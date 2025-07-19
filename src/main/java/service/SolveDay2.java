package service;

import java.util.Arrays;
import java.util.List;

public class SolveDay2 {
    public Long getWrappingPaperQuantity(List<String> presents) {
        return presents.stream().mapToLong(this::getSizeOfPaper).sum();
    }

    public Long getRibbonLength(List<String> presents) {
        return presents.stream().mapToLong(this::getLengthOfRibbon).sum();
    }

    private Long getSizeOfPaper(String present) {
        var values = Arrays.stream(present.split("x"))
                .mapToLong(Long::parseLong)
                .sorted()
                .toArray();

        return 2 * (values[0] * values[1])
                + 2 * (values[1] * values[2])
                + 2 * (values[2] * values[0])
                + values[0] * values[1];
    }

    private Long getLengthOfRibbon(String present) {
        var values = Arrays.stream(present.split("x"))
                .mapToLong(Long::parseLong)
                .sorted()
                .toArray();

        return 2 * (values[0] + values[1]) + values[0] * values[1] * values[2];
    }
}
