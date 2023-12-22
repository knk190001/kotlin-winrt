package Windows.Networking.NetworkOperators

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

@ABIMarker(UssdResultCode.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.UssdResultCode;i4)")
@WinRTByReference(brClass = UssdResultCode.ByReference::class)
public enum class UssdResultCode(
  public val value: Int
) : NativeMapped {
  NoActionRequired(0),
  ActionRequired(1),
  Terminated(2),
  OtherLocalClient(3),
  OperationNotSupported(4),
  NetworkTimeout(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UssdResultCode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NoActionRequired
      1 -> ActionRequired
      2 -> Terminated
      3 -> OtherLocalClient
      4 -> OperationNotSupported
      5 -> NetworkTimeout
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UssdResultCode> {
    public fun setValue(newValue: UssdResultCode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UssdResultCode =
        UssdResultCode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UssdResultCode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UssdResultCode =
        UssdResultCode.values()[0].fromNative(value, null)

    public override fun toNative(obj: UssdResultCode): Int = obj.value
  }
}
