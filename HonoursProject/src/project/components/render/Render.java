package project.components.render;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import project.components.coreComponents.Component;

public interface Render extends Component {

	public void render(GameContainer container, Graphics g) 
			throws SlickException;

}
