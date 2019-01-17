package at.aau.difftest;

//useless imports
import fake.io.PrintWriter;
import fake.util.Random;

import org.apache.commons.lang3.StringUtils;


public class MyApplication {
	
    public String abbrevate(String src, Integer maxLength) {
        // do some stuff
        return StringUtils.abbreviate(src, maxLength);
    }
}