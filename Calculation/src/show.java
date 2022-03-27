import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class show extends JFrame{
	private JPanel panel = new JPanel()
	{//设置背景  
        protected void paintComponent(Graphics g) {  
            Image bg;  
            try {  
                bg = ImageIO.read(new File("src/image/6.jpg"));  
                g.drawImage(bg, 0, 0, getWidth(), getHeight(), null);  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }; 
   
	private JLabel lun = new JLabel("第1轮");
	private JLabel qus = new JLabel("题目");
	private JLabel tans = new JLabel("你的答案");
	private JLabel qus1 = new JLabel("题目");
	private JLabel tans1 = new JLabel("你的答案");
	private JLabel time = new JLabel("本轮用时：");
	private JLabel score = new JLabel("本轮总分：");
	private JLabel tans01 = new JLabel("123+456");
	private JLabel tans02 = new JLabel("34");
	private JLabel tans03 = new JLabel("3");
	private JLabel tans04 = new JLabel("3");
	private JLabel tans05 = new JLabel("3");
	private JLabel tans06 = new JLabel("3");
	private JLabel tans07 = new JLabel("3");
	private JLabel tans08 = new JLabel("3");
	private JLabel tans09 = new JLabel("3");
	private JLabel tans10 = new JLabel("3");
	private JLabel tans11 = new JLabel("3");
	private JLabel tans12 = new JLabel("3");
	private JLabel tans13 = new JLabel("3");
	private JLabel tans14 = new JLabel("3");
	private JLabel tans15 = new JLabel("3");
	private JLabel tans16 = new JLabel("3");
	private JLabel tans17 = new JLabel("3");
	private JLabel tans18 = new JLabel("3");
	private JLabel tans19 = new JLabel("3");
	private JLabel tans20 = new JLabel("3");
	private static JLabel question1 = new JLabel("123+456");
	private static JLabel question2 = new JLabel("34");
	private static JLabel question3 = new JLabel("3");
	private static JLabel question4 = new JLabel("3");
	private static JLabel question5 = new JLabel("3");
	private static JLabel question6 = new JLabel("3");
	private static JLabel question7 = new JLabel("3");
	private static JLabel question8 = new JLabel("3");
	private static JLabel question9 = new JLabel("3");
	private static JLabel question10 = new JLabel("3");
	private static JLabel question11 = new JLabel("3");
	private static JLabel question12 = new JLabel("3");
	private static JLabel question13 = new JLabel("3");
	private static JLabel question14 = new JLabel("3");
	private static JLabel question15 = new JLabel("3");
	private static JLabel question16 = new JLabel("3");
	private static JLabel question17 = new JLabel("3");
	private static JLabel question18 = new JLabel("3");
	private static JLabel question19 = new JLabel("3");
	private static JLabel question20 = new JLabel("3");
	
	public show(List a_q,List o_a,int sum,String endTime){
		setBounds(100, 100, 1200,825);
		panel.setBackground(Color.WHITE);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		lun.setForeground(Color.black);//第一轮
		lun.setHorizontalAlignment(SwingConstants.CENTER);
		lun.setFont(new Font("华文楷体", Font.BOLD, 45));
		lun.setBackground(Color.BLUE);
		lun.setBounds(520, 30, 139, 71);
		panel.add(lun);
		
        question1.setForeground(Color.black);
		question1.setFont(new Font("华文楷体", Font.BOLD, 30));
		question1.setBounds(50, 190, 500, 53);
		panel.add(question1);
		
		question2.setForeground(Color.black);
		question2.setFont(new Font("华文楷体", Font.BOLD, 30));
		question2.setBounds(50,240 , 500, 53);
		panel.add(question2);
		
		question3.setForeground(Color.black);
		question3.setFont(new Font("华文楷体", Font.BOLD, 30));
		question3.setBounds(50, 290, 500, 53);
		panel.add(question3);
		
		question4.setForeground(Color.black);
		question4.setFont(new Font("华文楷体", Font.BOLD, 30));
		question4.setBounds(50, 340, 500, 53);
		panel.add(question4);
		
		question5.setForeground(Color.black);
		question5.setFont(new Font("华文楷体", Font.BOLD, 30));
		question5.setBounds(50, 390, 500, 53);
		panel.add(question5);
		
		question6.setForeground(Color.black);
		question6.setFont(new Font("华文楷体", Font.BOLD, 30));
		question6.setBounds(50, 440, 500, 53);
		panel.add(question6);
		
		question7.setForeground(Color.black);
		question7.setFont(new Font("华文楷体", Font.BOLD, 30));
		question7.setBounds(50, 490, 500, 53);
		panel.add(question7);
		
		question8.setForeground(Color.black);
		question8.setFont(new Font("华文楷体", Font.BOLD, 30));
		question8.setBounds(50, 540, 500, 53);
		panel.add(question8);
		
		question9.setForeground(Color.black);
		question9.setFont(new Font("华文楷体", Font.BOLD, 30));
		question9.setBounds(50, 590, 500, 53);
		panel.add(question9);
		
		question10.setForeground(Color.black);
		question10.setFont(new Font("华文楷体", Font.BOLD, 30));
		question10.setBounds(50, 640, 500, 53);
		panel.add(question10);
		
		question11.setForeground(Color.black);
		question11.setFont(new Font("华文楷体", Font.BOLD, 30));
		question11.setBounds(650, 190, 500, 53);
		panel.add(question11);
			
			
		question12.setForeground(Color.black);
		question12.setFont(new Font("华文楷体", Font.BOLD, 30));
		question12.setBounds(650,240 , 500, 53);
		panel.add(question12);
			
		question13.setForeground(Color.black);
		question13.setFont(new Font("华文楷体", Font.BOLD, 30));
		question13.setBounds(650, 290, 500, 53);
		panel.add(question13);
			
		question14.setForeground(Color.black);
		question14.setFont(new Font("华文楷体", Font.BOLD, 30));
		question14.setBounds(650, 340, 500, 53);
		panel.add(question14);
			
		question15.setForeground(Color.black);
		question15.setFont(new Font("华文楷体", Font.BOLD, 30));
		question15.setBounds(650, 390, 500, 53);
		panel.add(question15);
			
		question16.setForeground(Color.black);
		question16.setFont(new Font("华文楷体", Font.BOLD, 30));
		question16.setBounds(650, 440, 500, 53);
		panel.add(question16);
			
		question17.setForeground(Color.black);
		question17.setFont(new Font("华文楷体", Font.BOLD, 30));
		question17.setBounds(650, 490, 500, 53);
		panel.add(question17);
			
		question18.setForeground(Color.black);
		question18.setFont(new Font("华文楷体", Font.BOLD, 30));
		question18.setBounds(650, 540, 500, 53);
		panel.add(question18);
			
		question19.setForeground(Color.black);
		question19.setFont(new Font("华文楷体", Font.BOLD, 30));
		question19.setBounds(650, 590, 500, 53);
		panel.add(question19);
			
		question20.setForeground(Color.black);
		question20.setFont(new Font("华文楷体", Font.BOLD, 30));
		question20.setBounds(650, 640, 500, 53);
		panel.add(question20);
		
		tans01.setForeground(Color.black);
		tans01.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans01.setBounds(400, 190, 276, 53);
		panel.add(tans01);
			
		tans02.setForeground(Color.black);
		tans02.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans02.setBounds(400,240 , 276, 53);
		panel.add(tans02);
			
		tans03.setForeground(Color.black);
		tans03.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans03.setBounds(400, 290, 276, 53);
		panel.add(tans03);
			
		tans04.setForeground(Color.black);
		tans04.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans04.setBounds(400, 340, 276, 53);
		panel.add(tans04);
			
		tans05.setForeground(Color.black);
		tans05.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans05.setBounds(400, 390, 276, 53);
		panel.add(tans05);
			
		tans06.setForeground(Color.black);
		tans06.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans06.setBounds(400, 440, 276, 53);
		panel.add(tans06);
			
		tans07.setForeground(Color.black);
		tans07.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans07.setBounds(400, 490, 276, 53);
		panel.add(tans07);
			
		tans08.setForeground(Color.black);
		tans08.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans08.setBounds(400, 540, 276, 53);
		panel.add(tans08);
			
		tans09.setForeground(Color.black);
		tans09.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans09.setBounds(400, 590, 276, 53);
		panel.add(tans09);
			
		tans10.setForeground(Color.black);
		tans10.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans10.setBounds(400, 640, 276, 53);
		panel.add(tans10);
			
		tans11.setForeground(Color.black);
		tans11.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans11.setBounds(1000, 190, 276, 53);
		panel.add(tans11);
				
		tans12.setForeground(Color.black);
		tans12.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans12.setBounds(1000,240 , 276, 53);
		panel.add(tans12);
				
		tans13.setForeground(Color.black);
		tans13.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans13.setBounds(1000, 290, 276, 53);
		panel.add(tans13);
				
		tans14.setForeground(Color.black);
		tans14.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans14.setBounds(1000, 340, 276, 53);
		panel.add(tans14);
				
		tans15.setForeground(Color.black);
		tans15.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans15.setBounds(1000, 390, 276, 53);
		panel.add(tans15);
				
		tans16.setForeground(Color.black);
		tans16.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans16.setBounds(1000, 440, 276, 53);
		panel.add(tans16);
				
		tans17.setForeground(Color.black);
		tans17.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans17.setBounds(1000, 490, 276, 53);
		panel.add(tans17);
				
		tans18.setForeground(Color.black);
		tans18.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans18.setBounds(1000, 540, 276, 53);
		panel.add(tans18);
				
		tans19.setForeground(Color.black);
		tans19.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans19.setBounds(1000, 590, 276, 53);
		panel.add(tans19);
				
		tans20.setForeground(Color.black);
		tans20.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans20.setBounds(1000, 640, 276, 53);
		panel.add(tans20);
				
		qus1.setFont(new Font("华文楷体", Font.BOLD, 30));
		qus1.setBounds(650, 135, 128, 53);
		panel.add(qus1);
		
		tans1.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans1.setBounds(1000, 135, 128, 53);
		panel.add(tans1);
		
		qus.setFont(new Font("华文楷体", Font.BOLD, 30));
		qus.setBounds(50, 135, 128, 53);
		panel.add(qus);
		
		tans.setFont(new Font("华文楷体", Font.BOLD, 30));
		tans.setBounds(400, 135, 128, 53);
		panel.add(tans);
		
		time.setFont(new Font("华文楷体", Font.BOLD, 25));//00:00
		time.setBounds(800, 700, 186, 46);
		panel.add(time);
		
        score.setForeground(Color.black);
		score.setFont(new Font("华文楷体", Font.BOLD, 25));
		score.setHorizontalAlignment(SwingConstants.CENTER);
		score.setBounds(200, 700, 186, 46);
		panel.add(score);
		setVisible(true);
    	setVisible(true);
    	place(a_q,o_a,sum,endTime);
	}
	
	public static void main(String[] args) {
			try {
					login window=new login();
					window.show();
					
				} catch (Exception e) {
					e.printStackTrace();
				}	
	}
	
	public void place(List al_q,List own_a,int sum,String endTime) {
		System.out.println(al_q);
		question1.setText((String) al_q.get(0));
		question2.setText((String) al_q.get(1));
		question3.setText((String) al_q.get(2));
		question4.setText((String) al_q.get(3));
		question5.setText((String) al_q.get(4));
		question6.setText((String) al_q.get(5));
		question7.setText((String) al_q.get(6));
		question8.setText((String) al_q.get(7));
		question9.setText((String) al_q.get(8));
		question10.setText((String) al_q.get(9));
		question11.setText((String) al_q.get(10));
		question12.setText((String) al_q.get(11));
		question13.setText((String) al_q.get(12));
		question14.setText((String) al_q.get(13));
		question15.setText((String) al_q.get(14));
		question16.setText((String) al_q.get(15));
		question17.setText((String) al_q.get(16));
		question18.setText((String) al_q.get(17));
		question19.setText((String) al_q.get(18));
		question20.setText((String) al_q.get(19));
		
		tans01.setText((String) own_a.get(0));
		tans02.setText((String) own_a.get(1));
		tans03.setText((String) own_a.get(2));
		tans04.setText((String) own_a.get(3));
		tans05.setText((String) own_a.get(4));
		tans06.setText((String) own_a.get(5));
		tans07.setText((String) own_a.get(6));
		tans08.setText((String) own_a.get(7));
		tans09.setText((String) own_a.get(8));
		tans10.setText((String) own_a.get(9));
		tans11.setText((String) own_a.get(10));
		tans12.setText((String) own_a.get(11));
		tans13.setText((String) own_a.get(12));
		tans14.setText((String) own_a.get(13));
		tans15.setText((String) own_a.get(14));
		tans16.setText((String) own_a.get(15));
		tans17.setText((String) own_a.get(16));
		tans18.setText((String) own_a.get(17));
		tans19.setText((String) own_a.get(18));
		tans20.setText((String) own_a.get(19));
		
		score.setText("得分："+sum);
		
		time.setText("用时" + endTime);
	}
}
