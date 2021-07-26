import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Formatter;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.*;
import helpers.GlobalProperties;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
//private Color ballColor = null;


public class mousekeylistener extends JPanel implements KeyListener,MouseListener {
    private static final int BOX_WIDTH = 640;
    private static final int BOX_HEIGHT = 480;
    private static final int RATE = 60;
    private File soundFile = new File("resources/snd16.wav");
    private File soundFile2 = new File("resources/soundwrong.wav");
    private Clip clip,clip2;
    private float ballRadius = 50;
    private float ballX = 360 - ballRadius;
    private float ballY = 290 - ballRadius;
    private float ballSpeedX = 6;
    private float ballSpeedY = 6;
    private int randomNumber=0;
    private boolean randomColorMode = false;
    private Color ballColor = null, numberColor = null;
    private Color backgroundColor;
    private static final float N = 64;
    private final Queue<Color> clut = new LinkedList<Color>();
    Timer timer2;
    JMenuBar menubar = new JMenuBar();
    JMenu menu = new JMenu("menu");
    public MovingLeftRight()
    {
        JMenu speed = new JMenu("speed");
        JMenu size = new JMenu("Size");
        menu.add(speed);
        menu.add(size);
        JMenuItem big = new JMenuItem("Big");
        JMenuItem small = new JMenuItem("small");
        JMenuItem middium = new JMenuItem("Medium");
        JMenuItem fast = new JMenuItem("Fast");
        JMenuItem normal = new JMenuItem("Normal");
        JMenuItem slow = new JMenuItem("Slow");
        speed.add(fast);
        speed.add(normal);
        speed.add(slow);
        size.add(big);
        size.add(small);
        size.add(middium);
        menubar.add(menu);
        this.addKeyListener(this);
        this.setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            AudioInputStream audioInputStream2 = AudioSystem.getAudioInputStream(soundFile2);
            AudioFormat audioFormat = audioInputStream.getFormat();
            AudioFormat audioFormat2 = audioInputStream2.getFormat(); 
            DataLine.Info dataLineInfo = new DataLine.Info(Clip.class, audioFormat);
            DataLine.Info dataLineInfo2 = new DataLine.Info(Clip.class, audioFormat2);
            clip = (Clip) AudioSystem.getLine(dataLineInfo);
            clip2 = (Clip) AudioSystem.getLine(dataLineInfo2);
            clip.open(audioInputStream);
            clip2.open(audioInputStream2);
        } 
        catch (Exception e)
        {
            e.printStackTrace(System.err);
        }
        Timer timer = new Timer(1000 / RATE, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                ballX += ballSpeedX;
                ballY += ballSpeedY;
                if (ballX - ballRadius < 0)
                {
                    ballSpeedX = -ballSpeedX;
                    ballX = ballRadius;
                    playSound();
                }
                else if (ballX + ballRadius > BOX_WIDTH)
                {
                    ballSpeedX = -ballSpeedX;
                    ballX = BOX_WIDTH - ballRadius;
                }
                if (ballY - ballRadius < 0)
                {
                  ballSpeedY = -ballSpeedY;
                  ballY = ballRadius ;
                }
                else if (ballY + ballRadius > BOX_HEIGHT)
                {
                  ballSpeedY = -ballSpeedY;
                  ballY = BOX_HEIGHT - ballRadius;
               }
                repaint();
            }
        });
        Timer timer2 = new Timer(4000, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               randomNumber=(int) Math.round(Math.random()*9);
            }
        });
        timer2.start();
        fast.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
            ballSpeedX = 9;
            ballSpeedY = 9;
        }
      });
       slow.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent event)
           {
             ballSpeedX = 3;
             ballSpeedY = 3;
          }
        });
       normal.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent event)
           {
           ballSpeedX =  5;
           ballSpeedY = 5;
        }
      });
       big.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent event)
           {
               ballRadius = 50;
          }
        });
       small.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent event)
           {
               ballRadius = 10;
           }
        });
        middium.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                ballRadius = 30;
        }
      });
      timer.start();
    }
    private void playSound() 
    {
        Runnable soundPlayer = new Runnable()
        {
            public void run()
            {
                try {
                    clip.setMicrosecondPosition(0);
                    clip.start();
                } 
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        };
        new Thread(soundPlayer).start();
    }
    private void playSound2()
    {
        Runnable soundPlayer2 = new Runnable() {
            public void run() {
                try {
                    clip2.setMicrosecondPosition(0);
                    clip2.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(soundPlayer2).start();
    }
    public void paintComponent(Graphics g)
    {
   }
   super.paintComponent(g);
   g.setColor(Color.BLACK);
   g.fillRect(0, 0, BOX_WIDTH, BOX_HEIGHT);
   g.setColor(Color.BLUE);
   g.fillOval((int) (ballX - ballRadius), (int) (ballY - ballRadius), (int) (2 * ballRadius), (int) (2 * ballRadius));
   g.setColor(Color.WHITE);
   int fontSize = (int) ballRadius;
   Font font = new Font("Arial", Font.PLAIN, fontSize);
   g.setFont(font);
   g.drawString(("" + randomNumber), (int) (ballX-ballRadius/3), (int) (ballY+ballRadius/3));
   g.setFont(new Font("Dialog", Font.PLAIN, 12));
   StringBuilder sb = new StringBuilder();
   Formatter formatter = new Formatter(sb);
   formatter.format("Ball @(%3.0f, %3.0f) Speed=(%2.0f, %2.0f)", ballX, ballY, ballSpeedX, ballSpeedY);
   g.drawString(sb.toString(), 20, 30);
 }
 public void keyPressed(KeyEvent e)
 {
     int keyCode = e.getKeyCode();
     if(keyCode == KeyEvent.VK_1)
     {
         System.out.printf("Correct!");
      }
      else
      {
          e.consume();
      }
  }
  public void keyReleased(KeyEvent e)
  {
  }
  public void keyTyped(KeyEvent e)
  {
  }
  public void mouseClicked(MouseEvent arg0)
  {
  }
  public void mouseEntered(MouseEvent arg0)
  {
  }
  public void mouseExited(MouseEvent arg0)
  {
  }
  public void mousePressed(MouseEvent e)
  {
  }
  public void mouseReleased(MouseEvent arg0)
  {
  }
  public static void main(String asd[])
  {
      javax.swing.SwingUtilities.invokeLater(new Runnable()
      {
          public void run()
          {
                MovingLeftRight Ani = new MovingLeftRight();
                JFrame frame = new JFrame("A Moving Ball");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(Ani);
                frame.setJMenuBar(Ani.menubar);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}