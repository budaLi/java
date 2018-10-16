package myfirst;
import java.awt.*;
import javax.swing.*;
public class Project extends JFrame{
	
	//加载图片
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100;
	double y=100;
	double degree = 3.14/3;
	boolean right=true;	//方向
	//画窗口
	public void  paint(Graphics g) {
		System.out.println("窗口画");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		x  = x+ 10*Math.cos(degree);
        y  = y +10*Math.sin(degree); 
         
        //碰到上下边界
        if(y>500-40-30||y<40+40){//500是窗口高度；40是桌子边框，30是球直径；最后一个40是标题栏的高度
            degree = -degree;
        }
         
        //碰到左右边界
        if(x<40||x>856-40-30){
            degree = 3.14 - degree;
        }
         
    }
	
	
	
	
	//窗口加载
	void launchFrame() {
		setSize(865,500);
		setLocation(50,50);	//不设置会默认出现在左上角
		setVisible(true);		//不设置为true不可见
		
		while(true) {
			repaint();
			try {
				
				//40毫秒 也就是一秒画25次
				Thread.sleep(40);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	



	//程序执行的入口
	public static void main(String[] args) {
		System.out.println("123");
		Project game=new Project();
		game.launchFrame();
		
	}
}
