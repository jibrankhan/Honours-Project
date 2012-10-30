package project.components.coreComponents;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public interface Component {

	int getId();
	boolean isInit();
	void init(GameContainer container, StateBasedGame stateBG) throws SlickException;
	void update(GameContainer container,StateBasedGame stateBG, int delta) throws SlickException;
	
}
