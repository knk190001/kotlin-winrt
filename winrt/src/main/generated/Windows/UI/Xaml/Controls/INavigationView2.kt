package Windows.UI.Xaml.Controls

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INavigationView2.ABI::class)
@Signature("{2be49737-7c13-4c44-86c3-8b25e697a80e}")
@Guid("2be497377c134c4486c38b25e697a80e")
@WinRTInterface("2be497377c134c4486c38b25e697a80e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationView2.ByReference::class)
public interface INavigationView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsBackButtonVisible(): NavigationViewBackButtonVisible?

  @InterfaceMethod(1)
  public fun put_IsBackButtonVisible(value: NavigationViewBackButtonVisible?): Unit

  @InterfaceMethod(2)
  public fun get_IsBackEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsBackEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_PaneTitle(): String?

  @InterfaceMethod(5)
  public fun put_PaneTitle(value: String?): Unit

  @InterfaceMethod(6)
  public fun add_BackRequested(handler: TypedEventHandler<NavigationView?,
      NavigationViewBackRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_BackRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_PaneClosed(handler: TypedEventHandler<NavigationView?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_PaneClosed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_PaneClosing(handler: TypedEventHandler<NavigationView?,
      NavigationViewPaneClosingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_PaneClosing(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_PaneOpened(handler: TypedEventHandler<NavigationView?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_PaneOpened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_PaneOpening(handler: TypedEventHandler<NavigationView?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_PaneOpening(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationView2> {
    public override fun getValue() = ABI.makeINavigationView2(pointer.getPointer(0))

    public fun setValue(value: INavigationView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationView2 {
    public val __156191523_Ptr: Pointer?

    public val _156191523_VtblPtr: Pointer?
      get() = __156191523_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsBackButtonVisible(): NavigationViewBackButtonVisible? {
      val fnPtr = _156191523_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewBackButtonVisible>()
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewBackButtonVisible>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_IsBackButtonVisible(value: NavigationViewBackButtonVisible?): Unit {
      val fnPtr = _156191523_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsBackEnabled(): Boolean {
      val fnPtr = _156191523_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsBackEnabled(value: Boolean): Unit {
      val fnPtr = _156191523_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PaneTitle(): String? {
      val fnPtr = _156191523_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PaneTitle(value: String?): Unit {
      val fnPtr = _156191523_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_BackRequested(handler: TypedEventHandler<NavigationView?,
        NavigationViewBackRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _156191523_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_BackRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _156191523_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_PaneClosed(handler: TypedEventHandler<NavigationView?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _156191523_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_PaneClosed(token: EventRegistrationToken?): Unit {
      val fnPtr = _156191523_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_PaneClosing(handler: TypedEventHandler<NavigationView?,
        NavigationViewPaneClosingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _156191523_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_PaneClosing(token: EventRegistrationToken?): Unit {
      val fnPtr = _156191523_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_PaneOpened(handler: TypedEventHandler<NavigationView?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _156191523_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_PaneOpened(token: EventRegistrationToken?): Unit {
      val fnPtr = _156191523_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_PaneOpening(handler: TypedEventHandler<NavigationView?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _156191523_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_PaneOpening(token: EventRegistrationToken?): Unit {
      val fnPtr = _156191523_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191523_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INavigationView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __156191523_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2be497377c134c4486c38b25e697a80e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationView2(ptr: Pointer?): WithDefault = INavigationView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationView2 {
      val address = segment.toRawLongValue()
      return makeINavigationView2(Pointer(address))
    }

    public override fun toNative(obj: INavigationView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__156191523_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationView2): Array<INavigationView2?> = (elements as
        Array<INavigationView2?>).castToImpl<INavigationView2,INavigationView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationView2?> =
        arrayOfNulls<INavigationView2_Impl>(size) as Array<INavigationView2?>
  }
}
