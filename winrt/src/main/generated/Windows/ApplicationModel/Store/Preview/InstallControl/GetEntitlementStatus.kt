package Windows.ApplicationModel.Store.Preview.InstallControl

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

@ABIMarker(GetEntitlementStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Store.Preview.InstallControl.GetEntitlementStatus;i4)")
@WinRTByReference(brClass = GetEntitlementStatus.ByReference::class)
public enum class GetEntitlementStatus(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  NoStoreAccount(1),
  NetworkError(2),
  ServerError(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GetEntitlementStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> NoStoreAccount
      2 -> NetworkError
      3 -> ServerError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GetEntitlementStatus> {
    public fun setValue(newValue: GetEntitlementStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GetEntitlementStatus =
        GetEntitlementStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GetEntitlementStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GetEntitlementStatus =
        GetEntitlementStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: GetEntitlementStatus): Int = obj.value
  }
}
