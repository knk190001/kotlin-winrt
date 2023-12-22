package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.IMediaProtectionServiceRequest
import Windows.Media.Protection.PlayReady.IPlayReadyLicenseAcquisitionServiceRequest.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IPlayReadyLicenseAcquisitionServiceRequest2.ABI::class)
@Signature("{b7fa5eb5-fe0c-b225-bc60-5a9edd32ceb5}")
@Guid("b7fa5eb5fe0cb225bc605a9edd32ceb5")
@WinRTInterface("b7fa5eb5fe0cb225bc605a9edd32ceb5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyLicenseAcquisitionServiceRequest2.ByReference::class)
public interface IPlayReadyLicenseAcquisitionServiceRequest2 : NativeMapped, IWinRTInterface,
    IPlayReadyLicenseAcquisitionServiceRequest, IPlayReadyServiceRequest,
    IMediaProtectionServiceRequest {
  @InterfaceMethod(0)
  public fun get_SessionId(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyLicenseAcquisitionServiceRequest2> {
    public override fun getValue() =
        ABI.makeIPlayReadyLicenseAcquisitionServiceRequest2(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyLicenseAcquisitionServiceRequest2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyLicenseAcquisitionServiceRequest2,
      IPlayReadyLicenseAcquisitionServiceRequest.WithDefault, IPlayReadyServiceRequest.WithDefault,
      IMediaProtectionServiceRequest.WithDefault {
    public val __106473367_Ptr: Pointer?

    public val _106473367_VtblPtr: Pointer?
      get() = __106473367_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SessionId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _106473367_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__106473367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadyLicenseAcquisitionServiceRequest2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IPlayReadyLicenseAcquisitionServiceRequest, IPlayReadyServiceRequest,
      IMediaProtectionServiceRequest {
    public override val __135112709_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_106473367_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __573428623_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IPlayReadyServiceRequest.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_106473367_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __454607004_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaProtectionServiceRequest.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_106473367_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __106473367_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyLicenseAcquisitionServiceRequest2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b7fa5eb5fe0cb225bc605a9edd32ceb5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyLicenseAcquisitionServiceRequest2(ptr: Pointer?): WithDefault =
        IPlayReadyLicenseAcquisitionServiceRequest2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPlayReadyLicenseAcquisitionServiceRequest2 {
      val address = segment.toRawLongValue()
      return makeIPlayReadyLicenseAcquisitionServiceRequest2(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyLicenseAcquisitionServiceRequest2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__106473367_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyLicenseAcquisitionServiceRequest2):
        Array<IPlayReadyLicenseAcquisitionServiceRequest2?> = (elements as
        Array<IPlayReadyLicenseAcquisitionServiceRequest2?>).castToImpl<IPlayReadyLicenseAcquisitionServiceRequest2,IPlayReadyLicenseAcquisitionServiceRequest2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyLicenseAcquisitionServiceRequest2?> =
        arrayOfNulls<IPlayReadyLicenseAcquisitionServiceRequest2_Impl>(size) as
        Array<IPlayReadyLicenseAcquisitionServiceRequest2?>
  }
}
