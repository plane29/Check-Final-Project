

public class Runner implements Runnable{  //a very simple class, runner basically is used so we can listen to the mouse and reprint the screen
	
	public static final int FPS = 60;

	public void run(){  //loop to run
		while(true){
			Main.listenToMouse();  //calls the method listen to mouse which is in main
		}

	}





}