package com.codegym;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("number.txt");
        int max = ReadAndWriteFile.findMax(numbers);
        readAndWriteFile.writeFile("result.txt",max);
    }
}
