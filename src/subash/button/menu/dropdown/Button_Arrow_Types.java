package subash.button.menu.dropdown;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 * The Class Button_Arrow_Types.
 * 
 * @author Subash
 * 
 */
public class Button_Arrow_Types {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shlButtonArrowType = new Shell();
		shlButtonArrowType.setSize(330, 342);
		shlButtonArrowType.setText("Button Arrow Type Example");
		
		Group grpRightArrow = new Group(shlButtonArrowType, SWT.BORDER | SWT.SHADOW_IN);
		grpRightArrow.setBackground(SWTResourceManager.getColor(255, 153, 255));
		grpRightArrow.setText("Right Arrow");
		grpRightArrow.setBounds(27, 21, 277, 49);
		
		Button btnNewButton = new Button(grpRightArrow, SWT.BORDER | SWT.ARROW | SWT.RIGHT);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageDialog.openInformation(shlButtonArrowType, "Right Arrow Button Message Dialog", "You have clicked SWT Button right arrow type widget");
			}
		});
		btnNewButton.setBounds(167, 15, 21, 21);
		btnNewButton.setText("RightArrow");
		
		CLabel lblNewLabel = new CLabel(grpRightArrow, SWT.BORDER);
		lblNewLabel.setBounds(92, 15, 76, 21);
		lblNewLabel.setText("RA_Button");
		
		Label label = new Label(shlButtonArrowType, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(0, 76, 424, -3);
		
		Group grpLeftArrow = new Group(shlButtonArrowType, SWT.BORDER | SWT.SHADOW_IN);
		grpLeftArrow.setBackground(SWTResourceManager.getColor(102, 153, 204));
		grpLeftArrow.setText("Left Arrow");
		grpLeftArrow.setBounds(27, 88, 277, 54);
		
		Button button = new Button(grpLeftArrow, SWT.BORDER | SWT.ARROW | SWT.LEFT);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageDialog.openInformation(shlButtonArrowType, "Left Arrow Button Message Dialog", "You have clicked SWT Button left arrow type widget");
			}
		});
		button.setText("RightArrow");
		button.setBounds(167, 15, 21, 21);
		
		CLabel lblLabutton = new CLabel(grpLeftArrow, SWT.BORDER);
		lblLabutton.setText("LA_Button");
		lblLabutton.setBounds(92, 15, 76, 21);
		
		Group grpUpArrow = new Group(shlButtonArrowType, SWT.BORDER | SWT.SHADOW_IN);
		grpUpArrow.setText("Up Arrow");
		grpUpArrow.setBackground(SWTResourceManager.getColor(153, 204, 102));
		grpUpArrow.setBounds(27, 168, 277, 54);
		
		Button button_1 = new Button(grpUpArrow, SWT.BORDER | SWT.ARROW);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageDialog.openInformation(shlButtonArrowType, "Up Arrow Button Message Dialog", "You have clicked SWT Button up arrow type widget");
			}
		});
		button_1.setText("RightArrow");
		button_1.setBounds(167, 15, 21, 21);
		
		CLabel lblUabutton = new CLabel(grpUpArrow, SWT.BORDER);
		lblUabutton.setText("UA_Button");
		lblUabutton.setBounds(92, 15, 76, 21);
		
		Group grpDownArrow = new Group(shlButtonArrowType, SWT.BORDER | SWT.SHADOW_IN);
		grpDownArrow.setText("Down Arrow");
		grpDownArrow.setBackground(SWTResourceManager.getColor(51, 0, 255));
		grpDownArrow.setBounds(27, 239, 277, 54);
		
		Button button_2 = new Button(grpDownArrow, SWT.BORDER | SWT.ARROW | SWT.DOWN);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageDialog.openInformation(shlButtonArrowType, "Down Arrow Button Message Dialog", "You have clicked SWT Button down arrow type widget");
			}
		});
		button_2.setText("RightArrow");
		button_2.setBounds(167, 15, 21, 21);
		
		CLabel lblDabutton = new CLabel(grpDownArrow, SWT.BORDER);
		lblDabutton.setText("DA_Button");
		lblDabutton.setBounds(92, 15, 76, 21);

		shlButtonArrowType.open();
		shlButtonArrowType.layout();
		while (!shlButtonArrowType.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
