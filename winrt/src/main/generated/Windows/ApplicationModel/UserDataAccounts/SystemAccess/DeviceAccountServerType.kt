package Windows.ApplicationModel.UserDataAccounts.SystemAccess

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

@ABIMarker(DeviceAccountServerType.ABI::class)
@Signature("enum(Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType;i4)")
@WinRTByReference(brClass = DeviceAccountServerType.ByReference::class)
public enum class DeviceAccountServerType(
  public val value: Int
) : NativeMapped {
  Exchange(0),
  Pop(1),
  Imap(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DeviceAccountServerType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Exchange
      1 -> Pop
      2 -> Imap
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DeviceAccountServerType> {
    public fun setValue(newValue: DeviceAccountServerType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DeviceAccountServerType =
        DeviceAccountServerType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DeviceAccountServerType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DeviceAccountServerType =
        DeviceAccountServerType.values()[0].fromNative(value, null)

    public override fun toNative(obj: DeviceAccountServerType): Int = obj.value
  }
}
