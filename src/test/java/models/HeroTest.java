package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spark.utils.Assert;

import static org.junit.jupiter.api.Assertions.*;
class HeroTest {

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void newHeroInstantiatesCorrectly() {
        new Hero("spiderman", "28", "spiderwebs", "kindness");
        Assert.isTrue(true,"Successful");
    }

    @Test
    public void Hero_instantiatesCorrectlyWithHeroName_string () throws Exception{
        Hero hero = new Hero("spiderman","28","spiderwebs", "kindness");
        assertEquals("spiderman",hero.getHeroName());
    }

    @Test
    public void Hero_getsHeroAgeCorrectly_int() throws  Exception {
        Hero hero = new Hero("spiderman","28","spiderwebs", "kindness");
        assertEquals("28",hero.getHeroAge());
    }

    @Test
    public void Hero_instantiatesCorrectlyWithHeroesSpecialPower_string() throws Exception {
        Hero hero = new Hero("spiderman","28","spiderwebs", "kindness");
        assertEquals("spiderwebs", hero.getHeroPower());
    }

    @Test
    public void Hero_instantiatesCorrectlyWithHeroWeakness_string() throws Exception{
        Hero hero = new Hero("spiderman","28","spiderwebs", "kindness");
        assertEquals("kindness", hero.getHeroWeakness());
    }

    @Test
    public void all_returnsAllInstancesOfHero_true() {
        Hero firstHero = new Hero("spiderman", "28", "spiderwebs", "kindness");
        Hero secondHero = new Hero("spiderman", "28", "spiderwebs", "kindness");
        assertEquals(true, Hero.getListOfHeroes().contains(firstHero));
        assertEquals(true, Hero.getListOfHeroes().contains(secondHero));
    }

    @Test
    void getId() {
    }

    @Test
    void findById() {
    }

    @Test
    void clearAllPosts() {
    }
}
