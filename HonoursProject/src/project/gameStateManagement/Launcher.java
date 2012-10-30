package project.gameStateManagement;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Launcher {

	public static void main(String[] args) {
		
		AppGameContainer appContainer;
		
		try{
			
			GameStateManager gameState = new GameStateManager("My doomed honours project");
			
			appContainer = new AppGameContainer(gameState);
			appContainer.setDisplayMode(640, 360, false);
			appContainer.start();
			
		}catch(SlickException e){
			
			e.printStackTrace();
			
		}
	}
	
}
