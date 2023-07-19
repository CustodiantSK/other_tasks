package Seminars.Sem004.task001;

public class GenBox<T> {
    T obj;

    public GenBox(T obj) {
        this.obj = obj;
    }

    public GenBox() {
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
