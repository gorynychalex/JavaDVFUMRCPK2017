package ru.dvfu.mrcpk.ex14graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;

/**
 * ip-address
 */
public class Demo01ip {
    public static void main(String[] args)
    {

        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                FirstSimpleFrame simpleFrame = new FirstSimpleFrame();
                simpleFrame.addWindowListener(new WindowAdapter()
                {
                    @Override
                    public void windowClosing(WindowEvent e)
                    {
                        super.windowClosing(e);
                    }
                });

                String ip = null;
                try
                {
                    ip = InetAddress.getLocalHost().getHostAddress().toString();
                }catch (Exception e){
                    ip = "Error find IP";
                }

                JPanel jPanel1 = new JPanel();
                jPanel1.setBorder(BorderFactory.createTitledBorder("Текущий ip-адрес"));
                jPanel1.add(new JLabel("     " + ip + "     "));
                jPanel1.add(new JTextArea("New ip = " + ip));
                simpleFrame.getContentPane().add(jPanel1);
                simpleFrame.pack();

                simpleFrame.setVisible(true);
            }
        });
    }

}
class FirstSimpleFrame extends JFrame{
    //Размеры окна
    private static final int DEFAULT_WIDTH=300;
    private static final int DEFAULT_HEIGHT=200;

    //Конструктор этого класса
    public FirstSimpleFrame(){
        super("Новое приложение First SWING");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new FlowLayout());
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        setLocationByPlatform(false);

    }
}