import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.Timer;

import java.util.*;

public class AnagramDriver extends GameDriver implements ActionListener, MouseListener{
	private int t_width = 800;
	private int t_height = 800;
	Timer t;
	private boolean clicked = false;
	private int x, y;
	private int s_width = 100, s_height = 100;
	JButton[] buttons =null;
	JButton[] invis = null;
	Tile[] tiles = null;
	Stack<Tile> stack = new Stack<Tile>();
	String word = null;
	

	public static void main(String[] args){
		AnagramDriver d = new AnagramDriver();
	}

	public AnagramDriver(){
		dictScan();
	
		JFrame f = new JFrame();
		f.setTitle("Anagrams");
		f.setSize(t_width, t_height);
		f.setBackground(Color.WHITE);
		f.add(this);
		f.setResizable(false);
		f.addMouseListener(this);
		t = new Timer(17, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setSize(new Dimension(800, 800));
		Font font = new Font("Arial", Font.PLAIN, 40);
		JButton enter = new JButton();
		enter.setBounds(200, 500, 400, 100);
		enter.setFont(font);
		enter.setText("ENTER");
		enter.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent arg0) {
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {

			}

		});
		f.add(enter);
		Random rand1 = new Random();
		int wordLength = rand1.nextInt(7)+3;
		buttons = new JButton[wordLength];
		int wordKey = rand1.nextInt(235886);
		word = dictionary.get(wordKey);
		while(word.length() != wordLength) {
			 wordKey = rand1.nextInt(235886);
			 word = dictionary.get(wordKey);
		}
		System.out.println(word);
		for(int i=0; i<wordLength; i++){
			JButton button = new JButton();
			//button.setVisible(true);
			button.setBounds(50 + 100*i, 100, s_width, s_height);
			button.setFont(font);
			button.setText(word.substring(i,i+1));
			button.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent arg0) {
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					invis[(button.getX()-50)/100].setVisible(!invis[(button.getX()-50)/100].isVisible());
				}

			});
			f.add(button);
			buttons[i] = button;
		}
		invis = new JButton[wordLength];
		for(int i=0; i<wordLength; i++){
			
			JButton button = new JButton();
			//button.setVisible(true);
			button.setBounds(50 + 100*i, 300, s_width, s_height);
			button.setFont(font);
			button.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent arg0) {
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
				}

			});
			button.setVisible(false);
			invis[i] = button;
			f.add(button);

		}
		f.add(panel, BorderLayout.CENTER);
		System.out.println(panel.getWidth());
		System.out.println(panel.getHeight());

		f.setVisible(true);

	}
	public void paint(Graphics g){
		// for(int i=0; i<board.length; i++){
		// g.drawRect(50 + 100*i, 300, s_width, s_height);
		// }
		// if(clicked){
		// g.setColor(Color.red);
		// for(int i=0; i<board.length; i++){
		// if(x < 50 + s_width*(i+1) &&
		// x > 50 + s_width*(i) &&
		// y < 300 + s_height &&
		// y > 300){
		// g.setColor(Color.green);
		// System.out.println(i+1);
		// break;
		// }
		// }
		// g.drawRect(x-5, y-5, 10, 10);
		//
		// clicked = false;
		// }
	}
	public void update(){
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		update();
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		x = arg0.getX();
		y = arg0.getY()-20;
		clicked = true;

	}

}