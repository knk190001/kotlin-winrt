package Windows.ApplicationModel.Background

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

@ABIMarker(AlarmAccessStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Background.AlarmAccessStatus;i4)")
@WinRTByReference(brClass = AlarmAccessStatus.ByReference::class)
public enum class AlarmAccessStatus(
  public val value: Int
) : NativeMapped {
  Unspecified(0),
  AllowedWithWakeupCapability(1),
  AllowedWithoutWakeupCapability(2),
  Denied(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AlarmAccessStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unspecified
      1 -> AllowedWithWakeupCapability
      2 -> AllowedWithoutWakeupCapability
      3 -> Denied
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AlarmAccessStatus> {
    public fun setValue(newValue: AlarmAccessStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AlarmAccessStatus =
        AlarmAccessStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AlarmAccessStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AlarmAccessStatus =
        AlarmAccessStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: AlarmAccessStatus): Int = obj.value
  }
}
