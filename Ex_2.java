package Home_Tasks.HT_14;

//Если необходимо, исправьте данный код
public class Ex_2 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            int d = 0;
            /**
             * Если нужно чтобы уравнение решалось - надо записать так
             * double catchedRes1 = intArray[8]*1.0 / d;
             */
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException ex) {
            System.out.println("Catching exception:" + ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
}
