package micro_blog;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestMicroBlog {
	@Test
	public void test() {
		assertTrue("Test uspeshen", sendMessage("123456"));
		assertTrue("Test uspeshen", !sendMessage("1234567891011"));
		assertTrue("Test uspeshen", !sendMessage(""));
	}
}