package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardCryptogramMaterialType.ABI::class)
@Signature("enum(Windows.Devices.SmartCards.SmartCardCryptogramMaterialType;i4)")
@WinRTByReference(brClass = SmartCardCryptogramMaterialType.ByReference::class)
public enum class SmartCardCryptogramMaterialType(
  public val value: Int
) : NativeMapped {
  None(0),
  StaticDataAuthentication(1),
  TripleDes112(2),
  Aes(3),
  RsaPkcs1(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmartCardCryptogramMaterialType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> StaticDataAuthentication
      2 -> TripleDes112
      3 -> Aes
      4 -> RsaPkcs1
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SmartCardCryptogramMaterialType> {
    public fun setValue(newValue: SmartCardCryptogramMaterialType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmartCardCryptogramMaterialType =
        SmartCardCryptogramMaterialType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmartCardCryptogramMaterialType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmartCardCryptogramMaterialType =
        SmartCardCryptogramMaterialType.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmartCardCryptogramMaterialType): Int = obj.value
  }
}
