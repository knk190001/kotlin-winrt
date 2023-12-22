package Windows.Foundation.Metadata

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

@ABIMarker(MarshalingType.ABI::class)
@Signature("enum(Windows.Foundation.Metadata.MarshalingType;i4)")
@WinRTByReference(brClass = MarshalingType.ByReference::class)
public enum class MarshalingType(
  public val value: Int
) : NativeMapped {
  None(1),
  Agile(2),
  Standard(3),
  InvalidMarshaling(0),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MarshalingType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> None
      2 -> Agile
      3 -> Standard
      0 -> InvalidMarshaling
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MarshalingType> {
    public fun setValue(newValue: MarshalingType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MarshalingType =
        MarshalingType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MarshalingType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MarshalingType =
        MarshalingType.values()[0].fromNative(value, null)

    public override fun toNative(obj: MarshalingType): Int = obj.value
  }
}
