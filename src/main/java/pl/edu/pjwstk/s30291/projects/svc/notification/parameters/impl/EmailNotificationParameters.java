package pl.edu.pjwstk.s30291.projects.svc.notification.parameters.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.NotificationParameters;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.type.NotificationParametersType;

public class EmailNotificationParameters extends NotificationParameters {
	
	@Deprecated
	public EmailNotificationParameters() {
		super(NotificationParametersType.EMAIL);
	}
	
	public EmailNotificationParameters(String email, String title) {
		this();
		this.email = email;
		this.title = title;
	}

	@Getter private String email;
	@Getter private String title;
}
