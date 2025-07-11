import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> map = new HashMap<> ();

    while (true) {
      System.out.println("== 마트 상품 목록 관리 ==");
      System.out.print("1. 상품 등록\n2. 전체 목록 보기\n3. 특정 가격 이상 상품 보기\n4. 종료");
      System.out.print("\n메뉴 선택 : ");
      int choice = sc.nextInt();
      sc.nextLine();

      if (choice == 1) {
        System.out.print("상품명 : ");
        String name = sc.nextLine();
        System.out.print("가격 : ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println("등록이 완료 되었습니다.");

        map.put(name, price);
      }
      else if (choice == 2) {
        if (map.isEmpty()) {
          System.out.println("등록된 상품이 없습니다.");
          continue;
        }
        System.out.println("[전체 상품 목록]");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
          System.out.println(entry.getKey() + " : " + entry.getValue() + "원");
        }
      }
      else if (choice == 3) {
        if (map.isEmpty()) {
          System.out.println("등록된 상품이 없습니다.");
          continue;
        }
        System.out.print("기준 가격을 입력해 주세요 : ");
        int price_ = sc.nextInt();
        sc.nextLine();

        if (price_ < 0) {
          System.out.println("0원 이상의 가격을 입력해 주세요.");
          continue;
        }
        boolean found = false;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
          if (entry.getValue() > price_) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + "원");
            found = true;
          }
        }
        if (!found) {
          System.out.println(price_ + "원 이상의 상품이 없습니다.");
        }
      }
      else if (choice == 4) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }
      else {
        System.out.println("해당 기능은 없습니다. 다시 입력해 주세요.");
      }
    }
    sc.close();
  }
}