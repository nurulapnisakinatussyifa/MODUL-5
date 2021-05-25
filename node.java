
package single_linked_list_noncilcular;
public class node {
     protected int data;
    protected node link;
    
    
    public node(){
    link = null;
    data = 0;
    }
    
    public node(int d, node n){
    data = d;
    link = n;
    }
    
    public void setLink(node n){
    link = n;
    }
    
    public void setData(int d){
    data = d;
    }
    
    public node getLink(){
    return link;
    }
    
    public int getData(){
    return data;
    }

   
}

