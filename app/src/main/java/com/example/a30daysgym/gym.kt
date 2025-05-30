package com.example.a30daysgym

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class gym(
    @StringRes val head:Int,
    @StringRes val day:Int,
    @DrawableRes val imageRes:Int,
    @StringRes val desc:Int
)

val gymList = listOf(
    gym(R.string.day_1head, R.string.day_1, R.drawable.img1, R.string.day_1desc),
    gym(R.string.day_2head, R.string.day_2, R.drawable.img13, R.string.day_2desc),
    gym(R.string.day_3head, R.string.day_3, R.drawable.img14, R.string.day_3desc),
    gym(R.string.day_4head, R.string.day_4, R.drawable.img15, R.string.day_4desc),
    gym(R.string.day_5head, R.string.day_5, R.drawable.img16, R.string.day_5desc),
    gym(R.string.day_6head, R.string.day_6, R.drawable.img17, R.string.day_6desc),
    gym(R.string.day_7head, R.string.day_7, R.drawable.img35, R.string.day_7desc),
    gym(R.string.day_8head, R.string.day_8, R.drawable.img19, R.string.day_8desc),
    gym(R.string.day_9head, R.string.day_9, R.drawable.img20, R.string.day_9desc),
    gym(R.string.day_10head, R.string.day_10, R.drawable.img21, R.string.day_10desc),
    gym(R.string.day_11head, R.string.day_11, R.drawable.img22, R.string.day_11desc),
    gym(R.string.day_12head, R.string.day_12, R.drawable.img23, R.string.day_12desc),
    gym(R.string.day_13head, R.string.day_13, R.drawable.img21, R.string.day_13desc),
    gym(R.string.day_14head, R.string.day_14, R.drawable.img24, R.string.day_14desc),
    gym(R.string.day_15head, R.string.day_15, R.drawable.img26, R.string.day_15desc),
    gym(R.string.day_16head, R.string.day_16, R.drawable.img21, R.string.day_16desc),
    gym(R.string.day_17head, R.string.day_17, R.drawable.img1, R.string.day_17desc),
    gym(R.string.day_18head, R.string.day_18, R.drawable.img24, R.string.day_18desc),
    gym(R.string.day_19head, R.string.day_19, R.drawable.img27, R.string.day_19desc),
    gym(R.string.day_20head, R.string.day_20, R.drawable.img28, R.string.day_20desc),
    gym(R.string.day_21head, R.string.day_21, R.drawable.img29, R.string.day_21desc),
    gym(R.string.day_22head, R.string.day_22, R.drawable.img30, R.string.day_22desc),
    gym(R.string.day_23head, R.string.day_23, R.drawable.img31, R.string.day_23desc),
    gym(R.string.day_24head, R.string.day_24, R.drawable.img32, R.string.day_24desc),
    gym(R.string.day_25head, R.string.day_25, R.drawable.img33, R.string.day_25desc),
    gym(R.string.day_26head, R.string.day_26, R.drawable.img26, R.string.day_26desc),
    gym(R.string.day_27head, R.string.day_27, R.drawable.img34, R.string.day_27desc),
    gym(R.string.day_28head, R.string.day_28, R.drawable.img18, R.string.day_28desc),
    gym(R.string.day_29head, R.string.day_29, R.drawable.img36, R.string.day_29desc),
    gym(R.string.day_30head, R.string.day_30, R.drawable.img41, R.string.day_30desc)
)

