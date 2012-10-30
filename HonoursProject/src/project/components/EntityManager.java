package project.components;

import java.util.ArrayList;
import java.util.List;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import project.components.coreComponents.Entity;
import project.components.entities.Player;


public class EntityManager {
	
	List<Entity> entityList;
	
	public EntityManager(){
		
		this.entityList = new ArrayList<Entity>();
		
		Player player = new Player(0);
		
		this.entityList.add(player);
		
	}
	
	public void render(GameContainer container, StateBasedGame stateBG, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
	}

	public void init(GameContainer container, StateBasedGame stateBG) throws SlickException {
		// TODO Auto-generated method stub
	}

	public void update(GameContainer container,StateBasedGame stateBG, int delta) throws SlickException {
		// TODO Auto-generated method stub
	}
}
