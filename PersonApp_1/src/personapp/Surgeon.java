
package personapp;


public class Surgeon extends Person {
    
       
      public Surgeon(String salutation, String firstName, String lastName, String occupation) {
         super(salutation,firstName, lastName, occupation);     
      }

    public void setOccupation(String occupation) {

        switch(occupation.toLowerCase()){
           case "general":
              super.occupation = "General Surgeon";
              break;
            case "cardiothoracic":
              super.occupation = "Cardiothoracic Surgeon";
              break;
            case "neurosurgeon":
              super.occupation = "NeuroSurgeon";
              break;
            case "oral and maxillofacial":
              super.occupation = "Oral and maxillofacial Surgeon";
              break;
            case "obstetric and gynecological":
              super.occupation = "Obstetric and gynecological Surgeon";
              break;
            case "otolaryngology":
              super.occupation = "Otolaryngology Surgeon";
              break;
            case "ophthalmic":
              this.occupation = "Ophthalmic Surgeon";
              break;
            case "oculoplastic":
              super.occupation = "Oculoplastic Surgeon";
              break;
            case "pediatric":
              super.occupation = "Pediatric Surgeon";
              break;
            case "plastic":
              super.occupation = "Plastic Surgeon";
              break;
            case "colon and rectal":
              super.occupation = "Colon and Rectal Surgeon";
              break;
            case "orthopedic":
              super.occupation = "Orthopedic Surgeon";
              break;
            case "trauma":
              super.occupation = "Trauma Surgeon";
              break;
            case "urological":
              super.occupation = "Urological Surgeon";
              break;
            case "vascular":
              super.occupation = "Vascular Surgeon";
              break;
            case "bariatric":
              super.occupation = "Bariatric Surgeon";
              break;
            case "podiatric":
              super.occupation = "Podiatric Surgeon";
              break;
            case "hand":
              super.occupation = "Hand Surgeon";
              break;
            case "transplant":
              super.occupation = "Transplant Surgeon";
              break;
            case "endocrine":
              this.occupation = "Endocrine Surgeon";
              break;
            default:
                super.occupation = "Surgeon"; 
        }
    }

        public String[] duties(){
        
     
        String[] surgeonDuities =    { "Consult with Patient",
                                     "Consult with other Doctors",
                                     "Operate on Patient",
                                     "Conduct follow-up after surgery"
                                     };
        return surgeonDuities;
    }

}
