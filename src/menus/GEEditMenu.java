package menus;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import constants.GEConstants.EditMenuItems;

public class GEEditMenu extends JMenu {
	
//	����, �߶󳻱�, ����, ���̱�, �׷�, �׷����� 
	

	
	public GEEditMenu(String title) {
		super(title);
		
		for (EditMenuItems e : EditMenuItems.values()) {
			JMenuItem item = new JMenuItem(e.name());
			this.add(item);
		}
	}

}
