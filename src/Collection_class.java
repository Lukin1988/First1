import java.util.*;

public class Collection_class {
    public Collection_class() {
    }

    static ArrayList<Integer> generateArrayList() {
        return new ArrayList();
    }

    static ArrayList<Integer> fillArrayList(ArrayList<Integer> arrayList) {
        int min = -10;
        int max = 10;
        Random random = new Random();

        for(int i = 0; i < 10; ++i) {
            arrayList.add(random.nextInt(max - min + 1) + min);
        }

        System.out.printf("Завдання 2 - заповнити колекцію рандомними числами %s", arrayList);
        System.out.println();
        return arrayList;
    }

    static ArrayList<Integer> creatCopyArrayList(ArrayList<Integer> arrayList) {
        return new ArrayList(arrayList);
    }

    static ArrayList<Integer> creatSecondCopyArrayList(ArrayList<Integer> arrayList) {
        return (ArrayList)arrayList.clone();
    }

    static ArrayList<Integer> creatThirdCopyArrayList(ArrayList<Integer> arrayList) {
        ArrayList<Integer> copyArrayList = new ArrayList();
        copyArrayList.addAll(arrayList);
        return copyArrayList;
    }

    static TreeSet<Integer> creatSet(ArrayList<Integer> arrayList) {
        return new TreeSet(arrayList);
    }

    static ArrayList<Integer> sortCollection(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        return arrayList;
    }

    static Integer minCollection(ArrayList<Integer> arrayList) {
        return (Integer)Collections.min(arrayList);
    }

    static Integer maxCollection(ArrayList<Integer> arrayList) {
        return (Integer)Collections.max(arrayList);
    }

    static Integer sumCollection(ArrayList<Integer> arrayList) {
        return arrayList.stream().mapToInt(Integer::intValue).sum();
    }

    static boolean isPalindrome(ArrayList<Integer> arrayList) {
        ArrayList<Integer> reversedArrayList = new ArrayList(arrayList);
        Collections.reverse(reversedArrayList);
        return arrayList.equals(reversedArrayList);
    }

    static ArrayList<Integer> getPositiveNumbers(ArrayList<Integer> arrayList) {
        ArrayList<Integer> positiveNumbers = new ArrayList();
        Iterator var2 = arrayList.iterator();

        while(var2.hasNext()) {
            Integer number = (Integer)var2.next();
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }

        return positiveNumbers;
    }

    static boolean containsNumber(ArrayList<Integer> arrayList, int targetNumber) {
        return arrayList.contains(targetNumber);
    }

    static int countOccurrences(ArrayList<Integer> arrayList, int targetNumber) {
        return Collections.frequency(arrayList, targetNumber);
    }

    static ArrayList<Integer> reverseCollection(ArrayList<Integer> arrayList) {
        ArrayList<Integer> reversedList = new ArrayList(arrayList);
        Collections.reverse(reversedList);
        return reversedList;
    }

    static void swapFirstAndLast(ArrayList<Integer> arrayList) {
        if (arrayList.size() >= 2) {
            Collections.swap(arrayList, 0, arrayList.size() - 1);
        }

    }

    static int findSecondLargest(ArrayList<Integer> arrayList) {
        if (arrayList.size() < 2) {
            throw new IllegalArgumentException("Колекція мае мати хочаб 2 символи");
        } else {
            ArrayList<Integer> uniqueSorted = new ArrayList(new TreeSet(arrayList));
            Collections.sort(uniqueSorted);
            return (Integer)uniqueSorted.get(uniqueSorted.size() - 2);
        }
    }

    static Long select100000(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        int max = 100;
        for (int i = 0; i<100000; i++){
            int randomNumber = new Random().nextInt((max));
            arrayList.get(randomNumber);
        }
        return (System.currentTimeMillis() - start);
    }

    static ArrayList<Integer> millionArrayList() {
        ArrayList<Integer> result = new ArrayList<>();
        int max = 1000;
        for (int i = 0; i < 1000000; i++) {
            int randomNumber = new Random().nextInt((max));
            result.add(randomNumber);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> emptyarrayList = generateArrayList();
        System.out.println("Задача 1 створити коллекцію Integeriv " + emptyarrayList);
        ArrayList<Integer> arrayList = fillArrayList(emptyarrayList);
        ArrayList<Integer> firstCopyOfArrayList = creatCopyArrayList(arrayList);
        System.out.println("Завдання 3.1 - створюемо копію через конструктор " + firstCopyOfArrayList);
        ArrayList<Integer> secondCopyOfArrayList = creatSecondCopyArrayList(arrayList);
        System.out.println("Завдання 3.2 - створюемо копію через клонування " + secondCopyOfArrayList);
        ArrayList<Integer> ThirdCopyOfArrayList = creatThirdCopyArrayList(arrayList);
        System.out.println("Завдання 3.3 - створюемо копію через метод add " + ThirdCopyOfArrayList);
        arrayList.add(55);
        arrayList.add(55);
        System.out.println(arrayList);
        System.out.println(firstCopyOfArrayList);
        System.out.println(secondCopyOfArrayList);
        System.out.println(ThirdCopyOfArrayList);
        System.out.println("Завдання 4 - створюемо set. Коллекція з унікальними занченнями " + creatSet(arrayList));
        System.out.println("Завдання 5 - сортуемо коллекцію " + sortCollection(arrayList));
        System.out.println("Завдання 6.1 - виводимо min значення " + minCollection(arrayList));
        System.out.println("Завдання 6.2 - виводимо max значення " + maxCollection(arrayList));
        System.out.println("Завдання 7 - виводимо сумму усіх занячень " + sumCollection(arrayList));
        ArrayList<Integer> palindromeData = new ArrayList();
        palindromeData.add(0);
        palindromeData.add(0);
        palindromeData.add(0);
        System.out.println("Завдання 8 - перевірка на паліндром " + isPalindrome(palindromeData));
        System.out.println("Завдання 9 - вивести тільки плюсові числа " + getPositiveNumbers(arrayList));
        int targetNumber = 55;
        boolean containsTargetNumber = containsNumber(arrayList, targetNumber);
        System.out.println("Завдання 10 - вивести true or falce " + targetNumber + "? віддае " + containsTargetNumber);
        int occurrences = countOccurrences(arrayList, targetNumber);
        System.out.println("Завдання 11 - коли певне число повторюеться " + targetNumber + ": " + occurrences);
        System.out.println("Початкова коллекція: " + arrayList);
        System.out.println("Завдання 12 - розвернути коллекцію " + reverseCollection(arrayList));
        swapFirstAndLast(arrayList);
        System.out.println("Завдання 13 - поміняти місцями перший та останній символи " + arrayList);
        int secondLargest = findSecondLargest(arrayList);
        System.out.println("Завдання 14 - найбільше 2-ге число: " + secondLargest);
        System.out.println("Завданян 15 - Витрачений час : " + select100000(millionArrayList()) + " millisec");
    }
    }
