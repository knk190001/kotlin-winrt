package Windows.Management

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

@ABIMarker(MdmSessionState.ABI::class)
@Signature("enum(Windows.Management.MdmSessionState;i4)")
@WinRTByReference(brClass = MdmSessionState.ByReference::class)
public enum class MdmSessionState(
  public val value: Int
) : NativeMapped {
  NotStarted(0),
  Starting(1),
  Connecting(2),
  Communicating(3),
  AlertStatusAvailable(4),
  Retrying(5),
  Completed(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MdmSessionState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotStarted
      1 -> Starting
      2 -> Connecting
      3 -> Communicating
      4 -> AlertStatusAvailable
      5 -> Retrying
      6 -> Completed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MdmSessionState> {
    public fun setValue(newValue: MdmSessionState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MdmSessionState =
        MdmSessionState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MdmSessionState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MdmSessionState =
        MdmSessionState.values()[0].fromNative(value, null)

    public override fun toNative(obj: MdmSessionState): Int = obj.value
  }
}
