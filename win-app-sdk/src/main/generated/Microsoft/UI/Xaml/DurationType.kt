package Microsoft.UI.Xaml

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

@ABIMarker(DurationType.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.DurationType;i4)")
@WinRTByReference(brClass = DurationType.ByReference::class)
public enum class DurationType(
  public val value: Int
) : NativeMapped {
  Automatic(0),
  TimeSpan(1),
  Forever(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DurationType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Automatic
      1 -> TimeSpan
      2 -> Forever
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DurationType> {
    public fun setValue(newValue: DurationType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DurationType =
        DurationType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DurationType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DurationType =
        DurationType.values()[0].fromNative(value, null)

    public override fun toNative(obj: DurationType): Int = obj.value
  }
}
