package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult{}

class MathService{

	 static Map<Integer,Integer> cache=new HashMap<>();

	 @CacheResult
	 public int square(int n){
	  System.out.println("Calculating...");
	  return n*n;
	 }
	}

class CacheRunner{

	 public static Object call(Object o,String m,int p)throws Exception{

	  Method me=o.getClass().getMethod(m,int.class);

	  if(me.isAnnotationPresent(CacheResult.class)){

	   if(MathService.cache.containsKey(p))
	    return MathService.cache.get(p);

	   Object r=me.invoke(o,p);

	   MathService.cache.put(p,(Integer)r);

	   return r;
	  }

	  return me.invoke(o,p);
	 }
	}




