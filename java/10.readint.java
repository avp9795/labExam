import java.util.*;
class readint{
public static void main(String[] args){

int sum=0;
StringTokenizer st = new StringTokenizer("1 2 3 4 5 6 7");

System.out.println("Numbers are ::");

while(st.hasMoreTokens()){
String i = st.nextToken();
System.out.println(i);
sum+=Integer.parseInt(i);
}
System.out.println("sum is ::"+sum);
}}
