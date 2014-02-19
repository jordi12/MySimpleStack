package dcll.kmar.MySimpleStack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Implentation implements SimpleStack{

	ArrayList<Item> liste = new ArrayList<Item>();
	
	@Override
	public boolean isEmpty() {

		return (liste.size() == 0);
	}

	@Override
	public int getSize() {
		return liste.size();
	}

	@Override
	public void push(Item item) {
		liste.add(item);
	}

	@Override
	public Item peek() throws EmptyStackException {
	try {
		return liste.get(getSize());
			
	} catch (EmptyStackException e) {
		throw new EmptyStackException();
		}
	}

	@Override
	public Item pop() throws EmptyStackException {
		try {
			if(liste.isEmpty())
				{
				return null;
				}
			return liste.remove(getSize());
				
		} catch (EmptyStackException e) {
			throw new EmptyStackException();
			}
	}

}
