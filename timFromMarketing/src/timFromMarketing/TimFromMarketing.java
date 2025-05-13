package timFromMarketing;

public class TimFromMarketing {
	public String print(Integer id, String name, String department) {
        /*
        Also can use String.format() to do
         */
		String badge = new String();
        // ID part
        if (id != null){
            badge = "[" + id + "]" + " - ";
        }
        // Name part
        badge = badge + name + " - ";
        // Department part
        if (department == null){
            badge = badge + "OWNER";
        }else{
            badge = badge + department.toUpperCase();
        }
        return badge;
    }
}
