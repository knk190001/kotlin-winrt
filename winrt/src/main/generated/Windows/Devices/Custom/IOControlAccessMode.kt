package Windows.Devices.Custom

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

@ABIMarker(IOControlAccessMode.ABI::class)
@Signature("enum(Windows.Devices.Custom.IOControlAccessMode;i4)")
@WinRTByReference(brClass = IOControlAccessMode.ByReference::class)
public enum class IOControlAccessMode(
  public val value: Int
) : NativeMapped {
  Any(0),
  Read(1),
  Write(2),
  ReadWrite(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IOControlAccessMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Any
      1 -> Read
      2 -> Write
      3 -> ReadWrite
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<IOControlAccessMode> {
    public fun setValue(newValue: IOControlAccessMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IOControlAccessMode =
        IOControlAccessMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<IOControlAccessMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IOControlAccessMode =
        IOControlAccessMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: IOControlAccessMode): Int = obj.value
  }
}
