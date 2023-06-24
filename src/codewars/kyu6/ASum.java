package codewars.kyu6;

public class ASum {

    public static long findNb(long m) {
        long volume = 0;
        long n = 0;
        while (volume < m) {
            volume += ++n * n * n;
        }
        return volume == m ? n : -1;
    }
}
