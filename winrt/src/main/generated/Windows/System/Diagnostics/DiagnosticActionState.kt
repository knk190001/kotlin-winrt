package Windows.System.Diagnostics

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

@ABIMarker(DiagnosticActionState.ABI::class)
@Signature("enum(Windows.System.Diagnostics.DiagnosticActionState;i4)")
@WinRTByReference(brClass = DiagnosticActionState.ByReference::class)
public enum class DiagnosticActionState(
  public val value: Int
) : NativeMapped {
  Initializing(0),
  Downloading(1),
  VerifyingTrust(2),
  Detecting(3),
  Resolving(4),
  VerifyingResolution(5),
  Executing(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DiagnosticActionState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Initializing
      1 -> Downloading
      2 -> VerifyingTrust
      3 -> Detecting
      4 -> Resolving
      5 -> VerifyingResolution
      6 -> Executing
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DiagnosticActionState> {
    public fun setValue(newValue: DiagnosticActionState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DiagnosticActionState =
        DiagnosticActionState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DiagnosticActionState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DiagnosticActionState =
        DiagnosticActionState.values()[0].fromNative(value, null)

    public override fun toNative(obj: DiagnosticActionState): Int = obj.value
  }
}
