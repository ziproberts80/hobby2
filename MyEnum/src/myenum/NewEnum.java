
package myenum;

public enum NewEnum {
    
    
  INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE,
  COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

  public String toString() {
    switch(this) {
      case INDIAN_ROSEWOOD:    return "Yellow Indian Rosewood";
      case BRAZILIAN_ROSEWOOD: return "Green Brazilian Rosewood";
      case MAHOGANY:           return "Black Mahogany";
      case MAPLE:              return "Brown Maple";
      case COCOBOLO:           return "Coca Cabana Cocobolo";
      case CEDAR:              return "Orange Cedar";
      case ADIRONDACK:         return "Pink Adirondack";
      case ALDER:              return "Poka Dot Alder";
      case SITKA:              return "White Sitka";
      default:  return "unspecified";
    }
  }
}


