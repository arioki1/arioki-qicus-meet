package com.qiscus.meetmodule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.qiscus.meet.QiscusMeet;
import javax.annotation.Nonnull;

public class QiscusMeetModule extends ReactContextBaseJavaModule{
    public QiscusMeetModule(@Nonnull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void launch(String room){
        ReactApplicationContext context = getReactApplicationContext();
        QiscusMeet.launch()
                .setRoomId(room)
                .build(context);
    }

    @Nonnull
    @Override
    public String getName() {
        return "QiscusMeet";
    }
}
