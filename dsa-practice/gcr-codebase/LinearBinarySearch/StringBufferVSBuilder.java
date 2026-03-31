package LinearBinarySearch;

public class StringBufferVSBuilder {
    public static void main(String[]args) {
    	int count=1000000;
    	StringBuffer sb=new StringBuffer();
    	long startBufferTime=System.nanoTime();
    	
    	for(int i=0;i<count;i++) {
    		sb.append("hello");
    	}
    	
    	long endTimeBuffer=System.nanoTime();
    	long bufferTime=endTimeBuffer-startBufferTime;
    	
    	StringBuilder s=new StringBuilder();
    	long startBuilderTime=System.nanoTime();
    	
    	for(int i=0;i<count;i++) {
    		s.append("hello");
    	}
    	
    	long endTimeBuilder=System.nanoTime();
    	long builderTime=endTimeBuilder-startBuilderTime;
    	
    	System.out.println(bufferTime+" buffer time");
    	System.out.print(builderTime+" builder time");
    }
}
