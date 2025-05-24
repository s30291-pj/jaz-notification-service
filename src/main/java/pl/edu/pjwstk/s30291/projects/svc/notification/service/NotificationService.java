package pl.edu.pjwstk.s30291.projects.svc.notification.service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;
import pl.edu.pjwstk.s30291.projects.svc.notification.Notification;
import pl.edu.pjwstk.s30291.projects.svc.notification.listener.NotificationListener;
import pl.edu.pjwstk.s30291.projects.svc.notification.listener.impl.EmailNotificationListener;
import pl.edu.pjwstk.s30291.projects.svc.notification.listener.impl.PushNotificationListener;
import pl.edu.pjwstk.s30291.projects.svc.notification.listener.impl.SMSNotificationListener;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.NotificationParameters;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.type.NotificationParametersType;

@Service
@Slf4j
public class NotificationService {
	
	@SuppressWarnings("rawtypes")
	private Map<NotificationParametersType, NotificationListener> listeners = new HashMap<>();
	
	private Gson gson = new Gson();
	
	public NotificationService(EmailNotificationListener email, SMSNotificationListener sms, PushNotificationListener push) {
		listeners.put(email.getParametersType(), email);
		listeners.put(sms.getParametersType(), sms);
		listeners.put(push.getParametersType(), push);
	}
	
	public void send(Notification notification) {
		
		for(String paramRAW : notification.getParameters()) {
			NotificationParameters param = gson.fromJson(paramRAW, NotificationParameters.class);
			
			NotificationListener listener = listeners.get(param.getParametersType());
			
			NotificationParameters castedParam = (NotificationParameters) gson.fromJson(paramRAW, listener.getParametersClass());
			
			listener.send(notification.getMessage(), castedParam);
		}
	}
	
}
