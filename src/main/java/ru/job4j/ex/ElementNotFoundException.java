package ru.job4j.ex;

import static ru.job4j.ex.ElementNotFoundException.FindEl.indexOf;

public class ElementNotFoundException extends Exception {
    public class FindEl {
        public static int indexOf(String[] value, String key) throws ElementNotFoundException {
            int rsl = -1;
            for (int i = 0; i < value.length; i++) {
                if (value[i].equals(key)) {
                    rsl = i;
                }
            }
            if (rsl == -1) {
                throw new ElementNotFoundException();
            }
            return rsl;
        }
    }

    public static void main(String[] args) {
        try {
            String[] one = new String[] {"Sem", "Tom", "Kate"};
            indexOf(one, "Jerry");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
