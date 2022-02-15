package Test;

import Pages.Base;
import org.junit.Test;

public class NewTest extends Base {
    @Test
    public void Tab()
    {
        pageFactory.get().setNewTab();
    }


}
