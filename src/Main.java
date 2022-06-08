public class Main {
    public static void sqrt(Double raizNumber) {
        for (int i = 0; i <= raizNumber; i++) {
            if (i * i == raizNumber) {
                Double result = (double) i;
                System.out.println(result);
                break;
            } else if (i * i > raizNumber) {
                Boolean foundResult = false;
                Double cont = 1.0;
                Double divider = 10.0;
                Integer numExactly = i - 1;
                Integer contRepeat = 0;
                Double result = (double) numExactly;
                Double numDecimal = 0.0;
                while (!foundResult) {
                    numDecimal = (cont / divider);
                    if ((result + numDecimal) * (result + numDecimal)  > raizNumber) {
                        cont = 1.0;
                        result = (result + numDecimal) - (1 / divider);
                        divider = divider * 10;
                        contRepeat += 1;
                    } else {
                        if (contRepeat == 4) {
                            foundResult = true;
                            break;
                        }
                        cont += 1.0;
                    }
                }
                System.out.println(result);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Main.sqrt(5.0);
    }
}
