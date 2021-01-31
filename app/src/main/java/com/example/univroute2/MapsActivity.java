package com.example.univroute2;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Casanestebanan = new LatLng(-16.041271, 120.527683);
        mMap.addMarker(new MarkerOptions().position(Casanestebanan).title("Marker in Casanestebanan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Casanestebanan));

        Polyline addPolyline = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(-16.041271, 120.527683),
                        new LatLng(-15.979940, 120.561120))
                .width(10)
                .color(Color.BLUE));

        LatLng Dasul = new LatLng(-15.887710, 119.896600);
        mMap.addMarker(new MarkerOptions().position(Dasul).title("Marker in Dasul"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Dasul));

        Polyline addPolyline = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(-15.887710, 119.896600),
                        new LatLng(-15.979940, 120.561120))
                .width(10)
                .color(Color.RED));

        LatLng Bacag = new LatLng(-15.932470, 120.573080);
        mMap.addMarker(new MarkerOptions().position(Bacag).title("Marker in Bacag"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bacag));

        Polyline addPolyline = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(-15.932470, 120.573080),
                        new LatLng(-15.979940, 120.561120))
                .width(10)
                .color(Color.RED));


    }
}