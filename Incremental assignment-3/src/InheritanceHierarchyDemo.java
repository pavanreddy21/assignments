abstract class Rodent{
    public abstract void food();
    public abstract void color();
    public abstract void size();
    Rodent(){
        System.out.println("this is default constructor of Rodent");
    }
}


class Mouse extends Rodent{
    Mouse(){
        System.out.println("This is  constructor of mouse");

    }

    public void food(){
        System.out.println("food of mouse is cheese");
    }

    public void color(){
        System.out.println("color of mouse is black");
    }
    public void size(){
        System.out.println("size of mouse may be 10cm");
    }
}


class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("This is  constructor of Gerbil");
    }
    public void food(){
        System.out.println("food of gerbil is carrot");
    }

    public void color(){
        System.out.println("color of gerbil is white");
    }
    public void size(){
        System.out.println("size of gerbil may be 11cm");
    }
}


class Hamster extends Rodent {
    Hamster(){
        System.out.println("This is  constructor of Hamster");

    }
    public void food(){
        System.out.println("food of hamster is vegetables");
    }

    public void color(){
        System.out.println("color of hamster is brown");
    }
    public void size(){
        System.out.println("size of hamster may be 5cm");
    }
}


public class InheritanceHierarchyDemo {
    public static void main( String[] args ) {

        Rodent rodentArray[] = {new Mouse(), new Gerbil(), new Hamster()};
        for( Rodent rodent : rodentArray) {
            System.out.println();
            rodent.food();
            rodent.color();
            rodent.size();
        }
    }
}

/**
Output:

this is default constructor of Rodent
This is  constructor of mouse

this is default constructor of Rodent
This is  constructor of Gerbil

this is default constructor of Rodent
This is  constructor of Hamster

food of mouse is cheese
color of mouse is black
size of mouse may be 10cm

food of gerbil is carrot
color of gerbil is white
size of gerbil may be 11cm

food of hamster is vegetables
color of hamster is brown
size of hamster may be 5cm

*/
