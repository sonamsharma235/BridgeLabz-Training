import java.util.*;
public class FindYoungest{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int amarAge=sc.nextInt();
        int akbarAge=sc.nextInt();
        int anthonyAge=sc.nextInt();
        findYoungest(amarAge,akbarAge,anthonyAge);

        int amarHeight=sc.nextInt();
        int akbarHeight=sc.nextInt();
        int anthonyHeight=sc.nextInt();
        findTallest(amarHeight,akbarHeight,anthonyHeight);
    }
    public static void findYoungest(int amarAge,int akbarAge,int anthonyAge){
         if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Youngest  is Amar");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Youngest  is Akbar");
        } else {
            System.out.println("Youngest  is Anthony");
        }
    }
    public static void findTallest(int amarHeight,int akbarHeight,int anthonyHeight){
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Tallest  is Amar");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Tallest  is Akbar");
        } else {
            System.out.println("Tallest  is Anthony");
        }
    } 
}