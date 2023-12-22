package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IColumnMajorUniformToLargestGridLayoutStatics.ABI::class)
@Signature("{7b2f0ec6-2345-5986-a5b9-b1beb5a74350}")
@Guid("7b2f0ec623455986a5b9b1beb5a74350")
@WinRTInterface("7b2f0ec623455986a5b9b1beb5a74350")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColumnMajorUniformToLargestGridLayoutStatics.ByReference::class)
public interface IColumnMajorUniformToLargestGridLayoutStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxColumnsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ColumnSpacingProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_RowSpacingProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColumnMajorUniformToLargestGridLayoutStatics> {
    public override fun getValue() =
        ABI.makeIColumnMajorUniformToLargestGridLayoutStatics(pointer.getPointer(0))

    public fun setValue(value: IColumnMajorUniformToLargestGridLayoutStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColumnMajorUniformToLargestGridLayoutStatics {
    public val __369505898_Ptr: Pointer?

    public val _369505898_VtblPtr: Pointer?
      get() = __369505898_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxColumnsProperty(): DependencyProperty? {
      val fnPtr = _369505898_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__369505898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ColumnSpacingProperty(): DependencyProperty? {
      val fnPtr = _369505898_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__369505898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RowSpacingProperty(): DependencyProperty? {
      val fnPtr = _369505898_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__369505898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IColumnMajorUniformToLargestGridLayoutStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __369505898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColumnMajorUniformToLargestGridLayoutStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b2f0ec623455986a5b9b1beb5a74350")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColumnMajorUniformToLargestGridLayoutStatics(ptr: Pointer?): WithDefault =
        IColumnMajorUniformToLargestGridLayoutStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IColumnMajorUniformToLargestGridLayoutStatics {
      val address = segment.toRawLongValue()
      return makeIColumnMajorUniformToLargestGridLayoutStatics(Pointer(address))
    }

    public override fun toNative(obj: IColumnMajorUniformToLargestGridLayoutStatics): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__369505898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColumnMajorUniformToLargestGridLayoutStatics):
        Array<IColumnMajorUniformToLargestGridLayoutStatics?> = (elements as
        Array<IColumnMajorUniformToLargestGridLayoutStatics?>).castToImpl<IColumnMajorUniformToLargestGridLayoutStatics,IColumnMajorUniformToLargestGridLayoutStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColumnMajorUniformToLargestGridLayoutStatics?> =
        arrayOfNulls<IColumnMajorUniformToLargestGridLayoutStatics_Impl>(size) as
        Array<IColumnMajorUniformToLargestGridLayoutStatics?>
  }
}
