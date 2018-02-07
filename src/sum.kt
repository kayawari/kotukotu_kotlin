/**
 * Created by takayuki on 2018/02/07.
 * 単純に足し算するだけの関数を作って、それを使って足し算の結果を出す。
 * 仕様：メソッドに引数を２つ渡して、それらを足した結果を出力する関数を動かす。
 */


fun main(args: Array<String>){
    println(sum(2,4))
}

fun sum(x: Int, y: Int):Int {
    return x + y
}