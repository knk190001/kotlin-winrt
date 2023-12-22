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

@ABIMarker(IVirtualizingLayoutContext.ABI::class)
@Signature("{5b5b186a-a7f9-5a2e-b1f0-8950ccd97350}")
@Guid("5b5b186aa7f95a2eb1f08950ccd97350")
@WinRTInterface("5b5b186aa7f95a2eb1f08950ccd97350")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualizingLayoutContext.ByReference::class)
public interface IVirtualizingLayoutContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemCount(): Int

  @InterfaceMethod(1)
  public fun GetItemAt(index: Int): IUnknown?

  @InterfaceMethod(2)
  public fun get_RealizationRect(): Rect?

  @InterfaceMethod(3)
  public fun GetOrCreateElementAt(index: Int): UIElement?

  @InterfaceMethod(4)
  public fun GetOrCreateElementAt(index: Int, options: ElementRealizationOptions?): UIElement?

  @InterfaceMethod(5)
  public fun RecycleElement(element: UIElement?): Unit

  @InterfaceMethod(6)
  public fun get_RecommendedAnchorIndex(): Int

  @InterfaceMethod(7)
  public fun get_LayoutOrigin(): Point?

  @InterfaceMethod(8)
  public fun put_LayoutOrigin(value: Point?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualizingLayoutContext> {
    public override fun getValue() = ABI.makeIVirtualizingLayoutContext(pointer.getPointer(0))

    public fun setValue(value: IVirtualizingLayoutContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualizingLayoutContext {
    public val __1783649272_Ptr: Pointer?

    public val _1783649272_VtblPtr: Pointer?
      get() = __1783649272_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemCount(): Int {
      val fnPtr = _1783649272_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1783649272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun GetItemAt(index: Int): IUnknown? {
      val fnPtr = _1783649272_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1783649272_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RealizationRect(): Rect? {
      val fnPtr = _1783649272_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1783649272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetOrCreateElementAt(index: Int): UIElement? {
      val fnPtr = _1783649272_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1783649272_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetOrCreateElementAt(index: Int, options: ElementRealizationOptions?):
        UIElement? {
      val fnPtr = _1783649272_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1783649272_Ptr, index, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RecycleElement(element: UIElement?): Unit {
      val fnPtr = _1783649272_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1783649272_Ptr, marshalToNative(element),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RecommendedAnchorIndex(): Int {
      val fnPtr = _1783649272_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1783649272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_LayoutOrigin(): Point? {
      val fnPtr = _1783649272_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1783649272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_LayoutOrigin(value: Point?): Unit {
      val fnPtr = _1783649272_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1783649272_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVirtualizingLayoutContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1783649272_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualizingLayoutContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b5b186aa7f95a2eb1f08950ccd97350")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualizingLayoutContext(ptr: Pointer?): WithDefault =
        IVirtualizingLayoutContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualizingLayoutContext {
      val address = segment.toRawLongValue()
      return makeIVirtualizingLayoutContext(Pointer(address))
    }

    public override fun toNative(obj: IVirtualizingLayoutContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1783649272_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualizingLayoutContext):
        Array<IVirtualizingLayoutContext?> = (elements as
        Array<IVirtualizingLayoutContext?>).castToImpl<IVirtualizingLayoutContext,IVirtualizingLayoutContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualizingLayoutContext?> =
        arrayOfNulls<IVirtualizingLayoutContext_Impl>(size) as Array<IVirtualizingLayoutContext?>
  }
}
