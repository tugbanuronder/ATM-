import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner input= new Scanner(System.in);
      String username,password;
      int kalan=3,select,bakiye=2000,miktar;

      while(kalan>0) {

          System.out.print("Kullanıcı adı giriniz:");
          username = input.nextLine();
          System.out.print("Şifre giriniz:");
          password = input.nextLine();

          if(username.equals("tugba") && password.equals("tugba123")){

              do {

                  System.out.println("Merhaba. Sisteme başarılı şekilde giriş yaptınız.");
                  System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
                  System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                  select=input.nextInt();

                  switch (select){
                      case 1:
                          System.out.print("Yatırmak istediğiniz para miktarını giriniz:");
                          miktar=input.nextInt();
                          bakiye +=miktar;
                          System.out.println("Bakiyeniz:" + bakiye);
                          break;

                      case 2:
                          System.out.print("Çekmek istediğiniz para miktarını giriniz:");
                          miktar=input.nextInt();
                          if(miktar>bakiye){
                              System.out.println("Bakiye yetersiz.");
                              System.exit(0);
                          }
                          else{
                              bakiye -=miktar;
                              System.out.println("Kalan bakiyeniz:" + bakiye);
                          }
                          break;

                      case 3:
                          System.out.println("Bakiyeniz:" + bakiye);
                          break;

                  }

              }while(select !=4);

              System.out.println("Tekrar görüşmek üzere!");
              break;
          }

          else{
              kalan--;
              System.out.println("Hatalı kullanıcı adı veya şifre. Lütfen tekrar deneyiniz.");
              System.out.println("Kalan hakkınız:" + kalan);
          }
      }
      if(kalan==0){
          System.out.println("Hesabınız bloke olmuştur. Banka ile iletişime geçiniz.");
      }
    }
}