import java.util.Scanner;
public class tugasuas {
   public static void main(String[] args) throws Exception {

  int jumlah,i,j, swap,pilih, lagi,angka, angka1, angka2,angka3,hasil,jari;
  double pi=3.14,r;
  Scanner scan = new Scanner(System.in);

    String text[]={"P","R","O","J","E","C","\t","J","A","V","A"};
    int a=0;
    System.out.print("\t");
    while(a<text.length){
      Thread.sleep(300);
      System.out.print(text[a]);
      a++;

    }
    System.out.println();

    System.out.println("=====================================");
    System.out.println("APLIKASI PERKUMPULAN PERHITUNGAN LUAS");
    System.out.println("=====================================");
   
 
  int array[] = {3,5,1,4,2,8,7,3};
  String list[]={"LUAS KUBUS","LUAS BALOK","LUAS PRISMA SEGITIGA","LUAS LIMAS SEGIEMPAT","LUAS LIMAS SEGITIGA","LUAS TABUNG","LUAS KERUCUT","LUAS BOLA"};

  for(i=0; i<(array.length-1);i++)
  {
   for(j=0;j<array.length-i-1;j++)
   {
    if (array[j] > array[j+1])
    {
     swap = array[j];
     array[j] = array[j+1];
     array[j+1]=swap;{}
    }
   }
  }

  
  for(i=0;i<array.length; i++){
   System.out.println(array[i]+". "+list[i]);
  }
  pil:
  for(;;){

  System.out.print("\nPilih Rumus Yang diinginkan : ");
  pilih=scan.nextInt();
  
    
  System.out.print("Pilihan Rumus anda no :"+pilih);
  System.out.println();
  switch (pilih){
    case 1:
    System.out.println();
    System.out.println("RUMUS : ");
    System.out.println("luas kubus = L = 6 x (s x s)");
    System.out.println();
    System.out.println("Masukkan angka bulat");
    // int angka,hasil;
    angka1=scan.nextInt();
    hasil=6*angka1*angka1;
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=========CONTOH SOAL==========");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("Diketahui sebuah bangun ruang kubus dengan panjang sisi sebuah kubus sebesar "+angka1+" cm, maka hitunglah Luas permukaan Kubus tersebut ?");
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=============JAWAB============");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("l = 6 x "+angka1+ " x"+angka1+" ");
    System.out.println("L = "+hasil+" cm");
    System.out.println();
    System.out.println("jadi hasil dari perhitungan luas kubus adalah = "+hasil+" cm ");
    break;
    case 2:
    System.out.println();
    System.out.println("RUMUS : ");
    System.out.println("Balok = L = 2 x ( pl + lt + pt )");
    System.out.println();
    System.out.println("Masukkan angka bulat");
    //int angka, hasil;
    angka1=scan.nextInt();
    angka2=scan.nextInt();
    angka3=scan.nextInt();
    hasil=2*angka1+angka2+angka3;
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=========CONTOH SOAL==========");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("Sebuah balok mempunyai panjang "+angka1+" cm, lebar "+angka2+" cm, dan tinggi "+angka3+" cm. Hitunglah Luas permukaan balok itu");
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=============JAWAB============");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("l = 2 x "+hasil+" + "+hasil+" + "+hasil+" ");
    System.out.println("L = "+hasil+" cm");
    System.out.println();
    System.out.println("jadi hasil dari perhitungan luas balok adalah = "+hasil+" cm ");
    break;
    case 3:
    System.out.println();
    System.out.println("RUMUS : ");
    System.out.println("Prisma Segitiga = L = keliling alas x t + 2 x luas alas segitiga");
    System.out.println();
    System.out.println("Masukkan angka bulat");
   // int angka, hasil;
    angka1=scan.nextInt();
    angka2=scan.nextInt();
    angka3=scan.nextInt();
    hasil= angka1*angka2 + 2* angka3;
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=========CONTOH SOAL==========");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("Diketahui Sebuah Prisma Alasnya Berbentuk Segitiga Siku-Siku Dengan Ukuran "+angka1+" Cm, "+angka2+" Cm, "+angka3+" Cm. Jika Tinggi Prisma 20 Cm, Maka Panjang Seluruh Rusuk Prisma Adalah ");
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=============JAWAB============");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("l = "+angka1+" * "+angka2+" 2 * "+angka3+" ");
    System.out.println("L = "+hasil+" cm");
    System.out.println();
    System.out.println("jadi hasil dari perhitungan luas prisma segitiga adalah = "+hasil+" cm ");
    break;
    case 4:
    System.out.println();
    System.out.println("RUMUS : ");
    System.out.println("limas Segiempat = L = luas alas + luas selubung limas");
    System.out.println();
    System.out.println("Masukkan angka bulat");
    angka1=scan.nextInt();
    System.out.println("Masukkan angka bulat");
    //int angka,hasil;
    angka2=scan.nextInt();
    hasil=angka1+angka2;
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=========CONTOH SOAL==========");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("panjang sisi alas adalah "+angka1+" cm dan tinggi limas adalah "+angka2+" cm, Tentukanlah luas permukaan limas segiempat tersebut");
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=============JAWAB============");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("l = "+angka1+ " + "+angka2+" ");
    System.out.println("L = "+hasil+" cm");
    System.out.println();
    System.out.println("jadi hasil dari perhitungan luas limas segitiga adalah = "+hasil+" cm ");
    break;
    case 5:
    System.out.println();
    System.out.println("RUMUS : ");
    System.out.println("Limas Segitiga = L = Luas alas + Luas selubung limas");
    System.out.println();
    System.out.println("Masukkan angka bulat");
    // int angka,hasil;
    angka=scan.nextInt();
    hasil=angka+angka;
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=========CONTOH SOAL==========");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("Sebuah limas yang memiliki alas berbentuk persegi dengan panjang sisi "+angka+" cm. Apabila tinggi segitiga pada sisi tegak ialah "+angka+" cm, berpakah luas permukaan limas tersebut?");
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=============JAWAB============");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("l ="+angka+ " + "+angka+" ");
    System.out.println("L = "+hasil+" cm");
    System.out.println();
    System.out.println("jadi hasil dari perhitungan luas limmas segitiga adalah = "+hasil+" cm ");
    break;
    case 6:
    System.out.println();
    System.out.println("RUMUS : ");
    System.out.println("Tabung = L = (2 x luas alas) + (keliling alas x tinggi)");
    System.out.println();
    System.out.println("Masukkan angka bulat");
    // int angka,hasil;
    angka=scan.nextInt();
    hasil=2*angka+angka*angka;
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=========CONTOH SOAL==========");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("Apabiladiketahui sebuah tabung yang memiliki r = 3.14 dan tinggi "+angka+" cm Tentukanlah luas selimut tabung tersebut?");
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=============JAWAB============");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("l = 2 * "+angka+" + "+angka+" * "+angka+" ");
    System.out.println("L = "+hasil+" cm");
    System.out.println();
    System.out.println("jadi hasil dari perhitungan luas Tabung adalah = "+hasil+" cm ");
    break;
    case 7:
     System.out.println();
    System.out.println("RUMUS : ");
    System.out.println("Kerucut = L = ( π x r2 ) + ( π x r x s)");
    System.out.println();
    System.out.println("Masukkan jari-jari");
    jari=scan.nextInt();
    // int angka,hasil;
    // double 3.14;
    double hs,jr=jari;
    angka=scan.nextInt();
    hs=3.14*jr*jr;
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=========CONTOH SOAL==========");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("Sebuah topi petani memiliki bentuk kerucut dengan jari-jari alas "+angka+" cm dan tinggi "+angka+" cm. Hitunglah luas permukaan topi?");
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=============JAWAB============");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("l = 3.14* "+angka+" + 3.14 * "+angka+" * "+angka+" ");
    System.out.println("L = "+hs+" cm");
    System.out.println();
    System.out.println("jadi hasil dari perhitungan luas kerucut adalah = "+hs+" cm ");
    break;
    case 8:
     System.out.println();
    System.out.println("RUMUS : ");
    System.out.println("Bola = L = 4 x π x r2");
    System.out.println();
    System.out.println("Masukkan angka bulat");
    angka=scan.nextInt();    
    //int angka,hasil;
    double luas_bola,jri=angka;
    luas_bola=4 * 3.14 * jri;
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=========CONTOH SOAL==========");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("Sebuah pabrik bola ingin memproduksi 10.000 buah bola dengan diameter bola nya sepanjang "+angka+" cm. maka tentukan lah berapa luas bahan plastik yang yang di butuhkan?");
    System.out.println();
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println("=============JAWAB============");
    System.out.println("><><><><><><><><><><><><><><><");
    System.out.println();
    System.out.println("l = 4 * 3.14 * "+angka+" ");
    System.out.println("L = "+luas_bola+" cm");
    System.out.println();
    System.out.println("jadi hasil dari perhitungan luas Bola adalah = "+luas_bola+" cm ");
    break;
    default :
   continue pil;
   
  }
  System.out.print("Apakah Anda Ingin Coba lagi? (1:0)");
  lagi=scan.nextInt();
  System.out.println();
  if(lagi==1){
    continue pil;
  }else{
    System.out.print("**********THANK YOU**********");
    System.exit(0); 
  }
  break;
  }
  }
}
