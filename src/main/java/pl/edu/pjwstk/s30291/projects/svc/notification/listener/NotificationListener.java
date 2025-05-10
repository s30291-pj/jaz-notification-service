package pl.edu.pjwstk.s30291.projects.svc.notification.listener;

import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.NotificationParameters;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.type.NotificationParametersType;

public interface NotificationListener<P extends NotificationParameters> {

	public void send(String message, P parameters);

	public NotificationParametersType getParametersType();
	
	public Class<P> getParametersClass();
	
}
