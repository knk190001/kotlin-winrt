package Windows.Media.Protection.PlayReady

import Windows.Foundation.DateTime
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
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadySecureStopServiceRequest.ABI::class)
@Signature("{b5501ee5-01bf-4401-9677-05630a6a4cc8}")
@Guid("b5501ee501bf4401967705630a6a4cc8")
@WinRTInterface("b5501ee501bf4401967705630a6a4cc8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadySecureStopServiceRequest.ByReference::class)
public interface IPlayReadySecureStopServiceRequest : NativeMapped, IWinRTInterface,
    IPlayReadyServiceRequest, IMediaProtectionServiceRequest {
  @InterfaceMethod(0)
  public fun get_SessionID(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_StartTime(): DateTime?

  @InterfaceMethod(2)
  public fun get_UpdateTime(): DateTime?

  @InterfaceMethod(3)
  public fun get_Stopped(): Boolean

  @InterfaceMethod(4)
  public fun get_PublisherCertificate(): Array<Byte>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadySecureStopServiceRequest> {
    public override fun getValue() =
        ABI.makeIPlayReadySecureStopServiceRequest(pointer.getPointer(0))

    public fun setValue(value: IPlayReadySecureStopServiceRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadySecureStopServiceRequest,
      IPlayReadyServiceRequest.WithDefault, IMediaProtectionServiceRequest.WithDefault {
    public val __810857928_Ptr: Pointer?

    public val _810857928_VtblPtr: Pointer?
      get() = __810857928_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SessionID(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _810857928_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__810857928_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StartTime(): DateTime? {
      val fnPtr = _810857928_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__810857928_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_UpdateTime(): DateTime? {
      val fnPtr = _810857928_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__810857928_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Stopped(): Boolean {
      val fnPtr = _810857928_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__810857928_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_PublisherCertificate(): Array<Byte>? {
      val fnPtr = _810857928_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__810857928_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class IPlayReadySecureStopServiceRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPlayReadyServiceRequest,
      IMediaProtectionServiceRequest {
    public override val __573428623_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_810857928_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __454607004_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaProtectionServiceRequest.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_810857928_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __810857928_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadySecureStopServiceRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b5501ee501bf4401967705630a6a4cc8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadySecureStopServiceRequest(ptr: Pointer?): WithDefault =
        IPlayReadySecureStopServiceRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadySecureStopServiceRequest {
      val address = segment.toRawLongValue()
      return makeIPlayReadySecureStopServiceRequest(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadySecureStopServiceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__810857928_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadySecureStopServiceRequest):
        Array<IPlayReadySecureStopServiceRequest?> = (elements as
        Array<IPlayReadySecureStopServiceRequest?>).castToImpl<IPlayReadySecureStopServiceRequest,IPlayReadySecureStopServiceRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadySecureStopServiceRequest?> =
        arrayOfNulls<IPlayReadySecureStopServiceRequest_Impl>(size) as
        Array<IPlayReadySecureStopServiceRequest?>
  }
}
