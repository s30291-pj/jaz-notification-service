package pl.edu.pjwstk.s30291.projects.svc.notification.parameters.impl;

import lombok.Getter;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.NotificationParameters;

public class PushNotificationParameters extends NotificationParameters {

	@Getter private String token;
}
