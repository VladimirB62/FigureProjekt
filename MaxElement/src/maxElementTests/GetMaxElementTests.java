package maxElementTests;

import maxElement.MaxElement;
import org.junit.Assert;
import org.junit.Test;

public class GetMaxElementTests {
    MaxElement fList = new MaxElement();

    public GetMaxElementTests() {
    }

    @Test
    public void getMaxFromOneElementTest() {
        this.fList.addElement(0);
        Assert.assertEquals(0L, (long)this.fList.getMax());
    }

    @Test
    public void getMaxFromTwoElementTest() {
        this.fList.addElement(0);
        this.fList.addElement(-1);
        Assert.assertEquals(0L, (long)this.fList.getMax());
    }

    @Test
    public void getMaxTwoElementTest() {
        this.fList.addElement(0);
        this.fList.addElement(2);
        Assert.assertEquals(2L, (long)this.fList.getMax());
    }

    @Test
    public void getMaxFromLisTest() {
        this.fList.addElement(0);
        this.fList.addElement(2);
        this.fList.addElement(8);
        this.fList.addElement(4);
        this.fList.addElement(3);
        this.fList.addElement(15);
        Assert.assertEquals(15L, (long)this.fList.getMax());
    }

    @Test
    public void getMaxFromListAfterRemoveTest() {
        this.fList.addElement(0);
        this.fList.addElement(2);
        this.fList.addElement(8);
        this.fList.addElement(4);
        this.fList.addElement(3);
        this.fList.addElement(15);
        this.fList.removeLast();
        Assert.assertEquals(8L, (long)this.fList.getMax());
    }

    @Test
    public void getMaxIsNotLastTest() {
        this.fList.addElement(0);
        this.fList.addElement(2);
        this.fList.addElement(8);
        this.fList.addElement(4);
        Assert.assertNotEquals((long)this.fList.getLast(), (long)this.fList.getMax());
    }

    @Test
    public void getMaxIsLastTest() {
        this.fList.addElement(0);
        this.fList.addElement(2);
        this.fList.addElement(8);
        this.fList.addElement(4);
        this.fList.removeLast();
        Assert.assertEquals((long)this.fList.getLast(), (long)this.fList.getMax());
    }
}

