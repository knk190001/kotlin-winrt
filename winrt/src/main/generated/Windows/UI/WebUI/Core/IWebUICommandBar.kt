package Windows.UI.WebUI.Core

import Windows.Foundation.Collections.IObservableVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Size
import Windows.UI.Color
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebUICommandBar.ABI::class)
@Signature("{a4fc0016-dbe5-41ad-8d7b-14698bd6911d}")
@Guid("a4fc0016dbe541ad8d7b14698bd6911d")
@WinRTInterface("a4fc0016dbe541ad8d7b14698bd6911d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUICommandBar.ByReference::class)
public interface IWebUICommandBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Visible(): Boolean

  @InterfaceMethod(1)
  public fun put_Visible(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Opacity(): Double

  @InterfaceMethod(3)
  public fun put_Opacity(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_ForegroundColor(): Color?

  @InterfaceMethod(5)
  public fun put_ForegroundColor(value: Color?): Unit

  @InterfaceMethod(6)
  public fun get_BackgroundColor(): Color?

  @InterfaceMethod(7)
  public fun put_BackgroundColor(value: Color?): Unit

  @InterfaceMethod(8)
  public fun get_ClosedDisplayMode(): WebUICommandBarClosedDisplayMode?

  @InterfaceMethod(9)
  public fun put_ClosedDisplayMode(value: WebUICommandBarClosedDisplayMode?): Unit

  @InterfaceMethod(10)
  public fun get_IsOpen(): Boolean

  @InterfaceMethod(11)
  public fun put_IsOpen(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_Size(): Size?

  @InterfaceMethod(13)
  public fun get_PrimaryCommands(): IObservableVector<IWebUICommandBarElement?>?

  @InterfaceMethod(14)
  public fun get_SecondaryCommands(): IObservableVector<IWebUICommandBarElement?>?

  @InterfaceMethod(15)
  public fun add_MenuOpened(handler: MenuOpenedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_MenuOpened(value: EventRegistrationToken?): Unit

  @InterfaceMethod(17)
  public fun add_MenuClosed(handler: MenuClosedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_MenuClosed(value: EventRegistrationToken?): Unit

  @InterfaceMethod(19)
  public fun add_SizeChanged(handler: SizeChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(20)
  public fun remove_SizeChanged(value: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUICommandBar> {
    public override fun getValue() = ABI.makeIWebUICommandBar(pointer.getPointer(0))

    public fun setValue(value: IWebUICommandBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUICommandBar {
    public val __438915259_Ptr: Pointer?

    public val _438915259_VtblPtr: Pointer?
      get() = __438915259_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Visible(): Boolean {
      val fnPtr = _438915259_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Visible(value: Boolean): Unit {
      val fnPtr = _438915259_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Opacity(): Double {
      val fnPtr = _438915259_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Opacity(value: Double): Unit {
      val fnPtr = _438915259_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ForegroundColor(): Color? {
      val fnPtr = _438915259_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ForegroundColor(value: Color?): Unit {
      val fnPtr = _438915259_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_BackgroundColor(): Color? {
      val fnPtr = _438915259_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_BackgroundColor(value: Color?): Unit {
      val fnPtr = _438915259_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ClosedDisplayMode(): WebUICommandBarClosedDisplayMode? {
      val fnPtr = _438915259_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebUICommandBarClosedDisplayMode>()
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebUICommandBarClosedDisplayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ClosedDisplayMode(value: WebUICommandBarClosedDisplayMode?): Unit {
      val fnPtr = _438915259_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsOpen(): Boolean {
      val fnPtr = _438915259_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsOpen(value: Boolean): Unit {
      val fnPtr = _438915259_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Size(): Size? {
      val fnPtr = _438915259_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_PrimaryCommands(): IObservableVector<IWebUICommandBarElement?>? {
      val fnPtr = _438915259_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<IWebUICommandBarElement?>>()
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IObservableVector<IWebUICommandBarElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_SecondaryCommands(): IObservableVector<IWebUICommandBarElement?>? {
      val fnPtr = _438915259_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<IWebUICommandBarElement?>>()
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IObservableVector<IWebUICommandBarElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun add_MenuOpened(handler: MenuOpenedEventHandler?): EventRegistrationToken? {
      val fnPtr = _438915259_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_MenuOpened(value: EventRegistrationToken?): Unit {
      val fnPtr = _438915259_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun add_MenuClosed(handler: MenuClosedEventHandler?): EventRegistrationToken? {
      val fnPtr = _438915259_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_MenuClosed(value: EventRegistrationToken?): Unit {
      val fnPtr = _438915259_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun add_SizeChanged(handler: SizeChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _438915259_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun remove_SizeChanged(value: EventRegistrationToken?): Unit {
      val fnPtr = _438915259_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__438915259_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebUICommandBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __438915259_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUICommandBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4fc0016dbe541ad8d7b14698bd6911d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUICommandBar(ptr: Pointer?): WithDefault = IWebUICommandBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUICommandBar {
      val address = segment.toRawLongValue()
      return makeIWebUICommandBar(Pointer(address))
    }

    public override fun toNative(obj: IWebUICommandBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__438915259_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUICommandBar): Array<IWebUICommandBar?> = (elements as
        Array<IWebUICommandBar?>).castToImpl<IWebUICommandBar,IWebUICommandBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUICommandBar?> =
        arrayOfNulls<IWebUICommandBar_Impl>(size) as Array<IWebUICommandBar?>
  }
}
