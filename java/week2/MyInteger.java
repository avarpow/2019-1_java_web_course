
package myinteger;

public class MyInteger {
    private int value;

    MyInteger(int v) {
        this.value = v;
    }

    public boolean isEven() {
        if (this.value % 2==1)
            return false;
        else
            return true;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        int flag = 1;
        for (int i = 2; i * i <= this.value; i++) {
            if(this.value%i==0){
            flag = 0;
            break;
            }
        }
        if (flag==1)
            return true;
        else
            return false;
    }

    public static boolean isPrime(int v) {
        int flag = 1;
        for (int i = 2; i * i <= v; i++) {
            if(v%i==0){
            flag = 0;
            break;
            }
        }
        return flag == 1;
    }

    public static boolean isPrime(MyInteger v) {
        int flag = 1;
        for (int i = 2; i * i <= v.value; i++) {
            if(v.value%i==0){
            flag = 0;
            break;
            }
        }
        return flag == 1;
    }

    public boolean equals(int v) {
        return this.value == v;
    }

    public boolean equals(MyInteger v) {
        return this.value == v.value;
    }

    public int get() {
        return this.value;
    }
}