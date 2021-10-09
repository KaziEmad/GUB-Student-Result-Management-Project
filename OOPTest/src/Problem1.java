
class admission {

    int id;
    String name, dept, phn;

    void set_data(String w, int x, String y, String z) {
        name = w;
        id = x;
        phn = y;
        dept = z;
    }
}

class Ct_Marks extends admission {

    double ct1, ct2, ct3, Avg, min;

    void set_ct_marks(int x, int y, int z) {
        ct1 = x;
        ct2 = y;
        ct3 = z;
    }

    double avg_ct_marks() {

        if (ct1 <= ct2 && ct1 <= ct3) {
            min = ct1;
        } else if (ct2 <= ct3 && ct2 <= ct1) {
            min = ct2;
        } else {
            min = ct3;
        }
        Avg = (ct1 + ct2 + ct3 - min) / 2;
        return Avg;
    }
}

class result extends Ct_Marks {

    void Show_result() {
        System.out.println(name + " " + id + " " + phn + " " + dept);
        System.out.println(avg_ct_marks());
    }
}

class main {

    public static void main(String[] args) {
        result ob = new result();
        ob.set_data("Emad", 191902025, "01954458244", "CSE");
        ob.set_ct_marks(14, 15, 12);
        ob.Show_result();
    }
}
