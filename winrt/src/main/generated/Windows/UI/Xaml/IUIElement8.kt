package Windows.UI.Xaml

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Input.KeyboardAcceleratorPlacementMode
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

@ABIMarker(IUIElement8.ABI::class)
@Signature("{3ab70e85-d508-4477-b6f8-0e435701c836}")
@Guid("3ab70e85d5084477b6f80e435701c836")
@WinRTInterface("3ab70e85d5084477b6f80e435701c836")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElement8.ByReference::class)
public interface IUIElement8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyTipTarget(): DependencyObject?

  @InterfaceMethod(1)
  public fun put_KeyTipTarget(value: DependencyObject?): Unit

  @InterfaceMethod(2)
  public fun get_KeyboardAcceleratorPlacementTarget(): DependencyObject?

  @InterfaceMethod(3)
  public fun put_KeyboardAcceleratorPlacementTarget(value: DependencyObject?): Unit

  @InterfaceMethod(4)
  public fun get_KeyboardAcceleratorPlacementMode(): KeyboardAcceleratorPlacementMode?

  @InterfaceMethod(5)
  public fun put_KeyboardAcceleratorPlacementMode(value: KeyboardAcceleratorPlacementMode?): Unit

  @InterfaceMethod(6)
  public fun add_BringIntoViewRequested(handler: TypedEventHandler<UIElement?,
      BringIntoViewRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_BringIntoViewRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUIElement8> {
    public override fun getValue() = ABI.makeIUIElement8(pointer.getPointer(0))

    public fun setValue(value: IUIElement8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElement8 {
    public val __1021118242_Ptr: Pointer?

    public val _1021118242_VtblPtr: Pointer?
      get() = __1021118242_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyTipTarget(): DependencyObject? {
      val fnPtr = _1021118242_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1021118242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_KeyTipTarget(value: DependencyObject?): Unit {
      val fnPtr = _1021118242_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118242_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_KeyboardAcceleratorPlacementTarget(): DependencyObject? {
      val fnPtr = _1021118242_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1021118242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_KeyboardAcceleratorPlacementTarget(value: DependencyObject?): Unit {
      val fnPtr = _1021118242_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118242_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_KeyboardAcceleratorPlacementMode(): KeyboardAcceleratorPlacementMode? {
      val fnPtr = _1021118242_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyboardAcceleratorPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__1021118242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyboardAcceleratorPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override
        fun put_KeyboardAcceleratorPlacementMode(value: KeyboardAcceleratorPlacementMode?): Unit {
      val fnPtr = _1021118242_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118242_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_BringIntoViewRequested(handler: TypedEventHandler<UIElement?,
        BringIntoViewRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1021118242_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118242_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_BringIntoViewRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118242_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118242_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElement8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1021118242_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElement8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ab70e85d5084477b6f80e435701c836")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElement8(ptr: Pointer?): WithDefault = IUIElement8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElement8 {
      val address = segment.toRawLongValue()
      return makeIUIElement8(Pointer(address))
    }

    public override fun toNative(obj: IUIElement8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1021118242_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElement8): Array<IUIElement8?> = (elements as
        Array<IUIElement8?>).castToImpl<IUIElement8,IUIElement8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElement8?> =
        arrayOfNulls<IUIElement8_Impl>(size) as Array<IUIElement8?>
  }
}
