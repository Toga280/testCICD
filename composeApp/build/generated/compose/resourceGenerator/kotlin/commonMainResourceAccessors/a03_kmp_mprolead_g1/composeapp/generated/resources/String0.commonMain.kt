@file:OptIn(InternalResourceApi::class)

package a03_kmp_mprolead_g1.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.LanguageQualifier
import org.jetbrains.compose.resources.ResourceContentHash
import org.jetbrains.compose.resources.ResourceItem
import org.jetbrains.compose.resources.StringResource

private const val MD: String =
    "composeResources/a03_kmp_mprolead_g1.composeapp.generated.resources/"

@delegate:ResourceContentHash(1_582_711_621)
internal val Res.string.bt_load: StringResource by lazy {
      StringResource("string:bt_load", "bt_load", setOf(
        ResourceItem(setOf(LanguageQualifier("fr"), ), "${MD}values-fr/strings.commonMain.cvr", 10, 31),
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 10, 23),
      ))
    }

@delegate:ResourceContentHash(117_804_475)
internal val Res.string.my_label: StringResource by lazy {
      StringResource("string:my_label", "my_label", setOf(
        ResourceItem(setOf(LanguageQualifier("fr"), ), "${MD}values-fr/strings.commonMain.cvr", 42, 28),
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 34, 24),
      ))
    }

@InternalResourceApi
internal fun _collectCommonMainString0Resources(map: MutableMap<String, StringResource>) {
  map.put("bt_load", Res.string.bt_load)
  map.put("my_label", Res.string.my_label)
}
