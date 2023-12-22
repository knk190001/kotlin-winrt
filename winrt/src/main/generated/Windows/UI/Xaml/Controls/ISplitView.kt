package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Controls.Primitives.SplitViewTemplateSettings
import Windows.UI.Xaml.Media.Brush
import Windows.UI.Xaml.UIElement
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISplitView.ABI::class)
@Signature("{97222f31-3844-429e-939c-1673155322a1}")
@Guid("97222f313844429e939c1673155322a1")
@WinRTInterface("97222f313844429e939c1673155322a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitView.ByReference::class)
public interface ISplitView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): UIElement?

  @InterfaceMethod(1)
  public fun put_Content(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_Pane(): UIElement?

  @InterfaceMethod(3)
  public fun put_Pane(value: UIElement?): Unit

  @InterfaceMethod(4)
  public fun get_IsPaneOpen(): Boolean

  @InterfaceMethod(5)
  public fun put_IsPaneOpen(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_OpenPaneLength(): Double

  @InterfaceMethod(7)
  public fun put_OpenPaneLength(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_CompactPaneLength(): Double

  @InterfaceMethod(9)
  public fun put_CompactPaneLength(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_PanePlacement(): SplitViewPanePlacement?

  @InterfaceMethod(11)
  public fun put_PanePlacement(value: SplitViewPanePlacement?): Unit

  @InterfaceMethod(12)
  public fun get_DisplayMode(): SplitViewDisplayMode?

  @InterfaceMethod(13)
  public fun put_DisplayMode(value: SplitViewDisplayMode?): Unit

  @InterfaceMethod(14)
  public fun get_TemplateSettings(): SplitViewTemplateSettings?

  @InterfaceMethod(15)
  public fun get_PaneBackground(): Brush?

  @InterfaceMethod(16)
  public fun put_PaneBackground(value: Brush?): Unit

  @InterfaceMethod(17)
  public fun add_PaneClosing(handler: TypedEventHandler<SplitView?,
      SplitViewPaneClosingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_PaneClosing(token: EventRegistrationToken?): Unit

  @InterfaceMethod(19)
  public fun add_PaneClosed(handler: TypedEventHandler<SplitView?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(20)
  public fun remove_PaneClosed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISplitView> {
    public override fun getValue() = ABI.makeISplitView(pointer.getPointer(0))

    public fun setValue(value: ISplitView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitView {
    public val __1861472189_Ptr: Pointer?

    public val _1861472189_VtblPtr: Pointer?
      get() = __1861472189_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): UIElement? {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Content(value: UIElement?): Unit {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Pane(): UIElement? {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Pane(value: UIElement?): Unit {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsPaneOpen(): Boolean {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsPaneOpen(value: Boolean): Unit {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_OpenPaneLength(): Double {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_OpenPaneLength(value: Double): Unit {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_CompactPaneLength(): Double {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_CompactPaneLength(value: Double): Unit {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_PanePlacement(): SplitViewPanePlacement? {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SplitViewPanePlacement>()
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SplitViewPanePlacement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_PanePlacement(value: SplitViewPanePlacement?): Unit {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_DisplayMode(): SplitViewDisplayMode? {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SplitViewDisplayMode>()
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SplitViewDisplayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_DisplayMode(value: SplitViewDisplayMode?): Unit {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_TemplateSettings(): SplitViewTemplateSettings? {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SplitViewTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SplitViewTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_PaneBackground(): Brush? {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_PaneBackground(value: Brush?): Unit {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun add_PaneClosing(handler: TypedEventHandler<SplitView?,
        SplitViewPaneClosingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_PaneClosing(token: EventRegistrationToken?): Unit {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun add_PaneClosed(handler: TypedEventHandler<SplitView?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun remove_PaneClosed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1861472189_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1861472189_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISplitView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1861472189_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("97222f313844429e939c1673155322a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitView(ptr: Pointer?): WithDefault = ISplitView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitView {
      val address = segment.toRawLongValue()
      return makeISplitView(Pointer(address))
    }

    public override fun toNative(obj: ISplitView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1861472189_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitView): Array<ISplitView?> = (elements as
        Array<ISplitView?>).castToImpl<ISplitView,ISplitView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitView?> = arrayOfNulls<ISplitView_Impl>(size)
        as Array<ISplitView?>
  }
}
