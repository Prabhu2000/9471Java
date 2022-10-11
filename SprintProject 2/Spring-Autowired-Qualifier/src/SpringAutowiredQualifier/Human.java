package SpringAutowiredQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
    @Qualifier("Octopusheart")
	
	private Heart heart;
    
	public void startpumping() {
		if(heart != null) {
		heart.pump();
		System.out.println("name of the animal:" + heart.getNaneOfAnimal() +  "no of heart is present:" + heart.getNoOfHeart());
		}
		else {
			System.out.println("your are dead");
		}
	}
}
