package cj.collectionsframework.set.treeset.addhetrogeneousdata_comparethem;

public class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo( Student s) {
        if (s.id> id)
        return -1;
        else if (s.id<id)
        return 1;
        else
            return 0;
    }

}
