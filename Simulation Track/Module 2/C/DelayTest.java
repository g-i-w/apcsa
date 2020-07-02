import java.util.concurrent;

public class DelayTest {
  public static void main(String[] args) {

    ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();

    e.scheduleAtFixedRate( RepeatedTask::someTask, 0, 1, TimeUnit.SECONDS);

  }
}
