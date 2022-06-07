import java.util.concurrent.atomic.AtomicInteger

class MultiThreading(x:AtomicInteger) extends Runnable {
  override def run(): Unit =  {
    x.incrementAndGet()
    print(s"  $x  ")
  }
}

object Loop extends App {
  var  count = new AtomicInteger(0)
    for (i <- 0 until 2000){
      val t = new Thread(new MultiThreading(count))
      t.start()
    }
  }