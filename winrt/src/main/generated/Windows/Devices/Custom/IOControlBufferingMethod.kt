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

@ABIMarker(IOControlBufferingMethod.ABI::class)
@Signature("enum(Windows.Devices.Custom.IOControlBufferingMethod;i4)")
@WinRTByReference(brClass = IOControlBufferingMethod.ByReference::class)
public enum class IOControlBufferingMethod(
  public val value: Int
) : NativeMapped {
  Buffered(0),
  DirectInput(1),
  DirectOutput(2),
  Neither(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IOControlBufferingMethod {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Buffered
      1 -> DirectInput
      2 -> DirectOutput
      3 -> Neither
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<IOControlBufferingMethod>
      {
    public fun setValue(newValue: IOControlBufferingMethod): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IOControlBufferingMethod =
        IOControlBufferingMethod.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<IOControlBufferingMethod, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IOControlBufferingMethod =
        IOControlBufferingMethod.values()[0].fromNative(value, null)

    public override fun toNative(obj: IOControlBufferingMethod): Int = obj.value
  }
}
