package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.UIElement
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVirtualizingLayoutContextOverrides.ABI::class)
@Signature("{78633b2a-9633-5086-89a7-0e960a95a3b2}")
@Guid("78633b2a9633508689a70e960a95a3b2")
@WinRTInterface("78633b2a9633508689a70e960a95a3b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualizingLayoutContextOverrides.ByReference::class)
public interface IVirtualizingLayoutContextOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ItemCountCore(): Int

  @InterfaceMethod(1)
  public fun GetItemAtCore(index: Int): IUnknown?

  @InterfaceMethod(2)
  public fun RealizationRectCore(): Rect?

  @InterfaceMethod(3)
  public fun GetOrCreateElementAtCore(index: Int, options: ElementRealizationOptions?): UIElement?

  @InterfaceMethod(4)
  public fun RecycleElementCore(element: UIElement?): Unit

  @InterfaceMethod(5)
  public fun get_RecommendedAnchorIndexCore(): Int

  @InterfaceMethod(6)
  public fun get_LayoutOriginCore(): Point?

  @InterfaceMethod(7)
  public fun put_LayoutOriginCore(value: Point?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualizingLayoutContextOverrides> {
    public override fun getValue() =
        ABI.makeIVirtualizingLayoutContextOverrides(pointer.getPointer(0))

    public fun setValue(value: IVirtualizingLayoutContextOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualizingLayoutContextOverrides {
    public val __247389937_Ptr: Pointer?

    public val _247389937_VtblPtr: Pointer?
      get() = __247389937_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ItemCountCore(): Int {
      val fnPtr = _247389937_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__247389937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun GetItemAtCore(index: Int): IUnknown? {
      val fnPtr = _247389937_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__247389937_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RealizationRectCore(): Rect? {
      val fnPtr = _247389937_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__247389937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetOrCreateElementAtCore(index: Int, options: ElementRealizationOptions?):
        UIElement? {
      val fnPtr = _247389937_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__247389937_Ptr, index, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RecycleElementCore(element: UIElement?): Unit {
      val fnPtr = _247389937_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__247389937_Ptr, marshalToNative(element),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_RecommendedAnchorIndexCore(): Int {
      val fnPtr = _247389937_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__247389937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_LayoutOriginCore(): Point? {
      val fnPtr = _247389937_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__247389937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_LayoutOriginCore(value: Point?): Unit {
      val fnPtr = _247389937_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__247389937_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVirtualizingLayoutContextOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __247389937_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualizingLayoutContextOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("78633b2a9633508689a70e960a95a3b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualizingLayoutContextOverrides(ptr: Pointer?): WithDefault =
        IVirtualizingLayoutContextOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualizingLayoutContextOverrides {
      val address = segment.toRawLongValue()
      return makeIVirtualizingLayoutContextOverrides(Pointer(address))
    }

    public override fun toNative(obj: IVirtualizingLayoutContextOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__247389937_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualizingLayoutContextOverrides):
        Array<IVirtualizingLayoutContextOverrides?> = (elements as
        Array<IVirtualizingLayoutContextOverrides?>).castToImpl<IVirtualizingLayoutContextOverrides,IVirtualizingLayoutContextOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualizingLayoutContextOverrides?> =
        arrayOfNulls<IVirtualizingLayoutContextOverrides_Impl>(size) as
        Array<IVirtualizingLayoutContextOverrides?>
  }
}
