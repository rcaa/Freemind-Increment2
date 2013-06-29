package freemind.clouds;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import freemind.util.Driver;
import freemind.util.Util;

@Aspect
public class CloudDynamic {
	@Around("adviceexecution() && within(freemind.clouds.CloudFeature)")
	public Object adviceexecutionIdiom(JoinPoint thisJoinPoint,
			ProceedingJoinPoint pjp) throws Throwable {
		Object ret;
		if (Driver.isActivated("cloud")) {
			ret = pjp.proceed();
		} else {
			ret = Util.proceedAroundCallAtAspectJ(thisJoinPoint);
		}
		return ret;
	}
}