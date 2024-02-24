import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Program {
    public static void main(String[] args) {
        List<Toy> result = getToys();

        String saveTxt = "result.txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(saveTxt))){
            for(Toy toy: result){
                writer.write(String.format("id: %d, Название: %s, Частота выпадения: %.2fn \n",
                        toy.getId(), toy.getName(), toy.getCounter()));
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n",e);
        }

    }

    private static List<Toy> getToys() {
        int[] ids = {1, 2, 3, 4, 5};
        String[] names = {"Кукла","Меч","Машинка","Робот","Конструктор"};
        double[] counters = {0.2,0.3,0.1,0.2,0.2};

        PriorityQueue<Toy> toysQueue = new PriorityQueue<>((t1,t2) ->
                Double.compare(t2.getCounter(), t1.getCounter()));
        for(int i = 0; i < ids.length; i++ ){
            Toy toy = new Toy(ids[i], names[i], counters[i]);
            toysQueue.add(toy);
        }

        List<Toy> result = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Toy currentToy = toysQueue.poll();
            result.add(currentToy);
        }
        return result;
    }
}
