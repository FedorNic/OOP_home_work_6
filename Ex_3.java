package Home_Tasks.HT_14;

//Дан следующий код, исправьте его там, где требуется
public class Ex_3 {
    public static void main(String[] args) {
        //Если мы хотим увидеть сразу несколько ошибок в коде - нужно каждую потенциально косячную операцию обернуть
        // в свой блок try-catch
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(null, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
            ex.printStackTrace();
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}