package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for(int i = 1; i <= height; i++) {
            for(int j = 1; j <= height; j++) {
                if(i == 1 || i == height || i == j || height - j + 1 == i)
                    System.out.print(8);
                else System.out.print(' ');
            }
            System.out.println();
        }
    }
}
