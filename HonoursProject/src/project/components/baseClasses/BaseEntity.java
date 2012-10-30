package project.components.baseClasses;

import java.util.ArrayList;
import java.util.List;

import project.components.coreComponents.Component;
import project.components.coreComponents.Entity;

public class BaseEntity extends BaseComponent implements Entity {
	
	private List<Component> componentsList;

	public BaseEntity(int id){
		
		super(id);
		
		this.componentsList = new ArrayList<Component>(); 
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isInit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addComponent(Component component) {
		
		this.componentsList.add(component);
		
	}

	@Override
	public void removeComponent(Component component) {
		
		//this.componentsList.r
		
	}

}
