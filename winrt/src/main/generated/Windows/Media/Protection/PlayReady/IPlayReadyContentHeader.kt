package Windows.Media.Protection.PlayReady

import Windows.Foundation.Uri
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
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadyContentHeader.ABI::class)
@Signature("{9a438a6a-7f4c-452e-88bd-0148c6387a2c}")
@Guid("9a438a6a7f4c452e88bd0148c6387a2c")
@WinRTInterface("9a438a6a7f4c452e88bd0148c6387a2c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyContentHeader.ByReference::class)
public interface IPlayReadyContentHeader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_KeyIdString(): String?

  @InterfaceMethod(2)
  public fun get_LicenseAcquisitionUrl(): Uri?

  @InterfaceMethod(3)
  public fun get_LicenseAcquisitionUserInterfaceUrl(): Uri?

  @InterfaceMethod(4)
  public fun get_DomainServiceId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(5)
  public fun get_EncryptionType(): PlayReadyEncryptionAlgorithm?

  @InterfaceMethod(6)
  public fun get_CustomAttributes(): String?

  @InterfaceMethod(7)
  public fun get_DecryptorSetup(): PlayReadyDecryptorSetup?

  @InterfaceMethod(8)
  public fun GetSerializedHeader(): Array<Byte>?

  @InterfaceMethod(9)
  public fun get_HeaderWithEmbeddedUpdates(): PlayReadyContentHeader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyContentHeader> {
    public override fun getValue() = ABI.makeIPlayReadyContentHeader(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyContentHeader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyContentHeader {
    public val __640216145_Ptr: Pointer?

    public val _640216145_VtblPtr: Pointer?
      get() = __640216145_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _640216145_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__640216145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyIdString(): String? {
      val fnPtr = _640216145_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__640216145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LicenseAcquisitionUrl(): Uri? {
      val fnPtr = _640216145_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__640216145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_LicenseAcquisitionUserInterfaceUrl(): Uri? {
      val fnPtr = _640216145_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__640216145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DomainServiceId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _640216145_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__640216145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_EncryptionType(): PlayReadyEncryptionAlgorithm? {
      val fnPtr = _640216145_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadyEncryptionAlgorithm>()
      val hr = fn.invokeHR(arrayOf(__640216145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadyEncryptionAlgorithm>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CustomAttributes(): String? {
      val fnPtr = _640216145_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__640216145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_DecryptorSetup(): PlayReadyDecryptorSetup? {
      val fnPtr = _640216145_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadyDecryptorSetup>()
      val hr = fn.invokeHR(arrayOf(__640216145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadyDecryptorSetup>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetSerializedHeader(): Array<Byte>? {
      val fnPtr = _640216145_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__640216145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_HeaderWithEmbeddedUpdates(): PlayReadyContentHeader? {
      val fnPtr = _640216145_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadyContentHeader>()
      val hr = fn.invokeHR(arrayOf(__640216145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadyContentHeader>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadyContentHeader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __640216145_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyContentHeader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a438a6a7f4c452e88bd0148c6387a2c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyContentHeader(ptr: Pointer?): WithDefault =
        IPlayReadyContentHeader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyContentHeader {
      val address = segment.toRawLongValue()
      return makeIPlayReadyContentHeader(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyContentHeader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__640216145_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyContentHeader): Array<IPlayReadyContentHeader?>
        = (elements as
        Array<IPlayReadyContentHeader?>).castToImpl<IPlayReadyContentHeader,IPlayReadyContentHeader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyContentHeader?> =
        arrayOfNulls<IPlayReadyContentHeader_Impl>(size) as Array<IPlayReadyContentHeader?>
  }
}
