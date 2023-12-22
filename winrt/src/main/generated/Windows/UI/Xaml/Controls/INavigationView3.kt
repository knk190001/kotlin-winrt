package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.UIElement
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

@ABIMarker(INavigationView3.ABI::class)
@Signature("{8fdfab66-9bbc-5fa3-9043-a02bb4f8ef37}")
@Guid("8fdfab669bbc5fa39043a02bb4f8ef37")
@WinRTInterface("8fdfab669bbc5fa39043a02bb4f8ef37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationView3.ByReference::class)
public interface INavigationView3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PaneDisplayMode(): NavigationViewPaneDisplayMode?

  @InterfaceMethod(1)
  public fun put_PaneDisplayMode(value: NavigationViewPaneDisplayMode?): Unit

  @InterfaceMethod(2)
  public fun get_PaneHeader(): UIElement?

  @InterfaceMethod(3)
  public fun put_PaneHeader(value: UIElement?): Unit

  @InterfaceMethod(4)
  public fun get_PaneCustomContent(): UIElement?

  @InterfaceMethod(5)
  public fun put_PaneCustomContent(value: UIElement?): Unit

  @InterfaceMethod(6)
  public fun get_ContentOverlay(): UIElement?

  @InterfaceMethod(7)
  public fun put_ContentOverlay(value: UIElement?): Unit

  @InterfaceMethod(8)
  public fun get_IsPaneVisible(): Boolean

  @InterfaceMethod(9)
  public fun put_IsPaneVisible(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_SelectionFollowsFocus(): NavigationViewSelectionFollowsFocus?

  @InterfaceMethod(11)
  public fun put_SelectionFollowsFocus(value: NavigationViewSelectionFollowsFocus?): Unit

  @InterfaceMethod(12)
  public fun get_TemplateSettings(): NavigationViewTemplateSettings?

  @InterfaceMethod(13)
  public fun get_ShoulderNavigationEnabled(): NavigationViewShoulderNavigationEnabled?

  @InterfaceMethod(14)
  public fun put_ShoulderNavigationEnabled(value: NavigationViewShoulderNavigationEnabled?): Unit

  @InterfaceMethod(15)
  public fun get_OverflowLabelMode(): NavigationViewOverflowLabelMode?

  @InterfaceMethod(16)
  public fun put_OverflowLabelMode(value: NavigationViewOverflowLabelMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationView3> {
    public override fun getValue() = ABI.makeINavigationView3(pointer.getPointer(0))

    public fun setValue(value: INavigationView3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationView3 {
    public val __156191522_Ptr: Pointer?

    public val _156191522_VtblPtr: Pointer?
      get() = __156191522_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PaneDisplayMode(): NavigationViewPaneDisplayMode? {
      val fnPtr = _156191522_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewPaneDisplayMode>()
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewPaneDisplayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PaneDisplayMode(value: NavigationViewPaneDisplayMode?): Unit {
      val fnPtr = _156191522_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PaneHeader(): UIElement? {
      val fnPtr = _156191522_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PaneHeader(value: UIElement?): Unit {
      val fnPtr = _156191522_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PaneCustomContent(): UIElement? {
      val fnPtr = _156191522_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PaneCustomContent(value: UIElement?): Unit {
      val fnPtr = _156191522_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ContentOverlay(): UIElement? {
      val fnPtr = _156191522_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ContentOverlay(value: UIElement?): Unit {
      val fnPtr = _156191522_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsPaneVisible(): Boolean {
      val fnPtr = _156191522_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsPaneVisible(value: Boolean): Unit {
      val fnPtr = _156191522_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_SelectionFollowsFocus(): NavigationViewSelectionFollowsFocus? {
      val fnPtr = _156191522_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewSelectionFollowsFocus>()
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewSelectionFollowsFocus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_SelectionFollowsFocus(value: NavigationViewSelectionFollowsFocus?):
        Unit {
      val fnPtr = _156191522_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_TemplateSettings(): NavigationViewTemplateSettings? {
      val fnPtr = _156191522_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_ShoulderNavigationEnabled(): NavigationViewShoulderNavigationEnabled? {
      val fnPtr = _156191522_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewShoulderNavigationEnabled>()
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<NavigationViewShoulderNavigationEnabled>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override
        fun put_ShoulderNavigationEnabled(value: NavigationViewShoulderNavigationEnabled?): Unit {
      val fnPtr = _156191522_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_OverflowLabelMode(): NavigationViewOverflowLabelMode? {
      val fnPtr = _156191522_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewOverflowLabelMode>()
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewOverflowLabelMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_OverflowLabelMode(value: NavigationViewOverflowLabelMode?): Unit {
      val fnPtr = _156191522_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156191522_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INavigationView3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __156191522_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationView3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8fdfab669bbc5fa39043a02bb4f8ef37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationView3(ptr: Pointer?): WithDefault = INavigationView3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationView3 {
      val address = segment.toRawLongValue()
      return makeINavigationView3(Pointer(address))
    }

    public override fun toNative(obj: INavigationView3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__156191522_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationView3): Array<INavigationView3?> = (elements as
        Array<INavigationView3?>).castToImpl<INavigationView3,INavigationView3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationView3?> =
        arrayOfNulls<INavigationView3_Impl>(size) as Array<INavigationView3?>
  }
}
