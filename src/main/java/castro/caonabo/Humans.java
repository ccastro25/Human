package castro.caonabo;

/**
 * Created by castro on 9/17/16.
 */
public class Humans {
    String name;
    int age;
    enum gender{MALE,FEMALE}
    String occupation;
    String address;

    public gender getPersonGendr() {
        return personGendr;
    }

    public void setPersonGendr(gender personGendr) {
        this.personGendr = personGendr;
    }

    gender personGendr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printInfo(){


        System.out.print(" The name: "+this.name +" the age is: "+ this.age + " there gender is: " + this.personGendr +" " +
                " the occupation is:  "+ this.occupation + " and the addres is "+ address);
    }
}
