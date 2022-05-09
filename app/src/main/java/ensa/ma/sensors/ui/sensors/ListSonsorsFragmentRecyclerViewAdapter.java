package ensa.ma.sensors.ui.sensors;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ensa.ma.sensors.R;
import ensa.ma.sensors.beans.SensorItem;
import ensa.ma.sensors.ui.sensors.ListSonsorsFragment.OnListFragmentInteractionListener;

import java.util.List;

public class ListSonsorsFragmentRecyclerViewAdapter extends RecyclerView.Adapter<ListSonsorsFragmentRecyclerViewAdapter.ViewHolder> {

    private final List<SensorItem> mValues;
    private final OnListFragmentInteractionListener mListener;

    public ListSonsorsFragmentRecyclerViewAdapter(List<SensorItem> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_listsonsors, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(mValues.get(position).id);
        holder.mNameView.setText(mValues.get(position).name);
        holder.mVersionView.setText(mValues.get(position).version);
        holder.mVendorView.setText(mValues.get(position).vendor);
        holder.mTypeView.setText(mValues.get(position).type);
        holder.mMaxDataView.setText(mValues.get(position).maxData);
        holder.mMaxRangeView.setText(mValues.get(position).maxRange);
        holder.mResolutionView.setText(mValues.get(position).resolution);
        holder.mEnergieView.setText(mValues.get(position).energie);
        holder.mIntTypeView.setText(mValues.get(position).intType);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mNameView;
        public final TextView mTypeView;
        public final TextView mVendorView;
        public final TextView mVersionView;
        public final TextView mResolutionView;
        public final TextView mEnergieView;
        public final TextView mMaxRangeView;
        public final TextView mMaxDataView;
        public final TextView mIntTypeView;
        public SensorItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.item_number);
            mNameView = (TextView) view.findViewById(R.id.name);
            mTypeView = (TextView) view.findViewById(R.id.type);
            mVendorView = (TextView) view.findViewById(R.id.vendor);
            mVersionView = (TextView) view.findViewById(R.id.version);
            mResolutionView = (TextView) view.findViewById(R.id.resolution);
            mEnergieView = view.findViewById(R.id.energie);
            mMaxRangeView = view.findViewById(R.id.maxrange);
            mMaxDataView = view.findViewById(R.id.maxdata);
            mIntTypeView = view.findViewById(R.id.inttype);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mNameView.getText() + "'";
        }
    }
}
