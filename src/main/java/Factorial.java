public class Factorial {
    public long of(long i) {
        if (i < 2 ) {
            return 1;
        }
        return this.of(i-1) * i;
    }
}
