import java.util.*;
class RandomNumberThreads extends Thread
{
public void run()
{
Random random=new Random();
for(int i=0;i<10;i++)
{
int randomInteger=random.nextInt(100);
System.out.println("Random Integer Generated "+randomInteger);
try{
if((randomInteger%2==0))
{
SquareThreads sThread=new SquareThreads(randomInteger);
sThread.start();
Thread.sleep(1000);
}
else{
CubeThreads cThread = new CubeThreads(randomInteger);
cThread.start();
Thread.sleep(1000);
}
}
catch(InterruptedException ex)
{
System.out.println(ex);
}}}}

class SquareThreads extends Thread 
{
int number;
SquareThreads(int randomNumber)
{
number=randomNumber;
}
public void run()
{
System.out.println("Square of"+number+" = "+(number*number));
}
}

class CubeThreads extends Thread 
{int number;
CubeThreads(int randomNumber)
{number=randomNumber;
}
public void run()
{
System.out.println("Cube of"+number+" = "+(number*number*number));
}}

class main
{
public static void main(String args[])
{
RandomNumberThreads rnThread=new RandomNumberThreads();
rnThread.start();
}}
