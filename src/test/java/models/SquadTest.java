package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void SquadInstantiatesCorrectly() throws Exception {
        Squad squad = new Squad("Eternals", "9", "Saving the whole world");
        assertEquals(true, squad instanceof Squad);
    }

    @Test
    public void Squad_getsSquadNameCorrectly_string() throws Exception{
        Squad squad = new Squad("Eternals", "9", "Saving the whole world");
        assertEquals("Eternals", squad.getSquadName());
    }

    @Test
    public void Squad_getsMaxSizeCorrectly_int() throws Exception{
        Squad squad = new Squad("Eternals", "9", "Saving the whole world");
        assertEquals("9", squad.getSquadSize());
    }

    @Test
    public void Squad_getsSquadsNameCorrectly() throws Exception {
        Squad squad = new Squad("Eternals", "9", "Saving the whole world");
        assertEquals("Saving the whole world", squad.getSquadCause());
    }

    @Test
    public void all_returnsAllInstancesOfSquad_true() throws Exception {
        Squad firstSquad = new Squad("Eternals", "9", "Saving the whole world");
        Squad secondSquad = new Squad("Avengers", "10", "protect America");
        assertTrue(Squad.getListOfSquads().contains(firstSquad));
        assertTrue(Squad.getListOfSquads().contains(secondSquad));
    }

    @Test
    public void find_returnsSquadWithSameId_secondSquad() {
        Squad firstSquad = new Squad("Eternals", "9", "Saving the whole world");
        Squad secondSquad = new Squad("Avengers", "10", "protect America");
        assertEquals(Squad.find(firstSquad.getId()), firstSquad);
        assertEquals(Squad.find(secondSquad.getId()), secondSquad);
    }


}

