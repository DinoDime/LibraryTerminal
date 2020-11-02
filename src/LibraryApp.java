import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JPanel;
import java.awt.Panel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JScrollBar;

public class LibraryApp extends Midterm{
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private JTextField textField_2;
	private final Action action_2 = new SwingAction_2();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryApp window = new LibraryApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibraryApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 448, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton_1 = new JButton("List Catalog");
		btnNewButton_1.setAction(action);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setAction(action_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_2 = new JButton("Return Book");
		btnNewButton_2.setAction(action_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Library Catalog");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("Please enter title you are returning");
		
		JLabel lblNewJgoodiesTitle_2 = DefaultComponentFactory.getInstance().createTitle("Enter your search critera");
		
		JScrollBar scrollBar = new JScrollBar();
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(155)
							.addComponent(btnNewButton_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(76)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_2)
									.addGap(18)
									.addComponent(btnNewButton_2))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnNewButton)
									.addPreferredGap(ComponentPlacement.RELATED))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(99)
							.addComponent(lblNewJgoodiesTitle_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(147)
							.addComponent(lblNewJgoodiesTitle_2)))
					.addContainerGap(17, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(161, Short.MAX_VALUE)
					.addComponent(lblNewJgoodiesTitle, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addGap(107))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewJgoodiesTitle, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewJgoodiesTitle_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewJgoodiesTitle_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
							.addGap(241))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		frame.getContentPane().setLayout(groupLayout);
		
	}
	static JTextArea textArea = new JTextArea();

		
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "List Catalog");
			putValue(SHORT_DESCRIPTION, "Lists all books");
		}
		public void actionPerformed(ActionEvent e) {
			Midterm.readFile();
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Search");
			putValue(SHORT_DESCRIPTION, "Searches for books relating to keywords");
		}
		public void actionPerformed(ActionEvent e) {
			String str = textField_1.getText();
			readFile();
			System.out.println(searchFunction(things, str ));
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Return Book");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			String str2 = textField_2.getText();
			if(bookReturn(str2)) {
				textArea.append("Book returned");
				System.out.println("Book was returned.");
			};
		}
	}
}
