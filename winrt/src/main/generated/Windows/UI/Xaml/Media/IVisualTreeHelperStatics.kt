package Windows.UI.Xaml.Media

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(IVisualTreeHelperStatics.ABI::class)
@Signature("{e75758c4-d25d-4b1d-971f-596f17f12baa}")
@Guid("e75758c4d25d4b1d971f596f17f12baa")
@WinRTInterface("e75758c4d25d4b1d971f596f17f12baa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualTreeHelperStatics.ByReference::class)
public interface IVisualTreeHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindElementsInHostCoordinates(intersectingPoint: Point?, subtree: UIElement?):
      IIterable<UIElement?>?

  @InterfaceMethod(1)
  public fun FindElementsInHostCoordinates(intersectingRect: Rect?, subtree: UIElement?):
      IIterable<UIElement?>?

  @InterfaceMethod(2)
  public fun FindElementsInHostCoordinates(
    intersectingPoint: Point?,
    subtree: UIElement?,
    includeAllElements: Boolean
  ): IIterable<UIElement?>?

  @InterfaceMethod(3)
  public fun FindElementsInHostCoordinates(
    intersectingRect: Rect?,
    subtree: UIElement?,
    includeAllElements: Boolean
  ): IIterable<UIElement?>?

  @InterfaceMethod(4)
  public fun GetChild(reference: DependencyObject?, childIndex: Int): DependencyObject?

  @InterfaceMethod(5)
  public fun GetChildrenCount(reference: DependencyObject?): Int

  @InterfaceMethod(6)
  public fun GetParent(reference: DependencyObject?): DependencyObject?

  @InterfaceMethod(7)
  public fun DisconnectChildrenRecursive(element: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualTreeHelperStatics> {
    public override fun getValue() = ABI.makeIVisualTreeHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IVisualTreeHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualTreeHelperStatics {
    public val __333920163_Ptr: Pointer?

    public val _333920163_VtblPtr: Pointer?
      get() = __333920163_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindElementsInHostCoordinates(intersectingPoint: Point?,
        subtree: UIElement?): IIterable<UIElement?>? {
      val fnPtr = _333920163_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<UIElement?>>()
      val hr = fn.invokeHR(arrayOf(__333920163_Ptr, marshalToNative(intersectingPoint),
          marshalToNative(subtree), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<UIElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindElementsInHostCoordinates(intersectingRect: Rect?, subtree: UIElement?):
        IIterable<UIElement?>? {
      val fnPtr = _333920163_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<UIElement?>>()
      val hr = fn.invokeHR(arrayOf(__333920163_Ptr, marshalToNative(intersectingRect),
          marshalToNative(subtree), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<UIElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindElementsInHostCoordinates(
      intersectingPoint: Point?,
      subtree: UIElement?,
      includeAllElements: Boolean
    ): IIterable<UIElement?>? {
      val fnPtr = _333920163_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<UIElement?>>()
      val hr = fn.invokeHR(arrayOf(__333920163_Ptr, marshalToNative(intersectingPoint),
          marshalToNative(subtree), includeAllElements, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<UIElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindElementsInHostCoordinates(
      intersectingRect: Rect?,
      subtree: UIElement?,
      includeAllElements: Boolean
    ): IIterable<UIElement?>? {
      val fnPtr = _333920163_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<UIElement?>>()
      val hr = fn.invokeHR(arrayOf(__333920163_Ptr, marshalToNative(intersectingRect),
          marshalToNative(subtree), includeAllElements, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<UIElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetChild(reference: DependencyObject?, childIndex: Int): DependencyObject? {
      val fnPtr = _333920163_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__333920163_Ptr, marshalToNative(reference), childIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetChildrenCount(reference: DependencyObject?): Int {
      val fnPtr = _333920163_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__333920163_Ptr, marshalToNative(reference), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun GetParent(reference: DependencyObject?): DependencyObject? {
      val fnPtr = _333920163_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__333920163_Ptr, marshalToNative(reference), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun DisconnectChildrenRecursive(element: UIElement?): Unit {
      val fnPtr = _333920163_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__333920163_Ptr, marshalToNative(element),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisualTreeHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __333920163_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualTreeHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e75758c4d25d4b1d971f596f17f12baa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualTreeHelperStatics(ptr: Pointer?): WithDefault =
        IVisualTreeHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualTreeHelperStatics {
      val address = segment.toRawLongValue()
      return makeIVisualTreeHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IVisualTreeHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__333920163_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualTreeHelperStatics):
        Array<IVisualTreeHelperStatics?> = (elements as
        Array<IVisualTreeHelperStatics?>).castToImpl<IVisualTreeHelperStatics,IVisualTreeHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualTreeHelperStatics?> =
        arrayOfNulls<IVisualTreeHelperStatics_Impl>(size) as Array<IVisualTreeHelperStatics?>
  }
}
