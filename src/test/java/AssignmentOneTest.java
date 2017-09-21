import static org.junit.Assert.*;

import org.junit.Test;

public class AssignmentOneTest {

	@Test
	public void test() 
	{
		Student userNameTest = new Student("David", "14390186", "06091995", 22);
				
		assertEquals("David22", userNameTest.getUsername());
	}

}
