package base;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;


public class Student_Test {
	
	@Test
	public void addAPersonTest() {
		ArrayList<PersonDomainModel> List = new ArrayList<PersonDomainModel>();
		PersonDomainModel stuff = new PersonDomainModel();
		PersonDAL.addPerson(stuff);
		assertTrue("Stuff was added to this list", List.get(0)==stuff);
	}
	
	@Test
	public void updateAPersonTest() {
		ArrayList<PersonDomainModel> List = new ArrayList<PersonDomainModel>();
		PersonDomainModel stuff = new PersonDomainModel();
	}
	
	@Test
	public void deleteAPersonTest() {
		ArrayList<PersonDomainModel> List = new ArrayList<PersonDomainModel>();
		UUID stuff = new UUID(0, 0);
		
		PersonDAL.deletePerson(stuff);
		assertTrue(List.isEmpty());
	}
	
	@Test
	public void getAPersonTest(PersonDomainModel p) {
		ArrayList<PersonDomainModel> List = new ArrayList<PersonDomainModel>();
		PersonDomainModel stuff = new PersonDomainModel();
		
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	

}
