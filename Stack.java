package stack;
import stack.Stack; //imports the object Stack(class stack) from the same package

public class Pilha<T> {
    private Node <T> top;
    
    public boolean isEmpty(){
        if(this.top==null){
            return true;
            
        }else{
            return false;
        }
    }    
    
    public boolean isFull(){
        return false;
        
    }
    
    public void push(T valor){
        Node <T> aux = new Node<T>(valor);
        aux.setNext(this.top);
        this.top=aux;
        
        
    }
    
    public T top(){
        return this.top.getInfo();
    }    
    
    public T pop(){
        Node <T> aux=this.top;
        this.top=this.top.getNext();
        return aux.getInfo();
    }
    
    
}
