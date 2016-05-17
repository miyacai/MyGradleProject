package org.gradle.spring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Required {
	
	public RequiredField[] value();

	public static enum RequiredField{
		SCHOOL,USER;
	}
}
