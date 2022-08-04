///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package queuemanager;
//
//import java.util.ArrayList;
//
///**
// *
// * @author James
// */
//public class HeapQueue<T> implements PriorityQueue<T> {
//    
//    private ArrayList<T> items = new ArrayList<T>();
//    private QueueNode<T> head;
//    
//    @Override
//    public void add(T item, int priority) throws QueueOverflowException{
//        items.add(item);
//        siftUp();
//    }
//
//    private void siftUp() {
//        int k = items.size() - 1;
//
//        while(k > 0) {
//            int p = (k - 1) / 2;
//
//            T child = items.get(k);
//            T parent = items.get(p);
//            
//            if (child.compareTo(parent) > 0) {
//                //swap
//                items.set(k, parent);
//                items.set(p, child);
//
//                //adjust k
//                k = p;
//            } else {
//                break;
//            }
//        }
//
//    }
//
//    private void siftDown() {
//        int k = 0;
//        int left = 1;
//
//        while(left < items.size()) {
//            int max = left;
//            int right = left + 1;
//            if(right < items.size()) {
//                if(items.get(right).compareTo(items.get(left)) > 0) {
//                    max = right;
//                }
//            }
//            T parent = items.get(k);
//            T child = items.get(max);
//
//            if(parent.compareTo(child) < 0) {
//                //swap
//                items.set(k, child);
//                items.set(max, parent);
//
//                k = max;
//                left = 2*k+1;
//            }
//            else {
//                break;
//            }
//        }
//    }
//
//    @Override
//    public void remove() throws QueueUnderflowException {
//        if(items.isEmpty()) {
//            throw new QueueUnderflowException();
//        }
//        else if (items.size() == 1) {
//           
//        }
//
//        T tmp = items.get(0);
//        items.set(0, items.remove(items.size()-1));
//        siftDown();
//    }
//    
//    @Override
//    public T head() throws QueueUnderflowException {
//            T max = items.get(1);
//            return max;
//        }
//    
//    @Override
//    public boolean isEmpty() {
//        
//        return head == null;
//        
//    }
//    
//}
