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

@ABIMarker(IPlayReadyContentHeaderFactory.ABI::class)
@Signature("{cb97c8ff-b758-4776-bf01-217a8b510b2c}")
@Guid("cb97c8ffb7584776bf01217a8b510b2c")
@WinRTInterface("cb97c8ffb7584776bf01217a8b510b2c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyContentHeaderFactory.ByReference::class)
public interface IPlayReadyContentHeaderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceFromWindowsMediaDrmHeader(
    headerBytes: Array<Byte>,
    licenseAcquisitionUrl: Uri?,
    licenseAcquisitionUserInterfaceUrl: Uri?,
    customAttributes: String?,
    domainServiceId: com.sun.jna.platform.win32.Guid.GUID?
  ): PlayReadyContentHeader?

  @InterfaceMethod(1)
  public fun CreateInstanceFromComponents(
    contentKeyId: com.sun.jna.platform.win32.Guid.GUID?,
    contentKeyIdString: String?,
    contentEncryptionAlgorithm: PlayReadyEncryptionAlgorithm?,
    licenseAcquisitionUrl: Uri?,
    licenseAcquisitionUserInterfaceUrl: Uri?,
    customAttributes: String?,
    domainServiceId: com.sun.jna.platform.win32.Guid.GUID?
  ): PlayReadyContentHeader?

  @InterfaceMethod(2)
  public fun CreateInstanceFromPlayReadyHeader(headerBytes: Array<Byte>): PlayReadyContentHeader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyContentHeaderFactory> {
    public override fun getValue() = ABI.makeIPlayReadyContentHeaderFactory(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyContentHeaderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyContentHeaderFactory {
    public val __1298624647_Ptr: Pointer?

    public val _1298624647_VtblPtr: Pointer?
      get() = __1298624647_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceFromWindowsMediaDrmHeader(
      headerBytes: Array<Byte>,
      licenseAcquisitionUrl: Uri?,
      licenseAcquisitionUserInterfaceUrl: Uri?,
      customAttributes: String?,
      domainServiceId: com.sun.jna.platform.win32.Guid.GUID?
    ): PlayReadyContentHeader? {
      val fnPtr = _1298624647_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadyContentHeader>()
      val hr = fn.invokeHR(arrayOf(__1298624647_Ptr, headerBytes.size,marshalToNative(headerBytes),
          marshalToNative(licenseAcquisitionUrl),
          marshalToNative(licenseAcquisitionUserInterfaceUrl), marshalToNative(customAttributes),
          marshalToNative(domainServiceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadyContentHeader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstanceFromComponents(
      contentKeyId: com.sun.jna.platform.win32.Guid.GUID?,
      contentKeyIdString: String?,
      contentEncryptionAlgorithm: PlayReadyEncryptionAlgorithm?,
      licenseAcquisitionUrl: Uri?,
      licenseAcquisitionUserInterfaceUrl: Uri?,
      customAttributes: String?,
      domainServiceId: com.sun.jna.platform.win32.Guid.GUID?
    ): PlayReadyContentHeader? {
      val fnPtr = _1298624647_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadyContentHeader>()
      val hr = fn.invokeHR(arrayOf(__1298624647_Ptr, marshalToNative(contentKeyId),
          marshalToNative(contentKeyIdString), marshalToNative(contentEncryptionAlgorithm),
          marshalToNative(licenseAcquisitionUrl),
          marshalToNative(licenseAcquisitionUserInterfaceUrl), marshalToNative(customAttributes),
          marshalToNative(domainServiceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadyContentHeader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateInstanceFromPlayReadyHeader(headerBytes: Array<Byte>):
        PlayReadyContentHeader? {
      val fnPtr = _1298624647_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadyContentHeader>()
      val hr = fn.invokeHR(arrayOf(__1298624647_Ptr, headerBytes.size,marshalToNative(headerBytes),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadyContentHeader>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadyContentHeaderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1298624647_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyContentHeaderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb97c8ffb7584776bf01217a8b510b2c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyContentHeaderFactory(ptr: Pointer?): WithDefault =
        IPlayReadyContentHeaderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyContentHeaderFactory {
      val address = segment.toRawLongValue()
      return makeIPlayReadyContentHeaderFactory(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyContentHeaderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1298624647_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyContentHeaderFactory):
        Array<IPlayReadyContentHeaderFactory?> = (elements as
        Array<IPlayReadyContentHeaderFactory?>).castToImpl<IPlayReadyContentHeaderFactory,IPlayReadyContentHeaderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyContentHeaderFactory?> =
        arrayOfNulls<IPlayReadyContentHeaderFactory_Impl>(size) as
        Array<IPlayReadyContentHeaderFactory?>
  }
}
