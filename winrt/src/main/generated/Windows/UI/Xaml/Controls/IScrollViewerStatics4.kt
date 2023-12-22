package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyObject
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollViewerStatics4.ABI::class)
@Signature("{220cf7cc-4f46-59f1-af9b-67fa8eb33d01}")
@Guid("220cf7cc4f4659f1af9b67fa8eb33d01")
@WinRTInterface("220cf7cc4f4659f1af9b67fa8eb33d01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollViewerStatics4.ByReference::class)
public interface IScrollViewerStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReduceViewportForCoreInputViewOcclusionsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_HorizontalAnchorRatioProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_VerticalAnchorRatioProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_CanContentRenderOutsideBoundsProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun GetCanContentRenderOutsideBounds(element: DependencyObject?): Boolean

  @InterfaceMethod(5)
  public fun SetCanContentRenderOutsideBounds(element: DependencyObject?,
      canContentRenderOutsideBounds: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollViewerStatics4> {
    public override fun getValue() = ABI.makeIScrollViewerStatics4(pointer.getPointer(0))

    public fun setValue(value: IScrollViewerStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollViewerStatics4 {
    public val __129442934_Ptr: Pointer?

    public val _129442934_VtblPtr: Pointer?
      get() = __129442934_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReduceViewportForCoreInputViewOcclusionsProperty():
        DependencyProperty? {
      val fnPtr = _129442934_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__129442934_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HorizontalAnchorRatioProperty(): DependencyProperty? {
      val fnPtr = _129442934_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__129442934_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_VerticalAnchorRatioProperty(): DependencyProperty? {
      val fnPtr = _129442934_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__129442934_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CanContentRenderOutsideBoundsProperty(): DependencyProperty? {
      val fnPtr = _129442934_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__129442934_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetCanContentRenderOutsideBounds(element: DependencyObject?): Boolean {
      val fnPtr = _129442934_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__129442934_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun SetCanContentRenderOutsideBounds(element: DependencyObject?,
        canContentRenderOutsideBounds: Boolean): Unit {
      val fnPtr = _129442934_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__129442934_Ptr, marshalToNative(element),
          canContentRenderOutsideBounds,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollViewerStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __129442934_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollViewerStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("220cf7cc4f4659f1af9b67fa8eb33d01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollViewerStatics4(ptr: Pointer?): WithDefault =
        IScrollViewerStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollViewerStatics4 {
      val address = segment.toRawLongValue()
      return makeIScrollViewerStatics4(Pointer(address))
    }

    public override fun toNative(obj: IScrollViewerStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__129442934_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollViewerStatics4): Array<IScrollViewerStatics4?> =
        (elements as
        Array<IScrollViewerStatics4?>).castToImpl<IScrollViewerStatics4,IScrollViewerStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollViewerStatics4?> =
        arrayOfNulls<IScrollViewerStatics4_Impl>(size) as Array<IScrollViewerStatics4?>
  }
}
