package tk4;
import java.util.Scanner;
public class TugasKelompok4 {
    static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    int iMin,iMax;
    static int[] lstData=new int[5];
    public static void main(String[] args) {
        int iPilih=0;
        while (iPilih!=6){
            System.out.print ( "\nSelamat Datang di Program Simulasi \n"
                    + "Menu:\n"
                    + "1. Random Data \n"
                    + "2. Simulasi Bubble Sort - Ascending \n"
                    + "3. Simulasi Selection Sort - Ascending\n"
                    + "4. Simulasi Bubble Sort - Descending\n"
                    + "5. Simulasi Selection Sort - Descending\n"
                    + "6. Keluar \n"
                    + "Masukan Pilihan Anda:");
            iPilih=in.nextInt();
            switch (iPilih){
                case 1:
                    randomData();
                    break;
                case 2:
                    BubbleSort();
                    break;
                case 3:
                    selectionSort();
                    break;
                case 4:
                    BubbleSort(false);
                    break;
                case 5:
                    selectionSort(false);
                    break;
                case 6:
                    break; }
        }
    }
    static void randomData(){
        //input batas bawah
        System.out.print ( "Batas Bawah:");
        int iMin=in.nextInt();
        //input batas atas
        System.out.print ( "Batas Atas:");
        int iMax=in.nextInt();
        for (int i=1;i<=5;i++){
            lstData[i-1]=(int)(iMin + (int) (Math.random() * (iMax -
                    iMin + 1))); }
        //display result
        printData();
    }
    static void BubbleSort(){
        BubbleSort(true);
    }
    static void BubbleSort(boolean asc){
        for (int i=1;i<lstData.length;i++){
            System.out.print("Pass "+ i+ "\n");
            for (int j=0;j<lstData.length-i;j++ ){
                //select and swap
                selectBySort(asc,j);
                //print list of Data
                printData();
            }
            System.out.print("\n Result of Pass "+ i+ "\n");
            printData();
        }
    }
    static void selectBySort(boolean asc, int currentIndex){
        if (asc){
            if (lstData[currentIndex]>lstData[currentIndex+1])
                swap(currentIndex,currentIndex+1);
        } else{
            if (lstData[currentIndex]<lstData[currentIndex+1])
                swap(currentIndex,currentIndex+1);
        }
    }
    static void swap(int index1, int index2 ){
        int iTemp;
        iTemp=lstData[index1];
        lstData[index1]=lstData[index2];
        lstData[index2]=iTemp;
    }
    static void selectionSort(){
        selectionSort(true);
    }
    static void selectionSort(boolean asc){
        for (int i=0;i<lstData.length-1;i++){
            //display the messege
            System.out.print("\n Pass "+ (i+1) + "\n");
            //find current minimum in the list
            int currentMin=lstData[i];
            int currentMinIdx=i;
            for (int j=i+1;j<lstData.length;j++){
                if (asc){
                    if (currentMin>lstData[j]){
                        currentMin=lstData[j];
                        currentMinIdx=j;
                    }
                } else{
                    if (currentMin<lstData[j]){
                        currentMin=lstData[j];
                        currentMinIdx=j;
                    }
                }
                //print list of Data
                printData();
            }
            //swap list
            if (currentMinIdx!=i){
                lstData[currentMinIdx]=lstData[i];
                lstData[i]=currentMin;
            }
            //display messege
            System.out.print("\n Result of Pass "+ (i+1)+ "\n");
            printData();
        } }
    static void printData(){
        for (int i=0;i< lstData.length ;i++){
            //cetak hasil
            System.out.print(lstData[i]+ "    ");
        }
        System.out.print("\n");
    }
}

