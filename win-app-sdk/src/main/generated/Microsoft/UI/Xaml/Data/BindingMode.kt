package Microsoft.UI.Xaml.Data

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

@ABIMarker(BindingMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Data.BindingMode;i4)")
@WinRTByReference(brClass = BindingMode.ByReference::class)
public enum class BindingMode(
  public val value: Int
) : NativeMapped {
  OneWay(1),
  OneTime(2),
  TwoWay(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BindingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> OneWay
      2 -> OneTime
      3 -> TwoWay
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BindingMode> {
    public fun setValue(newValue: BindingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BindingMode =
        BindingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BindingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BindingMode =
        BindingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: BindingMode): Int = obj.value
  }
}
