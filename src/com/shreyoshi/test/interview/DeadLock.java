package com.shreyoshi.test.interview;


/** One possible Output:
Thread-0 is acquiring lock on Object1
Thread-0 has acquired lock on Object1
Thread-1 is acquiring lock on Object1
Thread-1 has acquired lock on Object1
Thread-2 is acquiring lock on Object1
Thread-2 has acquired lock on Object1
Thread-0 is acquiring lock on Object2
Thread-1 is acquiring lock on Object2
Thread-2 is acquiring lock on Object2 

*All the three threads will be able to acquire a lock on the first object. 
*But, they are using the shared resources and started in such a way that 
*they will keep on waiting indefinitely to acquire the lock on the second object. */
public class DeadLock {

	public static void main(String[] args) throws InterruptedException {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		MyThread mt1 = new MyThread(obj1, obj2);
		MyThread mt2 = new MyThread(obj2, obj3);
		//MyThread mt3 = new MyThread(obj3, obj1);
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		//Thread t3 = new Thread(mt3);
		
		t1.start();
		Thread.sleep(5000);
		
		t2.start();
		//Thread.sleep(5000);
		
		//t3.start();		
	}

}


class MyThread implements Runnable{

	private Object obj1;
	private Object obj2;

	public MyThread(Object obj1, Object obj2) {

		this.obj1=obj1;
		this.obj2=obj2;
	}

	@Override
	public void run() {

		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+" is acquiring lock on Object1");

		synchronized(obj1) {

			System.out.println(threadName+" has acquired lock on Object1");
			doSomething(threadName);

			System.out.println(threadName+" is acquiring lock on Object2");

			synchronized(obj2) { //for instance obj2 is shared among thread-0 and thread-1. If thread-0 tries to acquire lock of obj2, it won't be able to as lock of obj2 is already acquired by thread-1

				System.out.println(threadName+" has acquired lock on Object2");
				doSomething(threadName);
			}

			System.out.println(threadName+" has released lock on Object2");
		}

		System.out.println(threadName+" has released lock on Object1");
		System.out.println();
		System.out.println(threadName+" has finished execution");
	}

	private void doSomething(String name) {

		try {
			System.out.println(name+" inside dosomething()");
			
			Thread.sleep(30000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}


}