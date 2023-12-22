package Windows.UI.Text

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

@ABIMarker(CaretType.ABI::class)
@Signature("enum(Windows.UI.Text.CaretType;i4)")
@WinRTByReference(brClass = CaretType.ByReference::class)
public enum class CaretType(
  public val value: Int
) : NativeMapped {
  Normal(0),
  Null(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): CaretType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Normal
      1 -> Null
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CaretType> {
    public fun setValue(newValue: CaretType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CaretType =
        CaretType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CaretType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CaretType =
        CaretType.values()[0].fromNative(value, null)

    public override fun toNative(obj: CaretType): Int = obj.value
  }
}
