class ClDiffTest {

    public String oldVar = "so old";

    public void method() {
        this.oldVar = "constructor";
        this.oldVar = "newconst";
    }

}