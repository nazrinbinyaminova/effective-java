package com.example.patterns.structural_patterns.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypeMap = new HashMap<>();

    private TreeFactory() {
    }

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType type = treeTypeMap.get(name);

        if (type == null) {
            type = new TreeType(name, color, otherTreeData);
            treeTypeMap.put(name, type);
        }

        return type;
    }
}
