public class Task {
    public int first;
    public int second;

    public Task(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return  first + "*" + second;
    }
}
