public class Main {
    public static void main(String[] args) {
        int lengthBoxString = 3;
        int lengthBoxInteger = 4;
        MagicBox<String> boxString = new MagicBox<>(lengthBoxString);
        MagicBox<Integer> boxInteger = new MagicBox<>(lengthBoxInteger);

        boxString.add("Зайчик");
        boxString.add("Шарик");
        boxString.add("Савок");
        boxString.add("Фонарик");
        System.out.println(boxString.pick());

        boxInteger.add(3);
        boxInteger.add(6);
        boxInteger.add(18);
        boxInteger.add(22);
        boxInteger.add(65);
        boxInteger.add(7);
        System.out.println(boxInteger.pick());
    }
}
