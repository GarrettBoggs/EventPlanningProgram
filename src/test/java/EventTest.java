import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventTest{

  @Test
  public void getCost_CostreturnsMoney_5() {
    Event tester = new Event(true);
    assertEquals(true, tester.getCost() instanceof Integer);
  }
}
