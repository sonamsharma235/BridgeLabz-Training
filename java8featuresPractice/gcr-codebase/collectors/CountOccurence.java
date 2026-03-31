package collectors;
import java.util.*;
import java.util.stream.*;
public class CountOccurence {
  public static void main(String[]args) {
	  String s="hello my name is hello my nae is";
	  
	  Map<String,Integer>fre=Arrays.stream(s.split(" "))
			  .collect(Collectors.toMap(word->word, word->1,
					  (oldValue,newValue)->oldValue+newValue));
	  System.out.println(fre);
  }
}
