import java.util.*;

class frequency{
public static void main(String[] args){
int count =0;

Scanner sc = new Scanner(System.in);
System.out.println("Enter the String ::");
String str = sc.nextLine();
System.out.print("Enter the character to find frequency :: ");
char chr = sc.next().charAt(0);

for(int i =0; i<str.length(); i++){
if(str.charAt(i)==chr){
count++;
}
}
System.out.println("Frequency of "+chr+" = "+count);
}
}
