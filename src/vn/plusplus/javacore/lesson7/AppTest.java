package vn.plusplus.javacore.lesson7;

public class AppTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal spider = new Spider();
        Animal chickend = new Chicken();

        System.out.println("So chan cua cho la: " + dog.getTotalLeg());
        System.out.println("So chan cua nhen la: " + spider.getTotalLeg());
        System.out.println("So chan cua ga la: " + chickend.getTotalLeg());
    }
}



class Animal {
    public int getTotalLeg() {
        return 2;
    }
}

class Dog extends Animal{
    @Override
    public int getTotalLeg(){
        return 4;
    }
}

class Spider extends Animal{
    @Override
    public int getTotalLeg(){
        return 8;
    }
}

class Chicken extends Animal{
}

