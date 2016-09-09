import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventTest{

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(true,5);
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void getCost_CostreturnsMoney_0() {
    Event testEvent = new Event(true,5);
    Integer convertThis = new Integer(testEvent.getCost());
    assertEquals(true, convertThis instanceof Integer);
  }

  @Test
  public void getCost_costIncreaseswithChips_5() {
    Event testEvent = new Event(true,5);
    assertEquals(5, testEvent.getCost());
  }

  @Test
  public void getCost_costIncreaseswithPeople_10() {
    Event testEvent = new Event(true,5);
    assertEquals(10, testEvent.getCost());
  }
}
