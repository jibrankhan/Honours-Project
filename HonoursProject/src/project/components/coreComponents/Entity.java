package project.components.coreComponents;

public interface Entity extends Component {
	
	void addComponent(Component component);
	
	void removeComponent(Component component);
	
}
