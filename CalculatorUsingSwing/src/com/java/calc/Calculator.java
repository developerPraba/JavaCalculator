package com.java.calc;


import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	JLabel calcDisplay;
     
	JButton clearButton,perButton,oneDelButton,divButton;
	JButton sevenButton,eightButton,nineButton,multiButton;
	JButton fourButton,fiveButton,sixButton,minusButton;
	JButton oneButton,twoButton,threeButton,addButton;
	JButton doubleZeroButton,zeroButton,dotButton,equalButton;
	
	boolean isOperatorClicked = false;
	String OldValue;
	char operator;
	float result;
	
	
	public Calculator() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(450, 750);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.decode("#f1f2f6"));

		 calcDisplay = new JLabel();
		frame.add(calcDisplay);
		calcDisplay.setBounds(30, 50, 380, 100);
		calcDisplay.setBackground(Color.lightGray);
		calcDisplay.setOpaque(true);
		calcDisplay.setHorizontalAlignment(SwingConstants.RIGHT);

		// font size increment
		Font font = calcDisplay.getFont();
		float newSize = font.getSize() + 25;
		calcDisplay.setFont(font.deriveFont(newSize));
		// ------------------------------clear button-----------------------
		clearButton = new JButton("C");
		clearButton.setBounds(30, 200, 70, 70);
		clearButton.addActionListener(this);
		frame.add(clearButton);

		Font clearBtn = clearButton.getFont();
		float clearBtnNewSize = clearBtn.getSize() + 20;
		clearButton.setFont(clearBtn.deriveFont(clearBtnNewSize));

		// -----------------------------percentage btn----------------------
		perButton = new JButton("%");
		perButton.setBounds(130, 200, 70, 70);
		perButton.addActionListener(this);
		frame.add(perButton);

		// font size increment for buttons
		Font perBtnFont = perButton.getFont();
		float perbtnNewSize = perBtnFont.getSize() + 20;
		perButton.setFont(perBtnFont.deriveFont(perbtnNewSize));

		// ---------------------------oneDeleteButton-----------------------

		oneDelButton = new JButton("<=");
		oneDelButton.setBounds(230, 200, 70, 70);
		oneDelButton.addActionListener(this);
		frame.add(oneDelButton);

		// font size increment for buttons
		Font oneDelbtnFont = oneDelButton.getFont();
		float oneDelbtnNewSize = oneDelbtnFont.getSize() + 10;
		oneDelButton.setFont(oneDelbtnFont.deriveFont(oneDelbtnNewSize));

		// ----------------------------division button----------------------

		divButton = new JButton("/");
		divButton.setBounds(330, 200, 70, 70);
		divButton.addActionListener(this);
		frame.add(divButton);

		Font divBtnFont = divButton.getFont();
		float divBtnNewSize = divBtnFont.getSize() + 20;
		divButton.setFont(divBtnFont.deriveFont(divBtnNewSize));

		// -------------------------------buttons-7-------------------------
		sevenButton = new JButton("7");
		sevenButton.setBounds(30, 300, 70, 70);
		sevenButton.addActionListener(this);
		frame.add(sevenButton);

		// font size increment for buttons
		Font sevenBtnFont = sevenButton.getFont();
		float btnNewSize = sevenBtnFont.getSize() + 20;
		sevenButton.setFont(sevenBtnFont.deriveFont(btnNewSize));

		// ------------------------------button --- 8-----------------------
		eightButton = new JButton("8");
		eightButton.setBounds(130, 300, 70, 70);
		eightButton.addActionListener(this);
		frame.add(eightButton);

		// font size increment for buttons
		Font eightbtnFont = eightButton.getFont();
		float eightbtnNewSize = eightbtnFont.getSize() + 20;
		eightButton.setFont(eightbtnFont.deriveFont(eightbtnNewSize));

		// ------------------------------button --- 9-----------------------
		nineButton = new JButton("9");
		nineButton.setBounds(230, 300, 70, 70);
		nineButton.addActionListener(this);
		frame.add(nineButton);

		// font size increment for buttons
		Font ninebtnFont = nineButton.getFont();
		float ninebtnNewSize = ninebtnFont.getSize() + 20;
		nineButton.setFont(ninebtnFont.deriveFont(ninebtnNewSize));

		// ----------------------multiplication button-----------------------
		multiButton = new JButton("x");
		multiButton.setBounds(330, 300, 70, 70);
		multiButton.addActionListener(this);
		frame.add(multiButton);

		Font multibtnFont = multiButton.getFont();
		float multibtnNewSize = multibtnFont.getSize() + 20;
		multiButton.setFont(multibtnFont.deriveFont(multibtnNewSize));

		// -------------------------------buttons-4-------------------------
		fourButton = new JButton("4");
		fourButton.setBounds(30, 400, 70, 70);
		fourButton.addActionListener(this);
		frame.add(fourButton);

		// font size increment for buttons
		Font fourBtnFont = fourButton.getFont();
		float fourbtnNewSize = fourBtnFont.getSize() + 20;
		fourButton.setFont(fourBtnFont.deriveFont(fourbtnNewSize));

		// --------------------------- button-5 ----------------------------
		fiveButton = new JButton("5");
		fiveButton.setBounds(130, 400, 70, 70);
		fiveButton.addActionListener(this);
		frame.add(fiveButton);

		// font size increment for buttons
		Font fivebtnFont = fiveButton.getFont();
		float fivebtnNewSize = fivebtnFont.getSize() + 20;
		fiveButton.setFont(fivebtnFont.deriveFont(fivebtnNewSize));

		// ------------------------------button --- 6------------------------
		sixButton = new JButton("6");
		sixButton.setBounds(230, 400, 70, 70);
		sixButton.addActionListener(this);
		frame.add(sixButton);

		// font size increment for buttons
		Font sixBtnFont = sixButton.getFont();
		float sixBtnNewSize = sixBtnFont.getSize() + 20;
		sixButton.setFont(sixBtnFont.deriveFont(sixBtnNewSize));

		// ----------------------subtraction button-------------------------
		minusButton = new JButton("-");
		minusButton.setBounds(330, 400, 70, 70);
		minusButton.addActionListener(this);
		frame.add(minusButton);

		Font minusBtnFont = minusButton.getFont();
		float minusBtnNewSize = minusBtnFont.getSize() + 20;
		minusButton.setFont(minusBtnFont.deriveFont(minusBtnNewSize));

		// -------------------------------buttons-1-------------------------
		oneButton = new JButton("1");
		oneButton.setBounds(30, 500, 70, 70);
		oneButton.addActionListener(this);
		frame.add(oneButton);

		// font size increment for buttons
		Font oneBtnFont = oneButton.getFont();
		float oneBtnNewSize = oneBtnFont.getSize() + 20;
		oneButton.setFont(oneBtnFont.deriveFont(oneBtnNewSize));

		// --------------------------- button-2 ----------------------------
		twoButton = new JButton("2");
		twoButton.setBounds(130, 500, 70, 70);
		twoButton.addActionListener(this);
		frame.add(twoButton);

		// font size increment for buttons
		Font twoBtnFont = twoButton.getFont();
		float twoBtnNewSize = twoBtnFont.getSize() + 20;
		twoButton.setFont(twoBtnFont.deriveFont(twoBtnNewSize));

		// ------------------------------button --- 3------------------------
		threeButton = new JButton("3");
		threeButton.setBounds(230, 500, 70, 70);
		threeButton.addActionListener(this);
		frame.add(threeButton);

		// font size increment for buttons
		Font threeBtnFont = threeButton.getFont();
		float threeBtnNewSize = threeBtnFont.getSize() + 20;
		threeButton.setFont(threeBtnFont.deriveFont(threeBtnNewSize));

		// ----------------------addition button----------------------------
		addButton = new JButton("+");
		addButton.setBounds(330, 500, 70, 70);
		addButton.addActionListener(this);
		frame.add(addButton);

		Font addBtnFont = addButton.getFont();
		float addBtnNewSize = addBtnFont.getSize() + 20;
		addButton.setFont(addBtnFont.deriveFont(addBtnNewSize));

		// -------------------------------buttons-double zero----------------
		doubleZeroButton = new JButton("00");
		doubleZeroButton.setBounds(30, 600, 70, 70);
		doubleZeroButton.addActionListener(this);
		frame.add(doubleZeroButton);

		// font size increment for buttons
		Font doubleZeroBtnFont = doubleZeroButton.getFont();
		float doubleZeroBtnNewSize = doubleZeroBtnFont.getSize() + 20;
		doubleZeroButton.setFont(doubleZeroBtnFont.deriveFont(doubleZeroBtnNewSize));

		// --------------------------- button-0 ----------------------------
		zeroButton = new JButton("0");
		zeroButton.setBounds(130, 600, 70, 70);
		zeroButton.addActionListener(this);
		frame.add(zeroButton);

		// font size increment for buttons
		Font zeroBtnFont = zeroButton.getFont();
		float zeroBtnNewSize = zeroBtnFont.getSize() + 20;
		zeroButton.setFont(zeroBtnFont.deriveFont(zeroBtnNewSize));

		// ------------------------------button --- dot---------------------
		dotButton = new JButton(".");
		dotButton.setBounds(230, 600, 70, 70);
		dotButton.addActionListener(this);
		frame.add(dotButton);

		// font size increment for buttons
		Font dotBtnFont = dotButton.getFont();
		float dotBtnNewSize = dotBtnFont.getSize() + 20;
		dotButton.setFont(dotBtnFont.deriveFont(dotBtnNewSize));

		// ----------------------addition button----------------------------
		equalButton = new JButton("=");
		equalButton.setBounds(330, 600, 70, 70);
		equalButton.addActionListener(this);
		frame.add(equalButton);

		Font equalBtnFont = equalButton.getFont();
		float equalBtnNewSize = equalBtnFont.getSize() + 20;
		equalButton.setFont(equalBtnFont.deriveFont(equalBtnNewSize));

	}
    //---------------------------------main method---------------------------
	public static void main(String[] args) {

		new Calculator();
	}

	@Override//------------------Action listener method---------------------
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == clearButton) {
			calcDisplay.setText("");
		}
		else if(e.getSource() == perButton) {
			isOperatorClicked = true;
			operator = '%';
			OldValue= calcDisplay.getText();
			calcDisplay.setText("%");
		}
		else if(e.getSource() == oneDelButton) {
			
			String str = calcDisplay.getText();
			calcDisplay.setText("");
			for(int i = 0; i < str.length()-1; i++) {
				calcDisplay.setText(calcDisplay.getText()+str.charAt(i));
			}
			
		}
		else if(e.getSource() == divButton) {
			isOperatorClicked = true;
			operator = '/';
			OldValue = calcDisplay.getText();
			calcDisplay.setText("/");
			
		}
		else if(e.getSource() == multiButton) {
			isOperatorClicked = true;
			operator = '*';
			OldValue = calcDisplay.getText();
			calcDisplay.setText("x");
		}
		else if(e.getSource() == minusButton) {
			isOperatorClicked = true;
			operator = '-';
			OldValue = calcDisplay.getText();
			calcDisplay.setText("-");
		}
		else if(e.getSource() == addButton) {
			isOperatorClicked = true;
			operator = '+';
			OldValue = calcDisplay.getText();
			calcDisplay.setText("+");
		}
		else if(e.getSource() == sevenButton) {
			
			if(isOperatorClicked) {
				calcDisplay.setText("7");
				isOperatorClicked = false;
			}else {
				calcDisplay.setText(calcDisplay.getText()+"7");
			}
			
		}
		else if(e.getSource() == eightButton) {
			
			if(isOperatorClicked) {
				calcDisplay.setText("8");
				isOperatorClicked = false;
			}else {
				calcDisplay.setText(calcDisplay.getText()+"8");
			}
			
		}
		else if(e.getSource() == nineButton) {
			
			if(isOperatorClicked) {
				calcDisplay.setText("9");
				isOperatorClicked = false;
			}else {
				calcDisplay.setText(calcDisplay.getText()+"9");
			}
			
		}
		else if(e.getSource() == fourButton) {
			
			if(isOperatorClicked) {
				calcDisplay.setText("4");
				isOperatorClicked = false;
			}else {
				calcDisplay.setText(calcDisplay.getText()+"4");
			}
		}
		else if(e.getSource() == fiveButton) {
         
			if(isOperatorClicked) {
				calcDisplay.setText("5");
				isOperatorClicked = false;
			}else {
				calcDisplay.setText(calcDisplay.getText()+"5");
			}

		}
		else if(e.getSource() == sixButton) {
			
			if(isOperatorClicked) {
				calcDisplay.setText("6");
				isOperatorClicked = false;
			}else {
				calcDisplay.setText(calcDisplay.getText()+"6");
			}
			
		}
		else if(e.getSource() == oneButton) {
			
			if(isOperatorClicked) {
				calcDisplay.setText("1");
				isOperatorClicked = false;
			}else {
				calcDisplay.setText(calcDisplay.getText()+"1");
			}
			
		}
		else if(e.getSource() == twoButton) {
			
			if(isOperatorClicked) {
				calcDisplay.setText("2");
				isOperatorClicked = false;
			}else {
				calcDisplay.setText(calcDisplay.getText()+"2");
			}
			
		}
		else if(e.getSource() == threeButton) {
			
			if(isOperatorClicked) {
				calcDisplay.setText("3");
				isOperatorClicked = false;
			}else {
				calcDisplay.setText(calcDisplay.getText()+"3");
			}
			
		}
		else if(e.getSource() == doubleZeroButton) {
			
			if(isOperatorClicked) {
				calcDisplay.setText("00");
				isOperatorClicked = false;
			}else {
				calcDisplay.setText(calcDisplay.getText()+"00");
			}
			
		}
		else if(e.getSource() == zeroButton) {
			
			if(isOperatorClicked) {
				calcDisplay.setText("0");
				isOperatorClicked = false;
			}else {
				calcDisplay.setText(calcDisplay.getText()+"0");
			}
			
		}
		else if(e.getSource() == dotButton) {
			
			if(isOperatorClicked) {
				calcDisplay.setText(".");
				isOperatorClicked = false;
			}else {
				calcDisplay.setText(calcDisplay.getText()+".");
			}
		}
		else if(e.getSource() == equalButton) {
					
			
			Float oldValueF = Float.parseFloat(OldValue);
			Float newValueF = Float.parseFloat(calcDisplay.getText());	
			
			switch (operator) {
			case '+':
				result = oldValueF+newValueF;
				break;
			case '-':
				result = oldValueF-newValueF;
				break;
			case '*':
				result = oldValueF*newValueF;
				break;
			case '/':
				result = oldValueF/newValueF;
				break;	
			case '%':
				result = oldValueF%newValueF;
			}
			calcDisplay.setText(String.valueOf(result));
			oldValueF = result;
								
			}
		
		}
				
	}


