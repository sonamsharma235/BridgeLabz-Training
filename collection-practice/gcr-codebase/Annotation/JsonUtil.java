package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField{
 String name();
}

class User{
	 @JsonField(name="user_name")
	 String name="Sonam";
	}

class JsonUtil{

	 static String toJson(Object o)throws Exception{

	  StringBuilder sb=new StringBuilder("{");

	  for(Field f:o.getClass().getDeclaredFields()){

	   f.setAccessible(true);

	   JsonField j=f.getAnnotation(JsonField.class);

	   String key=j!=null?j.name():f.getName();

	   sb.append("\""+key+"\":\""+f.get(o)+"\",");
	  }

	  sb.deleteCharAt(sb.length()-1);
	  return sb+"}";
	 }
	}
