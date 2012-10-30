package project.worldStateManagement;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

import project.components.EntityManager;
import project.components.controllers.playerController.PlayerController;
import project.components.entities.Player;

public class Menu extends BasicGameState {

	public Menu(int state) {
		
		EntityManager eM = new EntityManager();
		
	}

	
	public void render(GameContainer container, StateBasedGame stateBG, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
	}

	
	public void init(GameContainer container, StateBasedGame stateBG) throws SlickException {
		
	}

	public void update(GameContainer container,StateBasedGame stateBG, int delta) throws SlickException {
		// TODO Auto-generated method stub
	}
	
	public int getID(){
		return 0;
	}
}
