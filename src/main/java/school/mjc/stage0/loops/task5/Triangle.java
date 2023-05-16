package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for(int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= i; j++) {
                if(i == 1 || j == 1 || i == cathetusLength || i == j) System.out.print(8);
                else System.out.print(' ');
            }
            System.out.println();
        }
    }

}
