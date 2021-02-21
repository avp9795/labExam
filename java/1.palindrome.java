class palindrome
{
public static void main(String args[])
{
try{
String pali;
int i,len,flag=0;
pali=args[0];
len=pali.length();
for(i=0;i<len;i++)
{
if (pali.charAt(i)!=pali.charAt(len-1-i))
{
System.out.println("Not palindrome");
flag =1;
break;
}
}
if (flag==0){
System.out.println("Palindrome");
}
}
catch(Exception e){
System.out.println("Enter the string before proceding.");}
}
}
