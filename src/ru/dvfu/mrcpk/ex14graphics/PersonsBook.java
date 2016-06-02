package ru.dvfu.mrcpk.ex14graphics;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class PersonsBook extends JFrame implements Runnable
{
    ArrayList<String> persons = new ArrayList<>();
    java.util.List<JButton> jButtonList;
    DefaultListModel defaultListModel;
    JList list;
    JTextField jTextField;

    Box box;

    public PersonsBook(){
        persons.add("Иванов Иван Иванович, 222333");
        persons.add("Сидоров Сидр Сидорович, 333444");
        persons.add("Петров Петр Петрович, 444555");
        persons.add("Васильев Василий Васильевич, 555666");
    }


    @Override
    public void run()
    {
        BookSimpleFrame simpleFrame = new BookSimpleFrame();
        JPanel jPanel1 = new JPanel();
        jPanel1.setBorder(BorderFactory.createTitledBorder("Список пользователей:"));

        defaultListModel = new DefaultListModel();
        jButtonList=new ArrayList<>();
        box = Box.createVerticalBox();

        for(String s: persons)
        {
            defaultListModel.addElement(s);
        }


        // Список значений
        list=new JList(defaultListModel);
        list.setSelectedIndex(0);
        list.setFocusable(false);

        box.add(new JScrollPane(list),BorderLayout.CENTER);

        jTextField=new JTextField();
        box.add(jTextField);

        //-------- BUTTONS ----------------
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 0));
        box.add(buttonsPanel, BorderLayout.SOUTH);

        JButton addButton = new JButton("Добавить");
        addButton.setFocusable(false);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String element = jTextField.getText();
                defaultListModel.addElement(element);
                int index = defaultListModel.size() - 1;
                list.setSelectedIndex(index);
                list.ensureIndexIsVisible(index);
            }
        });
        buttonsPanel.add(addButton);

        final JButton removeButton = new JButton("Удалить");
        removeButton.setFocusable(false);
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                defaultListModel.remove(list.getSelectedIndex());
            }
        });

        buttonsPanel.add(removeButton);

        list.addListSelectionListener(new ListSelectionListener()
                                      {
                                          public void valueChanged(ListSelectionEvent e)
                                          {
                                              if (list.getSelectedIndex() >= 0)
                                              {
                                                  removeButton.setEnabled(true);
                                                  jTextField.setText(String.valueOf(list.getSelectedValue()));
                                              } else
                                              {
                                                  removeButton.setEnabled(false);
                                              }
                                          }
                                      });


        //---ADD PANEL------------------------------
        jPanel1.add(box);

        simpleFrame.getContentPane().add(jPanel1);

        simpleFrame.pack();
        simpleFrame.setVisible(true);
    }

    public static void main(String[] args)
    {
        PersonsBook personsBook = new PersonsBook();

        EventQueue.invokeLater(personsBook);
    }
}

class BookSimpleFrame extends JFrame
{
    //Размеры окна
    private static final int DEFAULT_WIDTH=400;
    private static final int DEFAULT_HEIGHT=300;

    //Конструктор этого класса
    public BookSimpleFrame(){
        super("Справочник пользователей");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                super.windowClosing(e);
            }
        });
    }
}

