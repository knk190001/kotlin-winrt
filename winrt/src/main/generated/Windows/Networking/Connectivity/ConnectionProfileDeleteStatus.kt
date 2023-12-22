package Windows.Networking.Connectivity

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

@ABIMarker(ConnectionProfileDeleteStatus.ABI::class)
@Signature("enum(Windows.Networking.Connectivity.ConnectionProfileDeleteStatus;i4)")
@WinRTByReference(brClass = ConnectionProfileDeleteStatus.ByReference::class)
public enum class ConnectionProfileDeleteStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  DeniedByUser(1),
  DeniedBySystem(2),
  UnknownError(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ConnectionProfileDeleteStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> DeniedByUser
      2 -> DeniedBySystem
      3 -> UnknownError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ConnectionProfileDeleteStatus> {
    public fun setValue(newValue: ConnectionProfileDeleteStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ConnectionProfileDeleteStatus =
        ConnectionProfileDeleteStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ConnectionProfileDeleteStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ConnectionProfileDeleteStatus =
        ConnectionProfileDeleteStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: ConnectionProfileDeleteStatus): Int = obj.value
  }
}
