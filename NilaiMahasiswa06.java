public class NilaiMahasiswa06 {
    String nama[] = {"Ahmad","Budi","Cindy","Dian","Eko","Fajar","Gina","Hadi"};
    String nim[] = {"220101001","220101002","220101003","220101004","220101005","220101006","220101007","220101008"};
    int tahunMasuk[] = {2022,2022,2021,2021,2023,2020,2023,2020};
    int uts[] = {78,85,90,76,92,88,80,82};
    int uas[] = {82,88,87,79,95,85,83,84};
    int jumlah = uts.length;

    int maxUTS(int l, int r){
        if(l == r){
            return l;
        }
        int mid = (l + r) / 2;
        int left = maxUTS(l, mid);
        int right = maxUTS(mid+1, r);
        if(uts[left] > uts[right]){
            return left;
        } else{
            return right;
        }
    }
    int minUTS(int l, int r){
        if(l == r){
            return l;
        }
        int mid = (l + r) / 2;
        int left = minUTS(l, mid);
        int right = minUTS(mid+1, r);
        if(uts[left] < uts[right]){
            return left;
        } else{
            return right;
        }
    }
    double rataUAS(){
        double total = 0;
        for(int i = 0; i < jumlah; i++){
            total += uas[i];
        }
        return total / jumlah;
    }
}