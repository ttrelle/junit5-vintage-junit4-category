package tests;

import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(IntegrationTest.class)
public class CategorizedTest {

    @Test
    public void should_not_run() {
        fail("Test should not be executed at all!");
    }

}
