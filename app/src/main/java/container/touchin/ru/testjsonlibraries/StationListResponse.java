/*
 * This code is autogenerated by Touch Instinct tools
 */
package container.touchin.ru.testjsonlibraries;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.List;

/**
 * Список АЗС
 */
@JsonObject(serializeNullObjects = false)
public class StationListResponse {

    /**
     * Список АЗС
     */
    @NonNull
    @JsonField(name = "stations")
    private List<StationInfo> stations;

    public StationListResponse() {
        super();
    }

    //TODO: if TItems instance of arrayList then new ArrayList
    public StationListResponse(
            @NonNull final List<StationInfo> stations
    ) {
        super();
        this.stations = stations;
    }


    /**
     * Список АЗС
     */
    @NonNull
    public List<StationInfo> getStations() {
        return Collections.unmodifiableList(this.stations);
    }

    /**
     * Список АЗС
     */
    public void setStations(@NonNull final List<StationInfo> stations) {
        this.stations = stations;
    }

    protected void copyTo(@NonNull final StationListResponse destination) {
        destination.stations = stations;
    }

    @NonNull
    public StationListResponse copy() {
        final StationListResponse result = new StationListResponse();
        this.copyTo(result);
        return result;
    }

    public int hashCode() {
        return ObjectsCompat.hash(stations);
    }

    public boolean equals(@Nullable final Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        final StationListResponse that = (StationListResponse) object;
        return ObjectsCompat.equals(this.stations, that.stations);
    }

    private void writeObject(@NonNull final ObjectOutputStream outputStream) throws IOException {
        outputStream.writeObject(this.stations);
    }

    @SuppressWarnings("unchecked")
    private void readObject(@NonNull final ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        this.stations = (List<StationInfo>) inputStream.readObject();
    }

}
