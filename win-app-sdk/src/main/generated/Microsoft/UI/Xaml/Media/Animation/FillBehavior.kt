package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(FillBehavior.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Media.Animation.FillBehavior;i4)")
@WinRTByReference(brClass = FillBehavior.ByReference::class)
public enum class FillBehavior(
  public val value: Int
) : NativeMapped {
  HoldEnd(0),
  Stop(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FillBehavior {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> HoldEnd
      1 -> Stop
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FillBehavior> {
    public fun setValue(newValue: FillBehavior): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FillBehavior =
        FillBehavior.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FillBehavior, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FillBehavior =
        FillBehavior.values()[0].fromNative(value, null)

    public override fun toNative(obj: FillBehavior): Int = obj.value
  }
}
