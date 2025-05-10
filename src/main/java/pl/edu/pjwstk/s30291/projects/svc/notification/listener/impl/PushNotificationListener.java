package pl.edu.pjwstk.s30291.projects.svc.notification.listener.impl;

import org.springframework.stereotype.Component;

import pl.edu.pjwstk.s30291.projects.svc.notification.listener.NotificationListener;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.impl.PushNotificationParameters;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.type.NotificationParametersType;

@Component
public class PushNotificationListener implements NotificationListener<PushNotificationParameters> {

	@Override
	public void send(String message, PushNotificationParameters parameters) {
		System.out.println("EMAIL > Wyslano push na token %s z notyfikacja: %s".formatted(
				parameters.getToken(), message)
		);
	}

	@Override
	public NotificationParametersType getParametersType() {
		return NotificationParametersType.PUSH;
	}

	@Override
	public Class<PushNotificationParameters> getParametersClass() {
		return PushNotificationParameters.class;
	}

}
