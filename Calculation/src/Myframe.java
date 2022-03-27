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

public class Myframe extends JFrame {

	private JPanel panel = new JPanel()
	{//���ñ���  
        protected void paintComponent(Graphics g) {  
            Image bg;  
            try {  
                bg = ImageIO.read(new File("src/image/g.jpeg"));  
                g.drawImage(bg, 0, 0, getWidth(), getHeight(), null);  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }; 
	private JTextField answer;
	private JLabel lun = new JLabel("�� 1 ��");;
	private JLabel scorelb = new JLabel("�÷�:");
	private static JLabel question = new JLabel("____________");
	private JLabel num = new JLabel("1");
	private JLabel timelb = new JLabel("��ʱ��");
	private JLabel time = new JLabel("00:00");
	private JLabel score = new JLabel("0");
	private JButton nextbtn = new JButton("��һ��");
	private JButton drawlb = new JButton("�ɼ�ͼ��");
	private final JButton startbtn = new JButton("��ʼ����");
	private JLabel judge = new JLabel("��������");
	long startTime;
	int ans=0,count =1, clun=1;
	String sans;
	int sum=0;
	int tans=0; 
	ArrayList<Integer> scorelist=new ArrayList<>();
	
	Boolean flag=false;
	static String qus=new String("");
	static Random r = new Random();
	static int s=r.nextInt(10000)+1;
	
	public Myframe() {	
		startTime = new Date().getTime();
		setBounds(100, 100, 821, 643);
		panel.setBackground(Color.WHITE);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		lun.setForeground(Color.black);//��һ��
		lun.setHorizontalAlignment(SwingConstants.CENTER);
		lun.setFont(new Font("��Բ", Font.BOLD, 30));
		lun.setBackground(Color.BLUE);
		lun.setBounds(339, 80, 139, 71);
		panel.add(lun);
		scorelb.setFont(new Font("���Ŀ���", Font.BOLD, 21));//�÷�
		scorelb.setBounds(252, 339, 72, 46);
		panel.add(scorelb);
		num.setToolTipText("");
		num.setHorizontalAlignment(SwingConstants.CENTER);
		num.setBorder(new LineBorder(new Color(0, 204, 51), 3, true));
		num.setFont(new Font("Kristen ITC", Font.BOLD, 17));
		num.setBackground(new Color(176, 224, 230));
		num.setBounds(234, 209, 45, 34);
		panel.add(num);
		question.setForeground(new Color(176,224,230));
		question.setFont(new Font("Kristen ITC", Font.BOLD, 32));
		question.setBounds(298, 205, 276, 53);
		panel.add(question);
		answer = new JTextField();
		answer.setFont(new Font("Kristen ITC", Font.BOLD, 32));
		answer.setBounds(588, 205, 128, 53);
		panel.add(answer);
		answer.setColumns(10);
		judge.setFont(new Font("���Ŀ���", Font.BOLD, 21));//��ʱ
		judge.setBounds(470, 250, 400, 53);
		panel.add(judge);
		timelb.setFont(new Font("���Ŀ���", Font.BOLD, 21));//��ʱ
		timelb.setBounds(252,429, 186, 46);
		panel.add(timelb);
		time.setFont(new Font("���Ŀ���", Font.BOLD, 21));//00:00
		time.setBounds(315, 429, 186, 46);
		panel.add(time);
		nextbtn.setBackground(new Color(176, 224, 230));
		
		
		//��һ���¼�����
		nextbtn.addActionListener(new ActionListener() {
			String endTime;
			public void actionPerformed(ActionEvent e) {
				
				boolean over;
				over = nextbtn.getText().equals("�������");
				if(!over) {
				test();
				if(!judge.getText().equals("�����쳣")){
				boolean isend;
				isend=nextbtn.getText().equals("�ύ");
				if(! isend)
				{
					count = count+1;
					num.setText(""+count);
					answer.setText("");
					acquire();
					if(count==20){
						nextbtn.setText("�ύ");
				}
				}
				else
				{
					scorelist.add(sum);	
					System.out.println("sum"+sum);
					System.out.println("list" + scorelist);
					endTime = time.getText();
					int value=JOptionPane.showConfirmDialog(null, "��ǰ�÷֣�"+sum+"���Ƿ������һ�֣�", "��ʾ��Ϣ", JOptionPane.YES_NO_OPTION);
					if (value==JOptionPane.NO_OPTION) {
						nextbtn.setText("�������");
					}
					else if (value==JOptionPane.YES_OPTION) {
						show s = new show(all_question,own_answer,sum,endTime);
						System.out.println("��ѡ������");
						nextbtn.setText("��һ��");
						startTime = new Date().getTime();
						count =1;
						num.setText(""+count);
						clun=clun+1;
						lun.setText("�� "+clun+" ��");  
						all_question.clear();
						own_answer.clear();
						sum=0;
						answer.setText("");
						acquire();
					}
					
				}
				
		}
				}
				else {
					for(int i=0;i<20;i++)
						System.out.println(all_question.get(i));
					for(String strl:own_answer)
						System.out.println(strl);
					System.out.println(own_answer);
					show s = new show(all_question,own_answer,sum,endTime);
				}
			}
		});
		
		nextbtn.setFont(new Font("���Ŀ���", Font.BOLD, 17));//��һ��
		nextbtn.setBounds(479, 334, 113, 46);
		panel.add(nextbtn);
		score.setForeground(Color.black);
		score.setFont(new Font("Kristen ITC", Font.BOLD, 22));
		score.setHorizontalAlignment(SwingConstants.CENTER);
		score.setBounds(298, 346, 56, 34);
		panel.add(score);
		drawlb.setBackground(new Color(176, 224, 230));

		//�ɼ�ͼ���¼�����
		drawlb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chart demo = new Chart(scorelist); 
				System.out.println("scorelist" + scorelist);
		        demo.setVisible(true);
			}
		});
		drawlb.setFont(new Font("���Ŀ���", Font.BOLD, 17));//�ɼ�ͼ��
		drawlb.setBounds(479, 432, 113, 46);
		panel.add(drawlb);
		startbtn.setForeground(new Color(0,0,0));
		startbtn.setBackground(new Color(255, 204, 204));
		
		//��ʼ�����¼�����
		startbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				all_question.clear();
				own_answer.clear();
				nextbtn.setText("��һ��");
				startTime = new Date().getTime();
				score.setText("0");
				count = 1;
				num.setText(""+count);
				this.timer();
				acquire();
				
			}
			
			public void timer() {
				new Thread() {
					public void run() {
						while (true) {
							try {
								Thread.sleep(1000);
								long seconds = (new Date().getTime() - startTime) / 1000;
								long mm = seconds / 60;
								long ss = seconds % 60;
								time.setText((mm < 10 ? "0" + mm : "" + mm) + ":" + (ss < 10 ? "0" + ss : "" + ss));
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}.start();
			}

		});
		startbtn.setFont(new Font("���Ŀ���", Font.BOLD, 20));
		startbtn.setBounds(164, 58, 128, 41);
		
		panel.add(startbtn);
	}	
	
	List<String> all_question = new ArrayList<String>();
	List<String> own_answer = new ArrayList<String>();
	
	//��ȡ��ʹ�
	public void acquire()
	{
		Calculate ca = new Calculate();
		System.out.println(all_question);
		ca.calculate();
				qus=ca.qus;	
				System.out.println("����:"+ca.qus);
				tans = ca.ans;
				System.out.println("���еĴ�:"+ca.ans);
				all_question.add(qus+'='+tans);
				System.out.println("���е���ȷ��:"+tans);
				question.setText(qus);		
				
	}	
//��ȡ���Լ��ȶ�
	public void test(){
		
		try {
				
				System.out.println("��ȷ���ǣ�" + tans);
				String str = answer.getText();
				try{
					int c = Integer.parseInt(str);
;				} catch(NumberFormatException e){
					e.printStackTrace();
					System.out.println("�����쳣");
					judge.setText("�����쳣");
				}
				own_answer.add(str);
				System.out.println("���Լ����ǣ�" + own_answer);
				if(str.equals("")) 
					str = ""+0;
				ans=Integer.parseInt(str.trim());  //ɾ���ո��ַ�
				System.out.println("������Ĵ��ǣ�" + ans);
				System.out.println(ans);
				System.out.println(tans);
				if(tans==ans&&ans!=0)
				{
					flag=true;
					judge.setText("");
				}
				else {
					flag=false;
					judge.setText("");
				}
					
				System.out.println(flag);
				if(flag)
				{
					 sum = sum+5;
					score.setText(String.valueOf(sum));
				}
				else 
					score.setText(String.valueOf(sum));
				
				System.out.println("��Ŀǰ���ܷ��ǣ�" + sum);
		} 
		catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
 }

