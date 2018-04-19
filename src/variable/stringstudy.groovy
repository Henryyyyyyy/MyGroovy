package variable
/**
 * ***************************第一节
 */
//单引号是不可拓展的，不能加变量
def name1='a \'aaaa\'string'
def name2='a aaaastring'
//3个单引号可以定义格式
def name3='''  a
b  c
d
'''
//gstring类型，可拓展,,string 跟gstring可强转，可相互调用
def aa="zengjin"
def sayhello="hello:${aa}"

String echo(String msg){
    return msg
}
def result=echo(sayhello)
println result
/**
 * ***************************第二节 字符串方法
 */
def data="groovy"
//填充类型
println data.center(8,'a')//agroovya
println data.padLeft(8,'a')//aagroovy
//获取索引值的字符串
println data[0]//g
println data[0..2]//gro
println data.minus("vy")//groo ,也可以直接减
println data.reverse()
println data.capitalize()
println data.isNumber()


