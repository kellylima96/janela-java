package janela;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Janela extends Frame {
	
	public Janela () {
		super("--- Minha primeira janela em Java <3 ---");
		this.setBounds(0, 0, 800, 600);
		this.setResizable(false);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Janela j = new Janela();
	}
	
}
