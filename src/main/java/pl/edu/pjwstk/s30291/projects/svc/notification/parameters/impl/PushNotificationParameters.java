package pl.edu.pjwstk.s30291.projects.svc.notification.parameters.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.NotificationParameters;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.type.NotificationParametersType;

public class PushNotificationParameters extends NotificationParameters {

	@Deprecated
	public PushNotificationParameters() {
		super(NotificationParametersType.PUSH);
	}
	
	public PushNotificationParameters(String token) {
		this();
		this.token = token;
	}
	
	@Getter private String token;
}
