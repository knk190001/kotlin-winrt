package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(INavigationViewStatics3.ABI::class)
@Signature("{9b6b69b7-f746-5550-91e1-ee0c9a85c05e}")
@Guid("9b6b69b7f746555091e1ee0c9a85c05e")
@WinRTInterface("9b6b69b7f746555091e1ee0c9a85c05e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewStatics3.ByReference::class)
public interface INavigationViewStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PaneDisplayModeProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_PaneHeaderProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_PaneCustomContentProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_ContentOverlayProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_IsPaneVisibleProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_SelectionFollowsFocusProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_TemplateSettingsProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_ShoulderNavigationEnabledProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_OverflowLabelModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewStatics3> {
    public override fun getValue() = ABI.makeINavigationViewStatics3(pointer.getPointer(0))

    public fun setValue(value: INavigationViewStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewStatics3 {
    public val __750002723_Ptr: Pointer?

    public val _750002723_VtblPtr: Pointer?
      get() = __750002723_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PaneDisplayModeProperty(): DependencyProperty? {
      val fnPtr = _750002723_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__750002723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PaneHeaderProperty(): DependencyProperty? {
      val fnPtr = _750002723_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__750002723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PaneCustomContentProperty(): DependencyProperty? {
      val fnPtr = _750002723_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__750002723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ContentOverlayProperty(): DependencyProperty? {
      val fnPtr = _750002723_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__750002723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsPaneVisibleProperty(): DependencyProperty? {
      val fnPtr = _750002723_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__750002723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SelectionFollowsFocusProperty(): DependencyProperty? {
      val fnPtr = _750002723_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__750002723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_TemplateSettingsProperty(): DependencyProperty? {
      val fnPtr = _750002723_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__750002723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ShoulderNavigationEnabledProperty(): DependencyProperty? {
      val fnPtr = _750002723_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__750002723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_OverflowLabelModeProperty(): DependencyProperty? {
      val fnPtr = _750002723_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__750002723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __750002723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b6b69b7f746555091e1ee0c9a85c05e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewStatics3(ptr: Pointer?): WithDefault =
        INavigationViewStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewStatics3 {
      val address = segment.toRawLongValue()
      return makeINavigationViewStatics3(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__750002723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewStatics3): Array<INavigationViewStatics3?>
        = (elements as
        Array<INavigationViewStatics3?>).castToImpl<INavigationViewStatics3,INavigationViewStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewStatics3?> =
        arrayOfNulls<INavigationViewStatics3_Impl>(size) as Array<INavigationViewStatics3?>
  }
}
