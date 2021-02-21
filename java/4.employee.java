class Employee{
String name,address;
int age,phnum,salary;

void printSalary(){
System.out.println("salary ==> "+salary);
}
}

class Manager extends Employee{
String Department;
Manager(String name,String address,int age,int phnum,int salary){
this.name = name;
this.address = address;
this.age = age;
this.phnum = phnum;
this.salary = salary;
}
}
class Officer extends Employee{
String Specialization;
Officer(String name,String address,int age,int phnum,int salary){
this.name = name;
this.address = address;
this.age = age;
this.phnum = phnum;
this.salary = salary;
}
}

class main{
public static void main(String[] args){

Manager m = new Manager("abhi","xxxx",20,98987686,10000);
Officer o = new Officer("deepak","yyyy",21,98986778,2938);

System.out.println("********* MANAGER ***********");
System.out.println("Name ==> "+m.name+"\n"+"Address ==> "+m.address+"\n"+"age ==>"+m.age+"\n"+"Phone num ==> "+m.phnum+"\n"+"Salary ==> "+m.salary);

System.out.println("********* OFFICER ***********");
System.out.println("Name ==> "+o.name+"\n"+"Address ==> "+o.address+"\n"+"age ==>"+o.age+"\n"+"Phone num ==> "+o.phnum+"\n"+"Salary ==> "+o.salary);
}
}
