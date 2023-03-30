package com.example.effective_java.chapter_6_enums_annotations.enum_map_37;

import java.util.Comparator;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

public enum Phase {
    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID),
        BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID),
        SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

        private final Phase from;
        private final Phase to;

        Transition(Phase from, Phase to) {
            this.from = from;
            this.to = to;
        }

//        // Rows indexed by from-ordinal, cols by to-ordinal
//        private static final Transition[][] TRANSITIONS = {
//                {null, MELT, SUBLIME},
//                {FREEZE, null, BOIL},
//                {DEPOSIT, CONDENSE, null}
//        };
//
//
//        // Returns the phase transition from one phase to another
//        public static Transition from(Phase from, Phase to) {
//            return TRANSITIONS[from.ordinal()][to.ordinal()];
//        }

        private static final Map<Phase, Map<Phase, Transition>> mappedTransitions =
                Stream.of(Transition.values()).collect(groupingBy(p -> p.from,
                        () -> new EnumMap<>(Phase.class),
                        toMap(t -> t.to, t -> t, (x, y) ->
                                BinaryOperator.maxBy((Transition a, Transition b) -> a.from.compareTo(b.to)).apply(x, y),
                                () -> new EnumMap<>(Phase.class))));

        public static Transition from(Phase from, Phase to) {
            return mappedTransitions.get(from).get(to);
        }
    }

    public static void main(String[] args) {
        for (Phase from : Phase.values()) {
            for (Phase to : Phase.values()) {
                Transition transition = Transition.from(from, to);
                System.out.printf("%s to %s : %s %n", from, to, transition);
            }
        }
    }
}
