package Windows.ApplicationModel.ExtendedExecution

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

@ABIMarker(ExtendedExecutionRevokedReason.ABI::class)
@Signature("enum(Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason;i4)")
@WinRTByReference(brClass = ExtendedExecutionRevokedReason.ByReference::class)
public enum class ExtendedExecutionRevokedReason(
  public val value: Int
) : NativeMapped {
  Resumed(0),
  SystemPolicy(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ExtendedExecutionRevokedReason {
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
      IByReference<ExtendedExecutionRevokedReason> {
    public fun setValue(newValue: ExtendedExecutionRevokedReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ExtendedExecutionRevokedReason =
        ExtendedExecutionRevokedReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ExtendedExecutionRevokedReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ExtendedExecutionRevokedReason =
        ExtendedExecutionRevokedReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: ExtendedExecutionRevokedReason): Int = obj.value
  }
}
