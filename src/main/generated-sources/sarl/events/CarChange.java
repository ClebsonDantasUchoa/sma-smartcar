package events;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;

@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class CarChange extends Event {
  public CarChange() {
  }
  
  @SyntheticMember
  private static final long serialVersionUID = 588370691L;
}