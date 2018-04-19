package variable
def closer={println "fuck"}
//closer()
def minder={String name,int age-> println "fuck ${age}"}
minder.call("aaa",2)
//每个闭包都有一个隐式参数it
def okki={println "fuck${it}"}
okki.call('aa')
/**
 * 闭包详解,tims从0开始
 */
//从1-5,每次都执行闭包内容
int x=1
 int fab(int number){
     int result=1
     number.upto(5){
         num->result*=num
     }
     return result
 }
//println fab(x)
/**
 * 字符串与闭包结合使用
 *
 */
String str ='the 2 and 3 is 5'
//str.each {
//    String param->print param.multiply(2)
//}

//def list=str.findAll{
//    String s->s.isNumber()
//}
//println list.toListString()

//any,任意一个 返回布尔，判断是否满足条件
//any,每一个 返回布尔，判断是否满足条件
//def result=str.any{
//    String s->s.isNumber()
//}
//def result=str.every{
//    String s->s.isNumber()
//}
//println result

//def list=str.collect {
//    it.toUpperCase()
//}
/**
 * 闭包的三个重要变量 this,owner,delegate
 * this:代表闭包定义处的类
 * owner：代表闭包定义处的类或者对象
 * delegate:代表任意对象，默认owner,可修改
 */