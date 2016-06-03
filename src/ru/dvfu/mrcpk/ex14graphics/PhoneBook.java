package ru.dvfu.mrcpk.ex14graphics;

import ru.dvfu.mrcpk.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook extends JFrame implements Runnable
{
    List<Person> persons = new ArrayList<>();

    List<JButton> jButtonList = new ArrayList<>();

    JLabel jLabel = new JLabel("Text");

    JTextField jTextField = new JTextField("Text");

    JButton bAdd = new JButton("Add");
    JButton bDel = new JButton("Del");

    Box inBox;
    Box box1;

    public PhoneBook(){
        persons.add(new Person("Alexey","Ivanov",222333));
        persons.add(new Person("Nikolay","Petrov",222333));
        persons.add(new Person("Oleg","Sidorov",222333));
        persons.add(new Person("Ilya","Vanin",222333));
    }

    @Override
    public void run()
    {
        SimpleFrame simpleFrame = new SimpleFrame("Адресная книга");
        JPanel jPanel1 = new JPanel();
        jPanel1.setBorder(BorderFactory.createTitledBorder("Список пользователей:"));

        box1 = Box.createVerticalBox();
        inBox = Box.createHorizontalBox();
        inBox.add(new JLabel(""));
        inBox.add(new JLabel("Имя",10));
        inBox.add(new JLabel("Фамилия",10));
        inBox.add(new JLabel("Номер Телефона",10));
        box1.add(inBox);

        for(Person p: persons){
            inBox = Box.createHorizontalBox();
            inBox.add(new JCheckBox());
            inBox.add(new JTextField(p.getFirstName(),10));
            inBox.add(new JTextField(p.getLastName(),10));
            inBox.add(new JTextField(String.valueOf(p.getPhoneNumber()),10));
            JButton jButtonDel =  new JButton("Del");
            inBox.add(jButtonDel);

            box1.add(inBox);

            jButtonDel.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    jLabel.setText(p.getLastName());
                    jTextField.setText(p.getFirstName() + " " + persons.indexOf(p));
                    box1.remove(persons.indexOf(p));
                    persons.remove(persons.indexOf(p));
                    jPanel1.updateUI();
                    simpleFrame.pack();
                }
            });
        }


        box1.add(jLabel);

        inBox = Box.createHorizontalBox();
//        inBox.add(new JTextField("",2));
        JTextField jTextFieldName1 = new JTextField("Имя",10);
        inBox.add(jTextFieldName1);
        JTextField jTextFieldName2 = new JTextField("Фамилия",10);
        inBox.add(jTextFieldName2);
        JTextField jTextFieldTel3 = new JTextField("Номер телефона",10);
        inBox.add(jTextFieldTel3);
        box1.add(inBox);

//        box1.add(jTextField);
        jPanel1.add(box1);

        Box boxButtonBottom = Box.createHorizontalBox();
        boxButtonBottom.add(bAdd);
        boxButtonBottom.add(bDel);
        box1.add(boxButtonBottom);

        bAdd.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println(jTextFieldTel3.getText().matches("\\d+"));
                if(jTextFieldTel3.getText().matches("\\d+"))
                persons.add(new Person(jTextFieldName1.getText(),jTextFieldName2.getText(),Integer.parseInt(jTextFieldTel3.getText())));
                else
                    persons.add(new Person(jTextFieldName1.getText(),jTextFieldName2.getText(),123456));

                inBox = Box.createHorizontalBox();
                inBox.add(new JCheckBox());
                inBox.add(new JTextField(persons.get(persons.size()-1).getFirstName(),10));
                inBox.add(new JTextField(persons.get(persons.size()-1).getLastName(),10));
                inBox.add(new JTextField(String.valueOf(persons.get(persons.size()-1).getPhoneNumber()),10));
                JButton jButtonDel = new JButton("Del");
                inBox.add(jButtonDel);
                box1.add(inBox,persons.size());
                jPanel1.updateUI();
                simpleFrame.pack();

                jButtonDel.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        jLabel.setText(persons.get(persons.size()-1).getFirstName());
                        jTextField.setText(persons.get(persons.size()-1).getFirstName() + " " + persons.size());
                        box1.remove(persons.size()-1);
                        persons.remove(persons.size()-1);
                        jPanel1.updateUI();
                        simpleFrame.pack();
                    }
                });
            }
        });



        simpleFrame.getContentPane().add(jPanel1);
        simpleFrame.pack();
        simpleFrame.setVisible(true);

    }

    public static void main(String[] args)
    {
        PhoneBook phoneBook=new PhoneBook();
        EventQueue.invokeLater(phoneBook);
    }
}
