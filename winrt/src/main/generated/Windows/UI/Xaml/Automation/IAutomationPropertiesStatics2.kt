package Windows.UI.Xaml.Automation

import Windows.Foundation.Collections.IVector
import Windows.UI.Xaml.Automation.Peers.AccessibilityView
import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.DependencyProperty
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPropertiesStatics2.ABI::class)
@Signature("{3976547f-7089-4801-8f1d-aab78090d1a0}")
@Guid("3976547f708948018f1daab78090d1a0")
@WinRTInterface("3976547f708948018f1daab78090d1a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPropertiesStatics2.ByReference::class)
public interface IAutomationPropertiesStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AccessibilityViewProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetAccessibilityView(element: DependencyObject?): AccessibilityView?

  @InterfaceMethod(2)
  public fun SetAccessibilityView(element: DependencyObject?, value: AccessibilityView?): Unit

  @InterfaceMethod(3)
  public fun get_ControlledPeersProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun GetControlledPeers(element: DependencyObject?): IVector<UIElement?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPropertiesStatics2> {
    public override fun getValue() = ABI.makeIAutomationPropertiesStatics2(pointer.getPointer(0))

    public fun setValue(value: IAutomationPropertiesStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPropertiesStatics2 {
    public val __445074930_Ptr: Pointer?

    public val _445074930_VtblPtr: Pointer?
      get() = __445074930_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AccessibilityViewProperty(): DependencyProperty? {
      val fnPtr = _445074930_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074930_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAccessibilityView(element: DependencyObject?): AccessibilityView? {
      val fnPtr = _445074930_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AccessibilityView>()
      val hr = fn.invokeHR(arrayOf(__445074930_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AccessibilityView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetAccessibilityView(element: DependencyObject?, value: AccessibilityView?):
        Unit {
      val fnPtr = _445074930_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445074930_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ControlledPeersProperty(): DependencyProperty? {
      val fnPtr = _445074930_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074930_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetControlledPeers(element: DependencyObject?): IVector<UIElement?>? {
      val fnPtr = _445074930_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<UIElement?>>()
      val hr = fn.invokeHR(arrayOf(__445074930_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<UIElement?>>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPropertiesStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __445074930_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPropertiesStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3976547f708948018f1daab78090d1a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPropertiesStatics2(ptr: Pointer?): WithDefault =
        IAutomationPropertiesStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPropertiesStatics2 {
      val address = segment.toRawLongValue()
      return makeIAutomationPropertiesStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPropertiesStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__445074930_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPropertiesStatics2):
        Array<IAutomationPropertiesStatics2?> = (elements as
        Array<IAutomationPropertiesStatics2?>).castToImpl<IAutomationPropertiesStatics2,IAutomationPropertiesStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPropertiesStatics2?> =
        arrayOfNulls<IAutomationPropertiesStatics2_Impl>(size) as
        Array<IAutomationPropertiesStatics2?>
  }
}
