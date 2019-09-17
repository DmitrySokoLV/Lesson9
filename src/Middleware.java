public abstract class Middleware {
    private Middleware next;

    public Middleware linkwith(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String filename);

    protected boolean checkNext(String filename) {
        if (next == null) {
            return true;
        }

        return next.check(filename);
    }
}
