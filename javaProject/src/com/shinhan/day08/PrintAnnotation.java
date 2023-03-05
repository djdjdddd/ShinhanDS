package com.shinhan.day08;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE}) // 여러개를 쓸 거니까 ()가 아닌 {} 안에 썼다.
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-"; // 값을 주면 value, 값을 안 주면 디폴트로 - 를 주겠다는 뜻 (Service 클래스와 연계됨)
	int number() default 7;
	String jin() default "찐"; 
	
}
