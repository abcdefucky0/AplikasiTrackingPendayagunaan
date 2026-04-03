package com.yourname.aplikasitrackingpendayagunaan.model

data class CampaignModel(
    val id: Int,
    val slug: String,
    val title: String,
    val description: String,
    val donasiterkumpul: Int?,
    val start: String?,
    val end: String?,
    val target: Int?,
    val status: String?,
    val imageRes: Int = 0,
    val image: String?,
    val category_id: Int?,
    val user_id: Int?,
    val create_at: String?,
    val update_at: String?,
    val agency_id: Int?,
    val delete_at: String?
    )