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

@ABIMarker(IPlayReadyDomainLeaveServiceRequest.ABI::class)
@Signature("{062d58be-97ad-4917-aa03-46d4c252d464}")
@Guid("062d58be97ad4917aa0346d4c252d464")
@WinRTInterface("062d58be97ad4917aa0346d4c252d464")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyDomainLeaveServiceRequest.ByReference::class)
public interface IPlayReadyDomainLeaveServiceRequest : NativeMapped, IWinRTInterface,
    IPlayReadyServiceRequest, IMediaProtectionServiceRequest {
  @InterfaceMethod(0)
  public fun get_DomainAccountId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun put_DomainAccountId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(2)
  public fun get_DomainServiceId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(3)
  public fun put_DomainServiceId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyDomainLeaveServiceRequest> {
    public override fun getValue() =
        ABI.makeIPlayReadyDomainLeaveServiceRequest(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyDomainLeaveServiceRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyDomainLeaveServiceRequest,
      IPlayReadyServiceRequest.WithDefault, IMediaProtectionServiceRequest.WithDefault {
    public val __815841096_Ptr: Pointer?

    public val _815841096_VtblPtr: Pointer?
      get() = __815841096_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DomainAccountId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _815841096_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__815841096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DomainAccountId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _815841096_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__815841096_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DomainServiceId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _815841096_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__815841096_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DomainServiceId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _815841096_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__815841096_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPlayReadyDomainLeaveServiceRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPlayReadyServiceRequest,
      IMediaProtectionServiceRequest {
    public override val __573428623_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_815841096_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __454607004_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaProtectionServiceRequest.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_815841096_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __815841096_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyDomainLeaveServiceRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("062d58be97ad4917aa0346d4c252d464")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyDomainLeaveServiceRequest(ptr: Pointer?): WithDefault =
        IPlayReadyDomainLeaveServiceRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyDomainLeaveServiceRequest {
      val address = segment.toRawLongValue()
      return makeIPlayReadyDomainLeaveServiceRequest(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyDomainLeaveServiceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__815841096_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyDomainLeaveServiceRequest):
        Array<IPlayReadyDomainLeaveServiceRequest?> = (elements as
        Array<IPlayReadyDomainLeaveServiceRequest?>).castToImpl<IPlayReadyDomainLeaveServiceRequest,IPlayReadyDomainLeaveServiceRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyDomainLeaveServiceRequest?> =
        arrayOfNulls<IPlayReadyDomainLeaveServiceRequest_Impl>(size) as
        Array<IPlayReadyDomainLeaveServiceRequest?>
  }
}
