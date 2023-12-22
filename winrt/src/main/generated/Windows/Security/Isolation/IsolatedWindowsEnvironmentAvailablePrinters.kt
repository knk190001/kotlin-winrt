package Windows.Security.Isolation

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

@ABIMarker(IsolatedWindowsEnvironmentAvailablePrinters.ABI::class)
@Signature("enum(Windows.Security.Isolation.IsolatedWindowsEnvironmentAvailablePrinters;u4)")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentAvailablePrinters.ByReference::class)
public enum class IsolatedWindowsEnvironmentAvailablePrinters(
  public val value: Int
) : NativeMapped {
  None(0),
  Local(1),
  Network(2),
  SystemPrintToPdf(4),
  SystemPrintToXps(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IsolatedWindowsEnvironmentAvailablePrinters {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Local
      2 -> Network
      4 -> SystemPrintToPdf
      8 -> SystemPrintToXps
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<IsolatedWindowsEnvironmentAvailablePrinters> {
    public fun setValue(newValue: IsolatedWindowsEnvironmentAvailablePrinters): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IsolatedWindowsEnvironmentAvailablePrinters =
        IsolatedWindowsEnvironmentAvailablePrinters.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentAvailablePrinters, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IsolatedWindowsEnvironmentAvailablePrinters =
        IsolatedWindowsEnvironmentAvailablePrinters.values()[0].fromNative(value, null)

    public override fun toNative(obj: IsolatedWindowsEnvironmentAvailablePrinters): Int = obj.value
  }
}
