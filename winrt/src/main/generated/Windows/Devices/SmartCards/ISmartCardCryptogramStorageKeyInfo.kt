package Windows.Devices.SmartCards

import Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType
import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardCryptogramStorageKeyInfo.ABI::class)
@Signature("{77b0f00d-b097-4f61-a26a-9561639c9c3a}")
@Guid("77b0f00db0974f61a26a9561639c9c3a")
@WinRTInterface("77b0f00db0974f61a26a9561639c9c3a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardCryptogramStorageKeyInfo.ByReference::class)
public interface ISmartCardCryptogramStorageKeyInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OperationStatus(): SmartCardCryptogramGeneratorOperationStatus?

  @InterfaceMethod(1)
  public fun get_PublicKeyBlobType(): CryptographicPublicKeyBlobType?

  @InterfaceMethod(2)
  public fun get_PublicKey(): IBuffer?

  @InterfaceMethod(3)
  public fun get_AttestationStatus(): SmartCardCryptographicKeyAttestationStatus?

  @InterfaceMethod(4)
  public fun get_Attestation(): IBuffer?

  @InterfaceMethod(5)
  public fun get_AttestationCertificateChain(): IBuffer?

  @InterfaceMethod(6)
  public fun get_Capabilities(): SmartCardCryptogramStorageKeyCapabilities?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardCryptogramStorageKeyInfo> {
    public override fun getValue() =
        ABI.makeISmartCardCryptogramStorageKeyInfo(pointer.getPointer(0))

    public fun setValue(value: ISmartCardCryptogramStorageKeyInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardCryptogramStorageKeyInfo {
    public val __87792816_Ptr: Pointer?

    public val _87792816_VtblPtr: Pointer?
      get() = __87792816_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OperationStatus(): SmartCardCryptogramGeneratorOperationStatus? {
      val fnPtr = _87792816_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardCryptogramGeneratorOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__87792816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SmartCardCryptogramGeneratorOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PublicKeyBlobType(): CryptographicPublicKeyBlobType? {
      val fnPtr = _87792816_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CryptographicPublicKeyBlobType>()
      val hr = fn.invokeHR(arrayOf(__87792816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CryptographicPublicKeyBlobType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PublicKey(): IBuffer? {
      val fnPtr = _87792816_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__87792816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AttestationStatus(): SmartCardCryptographicKeyAttestationStatus? {
      val fnPtr = _87792816_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardCryptographicKeyAttestationStatus>()
      val hr = fn.invokeHR(arrayOf(__87792816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SmartCardCryptographicKeyAttestationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Attestation(): IBuffer? {
      val fnPtr = _87792816_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__87792816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_AttestationCertificateChain(): IBuffer? {
      val fnPtr = _87792816_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__87792816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Capabilities(): SmartCardCryptogramStorageKeyCapabilities? {
      val fnPtr = _87792816_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardCryptogramStorageKeyCapabilities>()
      val hr = fn.invokeHR(arrayOf(__87792816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SmartCardCryptogramStorageKeyCapabilities>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardCryptogramStorageKeyInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __87792816_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardCryptogramStorageKeyInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("77b0f00db0974f61a26a9561639c9c3a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardCryptogramStorageKeyInfo(ptr: Pointer?): WithDefault =
        ISmartCardCryptogramStorageKeyInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardCryptogramStorageKeyInfo {
      val address = segment.toRawLongValue()
      return makeISmartCardCryptogramStorageKeyInfo(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardCryptogramStorageKeyInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__87792816_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardCryptogramStorageKeyInfo):
        Array<ISmartCardCryptogramStorageKeyInfo?> = (elements as
        Array<ISmartCardCryptogramStorageKeyInfo?>).castToImpl<ISmartCardCryptogramStorageKeyInfo,ISmartCardCryptogramStorageKeyInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardCryptogramStorageKeyInfo?> =
        arrayOfNulls<ISmartCardCryptogramStorageKeyInfo_Impl>(size) as
        Array<ISmartCardCryptogramStorageKeyInfo?>
  }
}
