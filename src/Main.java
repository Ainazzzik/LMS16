import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Eagle("Rapax"),
                new Eagle("Pennata"),

                new Turtle("Matamata"),
                new Turtle("Trionix"),
                
                new Shark("Molot"),
                new Shark("White")


        };
       
        for (Animal animal : animals) {
            if (animal.getClass().equals(Turtle.class))((Turtle) animal).swim();
            else if (animal.getClass().equals(Eagle.class))((Eagle) animal).fly();
            else if (animal.getClass().equals(Shark.class))((Shark) animal).attack();
                System.out.println(animal);
            }

        Shark[]sharks=new Shark[2];
        Turtle[]turtles=new Turtle[2];
        Eagle[]eagles=new Eagle[2];
            int a=0;
            int b=0;
            int c=0;
        for (Animal animal : animals) {
            if (animal instanceof Shark){
                sharks[a]=(Shark) animal;
                ((Shark) animal).attack();
                a++;
            } else if (animal instanceof Eagle) {
                eagles[b]=(Eagle)animal;
                ((Eagle) animal).fly();
                b++;
            } else if (animal instanceof Turtle) {
                turtles[c]=(Turtle) animal;
                ((Turtle) animal).swim();
                c++;
            }
          }
        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eagles));
        }
    }
