package Microsoft.UI.Input

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInputPointerSource.ABI::class)
@Signature("{6a6c2764-c3f4-5be5-8447-c9a98766c240}")
@Guid("6a6c2764c3f45be58447c9a98766c240")
@WinRTInterface("6a6c2764c3f45be58447c9a98766c240")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputPointerSource.ByReference::class)
public interface IInputPointerSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Cursor(): InputCursor?

  @InterfaceMethod(1)
  public fun put_Cursor(value: InputCursor?): Unit

  @InterfaceMethod(2)
  public fun get_DeviceKinds(): InputPointerSourceDeviceKinds?

  @InterfaceMethod(3)
  public fun add_PointerCaptureLost(handler: TypedEventHandler<InputPointerSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_PointerCaptureLost(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_PointerEntered(handler: TypedEventHandler<InputPointerSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_PointerEntered(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_PointerExited(handler: TypedEventHandler<InputPointerSource?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_PointerExited(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_PointerMoved(handler: TypedEventHandler<InputPointerSource?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_PointerMoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_PointerPressed(handler: TypedEventHandler<InputPointerSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_PointerPressed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_PointerReleased(handler: TypedEventHandler<InputPointerSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_PointerReleased(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_PointerRoutedAway(handler: TypedEventHandler<InputPointerSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_PointerRoutedAway(token: EventRegistrationToken?): Unit

  @InterfaceMethod(17)
  public fun add_PointerRoutedReleased(handler: TypedEventHandler<InputPointerSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_PointerRoutedReleased(token: EventRegistrationToken?): Unit

  @InterfaceMethod(19)
  public fun add_PointerRoutedTo(handler: TypedEventHandler<InputPointerSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(20)
  public fun remove_PointerRoutedTo(token: EventRegistrationToken?): Unit

  @InterfaceMethod(21)
  public fun add_PointerWheelChanged(handler: TypedEventHandler<InputPointerSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(22)
  public fun remove_PointerWheelChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputPointerSource> {
    public override fun getValue() = ABI.makeIInputPointerSource(pointer.getPointer(0))

    public fun setValue(value: IInputPointerSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputPointerSource {
    public val __241873337_Ptr: Pointer?

    public val _241873337_VtblPtr: Pointer?
      get() = __241873337_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Cursor(): InputCursor? {
      val fnPtr = _241873337_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputCursor>()
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputCursor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Cursor(value: InputCursor?): Unit {
      val fnPtr = _241873337_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DeviceKinds(): InputPointerSourceDeviceKinds? {
      val fnPtr = _241873337_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputPointerSourceDeviceKinds>()
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputPointerSourceDeviceKinds>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_PointerCaptureLost(handler: TypedEventHandler<InputPointerSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _241873337_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_PointerCaptureLost(token: EventRegistrationToken?): Unit {
      val fnPtr = _241873337_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_PointerEntered(handler: TypedEventHandler<InputPointerSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _241873337_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_PointerEntered(token: EventRegistrationToken?): Unit {
      val fnPtr = _241873337_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_PointerExited(handler: TypedEventHandler<InputPointerSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _241873337_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_PointerExited(token: EventRegistrationToken?): Unit {
      val fnPtr = _241873337_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_PointerMoved(handler: TypedEventHandler<InputPointerSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _241873337_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_PointerMoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _241873337_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_PointerPressed(handler: TypedEventHandler<InputPointerSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _241873337_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_PointerPressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _241873337_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_PointerReleased(handler: TypedEventHandler<InputPointerSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _241873337_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_PointerReleased(token: EventRegistrationToken?): Unit {
      val fnPtr = _241873337_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_PointerRoutedAway(handler: TypedEventHandler<InputPointerSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _241873337_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_PointerRoutedAway(token: EventRegistrationToken?): Unit {
      val fnPtr = _241873337_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun add_PointerRoutedReleased(handler: TypedEventHandler<InputPointerSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _241873337_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_PointerRoutedReleased(token: EventRegistrationToken?): Unit {
      val fnPtr = _241873337_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun add_PointerRoutedTo(handler: TypedEventHandler<InputPointerSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _241873337_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun remove_PointerRoutedTo(token: EventRegistrationToken?): Unit {
      val fnPtr = _241873337_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun add_PointerWheelChanged(handler: TypedEventHandler<InputPointerSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _241873337_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun remove_PointerWheelChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _241873337_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241873337_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInputPointerSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __241873337_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputPointerSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a6c2764c3f45be58447c9a98766c240")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputPointerSource(ptr: Pointer?): WithDefault = IInputPointerSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputPointerSource {
      val address = segment.toRawLongValue()
      return makeIInputPointerSource(Pointer(address))
    }

    public override fun toNative(obj: IInputPointerSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__241873337_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputPointerSource): Array<IInputPointerSource?> =
        (elements as
        Array<IInputPointerSource?>).castToImpl<IInputPointerSource,IInputPointerSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputPointerSource?> =
        arrayOfNulls<IInputPointerSource_Impl>(size) as Array<IInputPointerSource?>
  }
}
