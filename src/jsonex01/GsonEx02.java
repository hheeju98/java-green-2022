package jsonex01;

class SMSD to{
    private String groupld;
    private int successCount;
    private int errorCount;

}

import javax.sql.rowset.spi.SyncResolver;

public class GsonEx02 {
    public static void main(String[] args) {
        // {"group_id":"R2GdEONszq64lNB9","success_count":1,"error_count":0}
        String smsReturn = "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";
        System.out.println(smsReturn);
    }

}
