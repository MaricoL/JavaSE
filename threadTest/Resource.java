package threadTest;

public class Resource {
    private String name;
    private String sex;
    private boolean flag;

    public synchronized void set(String name, String sex)  {
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException ignored) {
            }
        }
        this.name = name;
        this.sex = sex;
        flag = true;
        this.notify();
    }

    public synchronized void out()  {
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println(name + "__________" + sex);
        flag = false;
        this.notify();
    }
}
