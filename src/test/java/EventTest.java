import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventTest{

  @Test
  public void getCost_CostreturnsMoney_0() {
    Event testEvent = new Event(true);
    Integer convertThis = new Integer(testEvent.getCost());
    assertEquals(true, convertThis instanceof Integer);
  }

  @Test
  public void getCost_costIncreaseswithChips_5() {
    Event testEvent = new Event(true);
    assertEquals(5, testEvent.getCost());
  }
}
