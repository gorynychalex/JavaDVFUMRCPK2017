package ru.dvfu.mrcpk.ex14graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;

/**
 * Класс-приложение: вывод ip-address
 */
public class Demo01ip {
    public static void main(String[] args)
    {
        //Создание очереди потоков
        //почти как new Thread(new Runnable())
        EventQueue.invokeLater(new Runnable()
        {
            //Метод для создания нового потока
            @Override
            public void run()
            {
                //Объект базового окна
                FirstSimpleFrame simpleFrame = new FirstSimpleFrame();

                //Добавление слушателя для регистрации нажатий
                simpleFrame.addWindowListener(new WindowAdapter()
                {
                    @Override
                    public void windowClosing(WindowEvent e)
                    {
                        super.windowClosing(e);
                    }
                });

                //Объявление переменной для ip-address
                String ip = null;
                try
                {
                    //Инициализация переменной через вызов
                    ip = InetAddress.getLocalHost().getHostAddress().toString();

                }catch (Exception e){
                    ip = "Error find IP";
                }

                //Создание панели отображения
                JPanel jPanel1 = new JPanel();

                //Установка названия окна
                jPanel1.setBorder(BorderFactory.createTitledBorder("Текущий ip-адрес"));

                //Добавляем адрес
                jPanel1.add(new JLabel("     " + ip + "     "));

                //Добавляем текстовое поле
                jPanel1.add(new JTextArea("New ip = " + ip));

                //Добавление панели отображения на главное окно
                simpleFrame.getContentPane().add(jPanel1);
                simpleFrame.pack();

                // Делаем видимость окна
                simpleFrame.setVisible(true);
            }
        });
    }

}

// Класс для создания базового окна приложения
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