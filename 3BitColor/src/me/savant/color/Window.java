package me.savant.color;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Window {

	private JFrame frame;
	private JTextField text;
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Window window = new Window();
					window.frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	public Window()
	{
		initialize();
	}
	
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 207, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		text = new JTextField();
		text.setBounds(6, 6, 195, 26);
		frame.getContentPane().add(text);
		text.setColumns(10);
		
		JPanel display = new JPanel();
		display.setBounds(6, 44, 195, 70);
		frame.getContentPane().add(display);
		
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		
		JButton button_1 = new JButton("");
		button_1.setForeground(Color.RED);
		button_1.setBackground(Color.RED);
		button_1.setBounds(6, 126, 58, 29);
		frame.getContentPane().add(button_1);
		
		JButton button = new JButton("");
		button.setBounds(55, 126, 58, 29);
		frame.getContentPane().add(button);
		
		JButton button_3 = new JButton("");
		button_3.setBounds(6, 150, 58, 29);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBounds(55, 150, 58, 29);
		frame.getContentPane().add(button_4);
		
		JButton button_6 = new JButton("");
		button_6.setBounds(6, 176, 58, 29);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBounds(55, 176, 58, 29);
		frame.getContentPane().add(button_7);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(100, 126, 58, 29);
		frame.getContentPane().add(button_2);
		
		JButton button_5 = new JButton("");
		button_5.setBounds(100, 150, 58, 29);
		frame.getContentPane().add(button_5);
		
		JButton button_8 = new JButton("");
		button_8.setBounds(100, 176, 58, 29);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBounds(149, 176, 58, 29);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.setBounds(149, 150, 58, 29);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setBounds(149, 126, 58, 29);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setBounds(6, 203, 58, 29);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setBounds(55, 203, 58, 29);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setBounds(100, 203, 58, 29);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.setBounds(149, 203, 58, 29);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.setBounds(149, 230, 58, 29);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.setBounds(100, 230, 58, 29);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.setBounds(55, 230, 58, 29);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.setBounds(6, 230, 58, 29);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("");
		button_20.setBounds(6, 258, 58, 29);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.setBounds(149, 258, 58, 29);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.setBounds(100, 258, 58, 29);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setBounds(55, 258, 58, 29);
		frame.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("");
		button_24.setBounds(26, 279, 58, 29);
		frame.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("");
		button_25.setBounds(75, 279, 58, 29);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.setBounds(120, 279, 58, 29);
		frame.getContentPane().add(button_26);
		
		buttons.add(button);
		buttons.add(button_1);
		buttons.add(button_2);
		buttons.add(button_3);
		buttons.add(button_4);
		buttons.add(button_5);
		buttons.add(button_6);
		buttons.add(button_7);
		buttons.add(button_8);
		buttons.add(button_9);
		buttons.add(button_10);
		buttons.add(button_11);
		buttons.add(button_12);
		buttons.add(button_13);
		buttons.add(button_14);
		buttons.add(button_15);
		buttons.add(button_16);
		buttons.add(button_17);
		buttons.add(button_18);
		buttons.add(button_19);
		buttons.add(button_20);
		buttons.add(button_21);
		buttons.add(button_22);
		buttons.add(button_23);
		buttons.add(button_24);
		buttons.add(button_25);
		buttons.add(button_26);
		
		int i = 1;
		for(JButton b : buttons)
		{
			Color c = Color.parseColor(i);
			System.out.println(c.g);
			b.setBackground(new java.awt.Color(c.r / 255, c.b / 255, c.g / 255));
			i++;
		}
	}
}
