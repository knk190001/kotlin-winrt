package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
import Microsoft.UI.Xaml.FrameworkElement
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

@ABIMarker(IGridStatics.ABI::class)
@Signature("{ef9cf81d-a431-50f4-abf5-3023fe447704}")
@Guid("ef9cf81da43150f4abf53023fe447704")
@WinRTInterface("ef9cf81da43150f4abf53023fe447704")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridStatics.ByReference::class)
public interface IGridStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundSizingProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_BorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_BorderThicknessProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_CornerRadiusProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_PaddingProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_RowSpacingProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_ColumnSpacingProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_RowProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun GetRow(element: FrameworkElement?): Int

  @InterfaceMethod(9)
  public fun SetRow(element: FrameworkElement?, value: Int): Unit

  @InterfaceMethod(10)
  public fun get_ColumnProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun GetColumn(element: FrameworkElement?): Int

  @InterfaceMethod(12)
  public fun SetColumn(element: FrameworkElement?, value: Int): Unit

  @InterfaceMethod(13)
  public fun get_RowSpanProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun GetRowSpan(element: FrameworkElement?): Int

  @InterfaceMethod(15)
  public fun SetRowSpan(element: FrameworkElement?, value: Int): Unit

  @InterfaceMethod(16)
  public fun get_ColumnSpanProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun GetColumnSpan(element: FrameworkElement?): Int

  @InterfaceMethod(18)
  public fun SetColumnSpan(element: FrameworkElement?, value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGridStatics> {
    public override fun getValue() = ABI.makeIGridStatics(pointer.getPointer(0))

    public fun setValue(value: IGridStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridStatics {
    public val __1446932104_Ptr: Pointer?

    public val _1446932104_VtblPtr: Pointer?
      get() = __1446932104_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundSizingProperty(): DependencyProperty? {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BorderThicknessProperty(): DependencyProperty? {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PaddingProperty(): DependencyProperty? {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RowSpacingProperty(): DependencyProperty? {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ColumnSpacingProperty(): DependencyProperty? {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_RowProperty(): DependencyProperty? {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetRow(element: FrameworkElement?): Int {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun SetRow(element: FrameworkElement?, value: Int): Unit {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ColumnProperty(): DependencyProperty? {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun GetColumn(element: FrameworkElement?): Int {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun SetColumn(element: FrameworkElement?, value: Int): Unit {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_RowSpanProperty(): DependencyProperty? {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun GetRowSpan(element: FrameworkElement?): Int {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun SetRowSpan(element: FrameworkElement?, value: Int): Unit {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ColumnSpanProperty(): DependencyProperty? {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun GetColumnSpan(element: FrameworkElement?): Int {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun SetColumnSpan(element: FrameworkElement?, value: Int): Unit {
      val fnPtr = _1446932104_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1446932104_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGridStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1446932104_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef9cf81da43150f4abf53023fe447704")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridStatics(ptr: Pointer?): WithDefault = IGridStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridStatics {
      val address = segment.toRawLongValue()
      return makeIGridStatics(Pointer(address))
    }

    public override fun toNative(obj: IGridStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1446932104_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridStatics): Array<IGridStatics?> = (elements as
        Array<IGridStatics?>).castToImpl<IGridStatics,IGridStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridStatics?> =
        arrayOfNulls<IGridStatics_Impl>(size) as Array<IGridStatics?>
  }
}
