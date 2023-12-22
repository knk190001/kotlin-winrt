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

@ABIMarker(SmartCardCryptogramGeneratorOperationStatus.ABI::class)
@Signature("enum(Windows.Devices.SmartCards.SmartCardCryptogramGeneratorOperationStatus;i4)")
@WinRTByReference(brClass = SmartCardCryptogramGeneratorOperationStatus.ByReference::class)
public enum class SmartCardCryptogramGeneratorOperationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  AuthorizationFailed(1),
  AuthorizationCanceled(2),
  AuthorizationRequired(3),
  CryptogramMaterialPackageStorageKeyExists(4),
  NoCryptogramMaterialPackageStorageKey(5),
  NoCryptogramMaterialPackage(6),
  UnsupportedCryptogramMaterialPackage(7),
  UnknownCryptogramMaterialName(8),
  InvalidCryptogramMaterialUsage(9),
  ApduResponseNotSent(10),
  OtherError(11),
  ValidationFailed(12),
  NotSupported(13),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmartCardCryptogramGeneratorOperationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> AuthorizationFailed
      2 -> AuthorizationCanceled
      3 -> AuthorizationRequired
      4 -> CryptogramMaterialPackageStorageKeyExists
      5 -> NoCryptogramMaterialPackageStorageKey
      6 -> NoCryptogramMaterialPackage
      7 -> UnsupportedCryptogramMaterialPackage
      8 -> UnknownCryptogramMaterialName
      9 -> InvalidCryptogramMaterialUsage
      10 -> ApduResponseNotSent
      11 -> OtherError
      12 -> ValidationFailed
      13 -> NotSupported
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SmartCardCryptogramGeneratorOperationStatus> {
    public fun setValue(newValue: SmartCardCryptogramGeneratorOperationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmartCardCryptogramGeneratorOperationStatus =
        SmartCardCryptogramGeneratorOperationStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<SmartCardCryptogramGeneratorOperationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmartCardCryptogramGeneratorOperationStatus =
        SmartCardCryptogramGeneratorOperationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmartCardCryptogramGeneratorOperationStatus): Int = obj.value
  }
}
