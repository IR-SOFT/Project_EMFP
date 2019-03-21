package view;

import javax.faces.event.ActionEvent;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class FileManagement {
    public FileManagement() {
    }

    private UploadedFile file;

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public UploadedFile getFile() {
        return file;
    }

    public void FileUpload(ActionEvent actionEvent) {
        // Add event code here...
        UploadedFile myfile = this.getFile();
        System.out.println("oooooooooooooooo");
        //                String path = null;
        //                if (myfile == null) {
        //
        //                } else {
        //                    // All uploaded files will be stored in below path
        //                    path = "C://Users//Oracle//Desktop//ghg//" + myfile.getFilename();
        //                    InputStream inputStream = null;
        //                    try {
        //                        FileOutputStream out = new FileOutputStream(path);
        //                        inputStream = myfile.getInputStream();
        //                        byte[] buffer = new byte[8192];
        //                        int bytesRead = 0;
        //                        while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
        //                            out.write(buffer, 0, bytesRead);
        //                        }
        //                        out.flush();
        //                        out.close();
        //                    } catch (Exception ex) {
        //                        // handle exception
        //                        ex.printStackTrace();
        //                    } finally {
        //                        try {
        //                            inputStream.close();
        //                        } catch (IOException e) {
        //                        }
        //                    }
    }
}
