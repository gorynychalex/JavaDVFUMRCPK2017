package ru.dvfu.mrcpk.ex14graphics;

import javax.swing.*;

public class SimpleFrame extends JFrame
{
    //Размеры окна
    private static final int DEFAULT_WIDTH=300;
    private static final int DEFAULT_HEIGHT=200;

    //Конструктор этого класса
    public SimpleFrame(String s)
    {
        super(s);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
