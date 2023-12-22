package Windows.Management.Policies

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

@ABIMarker(NamedPolicyKind.ABI::class)
@Signature("enum(Windows.Management.Policies.NamedPolicyKind;i4)")
@WinRTByReference(brClass = NamedPolicyKind.ByReference::class)
public enum class NamedPolicyKind(
  public val value: Int
) : NativeMapped {
  Invalid(0),
  Binary(1),
  Boolean(2),
  Int32(3),
  Int64(4),
  String(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NamedPolicyKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Invalid
      1 -> Binary
      2 -> Boolean
      3 -> Int32
      4 -> Int64
      5 -> String
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<NamedPolicyKind> {
    public fun setValue(newValue: NamedPolicyKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NamedPolicyKind =
        NamedPolicyKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NamedPolicyKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NamedPolicyKind =
        NamedPolicyKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: NamedPolicyKind): Int = obj.value
  }
}
