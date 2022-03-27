import java.awt.Color;  
import java.awt.Graphics;  
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;  
  
import javax.swing.JFrame;  
  
public class Chart extends JFrame{  
    //��������ͳ��ͼ  
	ArrayList<Integer> ran=new  ArrayList<Integer>();
    public Chart(ArrayList<Integer> scores)
    {  
        super();  
        getContentPane().setForeground(Color.CYAN);
        setForeground(Color.CYAN);
        setBackground(Color.CYAN);
        for(int i=0;i<scores.size();i++)
        {
        	ran.add(scores.get(i));
        	System.out.println(scores.get(i));
        }   
        setTitle("��������ͼ");  
        setBounds(100, 100,800,860);  
        setDefaultCloseOperation(Chart.EXIT_ON_CLOSE);  
    }  
     
    public void paint(Graphics g)
    {  
    	int Width = getWidth();
        int Height = getHeight();
        int leftMargin = 20;//����ͼ��߽�
        int topMargin = 50;//����ͼ�ϱ߽�
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);//���ư�ɫ����
        g2.fillRect(0, 0, Width, Height-100);//���ƾ���ͼ
        g2.setColor(Color.black);
         for(int i=0;i<=10;i++)
         {
        	 //���ƻ�ɫ���ߺͰٷֱ�
             g2.drawString((100-10*i)+"", 15, topMargin+30*i);
             g2.drawLine(5, topMargin+30*i, Width, topMargin+30*i);//���ƻ�ɫ����
         }
         g2.setColor(Color.pink);
         for(int i=0;i<=ran.size();i++)
         {
        	 //��������ͼ
             int step = (i+1)*40;//����ÿ������ͼ��ˮƽ���Ϊ40
             //���ƾ���
             g2.fillRoundRect(leftMargin+step*2-5,(100-ran.get(i))*3+50, 40, 300-(100-ran.get(i))*3, 40, 10);
             //�г���������
             g2.drawString("��"+(i+1)+"��", leftMargin+step*2, 380);
         }    
    }
    
}  
