import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PersonTest {

    @Test
    void testAddParents() {
        Person child = new Person("Hans", "Bregman", "Male", 25);
        Person father = new Person("Piet", "Bregman", "Male", 79);
        Person mother = new Person("Carolien", "Van Doesburg", "Female", 60);

        child.addParents(father, mother);

        assertEquals(father, child.getFather());
        assertEquals(mother, child.getMother());
    }
    @Test
    void testAddChild() {
        Person parent = new Person("Piet", "Bregman", "Male", 79);
        Person child = new Person("Hans", "Bregman", "Male", 25);

        parent.addChild(child);

        assertTrue(parent.getChildren().contains(child));
        assertEquals(1, parent.getChildren().size());
    }

    @Test
    void testAddPet() {
        Person owner = new Person("Dog", "Owner", "Male", 48);
        Pet pet = new Pet("DOGGGGOO",7,"Dog");
        owner.addPet(pet,owner);

        assertTrue(owner.getPets().contains(pet));
    }

    @Test
    void testAddSibling() {
        Person bro1 = new Person("bro", "code", "Male", 25);
        Person bro2 = new Person("code", "bro", "Male", 30);

        bro1.addSibling(bro2);
        assertTrue(bro1.getSiblings().contains(bro2));



    }

    @Test
    void getGrandChild() {

        Person grandMother = new Person("grandma", "test", "FeMale", 60);
        Person father = new Person("father", "test", "Male", 30);
        Person baby = new Person("baby", "test", "Female", 0);

        grandMother.addChild(father);
        father.addChild(baby);

        assertTrue(grandMother.getGrandChildren().contains(baby));



    }
}