/**
 * Created by andriusbaltrunas on 2/1/2018.
 */
public class KlasesPvz {

    public static void main(String[] args){
        // objecto sukurimas, perduodam param i konstruktoriu
        SecondClassExample secondClassExample = new SecondClassExample(67);
        secondClassExample.testMethod();// metodo iskvietimas
    }
}

//klase be public nes faile gale buti tik viena su public
class SecondClassExample{
    private int id;// klases lygio kintamasis

    //default konstruktorius
    public SecondClassExample(){
        id = 10;
    }

    // konstruktorius su vienu int param
    public SecondClassExample(int id){
        //id = ids; /// galima nes skiriasi vardai
        this.id = id; //priskiria nauja reiksme
    }

    //public metodas
    public void testMethod(){
        System.out.println("this is my method :)" + id);
    }
}
