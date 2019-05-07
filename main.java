import java.util.Arrays;

class main {

    public static void main(String[] args) {

        int wek[] = { 5, 1, 2, 4, 3 };

        for(int j = 0; j < wek.length; j++) {

        for(int i = j+1; i < wek.length; i++) {
            
            if(wek[i] < wek[j]) { 
                int result = wek[j];
                wek[j] = wek[i];
                wek[i] = result;
            }
        }
    }
    System.out.println(Arrays.toString(wek));
}
}

     
 
