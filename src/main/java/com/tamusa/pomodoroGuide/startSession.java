package com.tamusa.pomodoroGuide;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class startSession extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        JOptionPane.showMessageDialog(null,"Start Session User Interface code area");
    }
}
