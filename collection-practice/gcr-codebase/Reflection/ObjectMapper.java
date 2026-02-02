package Reflection;

import java.lang.reflect.*;
import java.util.Map;

public class ObjectMapper {

 public static <T> T toObject(
   Class<T> clazz,
   Map<String,Object> map) throws Exception {

  T obj = clazz.getDeclaredConstructor().newInstance();

  for(var e: map.entrySet()){

   Field f = clazz.getDeclaredField(e.getKey());
   f.setAccessible(true);
   f.set(obj, e.getValue());
  }
  return obj;
 }
}

