package project.components.controllers.playerController;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import project.components.baseClasses.BaseComponent;

public class PlayerController extends BaseComponent implements KeyListener {

	int moveUp, moveDown, moveLeft, moveRight;
	
	public PlayerController(int id) {
		super(id);
		
		System.out.println(moveDown);
		
	}
	
	@Override
	public void init(GameContainer container, StateBasedGame stateBG)
			throws SlickException {
		
		super.init(container, stateBG);
		container.getInput().addKeyListener(this);
		
	}
	
	@Override
	public void inputEnded() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputStarted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAcceptingInput() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void setInput(Input input) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(int key, char c) {
		
		if(key == Input.KEY_UP){
			moveUp = 1;
		}
		if(key == Input.KEY_DOWN){
			moveDown = 1;
		}
		if(key == Input.KEY_LEFT){
			moveLeft = 1;
		}
		if(key == Input.KEY_RIGHT){
			moveRight = 1;
		}
		
	}

	@Override
	public void keyReleased(int key, char c) {
		// TODO Auto-generated method stub
		
	}
}
