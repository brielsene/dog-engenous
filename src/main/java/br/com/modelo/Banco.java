package br.com.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private static List<Dog>listaDog = new ArrayList<>();
	private static int chaveSequencial = 1;
	
	static {
		Dog dog = new Dog("amora", "Yorkshire", 2);
		dog.setId(chaveSequencial++);
		listaDog.add(dog);
	}
	
	public List<Dog>getListaDog(){
		return Banco.listaDog;
	}
	
	public void adicionaDog(Dog dog) {
		dog.setId(chaveSequencial++);
		Banco.listaDog.add(dog);
		
	}

	public Dog procuraDogPeloId(Integer id) {
		for (Dog dog : listaDog) {
			if(dog.getId() == id) {
				return dog;
			}
			
		}
		
		return null;
		
		
	}

	public void removeDogPeloId(Integer id) {
		Iterator<Dog>it = listaDog.iterator();
		
		while(it.hasNext()) {
			Dog dog = it.next();
			if(dog.getId() == id) {
				it.remove();
			}
		}
		
	}
	
	

}
