package String;


public class StringAssignmentsDriver {
    public static void main(String[] args) {
        String Name = "Gururaj" ;
        OvelsAndConsonants ovelsConsonants = new OvelsAndConsonants() ;
        ovelsConsonants.ovelsandconsonants(Name);

       String[] name1 = new String[]{"Gururaj", "Aarti", "Kiran", "Rohit", "Prajktha"};
        StringSort stringSort = new StringSort();
        stringSort.StringSortFuncton(name1);


        String[] name2 = new String[]{"Gururaj", "Aarti", "Kiran", "Rohit", "Prajkth"};
        Replace replace = new Replace() ;
        replace.replace(name2);

          String Name3 = "Hello coditas its me Gururaj" ;
        StringToIntArry stringtoIntarry = new StringToIntArry() ;
        stringtoIntarry.stringToIntArry(Name3);

    }
}
