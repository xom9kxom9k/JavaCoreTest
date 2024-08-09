public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new Map<>();

        map.put("Слава", 404040);
        map.put("Таня", 437323);
        map.put("Руслан", 874592);

        System.out.println("Размер записной книжки " + map.size());
        System.out.println("У меня есть номер Тани?: " + map.containsKey("Таня"));
        System.out.println("Номер телефона Руслана: " + map.get("Руслан"));
    }
}
