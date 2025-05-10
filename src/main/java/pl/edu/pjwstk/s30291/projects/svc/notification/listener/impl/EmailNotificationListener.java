package pl.edu.pjwstk.s30291.projects.svc.notification.listener.impl;

import org.springframework.stereotype.Component;

import pl.edu.pjwstk.s30291.projects.svc.notification.listener.NotificationListener;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.impl.EmailNotificationParameters;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.type.NotificationParametersType;

@Component
public class EmailNotificationListener implements NotificationListener<EmailNotificationParameters> {

	@Override
	public void send(String message, EmailNotificationParameters parameters) {
		System.out.println("EMAIL > Wyslano email o tytule %s na adres %s z notyfikacja: %s".formatted(
				parameters.getTitle(), parameters.getEmail(), message)
		);
	}

	@Override
	public NotificationParametersType getParametersType() {
		return NotificationParametersType.EMAIL;
	}

	@Override
	public Class<EmailNotificationParameters> getParametersClass() {
		return EmailNotificationParameters.class;
	}

}
