package pl.edu.pjwstk.s30291.projects.svc.notification.parameters.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.NotificationParameters;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.type.NotificationParametersType;

public class SMSNotificationParameters extends NotificationParameters {

	@Deprecated
	public SMSNotificationParameters() {
		super(NotificationParametersType.SMS);
	}
	
	public SMSNotificationParameters(String number) {
		super(NotificationParametersType.SMS);
		this.number = number;
	}
	
	@Getter private String number;
	
}
