package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        // TODO: Replace Chris G. with your name as shown on
        // <https://bit.ly/cs156-f25-teams>
        assertEquals("HAUKE SEBASTIAN", Developer.getName());
    }
    @Test
    public void getGithubId_returns_correct_githubId() {
    	assertEquals("HRehwald", Developer.getGithubId());
    }
    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f25-12", t.getName());
	assertTrue(t.getMembers().contains("JOSHUA CHACKO"),"Team should contain Josh");
        assertTrue(t.getMembers().contains("HAUKE SEBASTIAN"),"Team should contain Hauke");
        assertTrue(t.getMembers().contains("TEJ SRI"),"Team should contain Tej");
        assertTrue(t.getMembers().contains("JAYDEN JUN KHAI"),"Team should contain Jayden");
        assertTrue(t.getMembers().contains("BEN"),"Team should contain Bed");
        assertTrue(t.getMembers().contains("ALVIN KEN"),"Team should contain Alvin");

    }
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
