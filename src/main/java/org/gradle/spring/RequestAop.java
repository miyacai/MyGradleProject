package org.gradle.spring;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.gradle.spring.Required.RequiredField;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RequestAop {

	@Pointcut(value="@annotation(org.gradle.spring.Required) || @within(org.gradle.spring.Required)")  
	private void withRequiredAnnotation(){} 
	
	@Around("withRequiredAnnotation()")
	public Object requiredAdvice(ProceedingJoinPoint pjp) throws Throwable {
		
		MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
		Method method = methodSignature.getMethod();
		
		Required required = AnnotationUtils.findAnnotation(method, Required.class);

		if(required == null) {
			required = AnnotationUtils.findAnnotation(method.getDeclaringClass(), Required.class);
		}

		if (required != null) {
			RequiredField[] requiredFields = required.value();
			if (requiredFields!=null) {
				for (RequiredField requiredField : requiredFields) {
					System.out.println(requiredField.toString());
				}
			}
		}
		return pjp.proceed();
	}
	
}
