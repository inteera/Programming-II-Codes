
public class Main {

	public static void main(String[] args) {
		double item = 1;
        double sum = 0;
        while (item > 0.000000001) { // No guarantee item will be 0
            sum += item;
            
            item -= 0.1;

        }


        System.out.println(sum);
	}

}


