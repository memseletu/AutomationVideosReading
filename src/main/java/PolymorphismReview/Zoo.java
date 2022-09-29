package PolymorphismReview;

public class Zoo {
    public static void main(String[] args) {
      Dog rocky = new Dog();
      rocky.fetch();
      rocky.makeSound();
      Animal sasha = new Dog();
      sasha.makeSound();
      feed(rocky);

      sasha = new Cat();
      sasha.makeSound();
        ((Cat)sasha).scratch();
      feed(sasha);
      //you can get around sasha being of type animal and make her be able to use unique cat method by casting

    }
    //the method below is to check if PolymorphismReview.Dog amd PolymorphismReview.Cat are subclasses.
public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("heres dog food");
        }
       else if(animal instanceof Cat){
            System.out.println("heres cat food");
        }
}

    }

