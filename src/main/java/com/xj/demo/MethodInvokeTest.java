package com.xj.demo;

public class MethodInvokeTest {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal("cat");
        animal.eat();
        Animal.sleep();
        Animal dog = new Dog();
        dog.eat();
        Animal n = null;
        n.eat();
    }
}
class AnimalFactory{
    public static Animal getAnimal(String type){
        if("dog".equals(type)){
            return new Dog();
        }else if("cat".equals(type)){
            return new Cat();
        }else{
            return null;
        }
    }
}
abstract class Animal{
    void eat(){
        System.out.println("Animal eat");
    }

    public static void sleep(){
        System.out.println("Animal sleep");
    }
}

class Dog extends Animal{
    void eat(){
        super.eat();
        System.out.println("Dog eat");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cat eat");
    }
}
