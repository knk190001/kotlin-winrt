package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.HorizontalAlignment
import Microsoft.UI.Xaml.VerticalAlignment
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWrapGrid.ABI::class)
@Signature("{2e570b6a-ff97-53b8-a887-348f59ee0544}")
@Guid("2e570b6aff9753b8a887348f59ee0544")
@WinRTInterface("2e570b6aff9753b8a887348f59ee0544")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWrapGrid.ByReference::class)
public interface IWrapGrid : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemWidth(): Double

  @InterfaceMethod(1)
  public fun put_ItemWidth(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_ItemHeight(): Double

  @InterfaceMethod(3)
  public fun put_ItemHeight(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_Orientation(): Orientation?

  @InterfaceMethod(5)
  public fun put_Orientation(value: Orientation?): Unit

  @InterfaceMethod(6)
  public fun get_HorizontalChildrenAlignment(): HorizontalAlignment?

  @InterfaceMethod(7)
  public fun put_HorizontalChildrenAlignment(value: HorizontalAlignment?): Unit

  @InterfaceMethod(8)
  public fun get_VerticalChildrenAlignment(): VerticalAlignment?

  @InterfaceMethod(9)
  public fun put_VerticalChildrenAlignment(value: VerticalAlignment?): Unit

  @InterfaceMethod(10)
  public fun get_MaximumRowsOrColumns(): Int

  @InterfaceMethod(11)
  public fun put_MaximumRowsOrColumns(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWrapGrid> {
    public override fun getValue() = ABI.makeIWrapGrid(pointer.getPointer(0))

    public fun setValue(value: IWrapGrid_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWrapGrid {
    public val __1919005047_Ptr: Pointer?

    public val _1919005047_VtblPtr: Pointer?
      get() = __1919005047_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemWidth(): Double {
      val fnPtr = _1919005047_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1919005047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ItemWidth(value: Double): Unit {
      val fnPtr = _1919005047_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1919005047_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ItemHeight(): Double {
      val fnPtr = _1919005047_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1919005047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ItemHeight(value: Double): Unit {
      val fnPtr = _1919005047_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1919005047_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Orientation(): Orientation? {
      val fnPtr = _1919005047_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Orientation>()
      val hr = fn.invokeHR(arrayOf(__1919005047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Orientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Orientation(value: Orientation?): Unit {
      val fnPtr = _1919005047_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1919005047_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_HorizontalChildrenAlignment(): HorizontalAlignment? {
      val fnPtr = _1919005047_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HorizontalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1919005047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HorizontalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_HorizontalChildrenAlignment(value: HorizontalAlignment?): Unit {
      val fnPtr = _1919005047_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1919005047_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_VerticalChildrenAlignment(): VerticalAlignment? {
      val fnPtr = _1919005047_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VerticalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1919005047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VerticalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_VerticalChildrenAlignment(value: VerticalAlignment?): Unit {
      val fnPtr = _1919005047_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1919005047_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_MaximumRowsOrColumns(): Int {
      val fnPtr = _1919005047_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1919005047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_MaximumRowsOrColumns(value: Int): Unit {
      val fnPtr = _1919005047_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1919005047_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWrapGrid_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1919005047_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWrapGrid, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e570b6aff9753b8a887348f59ee0544")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWrapGrid(ptr: Pointer?): WithDefault = IWrapGrid_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWrapGrid {
      val address = segment.toRawLongValue()
      return makeIWrapGrid(Pointer(address))
    }

    public override fun toNative(obj: IWrapGrid): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1919005047_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWrapGrid): Array<IWrapGrid?> = (elements as
        Array<IWrapGrid?>).castToImpl<IWrapGrid,IWrapGrid_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWrapGrid?> = arrayOfNulls<IWrapGrid_Impl>(size)
        as Array<IWrapGrid?>
  }
}
