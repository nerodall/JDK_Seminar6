
import lombok.Data;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Data
public class Game {
    private int iteration;
    private int win;
    private int countGame;

    public Game(int iteration) {
        this.iteration = iteration;
    }

    private HashMap<Integer, Integer> starSource() {
        HashMap<Integer, Integer> result = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < iteration; i++) {
            int carDoor = random.nextInt(3);
            int chooseDoor = random.nextInt(3);
            countGame++;

            if (carDoor == chooseDoor) {
                win++;
                result.put(countGame, win);
            }
            result.put(countGame, win);
        }
        return result;
    }

    public void startGame() {
        HashMap<Integer, Integer> hm = starSource();
        int result = 0;
        for (Map.Entry entry : hm.entrySet()) {
            result = result + (int) entry.getValue();
        }
        System.out.println("Количество побед = " + result);
    }
}


