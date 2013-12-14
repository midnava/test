package com.ubs.fixserver.tool.util;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author : Novobranchenko Oleksandr
 */
public class XmlUtil {

    public static String readXMLFromResource(String name) throws IOException {

        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];//get method from stackTrace
        String pathToResource = stackTraceElement.getClassName();
        pathToResource = pathToResource.substring(0, pathToResource.lastIndexOf("."));   //get package without ClassName
        pathToResource = pathToResource.replace(".", "/");
        pathToResource = String.format("%s/%s", pathToResource, name);

        InputStream in = Thread.currentThread().getContextClassLoader().getSystemResourceAsStream(pathToResource);
        if (in == null) {
            throw new IllegalArgumentException(String.format("Failed to find %S file , path: %s", name, pathToResource));
        }

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int nRead;
        byte[] data = new byte[16384];

        while ((nRead = in.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        buffer.flush();
        in.close();

        return new String(buffer.toByteArray(), "UTF8");
    }
}
