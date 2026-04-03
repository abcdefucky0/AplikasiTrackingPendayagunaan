    package com.yourname.aplikasitrackingpendayagunaan.adapter

    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.ImageView
    import android.widget.TextView
    import androidx.recyclerview.widget.RecyclerView
    import com.yourname.aplikasitrackingpendayagunaan.R
    import com.yourname.aplikasitrackingpendayagunaan.model.CampaignModel

    class CampaignAdapter(private val list: List<CampaignModel>) :
        RecyclerView.Adapter<CampaignAdapter.ViewHolder>() {

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val image: ImageView = itemView.findViewById(R.id.imageView8)
            val title: TextView = itemView.findViewById(R.id.textView8)
            val organizer: TextView = itemView.findViewById(R.id.textView9)
            val collected: TextView = itemView.findViewById(R.id.textView11)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.campaign_item, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = list[position]

            holder.title.text = item.title
            holder.organizer.text = item.description
            holder.collected.text = "Terkumpul Rp ${item.donasiterkumpul ?: 0}"

            // ganti yang di-comment tadi dengan ini
            if (item.imageRes != 0) {
                holder.image.setImageResource(item.imageRes)
            }
        }
        override fun getItemCount() = list.size
    }