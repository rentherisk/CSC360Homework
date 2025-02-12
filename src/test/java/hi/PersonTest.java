package hi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest
{
	Person R;
	Person J;
	Person M;
	

	@BeforeEach
	void setUp() throws Exception
	{
		R = new Person("Romeo","Mon",15);
		J = new Person("Juliet","Cap",13);
		M = new Person("Count","Duckoo",54);
	}

	@Test
	void testToString()
	{
		assertEquals(R.toString(), "Person: Romeo Mon, 15",R.toString());
		fail("Not yet implemented");
	}

	@Test
	void testPerson()
	{
		assertThrows(UnderAgeException.class,
				()->{
					R.makePerson(J);
				});
		Person child;
		try
		{
			child = M.makePerson(J);
			
			assertEquals(M.getFirstName(), child.getFirstName());
			assertEquals(J.getFirstName(), child.getFirstName());
			assertEquals(0, child.getAge());
			
		} catch (UnderAgeException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("threw exception");
		}

	}
}
