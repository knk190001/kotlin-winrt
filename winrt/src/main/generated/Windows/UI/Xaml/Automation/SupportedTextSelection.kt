package Windows.UI.Xaml.Automation

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

@ABIMarker(SupportedTextSelection.ABI::class)
@Signature("enum(Windows.UI.Xaml.Automation.SupportedTextSelection;i4)")
@WinRTByReference(brClass = SupportedTextSelection.ByReference::class)
public enum class SupportedTextSelection(
  public val value: Int
) : NativeMapped {
  None(0),
  Single(1),
  Multiple(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SupportedTextSelection {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Single
      2 -> Multiple
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SupportedTextSelection> {
    public fun setValue(newValue: SupportedTextSelection): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SupportedTextSelection =
        SupportedTextSelection.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SupportedTextSelection, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SupportedTextSelection =
        SupportedTextSelection.values()[0].fromNative(value, null)

    public override fun toNative(obj: SupportedTextSelection): Int = obj.value
  }
}
