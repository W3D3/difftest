public class Loop {

    public Loop(int[] arr) {
        this.arr = arr;
    }

    public void doSomething() {
        MyBubbleSort sorter = new MyBubbleSort();
        sorter.setSourceArray(this.arr);
        this.arr = sorter.bubbleSort();

        System.out.println("Array printed in reverse:");
        loopReverse();
    }

    private void loopReverse() {
        for (int i = this.arr.length; i > 0; i--) {
            System.out.println(this.arr[i]);
        }
    }
}