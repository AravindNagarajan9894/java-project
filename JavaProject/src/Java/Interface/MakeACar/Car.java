package Java.Interface.MakeACar;

public class Car {

	PetrolEngine engine= new PetrolEngine();
	Media player = new Media();
	
//	Car(){
//		engine = new PetrolEngine();
//	}
	void startCar() {
		engine.start();
	}
	void stopCar() {
		engine.stop();
	}
	void acccar() {
		engine.acc();
	}
	void startMusic() {
		player.start();
	}
	void stopMusic() {
		player.stop();
	}
	void upgradeEngine() {
		engine = new ElectricEngine();
		System.out.println(engine.equals(player));
		
	}
}
