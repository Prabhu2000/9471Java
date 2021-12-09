class Animal{
Void eat(){
System.out.println("eating");}
class Dog extends Animal{
Void bark(){
System.out.println("bark");}
class Cat extends Animal{
void meow(){
System.out.println("meow");}
class Multilevelinheritance{
public static void main(String[] args){
Cat d = new Cat();
d.eat();
d.bark();
d.meow();
}
}
