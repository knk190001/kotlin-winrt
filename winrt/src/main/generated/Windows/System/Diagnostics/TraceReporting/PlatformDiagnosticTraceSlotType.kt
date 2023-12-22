package Windows.System.Diagnostics.TraceReporting

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

@ABIMarker(PlatformDiagnosticTraceSlotType.ABI::class)
@Signature("enum(Windows.System.Diagnostics.TraceReporting.PlatformDiagnosticTraceSlotType;i4)")
@WinRTByReference(brClass = PlatformDiagnosticTraceSlotType.ByReference::class)
public enum class PlatformDiagnosticTraceSlotType(
  public val value: Int
) : NativeMapped {
  Alternative(0),
  AlwaysOn(1),
  Mini(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PlatformDiagnosticTraceSlotType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Alternative
      1 -> AlwaysOn
      2 -> Mini
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PlatformDiagnosticTraceSlotType> {
    public fun setValue(newValue: PlatformDiagnosticTraceSlotType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PlatformDiagnosticTraceSlotType =
        PlatformDiagnosticTraceSlotType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PlatformDiagnosticTraceSlotType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PlatformDiagnosticTraceSlotType =
        PlatformDiagnosticTraceSlotType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PlatformDiagnosticTraceSlotType): Int = obj.value
  }
}
