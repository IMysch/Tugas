
import java.util.ArrayList;
import java.util.List;



class mahasiswa {

    public static <ArgumentSet> void main(String[] args){

        List<String> mahasiswa = new ArrayList<>();

        mahasiswa.add("Wildan");
        mahasiswa.add("Ahmad");
        mahasiswa.add("Sandi");
        mahasiswa.add("yudi");
        mahasiswa.add("dudi");
        mahasiswa.add("tono");
        mahasiswa.add("dona");
        mahasiswa.add("sapari");
        mahasiswa.add("yonda");


        //Membuat Objek Baru dengan Tipe Data String
        List<String> mahasiswa2 = new ArrayList<>();
        mahasiswa.add("Eren");
        mahasiswa.add("Levi");
        mahasiswa.add("rena");
        mahasiswa.add("nuna");
        mahasiswa.add("popo");
        mahasiswa.add("yuki");

        List<Integer> npm = new ArrayList<>();
        npm.add(5431245);
        npm.add(5312523);
        npm.add(5235121);
        npm.add(5133563);
        npm.add(5314134);
        npm.add(5357553);
        npm.add(5246257);
        npm.add(5603445);
        npm.add(5622234);

        //Membuat Objek Baru dengan Tipe Data Integer
        List<Integer> npm2 = new ArrayList<>();
        npm.add(5383434);
        npm.add(5426777);
        npm.add(5634545);
        npm.add(5613124);
        npm.add(5032467);
        npm.add(5753245);



        for(String mhs:mahasiswa){
            System.out.println(mhs);


        }
        for(int npM:npm){
            System.out.println(npM);
    }}}