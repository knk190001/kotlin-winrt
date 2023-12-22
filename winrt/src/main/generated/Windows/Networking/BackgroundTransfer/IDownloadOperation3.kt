package Windows.Networking.BackgroundTransfer

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.TypedEventHandler
import Windows.Foundation.Uri
import Windows.Storage.Streams.IRandomAccessStreamReference
import Windows.Web.WebErrorStatus
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDownloadOperation3.ABI::class)
@Signature("{5027351c-7d5e-4adc-b8d3-df5c6031b9cc}")
@Guid("5027351c7d5e4adcb8d3df5c6031b9cc")
@WinRTInterface("5027351c7d5e4adcb8d3df5c6031b9cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDownloadOperation3.ByReference::class)
public interface IDownloadOperation3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsRandomAccessRequired(): Boolean

  @InterfaceMethod(1)
  public fun put_IsRandomAccessRequired(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun GetResultRandomAccessStreamReference(): IRandomAccessStreamReference?

  @InterfaceMethod(3)
  public fun GetDownloadedRanges(): IVector<BackgroundTransferFileRange?>?

  @InterfaceMethod(4)
  public fun add_RangesDownloaded(eventHandler: TypedEventHandler<DownloadOperation?,
      BackgroundTransferRangesDownloadedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_RangesDownloaded(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun put_RequestedUri(value: Uri?): Unit

  @InterfaceMethod(7)
  public fun get_RecoverableWebErrorStatuses(): IVector<WebErrorStatus?>?

  @InterfaceMethod(8)
  public fun get_CurrentWebErrorStatus(): IReference<WebErrorStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDownloadOperation3> {
    public override fun getValue() = ABI.makeIDownloadOperation3(pointer.getPointer(0))

    public fun setValue(value: IDownloadOperation3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDownloadOperation3 {
    public val __214957909_Ptr: Pointer?

    public val _214957909_VtblPtr: Pointer?
      get() = __214957909_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsRandomAccessRequired(): Boolean {
      val fnPtr = _214957909_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__214957909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsRandomAccessRequired(value: Boolean): Unit {
      val fnPtr = _214957909_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__214957909_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetResultRandomAccessStreamReference(): IRandomAccessStreamReference? {
      val fnPtr = _214957909_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__214957909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDownloadedRanges(): IVector<BackgroundTransferFileRange?>? {
      val fnPtr = _214957909_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<BackgroundTransferFileRange?>>()
      val hr = fn.invokeHR(arrayOf(__214957909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<BackgroundTransferFileRange?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_RangesDownloaded(eventHandler: TypedEventHandler<DownloadOperation?,
        BackgroundTransferRangesDownloadedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _214957909_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__214957909_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_RangesDownloaded(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _214957909_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__214957909_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun put_RequestedUri(value: Uri?): Unit {
      val fnPtr = _214957909_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__214957909_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_RecoverableWebErrorStatuses(): IVector<WebErrorStatus?>? {
      val fnPtr = _214957909_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WebErrorStatus?>>()
      val hr = fn.invokeHR(arrayOf(__214957909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<WebErrorStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_CurrentWebErrorStatus(): IReference<WebErrorStatus?>? {
      val fnPtr = _214957909_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WebErrorStatus?>>()
      val hr = fn.invokeHR(arrayOf(__214957909_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WebErrorStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IDownloadOperation3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __214957909_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDownloadOperation3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5027351c7d5e4adcb8d3df5c6031b9cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDownloadOperation3(ptr: Pointer?): WithDefault = IDownloadOperation3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDownloadOperation3 {
      val address = segment.toRawLongValue()
      return makeIDownloadOperation3(Pointer(address))
    }

    public override fun toNative(obj: IDownloadOperation3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__214957909_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDownloadOperation3): Array<IDownloadOperation3?> =
        (elements as
        Array<IDownloadOperation3?>).castToImpl<IDownloadOperation3,IDownloadOperation3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDownloadOperation3?> =
        arrayOfNulls<IDownloadOperation3_Impl>(size) as Array<IDownloadOperation3?>
  }
}
