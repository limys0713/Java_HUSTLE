package internationalCallingConnoisseur;
//Map is an interface (to use method and declaration)
import java.util.Map;
//HashMap is a class(to create a new object)
import java.util.HashMap;

public class DialingCodes {
 
	private Map<Integer, String> dialingCodes = new HashMap<>();
 
	public Map<Integer, String> getCodes(){
     return dialingCodes;
	}

	public void setDialingCode(Integer code, String country){
		this.dialingCodes.put(code, country);
	}

	public String getCountry(Integer code) {
		return this.dialingCodes.get(code);
	}

	public void addNewDialingCode(Integer code, String country) {
		if(!this.dialingCodes.containsKey(code) &&  !this.dialingCodes.containsValue(country)){
			setDialingCode(code, country);
		}
	}

	public Integer findDialingCode(String country) {
		if(this.dialingCodes.containsValue(country)){
			// Loop through entries
			// Map.Entry is a type that used for an entry in a Map
			for(Map.Entry<Integer, String> entry : this.dialingCodes.entrySet()){
				if(entry.getValue() == country){
					return entry.getKey();
				}
			}
		}
		return null;
	}

	public void updateCountryDialingCode(Integer code, String country) {
		Integer codeRemove = 0;
		if(this.dialingCodes.containsValue(country)){
			for(Map.Entry<Integer, String> entry : this.dialingCodes.entrySet()){
				if(entry.getValue() == country){
					codeRemove = entry.getKey();
					break;
				}
			}   
			// Remove it and set a new one
			this.dialingCodes.remove(codeRemove);
			setDialingCode(code, country);
		}
	}
}
