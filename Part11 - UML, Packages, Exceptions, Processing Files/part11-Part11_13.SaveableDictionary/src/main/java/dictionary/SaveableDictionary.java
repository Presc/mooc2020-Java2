package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private final HashMap<String, String> dictionary;
    private String filePath;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.filePath = file;
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        String result = dictionary.getOrDefault(word, null);

        if (result == null) {
            result = this.dictionary.entrySet()
                    .stream()
                    .filter(value -> value.getValue()
                            .equals(word))
                    .findAny()
                    .map(Map.Entry::getKey)
                    .orElse(null);
        }

        return result;
    }

    public void delete(String word) {
        if (this.dictionary.remove(word) == null) {
           this.dictionary.values().removeIf(value -> value.equals(word));
        }
    }

    public boolean load() {
        try {
            Scanner reader = new Scanner(Paths.get(this.filePath));
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                String[] parts = row.split(":");
                add(parts[0], parts[1]);
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error, check file path of provided text file" + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        ArrayList<String> existingWords = new ArrayList<>();
        try {
            PrintWriter writer = new PrintWriter(this.filePath);
            this.dictionary.keySet()
                    .forEach(key -> {
                        if (existingWords.contains(key)) {
                            return;
                        }
                        writer.println(key + ":" + this.dictionary.get(key));

                        existingWords.add(key);
                    });

            writer.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("Error, check file path of provided text file" + e.getMessage());
            return false;
        }
    }
}
