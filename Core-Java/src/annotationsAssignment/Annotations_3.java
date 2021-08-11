package annotationsAssignment;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute{
	int sequence() default 0;
}



public class Annotations_3 {
	
	@Execute(sequence=1)
	void myMethod1() {}
	
	@Execute(sequence=2)
	void myMethod2() {}
	
	@Execute(sequence=3)
	void myMethod3() {}

}
