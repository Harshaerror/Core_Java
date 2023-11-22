/*we can create our own singletone class
for this we have to use private constructor and
private static variable and public factory method
approch 1
*/
class singletoneclass {
    private static singletoneclass t = new singletoneclass();
    private singletoneclass(){
        System.out.println("kalbhairavam bhaje");
    }
    public static singletoneclass getsingletone(){
        return t;
    }

    public static void main(String[] args){
    singletoneclass t1 = singletoneclass.getsingletone();
    singletoneclass t2 = singletoneclass.getsingletone();
    singletoneclass t3 = singletoneclass.getsingletone();
   
    
    }
}
