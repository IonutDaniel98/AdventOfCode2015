package service;

import java.util.List;

public class SolveDay1 {
    public Integer getSantasFinalFloor(List<String> input) {
        var up = input.getFirst().replaceAll("[)]", "").length();
        var down = input.getFirst().replaceAll("[(]", "").length();
        return up - down;
    }

    public Integer determineWhenSantaGoesToTheBasement(List<String> input) {
        int index;
        var steps = input.getFirst();
        var floor = 0;
        for (index = 0; steps.length() > index && floor >= 0; index++) {
            if (steps.charAt(index) == '(') {
                floor++;
            } else {
                floor--;
            }
        }
        return index;
    }
}
