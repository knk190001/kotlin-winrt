package Windows.ApplicationModel.ExtendedExecution.Foreground

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

@ABIMarker(ExtendedExecutionForegroundRevokedReason.ABI::class)
@Signature("enum(Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason;i4)")
@WinRTByReference(brClass = ExtendedExecutionForegroundRevokedReason.ByReference::class)
public enum class ExtendedExecutionForegroundRevokedReason(
  public val value: Int
) : NativeMapped {
  Resumed(0),
  SystemPolicy(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ExtendedExecutionForegroundRevokedReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Resumed
      1 -> SystemPolicy
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ExtendedExecutionForegroundRevokedReason> {
    public fun setValue(newValue: ExtendedExecutionForegroundRevokedReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ExtendedExecutionForegroundRevokedReason =
        ExtendedExecutionForegroundRevokedReason.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<ExtendedExecutionForegroundRevokedReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ExtendedExecutionForegroundRevokedReason =
        ExtendedExecutionForegroundRevokedReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: ExtendedExecutionForegroundRevokedReason): Int = obj.value
  }
}
