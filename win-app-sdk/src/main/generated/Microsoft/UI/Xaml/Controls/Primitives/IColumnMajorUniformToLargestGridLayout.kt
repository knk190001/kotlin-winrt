package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IColumnMajorUniformToLargestGridLayout.ABI::class)
@Signature("{ee10a6aa-efeb-51ac-b791-71913ae8c235}")
@Guid("ee10a6aaefeb51acb79171913ae8c235")
@WinRTInterface("ee10a6aaefeb51acb79171913ae8c235")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColumnMajorUniformToLargestGridLayout.ByReference::class)
public interface IColumnMajorUniformToLargestGridLayout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxColumns(): Int

  @InterfaceMethod(1)
  public fun put_MaxColumns(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_ColumnSpacing(): Double

  @InterfaceMethod(3)
  public fun put_ColumnSpacing(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_RowSpacing(): Double

  @InterfaceMethod(5)
  public fun put_RowSpacing(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColumnMajorUniformToLargestGridLayout> {
    public override fun getValue() =
        ABI.makeIColumnMajorUniformToLargestGridLayout(pointer.getPointer(0))

    public fun setValue(value: IColumnMajorUniformToLargestGridLayout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColumnMajorUniformToLargestGridLayout {
    public val __1595648815_Ptr: Pointer?

    public val _1595648815_VtblPtr: Pointer?
      get() = __1595648815_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxColumns(): Int {
      val fnPtr = _1595648815_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1595648815_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MaxColumns(value: Int): Unit {
      val fnPtr = _1595648815_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1595648815_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ColumnSpacing(): Double {
      val fnPtr = _1595648815_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1595648815_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ColumnSpacing(value: Double): Unit {
      val fnPtr = _1595648815_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1595648815_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RowSpacing(): Double {
      val fnPtr = _1595648815_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1595648815_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_RowSpacing(value: Double): Unit {
      val fnPtr = _1595648815_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1595648815_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IColumnMajorUniformToLargestGridLayout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1595648815_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColumnMajorUniformToLargestGridLayout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee10a6aaefeb51acb79171913ae8c235")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColumnMajorUniformToLargestGridLayout(ptr: Pointer?): WithDefault =
        IColumnMajorUniformToLargestGridLayout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColumnMajorUniformToLargestGridLayout {
      val address = segment.toRawLongValue()
      return makeIColumnMajorUniformToLargestGridLayout(Pointer(address))
    }

    public override fun toNative(obj: IColumnMajorUniformToLargestGridLayout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1595648815_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColumnMajorUniformToLargestGridLayout):
        Array<IColumnMajorUniformToLargestGridLayout?> = (elements as
        Array<IColumnMajorUniformToLargestGridLayout?>).castToImpl<IColumnMajorUniformToLargestGridLayout,IColumnMajorUniformToLargestGridLayout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColumnMajorUniformToLargestGridLayout?> =
        arrayOfNulls<IColumnMajorUniformToLargestGridLayout_Impl>(size) as
        Array<IColumnMajorUniformToLargestGridLayout?>
  }
}
