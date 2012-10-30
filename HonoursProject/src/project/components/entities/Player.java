package project.components.entities;

import project.components.baseClasses.BaseEntity;
import project.components.controllers.playerController.PlayerController;

public class Player extends BaseEntity {

	public Player(int id) {
		super(id);
		
		PlayerController player = new PlayerController(id);
		
		this.addComponent(player);
		
	}
	
	
}
