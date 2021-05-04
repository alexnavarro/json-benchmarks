package com.dashlane.benchmarks.json

import android.os.Parcelable
import com.dashlane.benchmarks.json.test1.Test1
import com.dashlane.benchmarks.json.test2.Test2
import com.dashlane.benchmarks.json.test3.Test3
import com.dashlane.benchmarks.json.test4.Test4
import com.dashlane.benchmarks.json.test5.Test5
import kotlinx.android.parcel.Parcelize

/**
 * Arguments for the [TestActivity], to be mapped by the [TestActivity.EXTRA_TESTS] in order to
 * specify which tests to run.
 */
@Parcelize
data class TestIntent(
        val test1Small: Boolean,
        val test1Large: Boolean,
        val test2: Boolean,
        val test3: Boolean,
        val test4: Boolean,
        val test5: Boolean
): Parcelable {

    fun toTestPlan() = sequence {
        if (test1Small) yield(Test1.Small)
        if (test1Large) yield(Test1.Large)
        if (test2) yield(Test2)
        if (test3) yield(Test3)
        if (test4) yield(Test4)
        if (test5) yield(Test5)
    }
}