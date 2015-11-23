/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ada_citac;

/**
 *
 * @author viktor.glabazna
 */
public class counter {
    public int num;
    private final int max;
    private counter next;

    public counter(int max, counter next) {
        this.next = next;
        this.max = max;
        num = 0;
    }
    void raise(){
        if(num > max){
            next.num++;
            num = 0;
        }
        num++;
    }
    
    
    
}
