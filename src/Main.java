public class Main {

    public static void main(String[] args) {
        LightSequence gradShow = new LightSequence("0101 0101 0101");

        gradShow.display();

        gradShow.changeSequence("0011 0011 0011");

        gradShow.insertSegment( "1111 1111", 4);

        //testing removing code segment
        gradShow.alterSeg("11000011", "11");

        //testing distance code segment
        System.out.println(gradShow.getDistance(3.0, 4.0));
    }
}
