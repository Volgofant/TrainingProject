import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Vector2DTest {

    @Test
    public void newVectorShouldHaveZeroLength() {
        Vector2d v1 = new Vector2d();
        Assert.assertEquals(0, v1.length(), 1e-9);
    }


}
