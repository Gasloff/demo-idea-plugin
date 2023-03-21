package com.example.demo.ui;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DemoDialog extends DialogWrapper {
    public DemoDialog(@Nullable Project project) {
        super(project);
        init();
        setTitle("Demo Dialog");
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        return new DemoUiForm().getMainPanel();
    }
}
