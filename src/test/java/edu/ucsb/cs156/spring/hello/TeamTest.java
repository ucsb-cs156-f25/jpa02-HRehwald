package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team team2;
    Team team3;
    @BeforeEach
    public void setup() {
        team = new Team("test-team");
    	team2 = new Team("test-team");
	team3 = new Team("bad-tean");	
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test 
    public void equals_same_object() {
    	assertEquals(team.equals(team), true);
    }

    @Test
    public void equals_different_type() {
    	assertEquals(team.equals("theATeam"), false);
    }

    @Test
    public void equals_check_fields() {

	assert(team.equals(team2));
	
	assertEquals(team.equals(team3), false);
    
    }

    @Test
    public void hashCode_test() {
    	
	assert(team.hashCode() == team2.hashCode());
	
	assertEquals(team.hashCode() == team3.hashCode(), false);
    }

}
