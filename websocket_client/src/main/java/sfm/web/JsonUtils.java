package sfm.web;

import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TSimpleJSONProtocol;
import org.apache.thrift.transport.TTransportException;

public class JsonUtils {
    private static final TSerializer serializer;

    static {
        try {
            serializer = new TSerializer(new TSimpleJSONProtocol.Factory());
        } catch (TTransportException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toString(TBase object) {
        try {
            return serializer.toString(object);
        } catch (TException e) {
            e.printStackTrace();
            return "{}";
        }
    }
}
