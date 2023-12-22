package Microsoft.UI.Xaml.Controls.Primitives

import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IThumb.ABI::class)
@Signature("{9b540ae4-98ed-5a19-9512-a56878c52fee}")
@Guid("9b540ae498ed5a199512a56878c52fee")
@WinRTInterface("9b540ae498ed5a199512a56878c52fee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IThumb.ByReference::class)
public interface IThumb : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDragging(): Boolean

  @InterfaceMethod(1)
  public fun add_DragStarted(handler: DragStartedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_DragStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_DragDelta(handler: DragDeltaEventHandler?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_DragDelta(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_DragCompleted(handler: DragCompletedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_DragCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun CancelDrag(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IThumb> {
    public override fun getValue() = ABI.makeIThumb(pointer.getPointer(0))

    public fun setValue(value: IThumb_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IThumb {
    public val __826608677_Ptr: Pointer?

    public val _826608677_VtblPtr: Pointer?
      get() = __826608677_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDragging(): Boolean {
      val fnPtr = _826608677_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__826608677_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun add_DragStarted(handler: DragStartedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _826608677_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__826608677_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_DragStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _826608677_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__826608677_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_DragDelta(handler: DragDeltaEventHandler?): EventRegistrationToken? {
      val fnPtr = _826608677_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__826608677_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_DragDelta(token: EventRegistrationToken?): Unit {
      val fnPtr = _826608677_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__826608677_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_DragCompleted(handler: DragCompletedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _826608677_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__826608677_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_DragCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _826608677_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__826608677_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun CancelDrag(): Unit {
      val fnPtr = _826608677_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__826608677_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IThumb_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __826608677_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IThumb, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b540ae498ed5a199512a56878c52fee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIThumb(ptr: Pointer?): WithDefault = IThumb_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IThumb {
      val address = segment.toRawLongValue()
      return makeIThumb(Pointer(address))
    }

    public override fun toNative(obj: IThumb): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__826608677_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IThumb): Array<IThumb?> = (elements as
        Array<IThumb?>).castToImpl<IThumb,IThumb_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IThumb?> = arrayOfNulls<IThumb_Impl>(size) as
        Array<IThumb?>
  }
}
