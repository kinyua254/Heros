package models;

import java.util.ArrayList;

public class Hero {
    private String heroName;
    private String heroAge;
    private String heroPower;
    private String heroWeakness;

    private static ArrayList<Hero> listOfHeroes = new ArrayList<>();

    public Hero(String heroName, String heroAge, String heroPower, String heroWeakness) {
        this.heroName = heroName;
        this.heroAge = heroAge;
        this.heroPower = heroPower;
        this.heroWeakness = heroWeakness;
        listOfHeroes.add(this);
    }



    public String getHeroName() {
        return heroName;
    }

    public String getHeroAge() {
        return heroAge;
    }

    public String getHeroPower() {
        return heroPower;
    }

    public String getHeroWeakness() {
        return heroWeakness;
    }

    public static ArrayList<Hero> getListOfHeroes() {
        return listOfHeroes;
    }

}
