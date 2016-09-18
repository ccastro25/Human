package castro.caonabo;

/**
 * Created by castro on 9/17/16.
 */
public class SuperHumans extends Humans {

    private enum goodORBad{GOOD,BAD}
    private String heroName;
    private String superAbility;
    private goodORBad vilianOrSuperHero;

    public goodORBad getVilianOrSuperHero() {
        return vilianOrSuperHero;
    }

    public void setVilianOrSuperHero(goodORBad vilianOrSuperHero) {
        this.vilianOrSuperHero = vilianOrSuperHero;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public void printSuperStuf(String print){




        System.out.println(print);
    }
}
