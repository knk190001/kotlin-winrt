package Microsoft.UI.Xaml

import Microsoft.UI.Composition.AnimationPropertyInfo
import Microsoft.UI.Xaml.Automation.Peers.AutomationPeer
import Microsoft.UI.Xaml.Input.KeyboardAcceleratorInvokedEventArgs
import Microsoft.UI.Xaml.Input.ProcessKeyboardAcceleratorEventArgs
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Point
import Windows.Foundation.Rect
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUIElementOverrides.ABI::class)
@Signature("{9034f41e-ab7b-59e7-8168-50de6b689dde}")
@Guid("9034f41eab7b59e7816850de6b689dde")
@WinRTInterface("9034f41eab7b59e7816850de6b689dde")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementOverrides.ByReference::class)
public interface IUIElementOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnCreateAutomationPeer(): AutomationPeer?

  @InterfaceMethod(1)
  public fun OnDisconnectVisualChildren(): Unit

  @InterfaceMethod(2)
  public fun FindSubElementsForTouchTargeting(point: Point?, boundingRect: Rect?):
      IIterable<IIterable<Point?>?>?

  @InterfaceMethod(3)
  public fun GetChildrenInTabFocusOrder(): IIterable<DependencyObject?>?

  @InterfaceMethod(4)
  public fun OnKeyboardAcceleratorInvoked(args: KeyboardAcceleratorInvokedEventArgs?): Unit

  @InterfaceMethod(5)
  public fun OnProcessKeyboardAccelerators(args: ProcessKeyboardAcceleratorEventArgs?): Unit

  @InterfaceMethod(6)
  public fun OnBringIntoViewRequested(e: BringIntoViewRequestedEventArgs?): Unit

  @InterfaceMethod(7)
  public fun PopulatePropertyInfoOverride(propertyName: String?,
      animationPropertyInfo: AnimationPropertyInfo?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementOverrides> {
    public override fun getValue() = ABI.makeIUIElementOverrides(pointer.getPointer(0))

    public fun setValue(value: IUIElementOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementOverrides {
    public val __535348826_Ptr: Pointer?

    public val _535348826_VtblPtr: Pointer?
      get() = __535348826_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnCreateAutomationPeer(): AutomationPeer? {
      val fnPtr = _535348826_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__535348826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun OnDisconnectVisualChildren(): Unit {
      val fnPtr = _535348826_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__535348826_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun FindSubElementsForTouchTargeting(point: Point?, boundingRect: Rect?):
        IIterable<IIterable<Point?>?>? {
      val fnPtr = _535348826_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<IIterable<Point?>?>>()
      val hr = fn.invokeHR(arrayOf(__535348826_Ptr, marshalToNative(point),
          marshalToNative(boundingRect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<IIterable<Point?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetChildrenInTabFocusOrder(): IIterable<DependencyObject?>? {
      val fnPtr = _535348826_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<DependencyObject?>>()
      val hr = fn.invokeHR(arrayOf(__535348826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<DependencyObject?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun OnKeyboardAcceleratorInvoked(args: KeyboardAcceleratorInvokedEventArgs?):
        Unit {
      val fnPtr = _535348826_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__535348826_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun OnProcessKeyboardAccelerators(args: ProcessKeyboardAcceleratorEventArgs?):
        Unit {
      val fnPtr = _535348826_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__535348826_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun OnBringIntoViewRequested(e: BringIntoViewRequestedEventArgs?): Unit {
      val fnPtr = _535348826_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__535348826_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun PopulatePropertyInfoOverride(propertyName: String?,
        animationPropertyInfo: AnimationPropertyInfo?): Unit {
      val fnPtr = _535348826_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__535348826_Ptr, marshalToNative(propertyName),
          marshalToNative(animationPropertyInfo),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElementOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __535348826_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9034f41eab7b59e7816850de6b689dde")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementOverrides(ptr: Pointer?): WithDefault = IUIElementOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementOverrides {
      val address = segment.toRawLongValue()
      return makeIUIElementOverrides(Pointer(address))
    }

    public override fun toNative(obj: IUIElementOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__535348826_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementOverrides): Array<IUIElementOverrides?> =
        (elements as
        Array<IUIElementOverrides?>).castToImpl<IUIElementOverrides,IUIElementOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementOverrides?> =
        arrayOfNulls<IUIElementOverrides_Impl>(size) as Array<IUIElementOverrides?>
  }
}
