package com.minageorge.core.utils.rxmap

import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import io.reactivex.Observable
import io.reactivex.functions.Function

class MapClickFunc : Function<GoogleMap, Observable<LatLng>> {

    override fun apply(t: GoogleMap): Observable<LatLng> {
       return Observable.create{subscriber->
           t.setOnMapClickListener {
               subscriber.onNext(it)
           }
       }
    }

}