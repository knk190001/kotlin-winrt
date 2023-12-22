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

@ABIMarker(InfoBarCloseReason.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.InfoBarCloseReason;i4)")
@WinRTByReference(brClass = InfoBarCloseReason.ByReference::class)
public enum class InfoBarCloseReason(
  public val value: Int
) : NativeMapped {
  CloseButton(0),
  Programmatic(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InfoBarCloseReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> CloseButton
      1 -> Programmatic
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InfoBarCloseReason> {
    public fun setValue(newValue: InfoBarCloseReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InfoBarCloseReason =
        InfoBarCloseReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InfoBarCloseReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InfoBarCloseReason =
        InfoBarCloseReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: InfoBarCloseReason): Int = obj.value
  }
}
