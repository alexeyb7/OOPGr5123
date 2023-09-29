import java.io.File;
import java.io.PrintWriter;
import java.util.Date;
import java.io.*;

public class Calculator {
    private double real;
    private double imaginary;

    public Calculator(double r, double i) {
        real = r;
        imaginary = i;
    }

    // метод сложение комплексных чисел
    public void add(Calculator c) {
        real += c.real;
        imaginary += c.imaginary;
    }

    // метод вычитание комплексных чисел
    public void subtract(Calculator c) {
        real -= c.real;
        imaginary -= c.imaginary;
    }

    // метод умножение комплексных чисел
    public void multiply(Calculator c) {
        double tempReal = real;
        double tempImaginary = imaginary;
        real = (tempReal * c.real) - (tempImaginary * c.imaginary);
        imaginary = (tempReal * c.imaginary) + (tempImaginary * c.real);
    }

    // метод деление комплексных чисел
    public void divide(Calculator c) {
        double tempReal = real;
        double tempImaginary = imaginary;
        double temp = (c.real * c.real) + (c.imaginary * c.imaginary);
        real = ((tempReal * c.real) + (tempImaginary * c.imaginary)) / temp;
        imaginary = ((tempImaginary * c.real) - (tempReal * c.imaginary)) / temp;
    }

    // возврат действительной части числа
    public double getReal() {
        return real;
    }

    // возврат мнимой части числа
    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator(2, 3);
        Calculator c2 = new Calculator(3, 4);

        c1.add(c2);
        System.out.println("Сумма 2+3i и 3+4i равна");
        System.out.println(c1.getReal() + " + " + c1.getImaginary() + "i");

        c1.subtract(c2);

        System.out.println(c1.getReal() + "+" + c1.getImaginary() + "i");

        c1.divide(c2);

        System.out.println(c1.getReal() + "+" + c1.getImaginary() + "i");
        // журнал действий пользователя
        logAction("Выполнены действия", new Date());
        // запись в файл
        try {
            PrintWriter pw = new PrintWriter(new File("output.txt"));

            pw.println(c1.getReal());
            pw.print(c2.getImaginary() + "i");
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // лог действий пользователя
    public static void logAction(String message, Date date) {
        // запись действий в файл или БД

    }

}
