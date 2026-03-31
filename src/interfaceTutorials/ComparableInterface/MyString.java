package interfaceTutorials.ComparableInterface;

public class MyString implements Comparable<MyString>{
    String str;
    MyString(String str){
        this.str = str;
    }
    @Override
    public int compareTo(MyString other) {
        return this.str.length() - other.str.length();
    }
    // Now string can be storeted by length , not alphabetically

}
