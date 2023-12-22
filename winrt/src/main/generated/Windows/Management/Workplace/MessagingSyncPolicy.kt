package Windows.Management.Workplace

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

@ABIMarker(MessagingSyncPolicy.ABI::class)
@Signature("enum(Windows.Management.Workplace.MessagingSyncPolicy;i4)")
@WinRTByReference(brClass = MessagingSyncPolicy.ByReference::class)
public enum class MessagingSyncPolicy(
  public val value: Int
) : NativeMapped {
  Disallowed(0),
  Allowed(1),
  Required(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MessagingSyncPolicy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disallowed
      1 -> Allowed
      2 -> Required
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MessagingSyncPolicy> {
    public fun setValue(newValue: MessagingSyncPolicy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MessagingSyncPolicy =
        MessagingSyncPolicy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MessagingSyncPolicy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MessagingSyncPolicy =
        MessagingSyncPolicy.values()[0].fromNative(value, null)

    public override fun toNative(obj: MessagingSyncPolicy): Int = obj.value
  }
}
