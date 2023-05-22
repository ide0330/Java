import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int h = stdIn.nextInt();
        int w = stdIn.nextInt();
        List<List<String>> s = new ArrayList<>();
        for(int i=0;i<h;i++){
            String[] input = stdIn.next().split("");
            s.add(Arrays.asList(input));
        }
        boolean contain=false;
        for(int i=0;i<h;i++){
            if(contain) break;
            for(int j=0;j<w-4;j++){
                List<String> str = s.get(i);
                String snuke = str.get(j)+str.get(j+1)+str.get(j+2)+str.get(j+3)+str.get(j+4);
                if(snuke.equals("snuke")){
                    System.out.println((i+1)+" "+(j+1));
                    System.out.println((i+1)+" "+(j+2));
                    System.out.println((i+1)+" "+(j+3));
                    System.out.println((i+1)+" "+(j+4));
                    System.out.println((i+1)+" "+(j+5));
                    contain = true;
                    break;
                }else if(snuke.equals("ekuns")){
                    System.out.println((i+1)+" "+(j+5));
                    System.out.println((i+1)+" "+(j+4));
                    System.out.println((i+1)+" "+(j+3));
                    System.out.println((i+1)+" "+(j+2));
                    System.out.println((i+1)+" "+(j+1));
                    contain = true;
                    break;
                }
            }
        }
        for(int i=0;i<w;i++){
            if(contain) break;
            for(int j=0;j<h-4;j++){
                String snuke = s.get(j).get(i)+s.get(j+1).get(i)+s.get(j+2).get(i)+s.get(j+3).get(i)+s.get(j+4).get(i);
                if(snuke.equals("snuke")){
                    System.out.println((j+1)+" "+(i+1));
                    System.out.println((j+2)+" "+(i+1));
                    System.out.println((j+3)+" "+(i+1));
                    System.out.println((j+4)+" "+(i+1));
                    System.out.println((j+5)+" "+(i+1));
                    contain = true;
                    break;
                }else if(snuke.equals("ekuns")){
                    System.out.println((j+5)+" "+(i+1));
                    System.out.println((j+4)+" "+(i+1));
                    System.out.println((j+3)+" "+(i+1));
                    System.out.println((j+2)+" "+(i+1));
                    System.out.println((j+1)+" "+(i+1));
                    contain = true;
                    break;
                }
            }
        }
        for(int i=0;i<w-4;i++){
            if(contain) break;
            for(int j=0;j<h-4;j++){
                String snuke1 = s.get(j).get(i)+s.get(j+1).get(i+1)+s.get(j+2).get(i+2)+s.get(j+3).get(i+3)+s.get(j+4).get(i+4);
                String snuke2 = s.get(j+4).get(i)+s.get(j+3).get(i+1)+s.get(j+2).get(i+2)+s.get(j+1).get(i+3)+s.get(j).get(i+4);
                if(snuke1.equals("snuke")){
                    System.out.println((j+1)+" "+(i+1));
                    System.out.println((j+2)+" "+(i+2));
                    System.out.println((j+3)+" "+(i+3));
                    System.out.println((j+4)+" "+(i+4));
                    System.out.println((j+5)+" "+(i+5));
                    contain = true;
                    break;
                }else if(snuke1.equals("ekuns")){
                    System.out.println((j+5)+" "+(i+5));
                    System.out.println((j+4)+" "+(i+4));
                    System.out.println((j+3)+" "+(i+3));
                    System.out.println((j+2)+" "+(i+2));
                    System.out.println((j+1)+" "+(i+1));
                    contain = true;
                    break;
                }else if(snuke2.equals("snuke")){
                    System.out.println((j+5)+" "+(i+1));
                    System.out.println((j+4)+" "+(i+2));
                    System.out.println((j+3)+" "+(i+3));
                    System.out.println((j+2)+" "+(i+4));
                    System.out.println((j+1)+" "+(i+5));
                    contain = true;
                    break;
                }else if(snuke2.equals("ekuns")){
                    System.out.println((j+1)+" "+(i+5));
                    System.out.println((j+2)+" "+(i+4));
                    System.out.println((j+3)+" "+(i+3));
                    System.out.println((j+4)+" "+(i+2));
                    System.out.println((j+5)+" "+(i+1));
                    contain = true;
                    break;
                }
            }
        }
        
        
    }
}
