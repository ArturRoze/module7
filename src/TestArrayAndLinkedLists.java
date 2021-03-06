import java.util.*;

public class TestArrayAndLinkedLists {

    public static void main(String[] args) {

        List<Integer> arrListInt = new ArrayList<>();
        List<String> arrListStr = new ArrayList<>();
        List<Integer> linkedListInt = new LinkedList<>();
        List<String> linkedListStr = new LinkedList<>();

        System.out.println("Time to add:");
        Date startTime = new Date();
        for (int i = 0; i < 1000; i++) {
            arrListInt.add(i);
        }
        Date endTime = new Date();
        long workTime = endTime.getTime() - startTime.getTime();
        System.out.println("time to add arrayList<Integer> by 1000: " + workTime);

        Date startTimeStr = new Date();
        for (int i = 0; i < 100000; i++) {
            arrListStr.add("word");
        }
        Date endTimeStr = new Date();
        long workTime1 = endTimeStr.getTime() - startTimeStr.getTime();
        System.out.println("time to add arrayList<String> by 100000: " + workTime1);

        Date startTimeInt2 = new Date();
        for (int i = 0; i < 1000; i++) {
            linkedListInt.add(i);
        }
        Date endTimeInt2 = new Date();
        long workTime2 = endTimeInt2.getTime() - startTimeInt2.getTime();
        System.out.println("time to add linkedList<Integer> by 1000: " + workTime2);

        Date startTimeStr2 = new Date();
        for (int i = 0; i < 100000; i++) {
            linkedListStr.add("word");
        }
        Date endTimeStr2 = new Date();
        long workTime3 = endTimeStr2.getTime() - startTimeStr2.getTime();
        System.out.println("time to add linkedList<String> by 100000: " + workTime3);
        System.out.println("Time to set:");

        Date startTimeInt3 = new Date();
        for (int i = 0; i < 1000; i++) {
            arrListInt.set(0, i);
        }
        Date endTimeInt3 = new Date();
        long workTime4 = endTimeInt3.getTime() - startTimeInt3.getTime();
        System.out.println("time to set(0) arrayList<Integer> by 1000: " + workTime4);

        Date startTimeStr3 = new Date();
        for (int i = 0; i < 100000; i++) {
            arrListStr.set(0, "word");
        }
        Date endTimeStr3 = new Date();
        long workTime5 = endTimeStr3.getTime() - startTimeStr3.getTime();
        System.out.println("time to set(0) arrayList<String> by 100000: " + workTime5);

        Date startTimeInt4 = new Date();
        for (int i = 0; i < 1000; i++) {
            linkedListInt.set(0, i);
        }
        Date endTimeInt4 = new Date();
        long workTime6 = endTimeInt4.getTime() - startTimeInt4.getTime();
        System.out.println("time to set(0) linkedList<Integer> by 1000: " + workTime6);

        Date startTimeStr5 = new Date();
        for (int i = 0; i < 100000; i++) {
            linkedListStr.set(0, "word");
        }
        Date endTimeStr5 = new Date();
        long workTime7 = endTimeStr5.getTime() - startTimeStr5.getTime();
        System.out.println("time to set(0) linkedList<String> by 100000: " + workTime7);
        System.out.println("Time to get:");

        Date startTimeInt6 = new Date();
        for (int i = 0; i < 1000; i++) {
            arrListInt.get(0);
        }
        Date endTimeInt6 = new Date();
        long workTime8 = endTimeInt6.getTime() - startTimeInt6.getTime();
        System.out.println("time to get(0) arrayList<Integer> by 1000: " + workTime8);

        Date startTimeStr7 = new Date();
        for (int i = 0; i < 100000; i++) {
            arrListStr.get(0);
        }
        Date endTimeStr7 = new Date();
        long workTime9 = endTimeStr7.getTime() - startTimeStr7.getTime();
        System.out.println("time to get(0) arrayList<String> by 100000: " + workTime9);

        Date startTimeInt8 = new Date();
        for (int i = 0; i < 1000; i++) {
            linkedListInt.get(0);
        }
        Date endTimeInt8 = new Date();
        long workTime10 = endTimeInt8.getTime() - startTimeInt8.getTime();
        System.out.println("time to get(0) linkedList<Integer> by 1000: " + workTime10);

        Date startTimeStr9 = new Date();
        for (int i = 0; i < 100000; i++) {
            linkedListStr.get(0);
        }
        Date endTimeStr9 = new Date();
        long workTime11 = endTimeStr9.getTime() - startTimeStr9.getTime();
        System.out.println("time to get(0) linkedList<String> by 100000: " + workTime11);
        System.out.println("Time to remove:");

        Date startTimeInt10 = new Date();
        for (int i = 0; i < 1000; i++) {
            arrListInt.remove(0);
        }
        Date endTimeInt10 = new Date();
        long workTime12 = endTimeInt10.getTime() - startTimeInt10.getTime();
        System.out.println("time to remove(0) arrayList<Integer> by 1000: " + workTime12);

        Date startTimeStr11 = new Date();
        for (int i = 0; i < 100000; i++) {
            arrListStr.remove(0);
        }
        Date endTimeStr11 = new Date();
        long workTime13 = endTimeStr11.getTime() - startTimeStr11.getTime();
        System.out.println("time to remove(0) arrayList<String> by 100000: " + workTime13);

        Date startTimeInt12 = new Date();
        for (int i = 0; i < 1000; i++) {
            linkedListInt.remove(0);
        }
        Date endTimeInt12 = new Date();
        long workTime14 = endTimeInt12.getTime() - startTimeInt12.getTime();
        System.out.println("time to remove(0) linkedList<Integer> by 1000: " + workTime14);

        Date startTimeStr13 = new Date();
        for (int i = 0; i < 100000; i++) {
            linkedListStr.remove(0);
        }
        Date endTimeStr13 = new Date();
        long workTime15 = endTimeStr13.getTime() - startTimeStr13.getTime();
        System.out.println("time to remove(0) linkedList<String> by 100000: " + workTime15);
    }
}

