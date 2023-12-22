package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.IMediaProtectionServiceRequest
import Windows.Media.Protection.PlayReady.IPlayReadyServiceRequest.ABI.IID
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

@ABIMarker(IPlayReadyLicenseAcquisitionServiceRequest.ABI::class)
@Signature("{5d85ff45-3e9f-4f48-93e1-9530c8d58c3e}")
@Guid("5d85ff453e9f4f4893e19530c8d58c3e")
@WinRTInterface("5d85ff453e9f4f4893e19530c8d58c3e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyLicenseAcquisitionServiceRequest.ByReference::class)
public interface IPlayReadyLicenseAcquisitionServiceRequest : NativeMapped, IWinRTInterface,
    IPlayReadyServiceRequest, IMediaProtectionServiceRequest {
  @InterfaceMethod(0)
  public fun get_ContentHeader(): PlayReadyContentHeader?

  @InterfaceMethod(1)
  public fun put_ContentHeader(value: PlayReadyContentHeader?): Unit

  @InterfaceMethod(2)
  public fun get_DomainServiceId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(3)
  public fun put_DomainServiceId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyLicenseAcquisitionServiceRequest> {
    public override fun getValue() =
        ABI.makeIPlayReadyLicenseAcquisitionServiceRequest(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyLicenseAcquisitionServiceRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyLicenseAcquisitionServiceRequest,
      IPlayReadyServiceRequest.WithDefault, IMediaProtectionServiceRequest.WithDefault {
    public val __135112709_Ptr: Pointer?

    public val _135112709_VtblPtr: Pointer?
      get() = __135112709_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentHeader(): PlayReadyContentHeader? {
      val fnPtr = _135112709_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadyContentHeader>()
      val hr = fn.invokeHR(arrayOf(__135112709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadyContentHeader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ContentHeader(value: PlayReadyContentHeader?): Unit {
      val fnPtr = _135112709_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__135112709_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DomainServiceId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _135112709_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__135112709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DomainServiceId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _135112709_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__135112709_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPlayReadyLicenseAcquisitionServiceRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPlayReadyServiceRequest,
      IMediaProtectionServiceRequest {
    public override val __573428623_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_135112709_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __454607004_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaProtectionServiceRequest.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_135112709_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __135112709_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyLicenseAcquisitionServiceRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d85ff453e9f4f4893e19530c8d58c3e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyLicenseAcquisitionServiceRequest(ptr: Pointer?): WithDefault =
        IPlayReadyLicenseAcquisitionServiceRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPlayReadyLicenseAcquisitionServiceRequest {
      val address = segment.toRawLongValue()
      return makeIPlayReadyLicenseAcquisitionServiceRequest(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyLicenseAcquisitionServiceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__135112709_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyLicenseAcquisitionServiceRequest):
        Array<IPlayReadyLicenseAcquisitionServiceRequest?> = (elements as
        Array<IPlayReadyLicenseAcquisitionServiceRequest?>).castToImpl<IPlayReadyLicenseAcquisitionServiceRequest,IPlayReadyLicenseAcquisitionServiceRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyLicenseAcquisitionServiceRequest?> =
        arrayOfNulls<IPlayReadyLicenseAcquisitionServiceRequest_Impl>(size) as
        Array<IPlayReadyLicenseAcquisitionServiceRequest?>
  }
}
