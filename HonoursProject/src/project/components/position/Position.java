package project.components.position;

import org.newdawn.slick.geom.Vector2f;

import project.components.coreComponents.Component;

public interface Position extends Component {

	int getPosition();
	int setPosition(Vector2f newPosition);
	
}
