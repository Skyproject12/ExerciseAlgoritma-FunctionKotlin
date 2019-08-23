import java.util.*

class Mahasiswa ( ) {
    var nama=""
    var nim=""
    var uts=0
    var uas=0
    var tugas=0
}
fun main (args : Array<String>)  {
    var scan = Scanner(System.`in`)
    var mas = Mahasiswa()
    println("masukkan nama")
    mas.nama= scan.next()
    println("masukkan nim")
    mas.nim=scan.next()
    println("masukkan uts")
    mas.uts=scan.nextInt()
    println("masukkan uas")
    mas.uas=scan.nextInt()
    println("masukkan tugas")
    mas.tugas=scan.nextInt()
    var nilaiUts = 0.4*mas.uts
    var nilaiUas = 0.4*mas.uas
    var nilaiTugas = 0.2*mas.tugas
    var totalTugas = nilaiUas + nilaiUts + nilaiTugas
    println("nilai tugas mahasiswa "+ mas.nama+ " " + totalTugas)

}