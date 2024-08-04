package threadTask;

public class ThreadTask implements Runnable {
	private String animal;
	private String sound;

	public ThreadTask() {
		;
	}

	public ThreadTask(String sound, String animal) {
		super();
		this.animal = animal;
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(animal + ":" + sound);

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {;}
		}
	}
}
