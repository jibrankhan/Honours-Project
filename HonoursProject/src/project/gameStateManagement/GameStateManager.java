package project.gameStateManagement;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import project.worldStateManagement.*;

public class GameStateManager extends StateBasedGame {
	
	public GameStateManager(String name) {
		
		super(name);
		this.addState(new Menu(GameStateIds.GAME_MENU));
		this.addState(new Play(GameStateIds.GAME_PLAYING));
		
	}
	
	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		
		this.getState(GameStateIds.GAME_MENU).init(container, this);
		this.getState(GameStateIds.GAME_PLAYING).init(container, this);
		
		this.enterState(GameStateIds.GAME_MENU);
		
	}

}
