package project.components.baseClasses;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import project.components.coreComponents.Component;

public class BaseComponent implements Component{

	int id;
	
	boolean isInit;
	
	public BaseComponent(int id){
		
		super();
		
		this.id = id;
		
	}
	
	@Override
	public int getId() {

		return id;
		
	}

	@Override
	public boolean isInit() {
		
		return isInit;
		
	}

	@Override
	public void update(GameContainer container, StateBasedGame stateBG,
			int delta) throws SlickException {
		
	}

	@Override
	public void init(GameContainer container, StateBasedGame stateBG)
			throws SlickException {
		
		isInit = true;
		
	}
}
