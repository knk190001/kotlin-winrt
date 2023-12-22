package Microsoft.Web.WebView2.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2DownloadOperation.ABI::class)
@Signature("{afe73e6b-e760-5a06-9bf6-1e743c13cd2d}")
@Guid("afe73e6be7605a069bf61e743c13cd2d")
@WinRTInterface("afe73e6be7605a069bf61e743c13cd2d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2DownloadOperation.ByReference::class)
public interface ICoreWebView2DownloadOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): String?

  @InterfaceMethod(1)
  public fun get_ContentDisposition(): String?

  @InterfaceMethod(2)
  public fun get_MimeType(): String?

  @InterfaceMethod(3)
  public fun get_TotalBytesToReceive(): Long

  @InterfaceMethod(4)
  public fun get_BytesReceived(): Long

  @InterfaceMethod(5)
  public fun get_EstimatedEndTime(): String?

  @InterfaceMethod(6)
  public fun get_ResultFilePath(): String?

  @InterfaceMethod(7)
  public fun get_State(): CoreWebView2DownloadState?

  @InterfaceMethod(8)
  public fun get_InterruptReason(): CoreWebView2DownloadInterruptReason?

  @InterfaceMethod(9)
  public fun get_CanResume(): Boolean

  @InterfaceMethod(10)
  public fun add_BytesReceivedChanged(handler: TypedEventHandler<CoreWebView2DownloadOperation?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_BytesReceivedChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_EstimatedEndTimeChanged(handler: TypedEventHandler<CoreWebView2DownloadOperation?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_EstimatedEndTimeChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_StateChanged(handler: TypedEventHandler<CoreWebView2DownloadOperation?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_StateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun Cancel(): Unit

  @InterfaceMethod(17)
  public fun Pause(): Unit

  @InterfaceMethod(18)
  public fun Resume(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2DownloadOperation> {
    public override fun getValue() = ABI.makeICoreWebView2DownloadOperation(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2DownloadOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2DownloadOperation {
    public val __1199417800_Ptr: Pointer?

    public val _1199417800_VtblPtr: Pointer?
      get() = __1199417800_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): String? {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ContentDisposition(): String? {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MimeType(): String? {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TotalBytesToReceive(): Long {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_BytesReceived(): Long {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_EstimatedEndTime(): String? {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ResultFilePath(): String? {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_State(): CoreWebView2DownloadState? {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2DownloadState>()
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2DownloadState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_InterruptReason(): CoreWebView2DownloadInterruptReason? {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2DownloadInterruptReason>()
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2DownloadInterruptReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_CanResume(): Boolean {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override
        fun add_BytesReceivedChanged(handler: TypedEventHandler<CoreWebView2DownloadOperation?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_BytesReceivedChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override
        fun add_EstimatedEndTimeChanged(handler: TypedEventHandler<CoreWebView2DownloadOperation?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_EstimatedEndTimeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_StateChanged(handler: TypedEventHandler<CoreWebView2DownloadOperation?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_StateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun Cancel(): Unit {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun Pause(): Unit {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun Resume(): Unit {
      val fnPtr = _1199417800_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1199417800_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2DownloadOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1199417800_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2DownloadOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("afe73e6be7605a069bf61e743c13cd2d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2DownloadOperation(ptr: Pointer?): WithDefault =
        ICoreWebView2DownloadOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2DownloadOperation {
      val address = segment.toRawLongValue()
      return makeICoreWebView2DownloadOperation(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2DownloadOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1199417800_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2DownloadOperation):
        Array<ICoreWebView2DownloadOperation?> = (elements as
        Array<ICoreWebView2DownloadOperation?>).castToImpl<ICoreWebView2DownloadOperation,ICoreWebView2DownloadOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2DownloadOperation?> =
        arrayOfNulls<ICoreWebView2DownloadOperation_Impl>(size) as
        Array<ICoreWebView2DownloadOperation?>
  }
}
