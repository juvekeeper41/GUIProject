package popups.view;

import javax.swing.JOptionPane;

public class PopupViewer
{

	/**
	 * Makes a Pop-Up window to display the supplied message.
	 * @param message The message to be placed in the Pop-Up.
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
}
