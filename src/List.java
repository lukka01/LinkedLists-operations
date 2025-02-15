public class List {

    public int info;
    public List next;

    public List(int x, List l){
        info = x;
        next = l;
    }

    public List (int x){
        info = x;
        next = null;
    }

    public void insert(int x){
        next = new List(x,next);
    }

    public void delete(){
        if (next != null)
            next = next.next;
    }

    public String toString(){
        String result = "[" + info;
        for(List t = next; t!= null; t=t.next)
           result = result + ", " + t.info;
        return result + "]";

    }








}
