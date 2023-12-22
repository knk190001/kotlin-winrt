package Windows.Media.Protection.PlayReady

import Windows.Foundation.HResult
import Windows.Foundation.IAsyncAction
import Windows.Foundation.Uri
import Windows.Media.Protection.IMediaProtectionServiceRequest
import Windows.Media.Protection.IMediaProtectionServiceRequest.ABI.IID
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
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadyServiceRequest.ABI::class)
@Signature("{8bad2836-a703-45a6-a180-76f3565aa725}")
@Guid("8bad2836a70345a6a18076f3565aa725")
@WinRTInterface("8bad2836a70345a6a18076f3565aa725")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyServiceRequest.ByReference::class)
public interface IPlayReadyServiceRequest : NativeMapped, IWinRTInterface,
    IMediaProtectionServiceRequest {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun put_Uri(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_ResponseCustomData(): String?

  @InterfaceMethod(3)
  public fun get_ChallengeCustomData(): String?

  @InterfaceMethod(4)
  public fun put_ChallengeCustomData(value: String?): Unit

  @InterfaceMethod(5)
  public fun BeginServiceRequest(): IAsyncAction?

  @InterfaceMethod(6)
  public fun NextServiceRequest(): IPlayReadyServiceRequest?

  @InterfaceMethod(7)
  public fun GenerateManualEnablingChallenge(): PlayReadySoapMessage?

  @InterfaceMethod(8)
  public fun ProcessManualEnablingResponse(responseBytes: Array<Byte>): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyServiceRequest> {
    public override fun getValue() = ABI.makeIPlayReadyServiceRequest(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyServiceRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyServiceRequest,
      IMediaProtectionServiceRequest.WithDefault {
    public val __573428623_Ptr: Pointer?

    public val _573428623_VtblPtr: Pointer?
      get() = __573428623_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _573428623_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__573428623_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Uri(value: Uri?): Unit {
      val fnPtr = _573428623_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__573428623_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ResponseCustomData(): String? {
      val fnPtr = _573428623_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__573428623_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ChallengeCustomData(): String? {
      val fnPtr = _573428623_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__573428623_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ChallengeCustomData(value: String?): Unit {
      val fnPtr = _573428623_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__573428623_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun BeginServiceRequest(): IAsyncAction? {
      val fnPtr = _573428623_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__573428623_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun NextServiceRequest(): IPlayReadyServiceRequest? {
      val fnPtr = _573428623_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPlayReadyServiceRequest>()
      val hr = fn.invokeHR(arrayOf(__573428623_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPlayReadyServiceRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GenerateManualEnablingChallenge(): PlayReadySoapMessage? {
      val fnPtr = _573428623_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadySoapMessage>()
      val hr = fn.invokeHR(arrayOf(__573428623_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadySoapMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ProcessManualEnablingResponse(responseBytes: Array<Byte>): HResult? {
      val fnPtr = _573428623_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__573428623_Ptr,
          responseBytes.size,marshalToNative(responseBytes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadyServiceRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaProtectionServiceRequest {
    public override val __454607004_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_573428623_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __573428623_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyServiceRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8bad2836a70345a6a18076f3565aa725")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyServiceRequest(ptr: Pointer?): WithDefault =
        IPlayReadyServiceRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyServiceRequest {
      val address = segment.toRawLongValue()
      return makeIPlayReadyServiceRequest(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyServiceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__573428623_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyServiceRequest):
        Array<IPlayReadyServiceRequest?> = (elements as
        Array<IPlayReadyServiceRequest?>).castToImpl<IPlayReadyServiceRequest,IPlayReadyServiceRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyServiceRequest?> =
        arrayOfNulls<IPlayReadyServiceRequest_Impl>(size) as Array<IPlayReadyServiceRequest?>
  }
}
