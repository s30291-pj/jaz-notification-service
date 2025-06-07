package pl.edu.pjwstk.s30291.projects.svc.notification.listener.impl;

import org.springframework.stereotype.Component;

import pl.edu.pjwstk.s30291.projects.svc.notification.listener.NotificationListener;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.impl.SMSNotificationParameters;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.type.NotificationParametersType;

@Component
public class SMSNotificationListener implements NotificationListener<SMSNotificationParameters> {

	@Override
	public void send(String message, SMSNotificationParameters parameters) {
		System.out.println("SMS > Wyslano SMS na numer %s z notyfikacja: %s".formatted(
				parameters.getNumber(), message)
		);
	}

	@Override
	public NotificationParametersType getParametersType() {
		return NotificationParametersType.SMS;
	}

	@Override
	public Class<SMSNotificationParameters> getParametersClass() {
		return SMSNotificationParameters.class;
	}

}
