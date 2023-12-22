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

@ABIMarker(TeachingTipCloseReason.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.TeachingTipCloseReason;i4)")
@WinRTByReference(brClass = TeachingTipCloseReason.ByReference::class)
public enum class TeachingTipCloseReason(
  public val value: Int
) : NativeMapped {
  CloseButton(0),
  LightDismiss(1),
  Programmatic(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TeachingTipCloseReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> CloseButton
      1 -> LightDismiss
      2 -> Programmatic
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TeachingTipCloseReason> {
    public fun setValue(newValue: TeachingTipCloseReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TeachingTipCloseReason =
        TeachingTipCloseReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TeachingTipCloseReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TeachingTipCloseReason =
        TeachingTipCloseReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: TeachingTipCloseReason): Int = obj.value
  }
}
