import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private final ArrayList<Person> siblings = new ArrayList<Person>();
    private final ArrayList<Person> children = new ArrayList<Person>();
    private final ArrayList<Pet> pets = new ArrayList<Pet>();

    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }


    public ArrayList<Person> getChildren() {
       return children;
    }



    public void addChild(Person child) {
        children.add(child);
    }



    public void addPet(Pet pets ,Person owner) {
        this.pets.add(pets);
        pets.setOwner(owner);
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void addParents(Person father, Person mother) {
        setFather(father);
        setMother(mother);
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public void addSibling(Person sibling) {
        siblings.add(sibling);
    }

    public void getGrandChildren() {
     for (int i = 0; i < children.size(); i++) {
         if (children.get(i) instanceof Person) {
             System.out.println(children.get(i).getChildren());
         }

     }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }


}
