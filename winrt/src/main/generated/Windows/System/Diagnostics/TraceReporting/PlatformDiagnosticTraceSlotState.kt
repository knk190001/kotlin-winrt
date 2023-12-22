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

@ABIMarker(PlatformDiagnosticTraceSlotState.ABI::class)
@Signature("enum(Windows.System.Diagnostics.TraceReporting.PlatformDiagnosticTraceSlotState;i4)")
@WinRTByReference(brClass = PlatformDiagnosticTraceSlotState.ByReference::class)
public enum class PlatformDiagnosticTraceSlotState(
  public val value: Int
) : NativeMapped {
  NotRunning(0),
  Running(1),
  Throttled(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PlatformDiagnosticTraceSlotState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotRunning
      1 -> Running
      2 -> Throttled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PlatformDiagnosticTraceSlotState> {
    public fun setValue(newValue: PlatformDiagnosticTraceSlotState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PlatformDiagnosticTraceSlotState =
        PlatformDiagnosticTraceSlotState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PlatformDiagnosticTraceSlotState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PlatformDiagnosticTraceSlotState =
        PlatformDiagnosticTraceSlotState.values()[0].fromNative(value, null)

    public override fun toNative(obj: PlatformDiagnosticTraceSlotState): Int = obj.value
  }
}
