import java.sql.Connection;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.Collections;  
import java.util.List;  
public class DBOperation{  //�û�ע�����¼
    private MyDBConnection myDB=null;  
    private Connection conn=null;  
    private Statement stmt=null;  
    private int scores;  
    private int number1=0;  
    private int number2=0;  
    private String name;  
    private String password;  
    public DBOperation(MyDBConnection myDB)
    {  
        conn=myDB.getMyConnection();//ȡ�ö���  
        stmt=myDB.getMyStatement();//ȡ��sql���  
    }  
    public void insertData(String name,String password,int scores){  
        try{  
            String newType1=new String(name.getBytes(),"GBK");//�ֽ�ת��  
            String newType2=new String(password.getBytes(),"GBK");  
            String sql="INSERT INTO user(scores,name,password)VALUES("+scores+",'"+newType1+"','"+newType2+"')";  
            stmt.executeUpdate(sql);//�������  
        }catch(Exception e1){  
            e1.printStackTrace();  
        }  
    }  
    public void deleteData(int scores){  
        String sql="DELETE FROM user WHERE scores="+scores+"";  
        System.out.print(sql);  
        try{  
            stmt.executeUpdate(sql);  
            //System.out.println("һ����¼��ɾ��");  
        }catch(SQLException e){  
            e.printStackTrace();  
        }  
    }  
    public void updateData(int mscores,int scores,String name,String password){//�޸�  
        String sql="UPDATE user SET scores="+scores+",name='"+name+"',password='"+password+"'where scores="+mscores+"&&name='"+name+"'&&password='"+password+"'";  
        try{  
            stmt.executeUpdate(sql);  
        }catch(SQLException e){  
            e.printStackTrace();  
        }  
    }  
    public boolean  selectPassword(String mpassword){//��ѯ����  
        String sql="SELECT scores,name,password FROM user";  
        try{  
            ResultSet rs=stmt.executeQuery(sql);//���ؽ����      
            while(rs.next()){//ָ������ƶ�  
                password=rs.getString("password");  
                number2++;  
                if(password.equals(mpassword)&&(number2==number1)){  
                    return true;  
                }  
            }  
              
        }catch(Exception e){  
            e.printStackTrace();  
        }  
        return false;  
    }  
    public boolean selectName(String mname){//��ѯid  
        String sql="SELECT scores,name,password FROM user";  
        try{  
            ResultSet rs=stmt.executeQuery(sql);//���ؽ����  
            while(rs.next()){//ָ������ƶ�  
                name=rs.getString("name");  
                number1++;  
                if(name.equals(mname)){  
                    //System.out.print("number1:"+number1);  
                    return true;  
                }  
            }  
              
              
        }catch(Exception e){  
            e.printStackTrace();  
        }  
        return false;  
    }  
    public int getScores(){  
        return scores;  
    }  
    public String getName(){  
        return name;  
    }  
    public String getPassword(){  
        return password;  
    }  
      
    public void setNumber1(){  
        number1=0;  
    }  
    public void setNumber2(){  
        number2=0;  
    }  
}