class garbage{

public static void main(String[] args){
garbage gb = new garbage();
gb = null;
System.gc();
}
protected void finalize(){
System.out.println("Garbage is collected.");
}
}
