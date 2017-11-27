public class Loop {

    private int[] arr;

    public Loop(int[] arr) {
        this.arr = arr;
    }

    public void doSomething() {
        MyBubbleSort sorter = new MyBubbleSort();
        sorter.setSourceArray(this.arr);
        this.arr = sh.bubbleSort();

        System.out.println("Array printed in reverse:");
        for (int i = this.arr.length - 1; i >= 0; i--) {
            System.out.println(this.arr[i]);
        }
    }

    private void loopReverse() {
        //TODO implement
    }
}