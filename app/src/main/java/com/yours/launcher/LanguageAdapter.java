package com.yours.launcher;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.ViewHolder> {

    private List<LanguageItem> languages;
    private LanguageSelectionListener listener;
    private int selectedPosition = -1;

    public interface LanguageSelectionListener {
        void onLanguageSelected(LanguageItem language);
    }

    public LanguageAdapter(List<LanguageItem> languages, LanguageSelectionListener listener) {
        this.languages = languages;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_language, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        LanguageItem language = languages.get(position);
        holder.langName.setText(language.getDisplayName() + " (" + language.getLanguageTag() + ")");
        holder.radioButton.setChecked(position == selectedPosition);

        holder.itemView.setOnClickListener(v -> {
            selectedPosition = position;
            notifyDataSetChanged();
            listener.onLanguageSelected(language);
        });
    }

    @Override
    public int getItemCount() {
        return languages.size();
    }

    public LanguageItem getSelectedLanguage() {
        if (selectedPosition >= 0 && selectedPosition < languages.size()) {
            return languages.get(selectedPosition);
        }
        return null;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView langName;
        RadioButton radioButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            langName = itemView.findViewById(R.id.lang_name);
            radioButton = itemView.findViewById(R.id.radio_button);
        }
    }
}
