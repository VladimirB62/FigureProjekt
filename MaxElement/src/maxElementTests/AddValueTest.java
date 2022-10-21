package maxElementTests;

import maxElement.MaxElement;
import org.junit.Assert;
import org.junit.Test;

public class AddValueTest {
    MaxElement fList = new MaxElement();

    public AddValueTest() {
    }

    @Test
    public void addPositiveNumberPositiveTest() {
        this.fList.addElement(4);
        Assert.assertEquals(4L, (long)this.fList.getLast());
    }

    @Test
    public void addNegativeNumberPositiveTest() {
        this.fList.addElement(-3);
        Assert.assertEquals(-3L, (long)this.fList.getLast());
    }

    @Test
    public void addSameNumberPositiveTest() {
        this.fList.addElement(-3);
        Assert.assertEquals(-3L, (long)this.fList.getLast());
    }

    @Test
    public void addTwoElementsPositiveTest() {
        this.fList.addElement(0);
        this.fList.addElement(9);
        Assert.assertEquals(9L, (long)this.fList.getLast());
    }

    @Test
    public void addNegativeTest() {
        this.fList.addElement(2);
        Assert.assertNotEquals(0L, (long)this.fList.getLast());
    }
}

