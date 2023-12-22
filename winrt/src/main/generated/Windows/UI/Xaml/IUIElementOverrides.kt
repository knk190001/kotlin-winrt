package Windows.UI.Xaml

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.UI.Xaml.Automation.Peers.AutomationPeer
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

@ABIMarker(IUIElementOverrides.ABI::class)
@Signature("{608d2f1d-7858-4aeb-89e4-b54e2c7ed3d3}")
@Guid("608d2f1d78584aeb89e4b54e2c7ed3d3")
@WinRTInterface("608d2f1d78584aeb89e4b54e2c7ed3d3")
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementOverrides> {
    public override fun getValue() = ABI.makeIUIElementOverrides(pointer.getPointer(0))

    public fun setValue(value: IUIElementOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementOverrides {
    public val __2076375793_Ptr: Pointer?

    public val _2076375793_VtblPtr: Pointer?
      get() = __2076375793_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnCreateAutomationPeer(): AutomationPeer? {
      val fnPtr = _2076375793_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__2076375793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun OnDisconnectVisualChildren(): Unit {
      val fnPtr = _2076375793_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076375793_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun FindSubElementsForTouchTargeting(point: Point?, boundingRect: Rect?):
        IIterable<IIterable<Point?>?>? {
      val fnPtr = _2076375793_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<IIterable<Point?>?>>()
      val hr = fn.invokeHR(arrayOf(__2076375793_Ptr, marshalToNative(point),
          marshalToNative(boundingRect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<IIterable<Point?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IUIElementOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2076375793_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("608d2f1d78584aeb89e4b54e2c7ed3d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementOverrides(ptr: Pointer?): WithDefault = IUIElementOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementOverrides {
      val address = segment.toRawLongValue()
      return makeIUIElementOverrides(Pointer(address))
    }

    public override fun toNative(obj: IUIElementOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2076375793_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementOverrides): Array<IUIElementOverrides?> =
        (elements as
        Array<IUIElementOverrides?>).castToImpl<IUIElementOverrides,IUIElementOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementOverrides?> =
        arrayOfNulls<IUIElementOverrides_Impl>(size) as Array<IUIElementOverrides?>
  }
}
