package DAY_4;



class StudentEquals {
    int rollNo;
    String name;

    StudentEquals(int r, String n) {
        rollNo = r;
        name = n;
    }

    public boolean equals(Object obj) {
        StudentEquals s = (StudentEquals) obj;
        if (rollNo == s.rollNo && name.equals(s.name))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        StudentEquals s1 = new StudentEquals(101, "Amit");
        StudentEquals s2 = new StudentEquals(101, "Amit");

        if (s1.equals(s2))
            System.out.println("Both students are equal");
        else
            System.out.println("Both students are not equal");
    }
}

