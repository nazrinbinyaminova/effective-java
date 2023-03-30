package com.example.patterns.creation_patterns.abstract_factory;

import com.example.patterns.creation_patterns.factory.Button;
import com.example.patterns.creation_patterns.factory.WindowsButton;

public class WindowsFactory implements Factory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
