package scratch4;

//public class TestAnimal {
//    // 编译器在编译代码时，并不知道要调用Dog 还是 Cat 中eat的方法
//    // 等程序运行起来后，形参a引用的具体对象确定后，才知道调用那个方法
//    // 注意：此处的形参类型必须时父类类型才可以
//
//    public static void eat(Animal a){
//        a.eat();
//    }
//
//    public static void main(String[] args) {
//        Dog dog = new Dog("小黑",2);
//        Cat cat = new Cat("咪咪",4);
//
//        eat(dog);
//        eat(cat);
//    }
//}

//public class TestAnimal{
//    // 2. 方法传参：形参为父类型引用，可以接收任意子类的对象
//    public static void eatFood(Animal a){
//        a.eat();
//    }
//
//    // 3. 作返回值：返回任意子类对象
//    public static Animal buyAnimal(String var){
//        if("狗".equals(var)){
//            return new Dog("狗狗",1);
//        }else if("猫".equals(var)){
//            return new Cat("猫猫",1);
//        }else{
//            return null;
//        }
//    }
//
//    public static void main(String[] args) {
//        Animal cat = new Cat("元宝",2); //直接赋值，子类对象赋值给父类对象
//        Dog dog = new Dog("小七",1);
//
//        eatFood(cat);
//        eatFood(dog);
//
//        Animal animal = buyAnimal("狗");
//        animal.eat();
//
//        animal = buyAnimal("猫");
//        animal.eat();
//
//    }
//}

//public class TestAnimal{
//    public static void main(String[] args) {
//        Dog dog = new Dog("元宝",2);
//        Cat cat = new Cat("小七",4);
//
//        // 向上转型
//        Animal animal = cat;
//        animal.eat();
//        animal = dog;
//        animal.eat();
//
//        // 编译失败，编译时编译器将animal当成Animal对象处理
//        // 而Animal类中没有bark方法，因此编译失败
//        // animal.bark();
//
//        // 向上转型
//        // 程序可以通过编程，但运行时抛出异常---因为：animal实际指向的是狗
//        // 现在要强制还原为猫，无法正常还原，运行时抛出：ClassCastException
//        cat = (Cat)animal;
//        cat.mew();
//
//        // animal本来指向的就是狗，因此将animal还原为狗也是安全的
//        dog = (Dog)animal;
//        dog.bark();
//
//    }
//}

public class TestAnimal{
    public static void main(String[] args) {
        Dog dog = new Dog("元宝",4);
        Cat cat = new Cat("小七",2);

        //向上转型
        Animal animal = cat;
        animal.eat();
        animal = dog;
        animal.eat();

        if(animal instanceof Cat){
            cat = (Cat)animal;
            cat.mew();
        }
        if(animal instanceof Dog){
            dog = (Dog)animal;
            dog.bark();
        }
    }
}

