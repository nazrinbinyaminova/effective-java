package com.example.effective_java.chapter_12_serialization.enum_over_readResolve;

import java.io.Serializable;

public class ElvisStealer implements Serializable {
    public static Elvis impersonator;
    private Elvis payload;

    private Object readResolve() {
        impersonator = payload;

        return new String[]{"New song"};
    }

    private static final long serialVersionUID = 0;
}
