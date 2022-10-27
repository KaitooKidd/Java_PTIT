package Mang_Va_Doi_Tuong.Sap_xep_SV_theo_lop_ma;

import java.lang.invoke.ConstantCallSite;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int n = Integer.parseInt(sc.nextLine());
        ArrayList<Sinh_Vienn> S = new ArrayList<>();
        while (sc.hasNext()) {
            S.add(new Sinh_Vienn(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        S.sort(new Comparator<Sinh_Vienn>() {

            @Override
            public int compare(Sinh_Vienn a, Sinh_Vienn b) {
//                if (!Objects.equals(a.getLop(), b.getLop()))
//                    return a.getLop().compareTo(b.getLop());
                return a.getId().compareTo(b.getId());
            }
        });
        for(Sinh_Vienn i : S)
            System.out.println(i);
    }
}
