package java2.hw4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ChatFrame extends JFrame {
    public ChatFrame() {
        setTitle("Custom chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200,200,800,600);
        setVisible(true);

        setLayout(new BorderLayout());

        JPanel chatArea = new JPanel();
        chatArea.setLayout(new BorderLayout());
        JTextPane  textArea = new JTextPane ();
        chatArea.add(textArea, BorderLayout.CENTER);
        textArea.setEditable(false);
        StringBuilder sb = new StringBuilder();

        JPanel inputField = new JPanel();
        inputField.setLayout(new BorderLayout());
        JTextField textField = new JTextField();
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 10) {

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode()==10){
                    sb.append(textField.getText());
                    sb.append("\n");
                    //                   System.out.print(sb.toString());
                    textArea.setText(sb.toString());
                    textField.setText("");
                }
            }
        });
        inputField.add(textField, BorderLayout.CENTER);
        JButton enter = new JButton("ENTER");
        enter.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sb.append(textField.getText());
                sb.append("\n");
                textArea.setText(sb.toString());
                textField.setText("");
            }
        });
        inputField.add(enter, BorderLayout.LINE_END);

        add(chatArea, BorderLayout.CENTER);
        add(inputField, BorderLayout.PAGE_END);
    }



    }


