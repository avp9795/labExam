import java.lang.*;

class printer{
synchronized void mthd(String msg){
System.out.println(msg);
}
}

class caller extends Thread{
printer p;
String s;

caller(printer p,String s){
Thread t = new Thread(this);
this.s =s;
this.p = p;
t.start();
}
public void run(){

try{
p.mthd(s);
}
catch(Exception e){}
}
}


class main{
public static void main(String args[]){
printer p1 = new printer();
caller c1 = new caller(p1,"hello");
caller c2 = new caller(p1,"world");
}
}
