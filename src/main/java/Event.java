class Event {
  private boolean mChips;

  public Event(boolean chips) {
    mChips = chips;
  }

  public int getCost() {
    int total = 0;

    if(mChips){
      total += 5;
    }

    return total;
  }
}
