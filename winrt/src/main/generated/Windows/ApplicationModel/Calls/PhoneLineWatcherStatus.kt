package Windows.ApplicationModel.Calls

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

@ABIMarker(PhoneLineWatcherStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.PhoneLineWatcherStatus;i4)")
@WinRTByReference(brClass = PhoneLineWatcherStatus.ByReference::class)
public enum class PhoneLineWatcherStatus(
  public val value: Int
) : NativeMapped {
  Created(0),
  Started(1),
  EnumerationCompleted(2),
  Stopped(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneLineWatcherStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Created
      1 -> Started
      2 -> EnumerationCompleted
      3 -> Stopped
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneLineWatcherStatus> {
    public fun setValue(newValue: PhoneLineWatcherStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneLineWatcherStatus =
        PhoneLineWatcherStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneLineWatcherStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneLineWatcherStatus =
        PhoneLineWatcherStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneLineWatcherStatus): Int = obj.value
  }
}
