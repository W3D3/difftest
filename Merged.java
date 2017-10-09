public class Merged {

    // this class will be committed as is and then 
    // will be merged with another branch

    public static void conflictingMethod(int param1, int param2)
    {
        for(int i = param1; i < param2; i++)
        {
            Logger.log(i);
        }
    }

}