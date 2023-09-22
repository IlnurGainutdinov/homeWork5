public class HomeWork {
    public static void main(String[] args) {
        task0();
    }
    static void task0(){
        TelephoneNum telephoneNum = new TelephoneNum();
        telephoneNum.add("1111111", "Ivan");
        telephoneNum.add("2222222", "Vasiliy");
        telephoneNum.add("3333333", "Petr");
        telephoneNum.add("4444444", "Igor");
        telephoneNum.add("5555555", "Ivan");
        telephoneNum.add("6666666", "Max");
        telephoneNum.add("7777777", "Igor");
        telephoneNum.add("8888888", "Ivan");
        telephoneNum.add("9999999", "Ivan");
        System.out.println(telephoneNum.map);
        System.out.println(telephoneNum.getAll());
    }
}