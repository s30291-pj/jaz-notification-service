package pl.edu.pjwstk.s30291.projects.svc.notification.parameters.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.NotificationParameters;

@AllArgsConstructor
@NoArgsConstructor
public class SMSNotificationParameters extends NotificationParameters {

	@Getter private String number;
	
}
