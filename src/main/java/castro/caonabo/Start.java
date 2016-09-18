package castro.caonabo;

/**
 * Created by castro on 9/17/16.
 */
public class Start {


    public static void main(String[] args) {

        Humans me = new Humans();
        me.setAddress("111 one street phila,pa");
        me.setAge(33);
        me.setName("phill");
        me.setOccupation("Developer");
        me.setPersonGendr(Humans.gender.MALE);

        me.printInfo();




        SuperHumans batMan = new SuperHumans();

        batMan.setHeroName("Batty");
        batMan.setAge(52);
        batMan.setSuperAbility("walking");
        batMan.setPersonGendr(Humans.gender.MALE);

        batMan.printSuperStuf(batMan.getHeroName());
        batMan.printSuperStuf(String.valueOf(batMan.getAge()));
        batMan.printSuperStuf(batMan.getSuperAbility());

    }








}
