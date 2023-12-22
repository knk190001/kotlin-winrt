package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
import Microsoft.UI.Xaml.UIElement
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

@ABIMarker(IVariableSizedWrapGridStatics.ABI::class)
@Signature("{0d979fe6-64af-5af5-914a-dd38f2ccf2d7}")
@Guid("0d979fe664af5af5914add38f2ccf2d7")
@WinRTInterface("0d979fe664af5af5914add38f2ccf2d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVariableSizedWrapGridStatics.ByReference::class)
public interface IVariableSizedWrapGridStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemHeightProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ItemWidthProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_OrientationProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_HorizontalChildrenAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_VerticalChildrenAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_MaximumRowsOrColumnsProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_RowSpanProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun GetRowSpan(element: UIElement?): Int

  @InterfaceMethod(8)
  public fun SetRowSpan(element: UIElement?, value: Int): Unit

  @InterfaceMethod(9)
  public fun get_ColumnSpanProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun GetColumnSpan(element: UIElement?): Int

  @InterfaceMethod(11)
  public fun SetColumnSpan(element: UIElement?, value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVariableSizedWrapGridStatics> {
    public override fun getValue() = ABI.makeIVariableSizedWrapGridStatics(pointer.getPointer(0))

    public fun setValue(value: IVariableSizedWrapGridStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVariableSizedWrapGridStatics {
    public val __994339371_Ptr: Pointer?

    public val _994339371_VtblPtr: Pointer?
      get() = __994339371_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemHeightProperty(): DependencyProperty? {
      val fnPtr = _994339371_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__994339371_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ItemWidthProperty(): DependencyProperty? {
      val fnPtr = _994339371_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__994339371_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_OrientationProperty(): DependencyProperty? {
      val fnPtr = _994339371_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__994339371_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_HorizontalChildrenAlignmentProperty(): DependencyProperty? {
      val fnPtr = _994339371_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__994339371_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_VerticalChildrenAlignmentProperty(): DependencyProperty? {
      val fnPtr = _994339371_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__994339371_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_MaximumRowsOrColumnsProperty(): DependencyProperty? {
      val fnPtr = _994339371_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__994339371_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_RowSpanProperty(): DependencyProperty? {
      val fnPtr = _994339371_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__994339371_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetRowSpan(element: UIElement?): Int {
      val fnPtr = _994339371_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__994339371_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun SetRowSpan(element: UIElement?, value: Int): Unit {
      val fnPtr = _994339371_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__994339371_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_ColumnSpanProperty(): DependencyProperty? {
      val fnPtr = _994339371_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__994339371_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetColumnSpan(element: UIElement?): Int {
      val fnPtr = _994339371_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__994339371_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun SetColumnSpan(element: UIElement?, value: Int): Unit {
      val fnPtr = _994339371_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__994339371_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVariableSizedWrapGridStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __994339371_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVariableSizedWrapGridStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d979fe664af5af5914add38f2ccf2d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVariableSizedWrapGridStatics(ptr: Pointer?): WithDefault =
        IVariableSizedWrapGridStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVariableSizedWrapGridStatics {
      val address = segment.toRawLongValue()
      return makeIVariableSizedWrapGridStatics(Pointer(address))
    }

    public override fun toNative(obj: IVariableSizedWrapGridStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__994339371_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVariableSizedWrapGridStatics):
        Array<IVariableSizedWrapGridStatics?> = (elements as
        Array<IVariableSizedWrapGridStatics?>).castToImpl<IVariableSizedWrapGridStatics,IVariableSizedWrapGridStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVariableSizedWrapGridStatics?> =
        arrayOfNulls<IVariableSizedWrapGridStatics_Impl>(size) as
        Array<IVariableSizedWrapGridStatics?>
  }
}
