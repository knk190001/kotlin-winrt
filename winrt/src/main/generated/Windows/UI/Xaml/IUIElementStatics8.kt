package Windows.UI.Xaml

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

@ABIMarker(IUIElementStatics8.ABI::class)
@Signature("{17be3487-4875-4915-b0b1-a4c0f851df3f}")
@Guid("17be348748754915b0b1a4c0f851df3f")
@WinRTInterface("17be348748754915b0b1a4c0f851df3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementStatics8.ByReference::class)
public interface IUIElementStatics8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BringIntoViewRequestedEvent(): RoutedEvent?

  @InterfaceMethod(1)
  public fun get_ContextRequestedEvent(): RoutedEvent?

  @InterfaceMethod(2)
  public fun get_KeyTipTargetProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_KeyboardAcceleratorPlacementTargetProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_KeyboardAcceleratorPlacementModeProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun RegisterAsScrollPort(element: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementStatics8> {
    public override fun getValue() = ABI.makeIUIElementStatics8(pointer.getPointer(0))

    public fun setValue(value: IUIElementStatics8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementStatics8 {
    public val __1915643127_Ptr: Pointer?

    public val _1915643127_VtblPtr: Pointer?
      get() = __1915643127_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BringIntoViewRequestedEvent(): RoutedEvent? {
      val fnPtr = _1915643127_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__1915643127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ContextRequestedEvent(): RoutedEvent? {
      val fnPtr = _1915643127_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoutedEvent>()
      val hr = fn.invokeHR(arrayOf(__1915643127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoutedEvent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_KeyTipTargetProperty(): DependencyProperty? {
      val fnPtr = _1915643127_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_KeyboardAcceleratorPlacementTargetProperty(): DependencyProperty? {
      val fnPtr = _1915643127_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_KeyboardAcceleratorPlacementModeProperty(): DependencyProperty? {
      val fnPtr = _1915643127_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RegisterAsScrollPort(element: UIElement?): Unit {
      val fnPtr = _1915643127_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1915643127_Ptr, marshalToNative(element),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElementStatics8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1915643127_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementStatics8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17be348748754915b0b1a4c0f851df3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementStatics8(ptr: Pointer?): WithDefault = IUIElementStatics8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementStatics8 {
      val address = segment.toRawLongValue()
      return makeIUIElementStatics8(Pointer(address))
    }

    public override fun toNative(obj: IUIElementStatics8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1915643127_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementStatics8): Array<IUIElementStatics8?> =
        (elements as
        Array<IUIElementStatics8?>).castToImpl<IUIElementStatics8,IUIElementStatics8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementStatics8?> =
        arrayOfNulls<IUIElementStatics8_Impl>(size) as Array<IUIElementStatics8?>
  }
}
