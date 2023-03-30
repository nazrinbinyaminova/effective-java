package com.example.effective_java.chapter_2_create_destroy.builder_pattern;


import java.time.LocalDateTime;

public class Animal {
    private String species;
    private String name;
    private LocalDateTime birth;

    private Animal(Builder builder) {
        this.species = builder.species;
        this.name = builder.name;
        this.birth = builder.birth;
    }

    public static Animal.Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String species;
        private String name;
        private LocalDateTime birth;

        public Builder species(String species) {
            this.species = species;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder birth(LocalDateTime birth) {
            this.birth = birth;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
