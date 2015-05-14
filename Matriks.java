
public class Matriks {

    public static void main(String[] args) {
       matriks();
    }

    private static void matriks() {
        Scanner masuk=new Scanner(System.in);
        System.out.println("**********************************");
        System.out.println("1. 2x2");
        System.out.println("2. 3x3");
        System.out.print("Masukkan Pilihan : ");
        int pilihan=masuk.nextInt();
        System.out.println("**********************************");
              
        switch(pilihan){
            case 1:  start1 a=new start1();
                    matriks1();
                break;
            case 2: start2  b=new start2();
                    matriks2();
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }

    private static void matriks1() {
        System.out.println("matriks ber-ordo 2x2");
        Scanner masuk=new Scanner(System.in);        
        int x [][]=new int[2][2];
        int y [][]=new int [2][2];
        int jumlah [][]=new int [2][2];
        int kurang [][]=new int [2][2];
        int kali [][]=new int [2][2];
        System.out.println("Masukkan Matriks A");
        for (int i = 0; i < x.length; i++) {
            System.out.print("Input Baris : ");
            for (int j = 0; j < x[i].length; j++) {                
               x[i][j] = masuk.nextInt();                
            }
        }
        System.out.println("Masukkan Matriks B");
        for (int i = 0; i < y.length; i++) {
            System.out.print("Input Baris : ");
            for (int j = 0; j < y[i].length; j++) {
                y[i][j]=masuk.nextInt();        
            }           
        }
        System.out.println("Matriks A");
        for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x.length; j++) {
                    System.out.print(x[i][j]+" ");                              
                }
                System.out.println();
        }
        System.out.println("Matriks B");
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y.length; j++) {
                System.out.print(y[i][j]+" ");                
            }
            System.out.println();            
        }
        System.out.println("Penjumlahan Matriks A dan B :");
        for (int i = 0; i < jumlah.length; i++) {
            for (int j = 0; j < jumlah.length; j++) {
                jumlah[i][j] = x[i][j]+y[i][j];
                System.out.print(" "+jumlah[i][j]);                
            }
            System.out.println();            
        }
        System.out.println("Pengurangan Matriks A dan B");
        for (int i = 0; i < kurang.length; i++) {
            for (int j = 0; j < kurang.length; j++) {
                kurang[i][j] = x[i][j]-y[i][j];
                System.out.print(" "+kurang[i][j]);                
            }
            System.out.println();
        }
        System.out.println("Perkalian Matriks A dan B");
        for (int i = 0; i < kali.length; i++) {
            for (int j = 0; j < kali.length; j++) {
                kali[i][j]=x[i][j]*y[i][j];
                System.out.print(" "+kali[i][j]);                
            }
            System.out.println();
        }
        int det1 = x[1][1]*x[0][0]-x[0][1]*x[1][0];
        int det2 = y[1][1]*y[0][0]-y[0][1]*y[1][0];
            System.out.println("Determinan Matriks A : "+det1);
            System.out.println("Determinan Matriks B : "+det2);
    }

    private static void matriks2() {
        System.out.println("matriks ber-ordo 3x3");
        Scanner masuk=new Scanner(System.in);
        int x[][]=new int[3][3];
        int y[][]=new int[3][3];
        int jumlah[][]=new int[3][3];
        int kurang[][]=new int[3][3];
        int kali[][]=new int[3][3];
        System.out.println("Masukkan Matriks A");
        for (int i = 0; i < x.length; i++) {
            System.out.print("Input Baris : ");
            for (int j = 0; j < x[i].length; j++) {
                x[i][j]=masuk.nextInt();                
            }            
        }
        System.out.println("Masukkan Matriks B");
        for (int i = 0; i < y.length; i++) {
            System.out.print("Input Baris : ");
            for (int j = 0; j < y[i].length; j++) {
                y[i][j]=masuk.nextInt();                
            }            
        }
        System.out.println("Matriks A");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[i][j]+" ");                
            }
            System.out.println();            
        }
        System.out.println("Matriks B");
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y.length; j++) {
                System.out.print(x[i][j]+" ");                
            }
            System.out.println();
        }
        System.out.println("Penjumlahan Matriks A dan B");
        for (int i = 0; i < jumlah.length; i++) {
            for (int j = 0; j < jumlah.length; j++) {
                jumlah[i][j]=x[i][j]+y[i][j];
                System.out.print(" "+jumlah[i][j]);                
            }
            System.out.println();
        }
        System.out.println("Pengurangan Matriks A dan B");
        for (int i = 0; i < kurang.length; i++) {
            for (int j = 0; j < kurang.length; j++) {
                kurang[i][j]=x[i][j]-y[i][j];
                System.out.print(" "+kurang[i][j]);                
            }
            System.out.println();
        }
        System.out.println("Perkalian Matriks A dan B");
        for (int i = 0; i < kali.length; i++) {
            for (int j = 0; j < kali.length; j++) {
                kali[i][j]=x[i][j]-y[i][j];
                System.out.print(" "+kali[i][j]);                
            }
            System.out.println();
        }
        int det1 = ((x[0][0]*x[1][1]*x[2][2]+x[0][1]*x[1][2]*x[2][0])
                    +(x[0][2]*x[1][0]*x[2][1]-x[0][2]*x[1][1]*x[2][0])
                    +(x[0][0]*x[1][2]*x[2][1]-x[0][1]*x[1][0])*x[2][2]);
        int det2= ((y[0][0]*y[1][1]*y[2][2]+y[0][1]*y[1][2]*y[2][0])
                    +(y[0][2]*y[1][0]*y[2][1]-y[0][2]*y[1][1]*y[2][0])
                    +(y[0][0]*y[1][2]*y[2][1]-y[0][1]*y[1][0])*y[2][2]);
        System.out.println("Determinan Matriks A : "+det1);
        System.out.println("Determinan Matriks B : "+det2);
    }
    private static class start2 {
        public start2() {
            System.out.println(" ");
        }
    }   
}
