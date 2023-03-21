package com.example.demo.ui;

import javax.swing.*;

public class DemoUiForm {
    private JLabel firstLab;
    private JTextField textField1;
    private JLabel secondLab;
    private JTextField textField2;
    private JPanel mainPanel;

    public DemoUiForm() {
        textField1.setText("First text");
        textField2.setText("Second text");
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
