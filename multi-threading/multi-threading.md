# Java Multithreading – Complete Topics Guide

## 1. Core Multithreading Basics
- What is multithreading & concurrency
		Multithreading: Running multiple threads within a single process.
		Concurrency: Managing multiple tasks at the same time (not necessarily parallel).
- Process vs Thread
			Process			Thread
			Heavyweight		Lightweight
			Own memory		Shared memory
			Slow			Fast
- Thread creation
  - Extending Thread
		class MyThread extends Thread {
			public void run() {
				System.out.println("Thread using Thread class");
			}
		}
  - Implementing Runnable
		class MyRunnable implements Runnable {
			public void run() {
				System.out.println("Thread using Runnable");
			}
		}
- Thread lifecycle
  - NEW → Thread created
	RUNNABLE → Ready/running
	BLOCKED → Waiting for lock
	WAITING/TIMED_WAITING → Waiting for another thread
	TERMINATED → Execution finished
- Thread methods
  - start()(java.lang.Thread)
		Creates a new thread and internally calls the run() method on that new thread.
		Enables true concurrent execution by running run() in a separate call stack.
		Can be called only once per thread object; calling it again throws IllegalThreadStateException.
  - run()(java.lang.Runnable)
		Contains the code to be executed by the thread.
		Calling it directly does not create a new thread; it executes in the current thread like a normal method.
		Can be called multiple times without exceptions.
  - sleep(), join(), yield()
  - interrupt(): is a request to stop, isAlive(): to confirm the thread has ended.
- Daemon threads
		Background threads (e.g., garbage collector)
		Automatically stops when main thread ends
- Thread priorities
		Range: 1 (MIN) → 10 (MAX)
		Default = 5

## 2. Thread Safety & Synchronization
- Race condition
	Multiple threads access and modify shared data at the same time, leading to unexpected results.
- Critical section
	The part of code where shared resources are accessed
- synchronized keyword: Used to control access to critical section
  - Method level
		class Counter {
		int count = 0;
		synchronized void increment() {
			count++;
			}
		}
  - Block level:More flexible (only locks required part)
		class Counter {
			int count = 0;
			void increment() {
				synchronized(this) {
					count++;
				}
			}
		}
When to use?
		Method-level → simple cases
		Block-level → performance optimization

- Intrinsic locks (monitor locks)
		Every Java object has an internal lock (monitor)
		synchronized uses this lock automatically
		
- Object-level: Lock is per object instance, Different objects → different locks
- Class-level locking: for class level lock use Static synchronization in method level
- Reentrancy:  A thread holding a lock can acquire it again


## 3. Inter-Thread Communication
- wait()
		Causes the current thread to release the lock and go into waiting state
		It will wait until another thread calls notify() or notifyAll()
		synchronized (obj) {
			obj.notify();
		}
- notify()
		Wakes up one waiting thread (randomly chosen)
		synchronized (obj) {
			obj.notify();
		}
- notifyAll()
		Wakes up all waiting threads
		synchronized (obj) {
			obj.notifyAll();
		}
- Producer–Consumer problem
		One thread (Producer) produces data
		Another thread (Consumer) consumes data
- Guarded blocks: A Guarded Block is a block of code that waits until a condition becomes true. It uses while + wait() pattern.

## 4. Memory Management & Visibility
- Java Memory Model (JMM)
	The Java Memory Model (JMM) defines
	How threads interact with memory
	How changes made by one thread become visible to others
- Stack vs Heap
		Stack Memory
		Per-thread memory
		Stores:
			Method calls
			Local variables
		NOT shared between threads

		Heap Memory
		Shared among all threads
		Stores:
			Objects
			Instance variables
- Thread-local memory
	Each thread has its own isolated copy of a variable
	Provided by ThreadLocal class
- Visibility problem
- volatile keyword
		Always read from main memory
		Always write to main memory
- Happens-before relationship
		ordering guarantee
		Monitor Lock: Unlock → Happens before → Lock
		Volatile: Write → Happens before → Read
		Thread Join Rule: t.join(); // ensures thread completed
		Thread Start Rule
## 5. Advanced Concurrency Issues
- Deadlock : A deadlock happens when two or more threads are waiting forever for each other’s locks.
			Fix: Use consistent lock ordering
		   // Always lock lock1 first, then lock2
		    Use tryLock() (ReentrantLock)
		    Avoid nested locks
		    Use timeout

- Livelock : Threads are not blocked, but keep responding to each other and never complete work.
				Fix:
				Add randomness (backoff strategy)
				Avoid over-coordination
				Use timeout
- Starvation : A thread never gets CPU/resources because other threads keep taking them.
				Problem: Low priority thread may never execute
- Thread contention : Multiple threads trying to access the same resource/lock, causing slowdown.
	Problem: All threads wait for the same lock → performance issue
	Fix: Reduce synchronized scope
		 Use AtomicInteger
- Lock ordering : A strategy to prevent deadlocks by always acquiring locks in the same order.
				Rule: lock1 → lock2 → lock3
- Double-checked locking : Used to create Singleton efficiently (lazy initialization with minimal locking)
		Problem (without volatile):
			Instruction reordering
			Partially constructed object

## 6. Locks Framework (java.util.concurrent.locks)
- Lock interface : Lock is a more flexible alternative to synchronized.
		Key Features:
			Explicit lock/unlock
			Try to acquire lock without blocking
			Interruptible locking
			Multiple conditions
- ReentrantLock : A lock that allows the same thread to acquire it multiple times.
- Fair vs Non-fair
  Non-Fair (default)                                                            
		Faster
		Threads may jump queue
		ReentrantLock lock = new ReentrantLock(); // non-fair
  Fair Lock
		First-come-first-serve (FIFO)
		Prevents starvation
		Slightly slower
		ReentrantLock lock = new ReentrantLock(true); // fair
		Use fair lock only when starvation matters more than performance
- tryLock(): Attempts to acquire lock without waiting, lockInterruptibly(): Allows thread to be interrupted while waiting
- ReadWriteLock : Separates locks into:Read Lock (multiple threads allowed),Write Lock (exclusive)
  - ReentrantReadWriteLock
   High performance for read-heavy systems
   Multiple readers at same time
   Limitation: Write lock blocks all readers
- StampedLock(java 8+): Advanced lock with:
		Optimistic read
		Read lock
		Write lock
		Very fast for read-heavy workloads
		Reduces contention
- Condition interface : Similar to wait() / notify(), but more flexible.
						Multiple conditions per lock
						Better control
						Cleaner API

## 7. Atomic Classes (Lock-Free Programming)
- AtomicInteger : A thread-safe integer that supports atomic operations without locks.
			Why use it: No synchronized, Better performance under contention, Uses CAS internally
- AtomicLong: same as AtomicInteger
- AtomicBoolean : hread-safe boolean value
- AtomicReference : Allows atomic updates on object references. Use cases: Updating shared objects safely, Lock-free data structures
- AtomicStampedReference : Adds a version (stamp) to reference → solves ABA problem
- Compare-And-Swap (CAS)
		Example: if (current == expected) {
					current = newValue;
				}
- ABA problem:
		A tricky issue in CAS:
		Value = A
		Thread1 reads A
		Thread2 changes A → B → A
		Thread1 sees A (thinks nothing changed) 
		But actually it changed!
Solution: AtomicStampedReference
## 8. Executor Framework
- Executor:  Executor is the top-level interface for launching tasks asynchronously.
			new Thread(task).start(); instead of executor.execute(task);
- ExecutorService : ExecutorService extends Executor.
				Submit tasks
				Shutdown pool
				Future result
				Multiple thread management
- ScheduledExecutorService
			Used for:
				Delayed tasks
				Periodic tasks
				Better replacement for old Timer.
			Methods:
				schedule()
				scheduleAtFixedRate()
				scheduleWithFixedDelay()
	FixedRate :Runs at exact interval.If task takes 1 sec and interval 2 sec
	FixedDelay: Next run starts after previous completes + delay.
	
- ThreadPoolExecutor
	Actual implementation of thread pool.
	Most powerful and customizable executor.
	Used internally by Executors
	ThreadPoolExecutor( corePoolSize, maxPoolSize, keepAliveTime, unit, workQueue)
	
- Executors utility class : Factory class to create thread pools easily.
  - newFixedThreadPool
		Creates fixed number of threads.
		Example:
				If 2 threads:
				Only 2 tasks run simultaneously
				Others wait in queue
  - newCachedThreadPool
			Creates threads as needed.
			No fixed size
			Reuses idle threads
			Good for many short tasks
  - newSingleThreadExecutor: Only one worker thread.
  - newScheduledThreadPool: Used for delayed / repeated jobs.

### Thread Pool Concepts
- Core pool size
- Maximum pool size
- Queue capacity
- RejectedExecutionHandler
- ThreadFactory

## 9. Callable, Future & CompletableFuture
- Runnable vs Callable
- Future
  - get(), cancel(), isDone()
- FutureTask
- CompletableFuture (Java 8+)
  - async chaining
  - combining results

## 10. Concurrent Collections (java.util.concurrent)

### Maps
- ConcurrentHashMap
- ConcurrentSkipListMap

### Lists
- CopyOnWriteArrayList
- CopyOnWriteArraySet

### Queues
- ConcurrentLinkedQueue
- ConcurrentLinkedDeque


## 11. Blocking Queues
- BlockingQueue interface
- ArrayBlockingQueue
- LinkedBlockingQueue
- PriorityBlockingQueue
- DelayQueue
- SynchronousQueue

### Key Methods
- put() vs offer()
- take() vs poll()

---

## 12. Synchronizers (Advanced)
- CountDownLatch
- CyclicBarrier
- Semaphore
- Phaser
- Exchanger

## 13. ThreadLocal
- ThreadLocal variables
- InheritableThreadLocal
- Use cases
  - User context
  - Transactions

---

## 14. Fork/Join Framework
- ForkJoinPool
- RecursiveTask
- RecursiveAction
- Work-stealing algorithm


## 15. Parallel Processing
- Parallel Streams (Java 8)
- Spliterator basics
- Performance considerations



## 16. Concurrency Design Patterns
- Producer–Consumer
- Thread Pool pattern
- Future pattern
- Guarded Suspension
- Balking pattern
- Double-checked locking (Singleton)

---

## 17. Performance & Tuning
- CPU-bound vs IO-bound tasks
- Thread pool sizing
- Context switching
- False sharing
- Cache coherence

---

## 18. Debugging & Monitoring
- Thread dump (jstack)
- Deadlock detection
- Logging thread names
- Profiling tools (JVisualVM, etc.)

---

## 19. Common Problems & Pitfalls
- Race conditions
- Deadlocks
- Memory leaks (thread leaks)
- Improper synchronization
- Blocking calls inside async
- Over-threading

---

## 20. Real-World Integration
- Multithreading in Spring Boot (@Async)
- Thread pools in web servers (Tomcat)
- Database connection pooling
- Message queues (Kafka, RabbitMQ)
- Caching concurrency issues

---

## 21. Interview Must-Know Topics (Top Priority)
- Thread creation & lifecycle
- synchronized vs Lock
- wait vs sleep
- volatile keyword
- ExecutorService & thread pool tuning
- ConcurrentHashMap
- BlockingQueue
- Deadlock & prevention
- Atomic classes
- Callable & Future

---

## Final Tip
Think in layers:
1. Core Threads
2. Synchronization
3. Concurrency Utilities
4. Real-world usage (Spring Boot, Messaging, Microservices)


• Concurrency vs Parallelism 
• Processes vs Threads 
• Thread Lifecycle 
• Race Condition 
• Mutex & Semaphore 
• Condition Variables 
• Deadlock & Livelock 
• Reentrant Lock & Try-Lock 
• Producer-Consumer 
• Reader-Writer 
• Thread Pool 
• Blocking Queue 
• Thread-Safe Cache 