import java.util.concurrent.*;

public class TestRepeat {
  public static void main(String[] args) {
    ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
    RepeatedTask repTask = new RepeatedTask();
    e.scheduleAtFixedRate( repTask::task, 0, 1, TimeUnit.SECONDS );
  }
}
