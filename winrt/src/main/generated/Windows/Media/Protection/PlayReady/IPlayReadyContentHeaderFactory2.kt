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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadyContentHeaderFactory2.ABI::class)
@Signature("{d1239cf5-ae6d-4778-97fd-6e3a2eeadbeb}")
@Guid("d1239cf5ae6d477897fd6e3a2eeadbeb")
@WinRTInterface("d1239cf5ae6d477897fd6e3a2eeadbeb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyContentHeaderFactory2.ByReference::class)
public interface IPlayReadyContentHeaderFactory2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceFromComponents2(
    dwFlags: WinDef.UINT,
    contentKeyIds: Array<com.sun.jna.platform.win32.Guid.GUID?>,
    contentKeyIdStrings: Array<String?>,
    contentEncryptionAlgorithm: PlayReadyEncryptionAlgorithm?,
    licenseAcquisitionUrl: Uri?,
    licenseAcquisitionUserInterfaceUrl: Uri?,
    customAttributes: String?,
    domainServiceId: com.sun.jna.platform.win32.Guid.GUID?
  ): PlayReadyContentHeader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyContentHeaderFactory2> {
    public override fun getValue() = ABI.makeIPlayReadyContentHeaderFactory2(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyContentHeaderFactory2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyContentHeaderFactory2 {
    public val __1602658343_Ptr: Pointer?

    public val _1602658343_VtblPtr: Pointer?
      get() = __1602658343_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceFromComponents2(
      dwFlags: WinDef.UINT,
      contentKeyIds: Array<com.sun.jna.platform.win32.Guid.GUID?>,
      contentKeyIdStrings: Array<String?>,
      contentEncryptionAlgorithm: PlayReadyEncryptionAlgorithm?,
      licenseAcquisitionUrl: Uri?,
      licenseAcquisitionUserInterfaceUrl: Uri?,
      customAttributes: String?,
      domainServiceId: com.sun.jna.platform.win32.Guid.GUID?
    ): PlayReadyContentHeader? {
      val fnPtr = _1602658343_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadyContentHeader>()
      val hr = fn.invokeHR(arrayOf(__1602658343_Ptr, dwFlags,
          contentKeyIds.size,marshalToNative(contentKeyIds),
          contentKeyIdStrings.size,marshalToNative(contentKeyIdStrings),
          marshalToNative(contentEncryptionAlgorithm), marshalToNative(licenseAcquisitionUrl),
          marshalToNative(licenseAcquisitionUserInterfaceUrl), marshalToNative(customAttributes),
          marshalToNative(domainServiceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadyContentHeader>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadyContentHeaderFactory2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1602658343_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyContentHeaderFactory2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1239cf5ae6d477897fd6e3a2eeadbeb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyContentHeaderFactory2(ptr: Pointer?): WithDefault =
        IPlayReadyContentHeaderFactory2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyContentHeaderFactory2 {
      val address = segment.toRawLongValue()
      return makeIPlayReadyContentHeaderFactory2(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyContentHeaderFactory2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1602658343_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyContentHeaderFactory2):
        Array<IPlayReadyContentHeaderFactory2?> = (elements as
        Array<IPlayReadyContentHeaderFactory2?>).castToImpl<IPlayReadyContentHeaderFactory2,IPlayReadyContentHeaderFactory2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyContentHeaderFactory2?> =
        arrayOfNulls<IPlayReadyContentHeaderFactory2_Impl>(size) as
        Array<IPlayReadyContentHeaderFactory2?>
  }
}
