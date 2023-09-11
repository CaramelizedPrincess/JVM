
public class JvmComprehension {

    public static void main(String[] args) { // создается фрейм в стеке
        int i = 1;                      // 1 во фрейме main создается переменная i типа int со значением 1
        Object o = new Object();        // 2 в heap создается объект object и переменная о во фрейме main , переменная ссылается на object из кучи
        Integer ii = 2;                 // 3 в heap создается объект integer ii со значением 2 и во фрейме main  создается переменная которая ссылается на на integer из кучи
        printAll(o, i, ii);             // 4 в stack создается новый фрейм ptintall во время вызова метода, в который входят переменные o. i. ii
        System.out.println("finished"); // 7 в stack создается новый фрейм println, которому передается ссылка на объест finished из heap
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 в heap создается объект integer uselessvar со значением 700, во фрейме создается переменная, которая ссылается на этот объект
        System.out.println(o.toString() + i + ii);  // 6 создается новый фрейм во время вызова метода tostring, создается и новый фрейм для println. Туда передаются ссылки из кучи. При последюущем вызове сборщик мусора удалит предыдыущий результат, фреймы удаляются
    }
}

