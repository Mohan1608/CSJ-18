package cj.Clone.shallowclone;

public class ShallowClone{
    public static void main(String[] args)throws CloneNotSupportedException {
        Address ad = new Address("pune", 1002);
        Student s = new Student("Mohan", 101, "cj", ad);

//      in the below line we are cloning(coping internal data) obect s to object s2
        Student s2 = (Student) s.clone();

//      here we are change the name of s object then only s object name is change
        s.name="Raj";

//      here we are changing city and pin of s2 object that causes changing data in both s and s2 object
//      if we change city and pin for s object then also data changing for both object
//      means we can change only primitive data not a referance type data of Student class(ad contains city and pin)
//      ad is referance type data of Student class.
        s2.ad.city="mumbai";
        s2.ad.pincode=2002;

        System.out.println(s2);
        System.out.println(s);

//     this shows us s oject ad and s2 object ad referaring to same object
        System.out.println(s.ad==s2.ad);
    }
}
