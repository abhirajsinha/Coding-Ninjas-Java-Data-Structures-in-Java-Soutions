What will be the output of the following code ?
public static int func(int num){
    return func(num- 1);
}

public static void main(String[] args) {
    int num = 5;
    int ans = func(num - 1);
    System.out.println(ans);
}

Answer
Runtime Error -StackOverflow
