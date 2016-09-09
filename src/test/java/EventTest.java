import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventTest{
  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(true,false,5,"none");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void getCost_costReturnsMoney_0() {
    Event testEvent = new Event(true,false,5,"none");
    Integer convertThis = new Integer(testEvent.getCost());
    assertEquals(true, convertThis instanceof Integer);
  }

  @Test
  public void getCost_costIncreasesWithChips_5() {
    Event testEvent = new Event(true,false,0,"none");
    assertEquals(5, testEvent.getCost());
  }

  @Test
  public void getCost_costIncreasesWithPeople_10() {
    Event testEvent = new Event(true,false,5,"none");
    assertEquals(10, testEvent.getCost());
  }

  @Test
  public void getCost_costIncreasesWithDrinks_20() {
    Event testEvent = new Event(true,true,5,"none");
    assertEquals(20, testEvent.getCost());
  }

  @Test
  public void getCost_costIncreasesWithBand_60() {
    Event testEvent = new Event(true,true,5,"pros");
    assertEquals(60, testEvent.getCost());
  }
}
