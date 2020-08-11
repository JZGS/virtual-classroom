package jc.sw.dev.virtualclassroom.filestorage;

import java.io.InputStream;
import java.io.OutputStream;

public interface FileStorageService {
    void downloadFile(String file, OutputStream stream);
    void downloadFile(String file, OutputStream stream, Long offsetBytes, Long bytesLength);
    void uploadFile(String file, InputStream stream, Long bytesLength);
}
