package Windows.Devices.PointOfService

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

@ABIMarker(PosPrinterStatusKind.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.PosPrinterStatusKind;i4)")
@WinRTByReference(brClass = PosPrinterStatusKind.ByReference::class)
public enum class PosPrinterStatusKind(
  public val value: Int
) : NativeMapped {
  Online(0),
  Off(1),
  Offline(2),
  OffOrOffline(3),
  Extended(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PosPrinterStatusKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Online
      1 -> Off
      2 -> Offline
      3 -> OffOrOffline
      4 -> Extended
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PosPrinterStatusKind> {
    public fun setValue(newValue: PosPrinterStatusKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PosPrinterStatusKind =
        PosPrinterStatusKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PosPrinterStatusKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PosPrinterStatusKind =
        PosPrinterStatusKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: PosPrinterStatusKind): Int = obj.value
  }
}
