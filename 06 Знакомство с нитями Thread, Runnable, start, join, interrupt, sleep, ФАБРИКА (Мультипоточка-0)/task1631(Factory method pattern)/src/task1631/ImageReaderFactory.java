package task1631;

import task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes types) throws IllegalArgumentException {
        if (types == ImageTypes.JPG) return new JpgReader();
        else if (types == ImageTypes.BMP) return new BmpReader();
        else if (types == ImageTypes.PNG) return new PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
