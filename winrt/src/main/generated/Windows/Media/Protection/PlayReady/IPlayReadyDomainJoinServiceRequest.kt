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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadyDomainJoinServiceRequest.ABI::class)
@Signature("{171b4a5a-405f-4739-b040-67b9f0c38758}")
@Guid("171b4a5a405f4739b04067b9f0c38758")
@WinRTInterface("171b4a5a405f4739b04067b9f0c38758")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyDomainJoinServiceRequest.ByReference::class)
public interface IPlayReadyDomainJoinServiceRequest : NativeMapped, IWinRTInterface,
    IPlayReadyServiceRequest, IMediaProtectionServiceRequest {
  @InterfaceMethod(0)
  public fun get_DomainAccountId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun put_DomainAccountId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(2)
  public fun get_DomainFriendlyName(): String?

  @InterfaceMethod(3)
  public fun put_DomainFriendlyName(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_DomainServiceId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(5)
  public fun put_DomainServiceId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyDomainJoinServiceRequest> {
    public override fun getValue() =
        ABI.makeIPlayReadyDomainJoinServiceRequest(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyDomainJoinServiceRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyDomainJoinServiceRequest,
      IPlayReadyServiceRequest.WithDefault, IMediaProtectionServiceRequest.WithDefault {
    public val __875300093_Ptr: Pointer?

    public val _875300093_VtblPtr: Pointer?
      get() = __875300093_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DomainAccountId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _875300093_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__875300093_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DomainAccountId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _875300093_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__875300093_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DomainFriendlyName(): String? {
      val fnPtr = _875300093_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__875300093_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DomainFriendlyName(value: String?): Unit {
      val fnPtr = _875300093_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__875300093_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DomainServiceId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _875300093_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__875300093_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_DomainServiceId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _875300093_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__875300093_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPlayReadyDomainJoinServiceRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPlayReadyServiceRequest,
      IMediaProtectionServiceRequest {
    public override val __573428623_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_875300093_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __454607004_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaProtectionServiceRequest.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_875300093_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __875300093_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyDomainJoinServiceRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("171b4a5a405f4739b04067b9f0c38758")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyDomainJoinServiceRequest(ptr: Pointer?): WithDefault =
        IPlayReadyDomainJoinServiceRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyDomainJoinServiceRequest {
      val address = segment.toRawLongValue()
      return makeIPlayReadyDomainJoinServiceRequest(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyDomainJoinServiceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__875300093_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyDomainJoinServiceRequest):
        Array<IPlayReadyDomainJoinServiceRequest?> = (elements as
        Array<IPlayReadyDomainJoinServiceRequest?>).castToImpl<IPlayReadyDomainJoinServiceRequest,IPlayReadyDomainJoinServiceRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyDomainJoinServiceRequest?> =
        arrayOfNulls<IPlayReadyDomainJoinServiceRequest_Impl>(size) as
        Array<IPlayReadyDomainJoinServiceRequest?>
  }
}
