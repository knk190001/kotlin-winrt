package Windows.Security.Authentication.OnlineId

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

@ABIMarker(OnlineIdSystemTicketStatus.ABI::class)
@Signature("enum(Windows.Security.Authentication.OnlineId.OnlineIdSystemTicketStatus;i4)")
@WinRTByReference(brClass = OnlineIdSystemTicketStatus.ByReference::class)
public enum class OnlineIdSystemTicketStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  Error(1),
  ServiceConnectionError(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      OnlineIdSystemTicketStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> Error
      2 -> ServiceConnectionError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<OnlineIdSystemTicketStatus> {
    public fun setValue(newValue: OnlineIdSystemTicketStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): OnlineIdSystemTicketStatus =
        OnlineIdSystemTicketStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<OnlineIdSystemTicketStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): OnlineIdSystemTicketStatus =
        OnlineIdSystemTicketStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: OnlineIdSystemTicketStatus): Int = obj.value
  }
}
