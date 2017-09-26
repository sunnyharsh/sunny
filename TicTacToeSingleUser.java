package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TicTacToeSingleUser extends JFrame {

	private JPanel contentPane;
	private boolean isTrue=true;
	JButton b1 = new JButton(" ");
	JButton b2 = new JButton(" ");
	JButton b3 = new JButton(" ");
	JButton b4 = new JButton(" ");
	JButton b5 = new JButton(" ");
	JButton b6 = new JButton(" ");
	JButton b7 = new JButton(" ");
	JButton b8 = new JButton(" ");
	JButton b9 = new JButton(" ");
	private boolean isXorZero;
	private int YES_NO_OPTION;

	
	public static void main(String[] args) {
		
		TicTacToeSingleUser frame = new TicTacToeSingleUser();
					frame.setVisible(true);
				
	}

	
	public TicTacToeSingleUser() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				askToClose();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(350, 150, 579, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doCrossZero(b1);
			}
		});
		
		
		b1.setFont(new Font("Georgia", Font.BOLD, 50));
		b1.setBounds(126, 171, 89, 59);
		contentPane.add(b1);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doCrossZero(b2);
			}
		});
		
		
		b2.setFont(new Font("Georgia", Font.BOLD, 50));
		b2.setBounds(237, 171, 89, 59);
		contentPane.add(b2);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doCrossZero(b3);
			}
		});
		
		
		b3.setFont(new Font("Georgia", Font.BOLD, 50));
		b3.setBounds(352, 171, 89, 59);
		contentPane.add(b3);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doCrossZero(b6);
			}
		});
		
		
		b6.setFont(new Font("Georgia", Font.BOLD, 50));
		b6.setBounds(352, 241, 89, 59);
		contentPane.add(b6);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doCrossZero(b5);
			}
		});
		
		
		b5.setFont(new Font("Georgia", Font.BOLD, 50));
		b5.setBounds(237, 241, 89, 59);
		contentPane.add(b5);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doCrossZero(b4);
			}
		});
		
		
		b4.setFont(new Font("Georgia", Font.BOLD, 50));
		b4.setBounds(126, 241, 89, 59);
		contentPane.add(b4);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doCrossZero(b9);
			}
		});
		
		
		b9.setFont(new Font("Georgia", Font.BOLD, 50));
		b9.setBounds(352, 311, 89, 59);
		contentPane.add(b9);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doCrossZero(b8);
			}
		});
		
		
		b8.setFont(new Font("Georgia", Font.BOLD, 50));
		b8.setBounds(237, 311, 89, 59);
		contentPane.add(b8);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doCrossZero(b7);
			}
		});
		
		
		b7.setFont(new Font("Georgia", Font.BOLD, 50));
		b7.setBounds(126, 311, 89, 59);
		contentPane.add(b7);
	}
	
	
	private void doCrossZero(JButton bt){
		
		if(bt.getText().trim().length()==0){
			if(isTrue){
				bt.setText("X");
			}else{
				bt.setText("0");
			}
			isTrue=!isTrue;
			if(gameOver()){
				sayWin(bt);
				reset();
				isTrue=true;
			}
		}
	}
	private boolean isNoBlank(JButton bt){
		if(bt.getText().trim().length()==0){
			return false;
		}else{
			return true;
		}
		
	}
	private boolean isRowNoBlank(JButton bt1,JButton bt2,JButton bt3){
		if(isNoBlank(bt1)&&isNoBlank(bt2)&&isNoBlank(bt3)){
			return true;
		}
		else{
			return false;
		}
	}
	private boolean isRowMatch(JButton bt1,JButton bt2,JButton bt3){
		if(isRowNoBlank(bt1, bt2, bt3)){
			if(bt1.getText().equals(bt2.getText())&&bt2.getText().equals(bt3.getText())){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}


	private boolean gameOver(){
		if(isRowMatch(b1, b2, b3)){
			return true;
		}else if(isRowMatch(b4, b5, b6)){
			return true;
		}else if(isRowMatch(b7, b8, b9)){
			return true;
		}else if(isRowMatch(b1, b4, b7)){
			return true;
		}else if(isRowMatch(b2, b5, b8)){
			return true;
		}else if(isRowMatch(b3, b6, b9)){
			return true;
		}else if(isRowMatch(b1, b5, b9)){
			return true;
		}else if(isRowMatch(b3, b5, b7)){
			return true;
		}
		else{
			return false;
		}
	}
	
	private void sayWin(JButton bt){
		JOptionPane.showMessageDialog(this, "Game Over '"+bt.getText()+"' is Winner");
	}
	
	private void reset(){
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
	}
	private void askToClose(){
		int choice=JOptionPane.showConfirmDialog(this, "Do You Want To Colse","Tic Tac Toe", YES_NO_OPTION);
		if(choice==JOptionPane.YES_OPTION){
			this.dispose();
		}
		else{
			return;
		}
	}


}