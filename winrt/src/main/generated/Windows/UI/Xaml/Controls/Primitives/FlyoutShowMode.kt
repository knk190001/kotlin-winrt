package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(FlyoutShowMode.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Primitives.FlyoutShowMode;i4)")
@WinRTByReference(brClass = FlyoutShowMode.ByReference::class)
public enum class FlyoutShowMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Standard(1),
  Transient(2),
  TransientWithDismissOnPointerMoveAway(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FlyoutShowMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Standard
      2 -> Transient
      3 -> TransientWithDismissOnPointerMoveAway
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FlyoutShowMode> {
    public fun setValue(newValue: FlyoutShowMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FlyoutShowMode =
        FlyoutShowMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FlyoutShowMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FlyoutShowMode =
        FlyoutShowMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: FlyoutShowMode): Int = obj.value
  }
}
