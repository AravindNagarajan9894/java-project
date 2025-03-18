package Java.Interface.MakeACar;
public class PetrolEngine implements Engine{

	@Override
	public void start() {
		System.out.println("Petrol engine starts");
		
	}

	@Override
	public void stop() {
		System.out.println("Petrol engine stops");
		
	}

	@Override
	public void acc() {
		System.out.println("Petrol engine accelerate");
		
	}

}
