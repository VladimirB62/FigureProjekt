package maxElementTests;

import maxElement.MaxElement;
import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {
    MaxElement fList = new MaxElement();

    public RemoveElementTest() {
    }

    @Test
    public void removeOneElementTest() {
        this.fList.addElement(4);
        this.fList.addElement(3);
        this.fList.removeLast();
        Assert.assertEquals(4L, (long)this.fList.getLast());
    }

    @Test
    public void removeAllElementsTest() {
        this.fList.addElement(4);
        this.fList.addElement(3);
        this.fList.removeLast();
        this.fList.removeLast();
        Assert.assertTrue(this.fList.isEmpty());
    }

    @Test
    public void removeAndAddElementTest() {
        this.fList.addElement(4);
        this.fList.removeLast();
        this.fList.addElement(35);
        Assert.assertEquals(35L, (long)this.fList.getLast());
    }

    @Test
    public void removeOneElementNegativeTest() {
        this.fList.addElement(4);
        this.fList.addElement(3);
        this.fList.removeLast();
        Assert.assertNotEquals(3L, (long)this.fList.getLast());
    }

    @Test
    public void removeNotAllElementsNegativeTest() {
        this.fList.addElement(4);
        this.fList.addElement(3);
        this.fList.removeLast();
        Assert.assertFalse(this.fList.isEmpty());
    }
}

