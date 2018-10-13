import javax.swing.JFrame;

import javax.swing.JLabel;

import javafx.scene.layout.Background;

import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color; 
import java.awt.Font;
 
public class tictactoe extends JFrame implements ActionListener {
    public static final int WIDTH = 800; //Width of the JFrame
    public static final int HEIGHT = 600; //Height of the JFrame
 
    public static void main(String[] args)
    {
    	tictactoe gui = new tictactoe (3,3);
        gui.setVisible(true);
    }
     
    //Creating 9 objects of a JButton
    JButton button1 = new JButton();JButton button13 = new JButton();
    JButton button2 = new JButton();JButton button14 = new JButton();
    JButton button3 = new JButton();JButton button15 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
    JButton button10 = new JButton();
    JButton button11 = new JButton();
    JButton button12 = new JButton();
    //A constructor to set initial values
    int scr1=0,scr2=0;
    public tictactoe(int rows, int columns ) {
        super();button4.setText(""+scr1);button8.setText(""+scr2);button12.setText(" Reset "); button13.setText("New game");button14.setText("Player 1 :");button15.setText("Player 2 :");
        setSize(WIDTH, HEIGHT);
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        //Setting a layout
        setLayout(new GridLayout(rows, columns ));   
        
        //Add all of those buttons to the layout
        add(button1); 
        add(button2); 
        add(button3);
        add(button14); 
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button15);
        add(button8);
        add(button9);
        add(button10);
        add(button11); 
        add(button12);
        add(button13);  
        
        //Assign an action listener to each button
        button1.addActionListener(this);button13.addActionListener(this);
        button2.addActionListener(this);button14.addActionListener(this);
        button3.addActionListener(this);button15.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button13.setFont(new Font("Arial",Font.BOLD,25));button12.setFont(new Font("Arial", Font.BOLD, 30));
        button14.setFont(new Font("Arial", Font.BOLD, 18));button4.setFont(new Font("Arial", Font.BOLD, 35));
        button15.setFont(new Font("Arial", Font.BOLD,18));button8.setFont(new Font("Arial", Font.BOLD, 35));
        button15.setBackground(Color.WHITE.darker());
        button14.setBackground(Color.WHITE.darker());
        button4.setBackground(Color.WHITE.darker());
        button8.setBackground(Color.WHITE.darker());
        button12.setBackground(Color.WHITE.darker());
        button13.setBackground(Color.WHITE.darker());
        button12.addActionListener(new ActionListener(){

			@Override public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				 reset();
			}
        } );
        button13.addActionListener(new ActionListener(){

			@Override public void actionPerformed(ActionEvent arg0) {
				scr1=0;scr2=0;reset();
			}
        } );
        
    }
  
    //Handling button clicks
    boolean check; //Variable to determine the current state of a button
    @Override
    
    public void actionPerformed(ActionEvent e) {
     //Using getSource method to avoid multiple if statements and make it efficient
        JButton myButton = (JButton)e.getSource();
        if( myButton!=button4 && myButton!=button8 && myButton!=button12 && myButton!=button13&& myButton!=button14 && myButton!=button15) {
        if (!check) 
         myButton.setText("X"); //Set X to the clicked cell
         if (check)
         myButton.setText("O"); //Set O to the clicked cell
        check = !check; //Reverting the button state 
        test(myButton.getText());test(myButton.getText());;myButton.setFont(new Font("Arial", Font.BOLD, 80)); //Set font of X and O
        button4.setText(""+scr1);button8.setText(""+scr2);button4.setSize(40,10);
        myButton.setEnabled(false);
        if (!check)myButton.setBackground(Color.PINK);
        if (check) myButton.setBackground(Color.GREEN.brighter()); //Disable button after it gets clicked
    }}
    
    public void reset(){
    	 button1.setText("");
    	 button2.setText("");
    	 button3.setText("");
    	 button5.setText("");
    	 button6.setText("");
    	 button7.setText("");
    	 button9.setText("");
    	 button10.setText("");
    	 button11.setText("");
    	 button1.setBackground(getBackground());
    	 button2.setBackground(getBackground());
    	 button3.setBackground(getBackground());
    	 button5.setBackground(getBackground());
    	 button6.setBackground(getBackground());
    	 button7.setBackground(getBackground());
    	 button9.setBackground(getBackground());
    	 button10.setBackground(getBackground());
    	 button11.setBackground(getBackground());
    	 button11.setEnabled(true);
    	 button1.setEnabled(true);
    	 button2.setEnabled(true);
    	 button3.setEnabled(true);
    	 button5.setEnabled(true);
    	 button6.setEnabled(true);
    	 button7.setEnabled(true);
    	 button9.setEnabled(true);
    	 button10.setEnabled(true);
    	 button4.setText(""+scr1);button8.setText(""+scr2);button14.setText("Player 1 :");button15.setText("Player 2 :");
    	 check=true; reset();
    }
 
    public void test( String c ) {
    
    if ( button1.getText() == "X" && button2.getText()=="X" && button3.getText()=="X") {scr1++;end("X"); }
    if ( button5.getText() == "X" && button6.getText() =="X" && button7.getText() == "X") {scr1++;end("X"); }
    if ( button9.getText() == "X" && button10.getText() == "X" && button11.getText() == "X" ) {scr1++;end("X"); }
    
    if ( button1.getText() == "X" && button5.getText() == "X" && button9.getText() == "X" ) {scr1++;end("X"); }
    if ( button2.getText() == "X"&& button6.getText() == "X" && button10.getText()=="X" ) {scr1++;end("X"); }
    if ( button3.getText() == "X" && button7.getText() == "X" && button11.getText() == "X") {scr1++;end("X"); }
    
    if ( button1.getText() == "X" && button6.getText() == "X" && button11.getText() == "X" ) {scr1++;end("X"); }
    if ( button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X") {scr1++;end("X"); }


    if ( button1.getText() == "O" && button2.getText()=="O" && button3.getText()=="O") {scr2++;end("O"); }
    if ( button5.getText() == "O" && button6.getText() =="O" && button7.getText() == "O") {scr2++;end("O"); }
    if ( button9.getText() == "O" && button10.getText() == "O" && button11.getText() == "O" ) {scr2++;end("O"); }
    
    if ( button1.getText() == "O" && button5.getText() == "O" && button9.getText() == "O" ) {scr2++;end("O"); }
    if ( button2.getText() == "O"&& button6.getText() == "O" && button10.getText()=="O" ) {scr2++;end("O"); }
    if ( button3.getText() == "O" && button7.getText() == "O" && button11.getText() == "O") {scr2++;end("O"); }
    
    if ( button1.getText() == "O" && button6.getText() == "O" && button11.getText() == "O" ) {scr2++;end("O"); }
    if ( button3.getText() == "O" && button6.getText() == "O" && button9.getText() == "O") {scr2++;end("O"); }
    }
    public void end(String a) {
    	if ( a.equals("X")) {reset();
    	}
    	else  {reset();
    	}
    
    }
    }
    
