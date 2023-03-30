package com.example.patterns.creation_patterns.prototype;

public class StudentType implements Cloneable {
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    protected StudentType clone() {

        try {
            return (StudentType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "StudentType{" +
                "type=" + type +
                '}';
    }
}
