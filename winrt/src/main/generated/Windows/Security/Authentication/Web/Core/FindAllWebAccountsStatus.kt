package Windows.Security.Authentication.Web.Core

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

@ABIMarker(FindAllWebAccountsStatus.ABI::class)
@Signature("enum(Windows.Security.Authentication.Web.Core.FindAllWebAccountsStatus;i4)")
@WinRTByReference(brClass = FindAllWebAccountsStatus.ByReference::class)
public enum class FindAllWebAccountsStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  NotAllowedByProvider(1),
  NotSupportedByProvider(2),
  ProviderError(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FindAllWebAccountsStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> NotAllowedByProvider
      2 -> NotSupportedByProvider
      3 -> ProviderError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FindAllWebAccountsStatus>
      {
    public fun setValue(newValue: FindAllWebAccountsStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FindAllWebAccountsStatus =
        FindAllWebAccountsStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FindAllWebAccountsStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FindAllWebAccountsStatus =
        FindAllWebAccountsStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: FindAllWebAccountsStatus): Int = obj.value
  }
}
