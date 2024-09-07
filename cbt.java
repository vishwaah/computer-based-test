import javax.swing.*;
import java.awt.event.*;

class cbt extends JFrame implements ActionListener{

    JLabel l;
    JRadioButton rb[] = new JRadioButton[5];
    JButton b1,b2;
    int current=0,count=0,now=0,x=1,y=1;
    ButtonGroup bg;
    int m[]=new int[10];
    
    
    cbt(String s){

        super(s);
        this.setVisible(true);
        this.setSize(800,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        //this.setResizable(false);
        l=new JLabel();
        add(l);
        bg = new ButtonGroup();
        l.setBounds(60,30,300,50);
       
        for(int i=0;i<5;i++){
          rb[i] = new JRadioButton();
          add(rb[i]); 
          bg.add(rb[i]);
        }
        for(int i=0;i<4;i++){
            rb[i].setBounds(60, (80+(30*i)), 300, 20);
        }
        b1=new JButton("Next");
        b2=new JButton("Bookmark");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);add(b2);
        set();
        b1.setBounds(100,240,100,30);  
        b2.setBounds(350,240,100,30); 


        /*rb[0].setBounds(50,80,100,20);  
        rb[1].setBounds(50,110,100,20);  
        rb[2].setBounds(50,140,100,20);  
        rb[3].setBounds(50,170,100,20); */     
    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       if(e.getSource()==b1){
        if(check()){
            count+=1;
        }
        current++;
        set();
        if(current==9){
            b1.setEnabled(false);
            b2.setText("Result");
            b2.setFocusable(false);
        }
       }

       if(e.getActionCommand().equals("Bookmark")){
        JButton bk=new JButton("Bookmark"+(current+1));
        bk.setBounds(550,20+30*(current+1),100,25);  
        add(bk);
        bk.addActionListener(this);
        bk.setFocusable(false);
        m[current]=current;
        current++;
        set();    
        if(current==9){
            b2.setText("Result"); 
            b1.setEnabled(false);
        }
        setVisible(false);  
        setVisible(true); 
        
       }
       for(int i=0,y=1;i<10;i++,y++){
        if(e.getActionCommand().equals("Bookmark"+y)){
                if(check()){
                    count=count+1;
                }
                now=current;
                current=m[y-1];
                set();
                ((JButton)e.getSource()).setEnabled(false);
                current=now-1;

        }
        }
        
        if(e.getActionCommand().equals("Result")){
            if(check())
                count=count+1;
            current++;
            if(count<4){
                JOptionPane.showMessageDialog(this,"Correct answers= "+count+"\n FAIL");
            }
            else
                JOptionPane.showMessageDialog(this,"Correct answers= "+count+"\n PASS");
            System.exit(0);
        }
    }
    
    void set()
       {
            //  setting questions and options
            rb[4].setSelected(true);
            if (current==0)
            {
                l.setText("Q1) What is your name?");
                rb[0].setText("Dhruv");
                rb[1].setText("Deep");
                rb[2].setText("Rudraksh");
                rb[3].setText("Vishwa");
            }    
            if (current==1)
            {
                l.setText("Q2) What is your subject?");
                rb[0].setText("PP");
                rb[1].setText("EP");
                rb[2].setText("JP");
                rb[3].setText("DSAP");
            }   
            if (current==2)
            {
                l.setText("Q3) What is correct syntax to output 'hello world' in java?");
                rb[0].setText("print('hello world')");
                rb[1].setText("System.out.println('hello world')");
                rb[2].setText("console.writeline('hello world')");
                rb[3].setText("nota");
            }   
            if (current==3)
            {
                l.setText("Q4) How do you write single line comment in java?");
                rb[0].setText("using /*");
                rb[1].setText("using #");
                rb[2].setText("using //");
                rb[3].setText("all");
            }   
            if (current==4)
            {
                l.setText("Q5) Which statement is use to stop a loop?");
                rb[0].setText("return");
                rb[1].setText("exit");
                rb[2].setText("stop");
                rb[3].setText("break");
            }   
            if (current==5)
            {
                l.setText("Q6) Which operator is used to multiply numbers?");
                rb[0].setText("#");
                rb[1].setText("*");
                rb[2].setText("X");
                rb[3].setText("%");
            }   
            if (current==6)
            {
                l.setText("Q7) Which data type is used to create a variable that stores text?");
                rb[0].setText("Txt");
                rb[1].setText("string");
                rb[2].setText("MyString");
                rb[3].setText("String");
            }   
            if (current==7)
            {
                l.setText("Q8) Array indexes start with?");
                rb[0].setText("-1");
                rb[1].setText("1");
                rb[2].setText("0");
                rb[3].setText("NONE");
            }
            if (current==8)
            {
                l.setText("Q9) What is size of float in java?");
                rb[0].setText("64");
                rb[1].setText("32");
                rb[2].setText("34");
                rb[3].setText("62");
            }
            if (current==9)
            {
                l.setText("Q10) What is size of double in java?");
                rb[0].setText("64");
                rb[1].setText("32");
                rb[2].setText("34");
                rb[3].setText("62");
            }
        }
        boolean check()
        {
            //  evaluation
            if(current==0)
            {
                return rb[0].isSelected();
            }
            if(current==1)
                return rb[3].isSelected();
            if(current==2)
                return rb[1].isSelected();
            if(current==3)
                return rb[2].isSelected();
            if(current==4)
                return rb[3].isSelected();
            if(current==5)
                return rb[1].isSelected();
            if(current==6)
                return rb[3].isSelected();
            if(current==7)
                return rb[2].isSelected();
            if(current==8)
                return rb[1].isSelected();
            if(current==9)
                return rb[0].isSelected();
            
            else
                return false;
        }

    public static void main(String s[]){
        new cbt("Computer Based Test");
    }
}    
