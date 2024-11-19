package selectAFile;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.plaf.FileChooserUI;

public class MyFrame extends JFrame implements ActionListener {

	JButton button = new JButton("Select Files");

	MyFrame() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);

		button.addActionListener(this);

		this.add(button);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			JFileChooser fileChooser = new JFileChooser();

//			System.out.println(fileChooser.showOpenDialog(null)); // select file to open
			
			fileChooser.setCurrentDirectory(new File("C:\\Users\\IJula\\Desktop"));

//			int response = fileChooser.showOpenDialog(null);
			int response = fileChooser.showSaveDialog(null);

			if (response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
	}

}
