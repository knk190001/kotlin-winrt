package Windows.Devices.AllJoyn

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

@ABIMarker(AllJoynSessionLostReason.ABI::class)
@Signature("enum(Windows.Devices.AllJoyn.AllJoynSessionLostReason;i4)")
@WinRTByReference(brClass = AllJoynSessionLostReason.ByReference::class)
public enum class AllJoynSessionLostReason(
  public val value: Int
) : NativeMapped {
  None(0),
  ProducerLeftSession(1),
  ProducerClosedAbruptly(2),
  RemovedByProducer(3),
  LinkTimeout(4),
  Other(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AllJoynSessionLostReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ProducerLeftSession
      2 -> ProducerClosedAbruptly
      3 -> RemovedByProducer
      4 -> LinkTimeout
      5 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AllJoynSessionLostReason>
      {
    public fun setValue(newValue: AllJoynSessionLostReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AllJoynSessionLostReason =
        AllJoynSessionLostReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AllJoynSessionLostReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AllJoynSessionLostReason =
        AllJoynSessionLostReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: AllJoynSessionLostReason): Int = obj.value
  }
}
