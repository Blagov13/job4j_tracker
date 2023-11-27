package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder str = new StringBuilder(evenElements.size());
        int size = evenElements.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                str.append(evenElements.peekFirst());
            }
            evenElements.pollFirst();
        }
        return str.toString();
    }

    private String getDescendingElements() {
        StringBuilder str1 = new StringBuilder(descendingElements.size());
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            str1.append(descendingElements.peekLast());
            descendingElements.pollLast();
        }
        return str1.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
