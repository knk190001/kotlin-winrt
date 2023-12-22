package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IClipboardStatics2.ABI::class)
@Signature("{d2ac1b6a-d29f-554b-b303-f0452345fe02}")
@Guid("d2ac1b6ad29f554bb303f0452345fe02")
@WinRTInterface("d2ac1b6ad29f554bb303f0452345fe02")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClipboardStatics2.ByReference::class)
public interface IClipboardStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetHistoryItemsAsync(): IAsyncOperation<ClipboardHistoryItemsResult?>?

  @InterfaceMethod(1)
  public fun ClearHistory(): Boolean

  @InterfaceMethod(2)
  public fun DeleteItemFromHistory(item: ClipboardHistoryItem?): Boolean

  @InterfaceMethod(3)
  public fun SetHistoryItemAsContent(item: ClipboardHistoryItem?): SetHistoryItemAsContentStatus?

  @InterfaceMethod(4)
  public fun IsHistoryEnabled(): Boolean

  @InterfaceMethod(5)
  public fun IsRoamingEnabled(): Boolean

  @InterfaceMethod(6)
  public fun SetContentWithOptions(content: DataPackage?, options: ClipboardContentOptions?):
      Boolean

  @InterfaceMethod(7)
  public fun add_HistoryChanged(handler: EventHandler<ClipboardHistoryChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_HistoryChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_RoamingEnabledChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_RoamingEnabledChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_HistoryEnabledChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_HistoryEnabledChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClipboardStatics2> {
    public override fun getValue() = ABI.makeIClipboardStatics2(pointer.getPointer(0))

    public fun setValue(value: IClipboardStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClipboardStatics2 {
    public val __170831161_Ptr: Pointer?

    public val _170831161_VtblPtr: Pointer?
      get() = __170831161_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetHistoryItemsAsync(): IAsyncOperation<ClipboardHistoryItemsResult?>? {
      val fnPtr = _170831161_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ClipboardHistoryItemsResult?>>()
      val hr = fn.invokeHR(arrayOf(__170831161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ClipboardHistoryItemsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ClearHistory(): Boolean {
      val fnPtr = _170831161_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__170831161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun DeleteItemFromHistory(item: ClipboardHistoryItem?): Boolean {
      val fnPtr = _170831161_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__170831161_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun SetHistoryItemAsContent(item: ClipboardHistoryItem?):
        SetHistoryItemAsContentStatus? {
      val fnPtr = _170831161_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SetHistoryItemAsContentStatus>()
      val hr = fn.invokeHR(arrayOf(__170831161_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SetHistoryItemAsContentStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun IsHistoryEnabled(): Boolean {
      val fnPtr = _170831161_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__170831161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun IsRoamingEnabled(): Boolean {
      val fnPtr = _170831161_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__170831161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun SetContentWithOptions(content: DataPackage?,
        options: ClipboardContentOptions?): Boolean {
      val fnPtr = _170831161_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__170831161_Ptr, marshalToNative(content),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override
        fun add_HistoryChanged(handler: EventHandler<ClipboardHistoryChangedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _170831161_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__170831161_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_HistoryChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _170831161_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__170831161_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_RoamingEnabledChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _170831161_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__170831161_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_RoamingEnabledChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _170831161_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__170831161_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_HistoryEnabledChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _170831161_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__170831161_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_HistoryEnabledChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _170831161_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__170831161_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClipboardStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __170831161_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClipboardStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2ac1b6ad29f554bb303f0452345fe02")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClipboardStatics2(ptr: Pointer?): WithDefault = IClipboardStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClipboardStatics2 {
      val address = segment.toRawLongValue()
      return makeIClipboardStatics2(Pointer(address))
    }

    public override fun toNative(obj: IClipboardStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__170831161_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClipboardStatics2): Array<IClipboardStatics2?> =
        (elements as
        Array<IClipboardStatics2?>).castToImpl<IClipboardStatics2,IClipboardStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClipboardStatics2?> =
        arrayOfNulls<IClipboardStatics2_Impl>(size) as Array<IClipboardStatics2?>
  }
}
