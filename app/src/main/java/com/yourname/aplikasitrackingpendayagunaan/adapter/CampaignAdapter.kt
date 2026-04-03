    package com.yourname.aplikasitrackingpendayagunaan.adapter
    //package declaration

    import android.view.LayoutInflater // penggembung , mengubah xml jadi view nyata
    import android.view.View //tipe dasar semua elemen ui android
    import android.view.ViewGroup // yg bisa menampung semua parent ui lain
    import android.widget.ImageView
    import android.widget.TextView
    import androidx.recyclerview.widget.RecyclerView  //komponen list/daftar , yg dirender ketika item terlihat di layar
    import com.yourname.aplikasitrackingpendayagunaan.R //menjadi penghubung ke semua resource (layout, id  , drawable)
    import com.yourname.aplikasitrackingpendayagunaan.model.CampaignModel //mengimport blueprint dari file ini

    class CampaignAdapter(private val list: List<CampaignModel>) :
        RecyclerView.Adapter<CampaignAdapter.ViewHolder>() {
     // class : mendefinisikan sebuah  blueprint objek baru bernama Campaign Adapter
    //deklarasi class dgn nama campaignAdapter , dan mewarisi kemampuan dari RecyclerView.Adapter
    // private val list : ini merupakan sebuah private constructor , data disimpan , tidak bisa diubah di luar class  ,
    //setiap kali buat objek CampaignAdapter  maka isinya wajib  satu argumen berupa list
    // List<CampaignModel> isi datanya berupa object campaign model
    // RecyclerView.Adapter inheritance dari campaign adapter

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val image: ImageView = itemView.findViewById(R.id.imageView8)
            val title: TextView = itemView.findViewById(R.id.textView8)
            val organizer: TextView = itemView.findViewById(R.id.textView9)
            val collected: TextView = itemView.findViewById(R.id.textView11)
        }
        // view holder : menyimpan referensi view yg banyak itu sekali saja

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.campaign_item, parent, false)
            return ViewHolder(view)
        }
        //dipanggil saat pertama kali load atau scroll area baru
        //alur   dari xml campaign_item.xml > LayoutInflater.inflate() > View > ViewHolder
        //LayoutInflater.from(parent.context) : mengambil context dari parent
        //.inflate (R.layout.campaign_item, parent, false)  : tiupkan/ubahkan xml jadi view nyata
        // false : jangan langsung attach ke parent (RecyclerView yg urus ini)
        // return ViewHolder(view) bungkus view tadi dalam ViewHolder

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
        //dipanggil saat tiap kali item ditampilkan ke layar
        // list[position] ambil data ke-N dari list
        // holder.tittle.text = item.tittle isi textview dengan data
        // "Terkumpul Rp ${item.donasiterkumpul ?: 0}" : String Template
        //  ${} sisipkan variable ke dalam string
        // ?: 0 = elvis operator kalau donasi terkumpul null , pakai 0
        // if (item.imageRes != 0 ) : cek apakah ada gambar



        override fun getItemCount() = list.size
        //memberitahu RecyclerView  bahwa "ada berapa item yg ditampilkan ?"
        // = list.size  : one liner , sama dengan {return list.size}
    }