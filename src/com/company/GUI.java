package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    JTextField textField;
    JButton button_1;
    JButton button_2;
    JButton button_3;
    JButton button_4;
    JButton button_5;
    JButton button_6;
    JButton button_7;
    JButton button_8;
    JButton button_9;
    JButton button_0;
    JButton button_dec;
    JButton button_clr;
    JButton button_del;
    JButton button_eq;
    JButton button_add;
    JButton button_sub;
    JButton button_mltp;
    JButton button_div;
    String number_1 = "";
    String number_2 = "";
    double digit_1 = 0;
    double digit_2 = 0;
    double result = 0;
    char operator = ' ';

    public GUI() {

        textField = new JTextField();
        button_1 = new JButton("1");
        button_2 = new JButton("2");
        button_3 = new JButton("3");
        button_4 = new JButton("4");
        button_5 = new JButton("5");
        button_6 = new JButton("6");
        button_7 = new JButton("7");
        button_8 = new JButton("8");
        button_9 = new JButton("9");
        button_0 = new JButton("0");
        button_dec = new JButton(".");
        button_clr = new JButton("Clear");
        button_del = new JButton("Delete");
        button_eq = new JButton("=");
        button_add = new JButton("+");
        button_sub = new JButton("-");
        button_mltp = new JButton("*");
        button_div = new JButton("/");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(290,460);
        this.setTitle("Kalkulator");
        this.setLayout(null);
        this.setVisible(true);

        this.add(textField);
        textField.setBounds(20, 20, 230, 50);
        textField.setEditable(false);
        textField.setFont(new Font("BOLD", Font.BOLD, 25));
        textField.setText("0");

        this.add(button_1);
        button_1.setBounds(20, 80, 50, 50);
        button_1.addActionListener(this);
        this.add(button_2);
        button_2.setBounds(80, 80, 50, 50);
        button_2.addActionListener(this);
        this.add(button_3);
        button_3.setBounds(140, 80, 50, 50);
        button_3.addActionListener(this);
        this.add(button_4);
        button_4.setBounds(20, 150, 50, 50);
        button_4.addActionListener(this);
        this.add(button_5);
        button_5.setBounds(80, 150, 50, 50);
        button_5.addActionListener(this);
        this.add(button_6);
        button_6.setBounds(140, 150, 50, 50);
        button_6.addActionListener(this);
        this.add(button_7);
        button_7.setBounds(20, 220, 50, 50);
        button_7.addActionListener(this);
        this.add(button_8);
        button_8.setBounds(80, 220, 50, 50);
        button_8.addActionListener(this);
        this.add(button_9);
        button_9.setBounds(140, 220, 50, 50);
        button_9.addActionListener(this);
        this.add(button_0);
        button_0.setBounds(20, 290, 50, 50);
        button_0.addActionListener(this);
        this.add(button_dec);
        button_dec.setBounds(80, 290, 50, 50);
        button_dec.addActionListener(this);
        this.add(button_eq);
        button_eq.setBounds(140, 290, 50, 50);
        button_eq.addActionListener(this);
        this.add(button_div);
        button_div.setBounds(200, 80, 50, 50);
        button_div.addActionListener(this);
        this.add(button_mltp);
        button_mltp.setBounds(200, 150, 50, 50);
        button_mltp.addActionListener(this);
        this.add(button_sub);
        button_sub.setBounds(200, 220, 50, 50);
        button_sub.addActionListener(this);
        this.add(button_add);
        button_add.setBounds(200, 290, 50, 50);
        button_add.addActionListener(this);
        this.add(button_clr);
        button_clr.setBounds(20, 360, 110, 50);
        button_clr.addActionListener(this);
        this.add(button_del);
        button_del.setBounds(140,360,110,50);
        button_del.addActionListener(this);

    }

    private void making_number(int digit) {
        if (operator == ' ') {
            number_1 = number_1 + digit;
        } else {
            number_2 = number_2 + digit;
        }
    }

    private void set_number() {
        if (operator == ' ') {
            digit_1 = Double.parseDouble(number_1);
            textField.setText(number_1);
        } else {
            digit_2 = Double.parseDouble(number_2);
            textField.setText(number_2);
        }
    }

    private void print_result() {
        textField.setText(String.valueOf(result));
        digit_1 = result;
        digit_2=0;
        number_1= String.valueOf(result);
        number_2 = "";
        operator = ' ';
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button_1) {
            making_number(1);
            set_number();
        }

        if (e.getSource() == button_2) {
            making_number(2);
            set_number();
        }

        if (e.getSource() == button_3) {
            making_number(3);
            set_number();
        }

        if (e.getSource() == button_4) {
            making_number(4);
            set_number();
        }

        if (e.getSource() == button_5) {
            making_number(5);
            set_number();
        }

        if (e.getSource() == button_6) {
            making_number(6);
            set_number();
        }

        if (e.getSource() == button_7) {
            making_number(7);
            set_number();
        }

        if (e.getSource() == button_8) {
            making_number(8);
            set_number();
        }

        if (e.getSource() == button_9) {
            making_number(9);
            set_number();
        }

        if (e.getSource() == button_0) {
            making_number(0);
            set_number();
        }

        if (e.getSource() == button_add) {
            operator = '+';
        }
        if (e.getSource() == button_sub) {
            operator = '-';
        }
        if (e.getSource() == button_mltp) {
            operator = '*';
        }
        if (e.getSource() == button_div) {
            operator = '/';
        }

        if (e.getSource() == button_eq) {
            switch (operator) {
                case '+' -> {
                    result = Calculator.add(digit_1, digit_2);
                    print_result();
                }
                case '-' -> {
                    result = Calculator.sub(digit_1, digit_2);
                    print_result();
                }
                case '*' -> {
                    result = Calculator.multiply(digit_1, digit_2);
                    print_result();
                }
                case '/' -> {
                    if (digit_2 == 0) {
                        textField.setText("Error");
                        number_1="";
                        number_2="";
                        digit_1=0;
                        digit_2=0;
                        operator=' ';
                        result=0;
                    } else {
                        result = Calculator.divide(digit_1, digit_2);
                        print_result();
                    }
                }
            }
        }

        if (e.getSource() == button_clr) {
            number_1 = "";
            number_2 = "";
            operator = ' ';
            textField.setText("0");
        }

        if (e.getSource() == button_dec) {
            if (operator == ' ') {
                number_1 = number_1 + ".";
                textField.setText(number_1);
            } else {
                number_2 = number_2 + ".";
                textField.setText(number_2);
            }
        }

        if(e.getSource() == button_del){
            if(operator == ' '){
                number_1=number_1.substring(0,number_1.length()-1);
                textField.setText(number_1);
            }
            else{
                number_2=number_2.substring(0,number_2.length()-1);
                textField.setText(number_2);
            }
            set_number();

        }
    }
}
