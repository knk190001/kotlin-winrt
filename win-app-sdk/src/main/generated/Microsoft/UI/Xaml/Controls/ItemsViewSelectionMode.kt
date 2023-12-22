package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(ItemsViewSelectionMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.ItemsViewSelectionMode;i4)")
@WinRTByReference(brClass = ItemsViewSelectionMode.ByReference::class)
public enum class ItemsViewSelectionMode(
  public val value: Int
) : NativeMapped {
  None(0),
  Single(1),
  Multiple(2),
  Extended(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ItemsViewSelectionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Single
      2 -> Multiple
      3 -> Extended
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ItemsViewSelectionMode> {
    public fun setValue(newValue: ItemsViewSelectionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ItemsViewSelectionMode =
        ItemsViewSelectionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ItemsViewSelectionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ItemsViewSelectionMode =
        ItemsViewSelectionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ItemsViewSelectionMode): Int = obj.value
  }
}
