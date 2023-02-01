public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 72;
        double height = 1.74;
        double myBmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела (ИМТ): " + myBmi);
        System.out.println("");
        System.out.println("ИМТ: меньше 16 - выраженный дефицит массы тела");
        System.out.println("ИМТ: 16 – 18,5 - недостаточная масса тела");
        System.out.println("ИМТ: 18,5 – 25 - нормальная масса тела");
        System.out.println("ИМТ: 25 – 30 - избыточная масса тела (предожирение)");
        System.out.println("ИМТ: 30 – 35 - ожирение 1-ой степени");
        System.out.println("ИМТ: 35 – 40 - ожирение 2-ой степени");
        System.out.println("ИМТ: Больше 40 - ожирение 3-ой степени");
    }
}