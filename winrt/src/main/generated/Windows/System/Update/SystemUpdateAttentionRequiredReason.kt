package Windows.System.Update

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

@ABIMarker(SystemUpdateAttentionRequiredReason.ABI::class)
@Signature("enum(Windows.System.Update.SystemUpdateAttentionRequiredReason;i4)")
@WinRTByReference(brClass = SystemUpdateAttentionRequiredReason.ByReference::class)
public enum class SystemUpdateAttentionRequiredReason(
  public val value: Int
) : NativeMapped {
  None(0),
  NetworkRequired(1),
  InsufficientDiskSpace(2),
  InsufficientBattery(3),
  UpdateBlocked(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SystemUpdateAttentionRequiredReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> NetworkRequired
      2 -> InsufficientDiskSpace
      3 -> InsufficientBattery
      4 -> UpdateBlocked
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SystemUpdateAttentionRequiredReason> {
    public fun setValue(newValue: SystemUpdateAttentionRequiredReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SystemUpdateAttentionRequiredReason =
        SystemUpdateAttentionRequiredReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SystemUpdateAttentionRequiredReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SystemUpdateAttentionRequiredReason =
        SystemUpdateAttentionRequiredReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: SystemUpdateAttentionRequiredReason): Int = obj.value
  }
}
