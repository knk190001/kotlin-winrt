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

@ABIMarker(DomainConnectivityLevel.ABI::class)
@Signature("enum(Windows.Networking.Connectivity.DomainConnectivityLevel;i4)")
@WinRTByReference(brClass = DomainConnectivityLevel.ByReference::class)
public enum class DomainConnectivityLevel(
  public val value: Int
) : NativeMapped {
  None(0),
  Unauthenticated(1),
  Authenticated(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DomainConnectivityLevel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Unauthenticated
      2 -> Authenticated
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DomainConnectivityLevel> {
    public fun setValue(newValue: DomainConnectivityLevel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DomainConnectivityLevel =
        DomainConnectivityLevel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DomainConnectivityLevel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DomainConnectivityLevel =
        DomainConnectivityLevel.values()[0].fromNative(value, null)

    public override fun toNative(obj: DomainConnectivityLevel): Int = obj.value
  }
}
