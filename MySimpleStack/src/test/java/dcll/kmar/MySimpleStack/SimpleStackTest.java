package dcll.kmar.MySimpleStack;

import java.util.ArrayList;

import junit.framework.TestCase;


public class SimpleStackTest extends TestCase
{
    public SimpleStackTest()
    {
    	
    }
    
    public void TestInsertion()
    {
    	Item test= new Item("toto");
    	ArrayList<Item> liste = new ArrayList<Item>();
    	liste.add(test);
    	assertTrue(liste.size()==1);
    }
    
    public void TestVide()
    {
    	ArrayList<Item> liste = new ArrayList<Item>();
    	assertTrue(liste.isEmpty());
    }
}
