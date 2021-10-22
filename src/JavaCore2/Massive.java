package JavaCore2;

public class Massive {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String [] [] table = {{"5","7","3","17"}, {"7","0","1","12"}, {"8","1","2","3"}, {"8","1","2","3"}};

        int sum = 0;
        if(table.length !=4) throw new MyArraySizeException();
        if(table[0].length != 4) throw new MyArraySizeException();

        for(int  a= 0; a < table.length; a++){
            for(int b = 0; b < table[a].length; a++){
                try {
                    sum += Integer.parseInt(table[a][b]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException(" Неправильное значение: " + a + " x" + b);
                }
                }
        }
        System.out.println(sum);
    }
}
