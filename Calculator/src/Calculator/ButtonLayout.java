package Calculator;

import javax.swing.*;
import java.awt.event.*;
import java.math.*;
 
 
class ButtonLayout implements ActionListener
{
	//Creating the frame, textfield and buttons variables for use in the calculator
	JFrame calculatorBody;
	JTextField displayText;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button0;
	JButton buttonDivide;
	JButton buttonMulti;
	JButton buttonSubtract;
	JButton buttonAddition;
	JButton buttonDecimal;
	JButton buttonEqual; 
	JButton buttonDelete;
	JButton buttonClear;
	JButton buttonTan; 
	JButton buttonSin;
	JButton buttonCos;
	JButton buttonAns;
	JButton buttonDeg;
 
	/*Static variables for the numbers used, the sum, what operator is selected and if the
	 calculator is in degrees or radains */
	static double number1=0;
	static double number2=0;
	static double sum=0;
	static int operator=0;
	static boolean degrees = false;
	
	//Button Layout Class
	ButtonLayout()
	{
		//Creating instances the frame, textfield and buttons variables for use in the calculator
		calculatorBody=new JFrame("Calculator");
		displayText=new JTextField();
		button1=new JButton("1");
		button2=new JButton("2");
		button3=new JButton("3");
		button4=new JButton("4");
		button5=new JButton("5");
		button6=new JButton("6");
		button7=new JButton("7");
		button8=new JButton("8");
		button9=new JButton("9");
		button0=new JButton("0");
		buttonDivide=new JButton("/");
		buttonMulti=new JButton("*");
		buttonSubtract=new JButton("-");
		buttonAddition=new JButton("+");
		buttonDecimal=new JButton(".");
		buttonEqual=new JButton("=");
		buttonDelete=new JButton("Delete");
		buttonClear=new JButton("Clear"); 
		buttonTan=new JButton("tan"); 
		buttonSin=new JButton("sin");
		buttonCos=new JButton("cos");
		buttonAns=new JButton("Ans");
		buttonDeg=new JButton("RAD");
		
		//Setting the postition and size of the textfield and buttons
		displayText.setBounds(30,40,280,30);
		buttonTan.setBounds(40,100,70,40);;
		button7.setBounds(130,100,50,40);
		button8.setBounds(200,100,50,40);
		button9.setBounds(270,100,50,40);
		buttonDivide.setBounds(340,100,50,40);
		
		buttonSin.setBounds(40,170,70,40);;
		button4.setBounds(130,170,50,40);
		button5.setBounds(200,170,50,40);
		button6.setBounds(270,170,50,40);
		buttonMulti.setBounds(340,170,50,40);
		
		buttonCos.setBounds(40,240,70,40);;
		button1.setBounds(130,240,50,40);
		button2.setBounds(200,240,50,40);
		button3.setBounds(270,240,50,40);
		buttonSubtract.setBounds(340,240,50,40);
		
		buttonAns.setBounds(40,310,70,40);;
		button0.setBounds(130,310,50,40);
		buttonDecimal.setBounds(200,310,50,40);
		buttonEqual.setBounds(270,310,50,40);
		buttonAddition.setBounds(340,310,50,40);
		
		buttonDeg.setBounds(40,380,70,40);
		buttonDelete.setBounds(130,380,100,40);
		buttonClear.setBounds(250,380,100,40);
		
		//Adding the textfield and buttons to the calculator body
		calculatorBody.add(displayText);
		calculatorBody.add(button7);
		calculatorBody.add(button8);
		calculatorBody.add(button9);
		calculatorBody.add(buttonDivide);
		calculatorBody.add(button4);
		calculatorBody.add(button5);
		calculatorBody.add(button6);
		calculatorBody.add(buttonMulti);
		calculatorBody.add(button1);
		calculatorBody.add(button2);
		calculatorBody.add(button3);
		calculatorBody.add(buttonSubtract);
		calculatorBody.add(buttonDecimal);
		calculatorBody.add(button0);
		calculatorBody.add(buttonEqual);
		calculatorBody.add(buttonAddition);
		calculatorBody.add(buttonDelete);
		calculatorBody.add(buttonClear);
		calculatorBody.add(buttonAns);
		calculatorBody.add(buttonTan);
		calculatorBody.add(buttonSin);
		calculatorBody.add(buttonCos);
		calculatorBody.add(buttonDeg);
		
		//Setting the layout, visiblity, size 
		calculatorBody.setLayout(null);
		calculatorBody.setVisible(true);
		calculatorBody.setSize(400,500);
		calculatorBody.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculatorBody.setResizable(false);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		buttonAddition.addActionListener(this);
		buttonDivide.addActionListener(this);
		buttonMulti.addActionListener(this);
		buttonSubtract.addActionListener(this);
		buttonDecimal.addActionListener(this);
		buttonEqual.addActionListener(this);
		buttonDelete.addActionListener(this);
		buttonClear.addActionListener(this);
		buttonTan.addActionListener(this);
		buttonSin.addActionListener(this);
		buttonCos.addActionListener(this);
		buttonAns.addActionListener(this);
		buttonDeg.addActionListener(this);
	}
 
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			displayText.setText(displayText.getText().concat("1"));
		}//End If
			
		if(e.getSource()==button2)
		{
			displayText.setText(displayText.getText().concat("2"));
		}//End If
			
		if(e.getSource()==button3)
		{
			displayText.setText(displayText.getText().concat("3"));
		}//End If
			
		if(e.getSource()==button4)
		{
			displayText.setText(displayText.getText().concat("4"));
		}//End If
			
		if(e.getSource()==button5)
		{
			displayText.setText(displayText.getText().concat("5"));
		}//End If
			
		if(e.getSource()==button6)
		{
			displayText.setText(displayText.getText().concat("6"));
		}//End If
			
		if(e.getSource()==button7)
		{
			displayText.setText(displayText.getText().concat("7"));
		}//End If
			
		if(e.getSource()==button8)
		{	
			displayText.setText(displayText.getText().concat("8"));
		}//End If
			
		if(e.getSource()==button9)
		{
			displayText.setText(displayText.getText().concat("9"));
		}//End If
			
		if(e.getSource()==button0)
		{
			displayText.setText(displayText.getText().concat("0"));
		}//End If
			
		if(e.getSource()==buttonDecimal)
		{
			displayText.setText(displayText.getText().concat("."));
		}//End If
			
		if(e.getSource()==buttonAddition)
		{
			number1=Double.parseDouble(displayText.getText());
			operator=1;
			displayText.setText("");
		}//End If
		
		if(e.getSource()==buttonSubtract)
		{
			number1=Double.parseDouble(displayText.getText());
			operator=2;
			displayText.setText("");
		}//End If
		
		if(e.getSource()==buttonMulti)
		{
			number1=Double.parseDouble(displayText.getText());
			operator=3;
			displayText.setText("");
		}//End If
		
		if(e.getSource()==buttonDivide)
		{
			number1=Double.parseDouble(displayText.getText());
			operator=4;
			displayText.setText("");
		}//End If
		
		if(e.getSource()==buttonEqual)
		{
			number2=Double.parseDouble(displayText.getText());
		
			switch(operator)
			{
				case 1: 
					sum=number1+number2;
					break;
		
				case 2: 
					sum=number1-number2;
					break;
		
				case 3: 
					sum=number1*number2;
					break;
		
				case 4: 
					sum=number1/number2;
					break;
		
				case 5:
					if(degrees)
					{
						sum=Math.tan(Math.toRadians(number2));
					}
					else
					{
						sum=Math.tan(number2);
					}
					break;
					
				case 6:
					if(degrees)
					{
						sum=Math.sin(Math.toRadians(number2));
					}
					else
					{
						sum=Math.sin(number2);
					}//End Else
					break;
					
				case 7:
					if(degrees)
					{
						sum=Math.cos(Math.toRadians(number2));
					}//End If
					else
					{
						sum=Math.cos(number2);
					}//End Else
					break;
					
				default: sum=0;
			}//End Switch
		
			displayText.setText(""+sum);
		}//End If
		
		if(e.getSource()==buttonClear)
		{
			displayText.setText("");
		}//End If
			
		if(e.getSource()==buttonDelete)
		{
			String s=displayText.getText();
			displayText.setText("");
			
			for(int i=0;i<s.length()-1;i++)
			{
			displayText.setText(displayText.getText()+s.charAt(i));
			}//End For
		}//End If
		
		if(e.getSource()==buttonTan)
		{
				number1=Double.parseDouble(displayText.getText());
				operator=5;
				displayText.setText("");
		}//End If
		
		if(e.getSource()==buttonSin)
		{
			number1=Double.parseDouble(displayText.getText());
			operator=6;
			displayText.setText("");
		}//End If
		
		if(e.getSource()==buttonCos)
		{
			number1=Double.parseDouble(displayText.getText());
			operator=7;
			displayText.setText("");
		}//End If
		
		if(e.getSource()==buttonAns)
		{
			displayText.setText(""+sum);
		}//End If
		
		if(e.getSource()==buttonDeg)
		{
			degrees=(!degrees);
			if(degrees)
			{
				buttonDeg.setText("DEG");
			}//End If
			else
			{
				buttonDeg.setText("RAD");
			}//End Else
		}//End If
	}//End Action Listener
}//End Class