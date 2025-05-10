package pl.edu.pjwstk.s30291.projects.svc.notification.parameters.impl;

import lombok.Getter;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.NotificationParameters;

public class EmailNotificationParameters extends NotificationParameters {

	@Getter private String email;
	@Getter private String title;
}
