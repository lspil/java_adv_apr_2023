package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

  public static List<String> list = new ArrayList<>();
  // CopyOnWriteArrayList, CopyOnWriteArraySet, ConcurrentHashSet, ConcurrentHashMap ...

  public static void main(String[] args) {

    new ProducerThread("_P1").start();
    new ProducerThread("_P2").start();
    new ProducerThread("_P3").start();

    new ConsumerThread("_C1").start();
    new ConsumerThread("_C2").start();
    new ConsumerThread("_C3").start();

    // Semaphore, ReadWriteLock, CyclicBarrier

//    Semaphore s = new Semaphore(1000); 
//    try  {
//      s.acquire();
//      //do stuff
//    } catch (InterruptedException e) {
//
//    } finally {
//      s.release();
//    }

//    ReadWriteLock lock = new ReentrantReadWriteLock();
//
//    lock.readLock().lock();
//    // a read operation
//    lock.readLock().unlock();
//
//    lock.writeLock().lock();
//    // a write operation
//    lock.writeLock().unlock();
  }
}
