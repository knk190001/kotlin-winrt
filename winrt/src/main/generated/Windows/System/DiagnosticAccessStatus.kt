package Windows.System

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

@ABIMarker(DiagnosticAccessStatus.ABI::class)
@Signature("enum(Windows.System.DiagnosticAccessStatus;i4)")
@WinRTByReference(brClass = DiagnosticAccessStatus.ByReference::class)
public enum class DiagnosticAccessStatus(
  public val value: Int
) : NativeMapped {
  Unspecified(0),
  Denied(1),
  Limited(2),
  Allowed(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DiagnosticAccessStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unspecified
      1 -> Denied
      2 -> Limited
      3 -> Allowed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DiagnosticAccessStatus> {
    public fun setValue(newValue: DiagnosticAccessStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DiagnosticAccessStatus =
        DiagnosticAccessStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DiagnosticAccessStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DiagnosticAccessStatus =
        DiagnosticAccessStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: DiagnosticAccessStatus): Int = obj.value
  }
}
