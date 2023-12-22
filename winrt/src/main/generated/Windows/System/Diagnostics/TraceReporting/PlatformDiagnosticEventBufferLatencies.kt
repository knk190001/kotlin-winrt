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

@ABIMarker(PlatformDiagnosticEventBufferLatencies.ABI::class)
@Signature("enum(Windows.System.Diagnostics.TraceReporting.PlatformDiagnosticEventBufferLatencies;u4)")
@WinRTByReference(brClass = PlatformDiagnosticEventBufferLatencies.ByReference::class)
public enum class PlatformDiagnosticEventBufferLatencies(
  public val value: Int
) : NativeMapped {
  Normal(1),
  CostDeferred(2),
  Realtime(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PlatformDiagnosticEventBufferLatencies {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> Normal
      2 -> CostDeferred
      4 -> Realtime
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PlatformDiagnosticEventBufferLatencies> {
    public fun setValue(newValue: PlatformDiagnosticEventBufferLatencies): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PlatformDiagnosticEventBufferLatencies =
        PlatformDiagnosticEventBufferLatencies.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PlatformDiagnosticEventBufferLatencies, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PlatformDiagnosticEventBufferLatencies =
        PlatformDiagnosticEventBufferLatencies.values()[0].fromNative(value, null)

    public override fun toNative(obj: PlatformDiagnosticEventBufferLatencies): Int = obj.value
  }
}
