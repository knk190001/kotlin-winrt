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

@ABIMarker(ListPickerFlyoutSelectionMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.ListPickerFlyoutSelectionMode;i4)")
@WinRTByReference(brClass = ListPickerFlyoutSelectionMode.ByReference::class)
public enum class ListPickerFlyoutSelectionMode(
  public val value: Int
) : NativeMapped {
  Single(0),
  Multiple(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ListPickerFlyoutSelectionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Single
      1 -> Multiple
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ListPickerFlyoutSelectionMode> {
    public fun setValue(newValue: ListPickerFlyoutSelectionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ListPickerFlyoutSelectionMode =
        ListPickerFlyoutSelectionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ListPickerFlyoutSelectionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ListPickerFlyoutSelectionMode =
        ListPickerFlyoutSelectionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ListPickerFlyoutSelectionMode): Int = obj.value
  }
}
