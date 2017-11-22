/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema2;

/**
 *
 * @author JoseCarlos
 */
public class ImplArrayManipulator<E> implements ArrayManipulator<E>{

    @Override
    public int subsets(List<E> set) {
        
 
            for (int i = 0; i < set.size()-1; i++) {
                subsets(set);
                if (set.size() != 0) {
                    E b = set.get(i);
                    set.set(i, set.get(set.size()-1));
                    set.set(set.size()-1,b);
                    return 1;
                }
                else{
                     E b = set.get(0);
                    set.set(0, set.get(set.size()-1));
                    set.set(set.size()-1,b);
                    return 1;
                }
            }
        return 0;
       
        
     
       
    }
    
}
