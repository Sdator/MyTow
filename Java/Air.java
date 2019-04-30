import java.awt.Image;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;


/**
 * a
 */
public class Air {

    public static void main(String[] args) {
        Air aa = new Air();
        // InputStream localInputStream =
        // a.getClass().getResourceAsStream("skill.name");
        // Q = new byte[localInputStream.available()];
        // System.out.println(a.getClass());

        // Image[][] as = a(new
        // DataInputStream(aa.getClass().getResourceAsStream("/boy.mod")));

        File file = new File("boy.mod");

        DataInputStream in = new DataInputStream(new FileInputStream(file));
        // Image[][] as = a(in);
        System.out.println(in);

    }

    public static Image[][] a(DataInputStream paramDataInputStream) {
        try {
            int i = paramDataInputStream.readShort();
            Image[][] arrayOfImage = new Image[i][];
            for (int j = 0; j < i; j = (short) (j + 1)) {
                int k = paramDataInputStream.readShort();
                arrayOfImage[j] = new Image[k];
                int m = i * k;
                for (int n = 0; n < k; n = (short) (n + 1)) {
                    int i1 = j * k + n;
                    // y.W = i1 * 100 / m;
                    paramDataInputStream.readShort();
                    paramDataInputStream.readByte();
                    int i2 = paramDataInputStream.readShort();
                    byte[] arrayOfByte1 = new byte[i2];
                    paramDataInputStream.readFully(arrayOfByte1);
                    int i3 = paramDataInputStream.readShort();
                    byte[] arrayOfByte2 = new byte[i3];
                    paramDataInputStream.readFully(arrayOfByte2);
                    int i4 = paramDataInputStream.readShort();
                    byte[] arrayOfByte3 = new byte[i4];
                    paramDataInputStream.readFully(arrayOfByte3);
                    byte[] arrayOfByte4 = new byte[arrayOfByte1.length + arrayOfByte2.length + arrayOfByte3.length];
                    System.arraycopy(arrayOfByte2, 0, arrayOfByte4, 0, arrayOfByte2.length);
                    System.arraycopy(arrayOfByte1, 0, arrayOfByte4, arrayOfByte2.length, arrayOfByte1.length);
                    System.arraycopy(arrayOfByte3, 0, arrayOfByte4, arrayOfByte2.length + arrayOfByte1.length,
                            arrayOfByte3.length);
                    System.out.println(arrayOfByte4);

                    // arrayOfImage[j][n] = Image.createImage(arrayOfByte4, 0, arrayOfByte4.length);
                }
            }
            return arrayOfImage;
        } catch (Exception localException) {
            localException.printStackTrace();
        }
        return (Image[][]) null;
    }
}