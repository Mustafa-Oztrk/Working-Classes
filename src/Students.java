public class Students {
    public String NameArr,SurNameArr, StudentNumberArr;

    public Students(String nameArr, String surNameArr, String studentNumberArr) {
        NameArr = nameArr;
        SurNameArr = surNameArr;
        StudentNumberArr = studentNumberArr;

    }

    public String getName() {
        return NameArr;
    }

    public String getSurName() {
        return SurNameArr;
    }

    public String getStudentNumber() {
        return StudentNumberArr;
    }


    @Override
    public String toString() {
        return "Name : " + NameArr +  " SurName : " + SurNameArr + " Number : " +StudentNumberArr;
    }
}
