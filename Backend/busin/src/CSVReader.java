import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {



    public static ArrayList<Bus> getvalue(String filesrc) throws IOException {

        ArrayList<Bus> bus=new ArrayList<>();
        FileReader f = new FileReader(filesrc);
        BufferedReader br = new BufferedReader(f);
        String s;
        while ((s = br.readLine()) != null) {
            try {
                String[] values = s.split(",");
                if (values.length != 6) {
                    throw new Exception("Invalid cvs file");
                }
                String busName = values[0].trim();
                String busType = values[1].trim();
                String busSource = values[2].trim();
                String busDestination = values[3].trim();
                String busDeparture = values[4].trim();
                String seatCount = values[5].trim();
                if (busName.isEmpty()) {
                    throw new Exception("Employee id not found");
                }
                if (busType.isEmpty()) {
                    throw new Exception("Employee name not found");
                }
                if (busSource.isEmpty()) {
                    throw new Exception("Employee designation not found");
                }
                if (busDestination.isEmpty()) {
                    throw new Exception("Employee salary not found");
                }
                if (busDeparture.isEmpty()) {
                    throw new Exception("Employee joining date not found");
                }
                if (seatCount.isEmpty()) {
                    throw new Exception("Employee joining date not found");
                }
                bus.add(new Bus(values[0], values[1], values[2], values[3], values[4], values[5]));
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.exit(0);

        }
        }
        System.out.println("FILE READ SUCCESSFULLY");
        //for(Bus hi:bus) System.out.println(hi.getBusDepature()+hi.getBusDestination()+hi.getBusSource()+hi.getBusType()+hi.getBusArrival()+hi.getBusName());
        return bus;
    }


}
