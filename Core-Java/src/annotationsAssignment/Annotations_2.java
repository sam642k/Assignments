package annotationsAssignment;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(value= {ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@interface Info{
	int authorId();
	String author() default "";
	String supervisor() default "";
	String date();
	String time();
	int version();
	String Description() default "";
}

@Info(authorId=1, date="11-08-2021", time="12:05", version=1)
public class Annotations_2 {
	
	@Info(authorId=1, date="11-08-2021", time="12:05", version=1, author="Samee")
	void method() {}
	
	public static void main(String[] args) {
		
	}
}