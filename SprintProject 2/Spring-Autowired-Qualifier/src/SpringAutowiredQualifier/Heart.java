package SpringAutowiredQualifier;

public class Heart {
	
	private String naneOfAnimal;
	private int noOfHeart;
	
	public String getNaneOfAnimal() {
		return naneOfAnimal;
	}

	public void setNaneOfAnimal(String naneOfAnimal) {
		this.naneOfAnimal = naneOfAnimal;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	public void pump() {
		System.out.println("your heart is pumping");
		System.out.println("alive");
	}

}
