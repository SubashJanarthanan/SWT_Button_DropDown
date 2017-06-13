package subash.button.menu.dropdown;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

/**
 * The Class DropDownMenu.
 * 
 * @author Subash
 * 
 */
public class DropDownMenu {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setSize(300, 300);
		shell.setText("SWT Button Arrow Right Drop Down Menu Example");
		
		// set layout for the shell
		shell.setLayout(new RowLayout());

		// creating a composite to add a button
		final Composite buttonMenuCntrl = new Composite(shell, SWT.FILL);
		buttonMenuCntrl.setLayout(new GridLayout(2, true));
		
		
		// Creating CLabel for button Name
		CLabel lbl = new CLabel(buttonMenuCntrl, SWT.CENTER);
		lbl.setText("DD Button");
		
		// Creating right arrow button to add a right arrow
		Button rightArrowDropDownBtn = new Button(buttonMenuCntrl, SWT.ARROW | SWT.RIGHT );
		rightArrowDropDownBtn.setLayoutData(new GridData(GridData.FILL_VERTICAL));
		
		Label separator = new Label(shell, SWT.HORIZONTAL | SWT.SEPARATOR | SWT.FILL);
	/*    separator.setLayoutData(new GridData(SWT.FILL));*/

		rightArrowDropDownBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				
				// Create a pop_up main menu for the button
				Menu menu = new Menu(shell, SWT.POP_UP);
				
				// Add menu items that required
				MenuItem helloMenuItem = new MenuItem(menu, SWT.PUSH);
				helloMenuItem.setText("Say Helloooooooooooo");
				helloMenuItem.addSelectionListener(new SelectionListener() {
					
					@Override
					public void widgetSelected(SelectionEvent event) {
						MessageDialog.openInformation(shell, "HEllO", "Heloooooooooooooooo");	
					}
					
					@Override
					public void widgetDefaultSelected(SelectionEvent e) {			
					}
				});
				MenuItem hiMenuItem = new MenuItem(menu, SWT.PUSH);
				hiMenuItem.setText("Say Hiiiiiiiiiiiiiii");
				hiMenuItem.addSelectionListener(new SelectionListener() {
					
					@Override
					public void widgetSelected(SelectionEvent event) {
						MessageDialog.openInformation(shell, "HI", "Hiiiiiiiiiiiiiiiiiii");	
					}
					
					@Override
					public void widgetDefaultSelected(SelectionEvent e) {			
					}
				});
				MenuItem byeMenuItem = new MenuItem(menu, SWT.PUSH);
				byeMenuItem.setText("Say Byeeeeeeeeeeeeee");
				byeMenuItem.addSelectionListener(new SelectionListener() {
					
					@Override
					public void widgetSelected(SelectionEvent event) {
						MessageDialog.openInformation(shell, "BYE", "Byeeeeeeeeeeeeeeeeeee");	
					}
					
					@Override
					public void widgetDefaultSelected(SelectionEvent event) {			
					}
				});
				MenuItem welcomeMenuItem = new MenuItem(menu, SWT.PUSH);
				welcomeMenuItem.setText("Say Welcomeeeeeee");
				welcomeMenuItem.addSelectionListener(new SelectionListener() {
					
					@Override
					public void widgetSelected(SelectionEvent event) {
						MessageDialog.openInformation(shell, "WELCOME", "Welcomeeeeeeeeeeee");	
					}
					
					@Override
					public void widgetDefaultSelected(SelectionEvent event) {			
					}
				});
				menu.setVisible(true);
			}
		});

		shell.open();
		
		// Disposing shell at the end
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

}
