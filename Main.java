package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int jurusan;

        System.out.println("Masukkan nama : ");
        nama = input.nextLine();
        System.out.println("Pilihan Jurusan");
        System.out.println("1. Tehnik informatika");
        System.out.println("2. Sistem informasi");
        System.out.println("3. Teknik Mesin");
        System.out.println("Masukan pilihan Jurusan");
        jurusan = input.nextInt();

        switch (jurusan){
            case 1:
            System.out.println("\n" + nama + " Anak tehnik informatika");
            break;
            case 2:
                System.out.println("\n" + nama + " Anak Sistem informasi");
                break;
            case 3:
                System.out.println("\n" + nama + " Anak teknik mesin");
                break;
            default :
                System.out.println("Bukan anak kuliahan");
        }


        int nilai;
        System.out.println("Masukkan Nilai : ");
        nilai = input.nextInt();

        if (nilai >= 70) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");

        }
    }}







