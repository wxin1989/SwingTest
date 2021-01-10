package my;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame1 extends JFrame {

    JPanel cards = new JPanel();

    public MyFrame1(String title) {

        super(title);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(cards, BorderLayout.CENTER);

        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("");
        model.addElement("aab");
        model.addElement("add");
        model.addElement("agg");
        model.addElement("acd");
        model.addElement("awb");
        model.addElement("add");
        model.addElement("aee");
        model.addElement("aadf");
        model.addElement("abaf");
        model.addElement("aadf");
        model.addElement("awb");
        model.addElement("awb");

        Color btnColor=new Color(213, 215, 211);
        JComboBox cmb = new JAutoCompleteComboBox(model);
        cmb.setBackground(btnColor);
        JPanel p1 = new JPanel();
        ImageIcon btnIcon = new ImageIcon("src/main/resources/images/start.png");
        ImageIcon btnIcon2 = new ImageIcon("src/main/resources/images/start2.png");
        JButton btn = new JButton("start 🚀");
//        btn.setPressedIcon(btnIcon2);
//        btn.setSize(30,30);
//        btn.setBorderPainted(false);
//        btn.setContentAreaFilled(false);

        btn.setBackground(btnColor);
        btn.setFocusPainted(false);
        btn.addActionListener(new ActionListener() {
                                  @Override
                                  public void actionPerformed(ActionEvent e) {
                                      String selectedItem = cmb.getSelectedItem().toString();
                                      System.out.println(selectedItem);
                                  }
                              }
        );
        p1.add(cmb);

        p1.add(btn);
        cards.add(p1);
    }

}

