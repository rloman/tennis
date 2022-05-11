package nl.duo.tennis.serialization;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Runner runner = new Runner();
        runner.setName("Raymond");
        runner.setMaxDistance(16);

        // serialiseer
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("runner.out"));
        objectOutputStream.writeObject(runner);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("runner.out"));

        Runner back = (Runner) objectInputStream.readObject();

        System.out.println(16 == back.getMaxDistance());
        System.out.println("Raymond".equals(back.getName()));
    }
}
