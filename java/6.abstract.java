/*abstract class Shape{
abstract void numberOfSides();
}
*/
class Rectangle {//extends Shape{
void numberOfSides(){
System.out.println("Number of sides of rectangle is 4");
}}

class Triangle {//extends Shape{
void numberOfSides(){
System.out.println("Number of sides of Triangle is 3");
}}

class Hexagon {//extends Shape{
void numberOfSides(){
System.out.println("Number of sides of Hexagon is 6");
}}

class main{
public static void main(String[] args){

Hexagon h = new Hexagon();
h.numberOfSides();

Triangle t = new Triangle();
t.numberOfSides();

Rectangle r = new Rectangle();
r.numberOfSides();
}
}
