package object2.package4;

public class Test {

    public static void eatFood(Animal animal){ // 2.
        animal.eat();
    }

    public static Animal fun(){
        return new Cat();
    }

    public static void main(String[] args) {
//        Animal cat = new Cat(); // 1.直接引用
//        eatFood(new Dog());
//        fun(); // 3.返回子类

//        Animal animal = new Dog();
        Animal animal = new Animal();
        animal.eat();
        if(animal instanceof Dog){
            Dog dog  = (Dog) animal;
            dog.bark();
        }else{
            System.out.println("类型出错");
        }



    }
}
