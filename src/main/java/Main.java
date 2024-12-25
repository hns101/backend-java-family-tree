import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person hans = new Person("Hans","Bregman" , "Male",25);
        Person bart = new Person("Bart","Bregman" , "Male",30);
        Person piet = new Person("Piet","Bregman" , "Male",79);
        Person carolien = new Person("Carolien","Van Doesburg" , "Female",60);

        Person babyOfBart = new Person("-----","Bregman","Female",-1);

        Pet zapp =new Pet("Zapp",11,"Dog");
        Pet bell =new Pet("Bell",6,"Dog");
        Pet bess =new Pet("Bess",2,"Dog");

        // add&get parents
        hans.addParents(piet,carolien);
        bart.addParents(piet,carolien);
        System.out.println(hans.getFather()+"\n");
        System.out.println(hans.getMother()+"\n");

        // add&get child

        piet.addChild(bart);
        carolien.addChild(bart);
        piet.addChild(hans);
        carolien.addChild(hans);
        System.out.println(piet.getChildren()+"\n");

        bart.addChild(babyOfBart);

        // add&get Pet

        hans.addPet(zapp,hans);
        System.out.println(hans.getPets()+"\n");

        carolien.addPet(bell,carolien);
        carolien.addPet(bess,carolien);
        System.out.println(carolien.getPets()+"\n");

        // add&get Sibling

        bart.addSibling(hans);
        System.out.println(bart.getSiblings()+"\n");

        // Get Grandchild

        System.out.println(carolien.getGrandChildren());

    }
}
