class Event {
  private boolean mChips;
  private int mPeople;

  public Event(boolean chips, int people) {
    mChips = chips;
    mPeople = people;
  }

  public int getCost() {
    int total = 0;

    if(mChips){
      total += 5;
    }

    total += mPeople;
    return total;
  }
}
