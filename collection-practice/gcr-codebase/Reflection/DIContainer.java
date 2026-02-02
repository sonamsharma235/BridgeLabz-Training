package Reflection;

import java.lang.reflect.*;

@interface Inject{}
class Service{}

class Controller{
 @Inject
 Service service;
}


public class DIContainer {

 public static void inject(Object obj)throws Exception{

  for(Field f: obj.getClass().getDeclaredFields()){

   if(f.isAnnotationPresent(Inject.class)){

    f.setAccessible(true);

    Object dep =
     f.getType().getDeclaredConstructor().newInstance();

    f.set(obj,dep);
   }
  }
 }
}

