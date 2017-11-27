public class Loop {

    public Loop(int[] arr) {
        this.arr = arr;
    }

    public reverseLoop() {
        this.loopFromTo(arr.length, 0);
    }

    public loopFromTo(int x, int y) {
        for(int i = x; i > y; i--) {
            System.out.println(this.arr[i]);
        }
    }
}