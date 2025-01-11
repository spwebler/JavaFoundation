// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       ArrayList<Integer> arr=new ArrayList<>();
arr.add(1);
arr.add(2);
arr.add(3);
arr.add(3,1);
for(int i=0;i<arr.size();i++)
{
System.out.println(arr.get(i));

}
System.out.println(arr.contains(27));
System.out.println(arr.indexOf(3));
    }
}
