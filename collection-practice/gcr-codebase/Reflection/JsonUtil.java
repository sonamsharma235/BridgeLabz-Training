package Reflection;

import java.lang.reflect.Field;

public class JsonUtil {

	 public static String toJson(Object obj) throws Exception{

	  StringBuilder sb = new StringBuilder("{");

	  for(Field f: obj.getClass().getDeclaredFields()){

	   f.setAccessible(true);

	   sb.append("\""+f.getName()+"\":\""+f.get(obj)+"\",");
	  }

	  sb.deleteCharAt(sb.length()-1);
	  sb.append("}");

	  return sb.toString();
	 }
	}
