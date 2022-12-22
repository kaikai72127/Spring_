package tw.leonchen.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "aDao")
public class AnimalDao implements IAnimalDao {
//標準寫法 要implements IAnimalDao   但是之後都會省略
	
	@Autowired //對應註冊過的Animal
	private Animal animal;
	
	@Override
	public void showInfo() {
		System.out.println("ID: "+animal.getId());
		System.out.println("Name: "+animal.getName());
		System.out.println("Continent: "+animal.getContient());
	}
}
