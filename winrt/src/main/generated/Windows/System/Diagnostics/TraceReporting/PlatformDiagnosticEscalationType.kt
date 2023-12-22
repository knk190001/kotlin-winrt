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

@ABIMarker(PlatformDiagnosticEscalationType.ABI::class)
@Signature("enum(Windows.System.Diagnostics.TraceReporting.PlatformDiagnosticEscalationType;i4)")
@WinRTByReference(brClass = PlatformDiagnosticEscalationType.ByReference::class)
public enum class PlatformDiagnosticEscalationType(
  public val value: Int
) : NativeMapped {
  OnCompletion(0),
  OnFailure(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PlatformDiagnosticEscalationType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> OnCompletion
      1 -> OnFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PlatformDiagnosticEscalationType> {
    public fun setValue(newValue: PlatformDiagnosticEscalationType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PlatformDiagnosticEscalationType =
        PlatformDiagnosticEscalationType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PlatformDiagnosticEscalationType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PlatformDiagnosticEscalationType =
        PlatformDiagnosticEscalationType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PlatformDiagnosticEscalationType): Int = obj.value
  }
}
