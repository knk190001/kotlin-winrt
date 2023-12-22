package Windows.UI.Core

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Size
import Windows.Foundation.TypedEventHandler
import Windows.UI.Popups.IUICommand
import Windows.UI.Popups.UICommandInvokedHandler
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICoreWindowFlyout.ABI::class)
@Signature("{e89d854d-2050-40bb-b344-f6f355eeb314}")
@Guid("e89d854d205040bbb344f6f355eeb314")
@WinRTInterface("e89d854d205040bbb344f6f355eeb314")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindowFlyout.ByReference::class)
public interface ICoreWindowFlyout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Showing(handler: TypedEventHandler<CoreWindow?,
      CoreWindowPopupShowingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Showing(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_MaxSize(): Size?

  @InterfaceMethod(3)
  public fun get_MinSize(): Size?

  @InterfaceMethod(4)
  public fun get_Title(): String?

  @InterfaceMethod(5)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_IsInteractionDelayed(): Int

  @InterfaceMethod(7)
  public fun put_IsInteractionDelayed(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_Commands(): IVector<IUICommand?>?

  @InterfaceMethod(9)
  public fun get_DefaultCommandIndex(): WinDef.UINT

  @InterfaceMethod(10)
  public fun put_DefaultCommandIndex(value: WinDef.UINT): Unit

  @InterfaceMethod(11)
  public fun get_BackButtonCommand(): UICommandInvokedHandler?

  @InterfaceMethod(12)
  public fun put_BackButtonCommand(value: UICommandInvokedHandler?): Unit

  @InterfaceMethod(13)
  public fun ShowAsync(): IAsyncOperation<IUICommand?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWindowFlyout> {
    public override fun getValue() = ABI.makeICoreWindowFlyout(pointer.getPointer(0))

    public fun setValue(value: ICoreWindowFlyout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindowFlyout {
    public val __740998437_Ptr: Pointer?

    public val _740998437_VtblPtr: Pointer?
      get() = __740998437_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Showing(handler: TypedEventHandler<CoreWindow?,
        CoreWindowPopupShowingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _740998437_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__740998437_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Showing(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _740998437_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740998437_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxSize(): Size? {
      val fnPtr = _740998437_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__740998437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MinSize(): Size? {
      val fnPtr = _740998437_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__740998437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Title(): String? {
      val fnPtr = _740998437_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__740998437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _740998437_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740998437_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsInteractionDelayed(): Int {
      val fnPtr = _740998437_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__740998437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsInteractionDelayed(value: Int): Unit {
      val fnPtr = _740998437_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740998437_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Commands(): IVector<IUICommand?>? {
      val fnPtr = _740998437_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUICommand?>>()
      val hr = fn.invokeHR(arrayOf(__740998437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUICommand?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_DefaultCommandIndex(): WinDef.UINT {
      val fnPtr = _740998437_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__740998437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_DefaultCommandIndex(value: WinDef.UINT): Unit {
      val fnPtr = _740998437_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740998437_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_BackButtonCommand(): UICommandInvokedHandler? {
      val fnPtr = _740998437_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UICommandInvokedHandler>()
      val hr = fn.invokeHR(arrayOf(__740998437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UICommandInvokedHandler>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_BackButtonCommand(value: UICommandInvokedHandler?): Unit {
      val fnPtr = _740998437_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__740998437_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun ShowAsync(): IAsyncOperation<IUICommand?>? {
      val fnPtr = _740998437_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IUICommand?>>()
      val hr = fn.invokeHR(arrayOf(__740998437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IUICommand?>>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWindowFlyout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __740998437_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindowFlyout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e89d854d205040bbb344f6f355eeb314")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindowFlyout(ptr: Pointer?): WithDefault = ICoreWindowFlyout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindowFlyout {
      val address = segment.toRawLongValue()
      return makeICoreWindowFlyout(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindowFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__740998437_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindowFlyout): Array<ICoreWindowFlyout?> = (elements
        as Array<ICoreWindowFlyout?>).castToImpl<ICoreWindowFlyout,ICoreWindowFlyout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindowFlyout?> =
        arrayOfNulls<ICoreWindowFlyout_Impl>(size) as Array<ICoreWindowFlyout?>
  }
}
