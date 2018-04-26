package threadTest;

public class Output implements Runnable {
    private final Resource resource;

    Output(Resource resource) {
        this.resource = resource;
    }

    @Override
    @SuppressWarnings("InfiniteLoopStatement")
    public void run() {
        while (true) {
           resource.out();
        }
    }
}
