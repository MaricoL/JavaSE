package threadTest;

public class Input implements Runnable {
    private final Resource resource;

    Input(Resource resource) {
        this.resource = resource;
    }

    private int i = 0;


    @Override
    @SuppressWarnings("InfiniteLoopStatement")
    public void run() {
        while (true) {
            if (i % 2 == 0) {
                resource.set("mark", "nana");
            } else {
                resource.set("玛丽", "女女女女女女");
            }
            i++;
        }
    }
}

