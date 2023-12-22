package Windows.Foundation.Metadata

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

@ABIMarker(AttributeTargets.ABI::class)
@Signature("enum(Windows.Foundation.Metadata.AttributeTargets;u4)")
@WinRTByReference(brClass = AttributeTargets.ByReference::class)
public enum class AttributeTargets(
  public val value: Int
) : NativeMapped {
  All(-1),
  Delegate(1),
  Enum(2),
  Event(4),
  Field(8),
  Interface(16),
  Method(64),
  Parameter(128),
  Property(256),
  RuntimeClass(512),
  Struct(1024),
  InterfaceImpl(2048),
  ApiContract(8192),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AttributeTargets {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      -1 -> All
      1 -> Delegate
      2 -> Enum
      4 -> Event
      8 -> Field
      16 -> Interface
      64 -> Method
      128 -> Parameter
      256 -> Property
      512 -> RuntimeClass
      1024 -> Struct
      2048 -> InterfaceImpl
      8192 -> ApiContract
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AttributeTargets> {
    public fun setValue(newValue: AttributeTargets): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AttributeTargets =
        AttributeTargets.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AttributeTargets, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AttributeTargets =
        AttributeTargets.values()[0].fromNative(value, null)

    public override fun toNative(obj: AttributeTargets): Int = obj.value
  }
}
