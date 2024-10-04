package Java_Equals_and_Hashcode_Generics_Enum;

import java.util.ArrayList;
import java.util.List;

public class Ex10 {

    public static void main(String[] args) {

        List<DataPoint> dataPoints = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            dataPoints.add(new DataPoint(i, "Value" + i));
        }

        LargeDataset dataset = new LargeDataset(dataPoints);

        System.out.println(dataset.toString());

    }

}

class DataPoint {
    private int id;
    private String value;

    public DataPoint(int id, String value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "DataPoint{id=" + id + ", value='" + value + "'}";
    }
}

class LargeDataset {
    private List<DataPoint> dataPoints;

    public LargeDataset(List<DataPoint> dataPoints) {
        this.dataPoints = dataPoints;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LargeDataset Summary: \n");
        sb.append("Total DataPoints: ").append(dataPoints.size()).append("\n");
        sb.append("First few data points: \n");

        int limit = Math.min(5, dataPoints.size());
        for (int i = 0; i < limit; i++) {
            sb.append(dataPoints.get(i).toString()).append("\n");
        }

        if (dataPoints.size() > 5) {
            sb.append("...and ").append(dataPoints.size() - 5).append(" more data points.");
        }

        return sb.toString();
    }
}
