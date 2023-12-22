package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IIconSourceOverrides.ABI::class)
@Signature("{9a02d369-1c79-5a81-871b-0b90946ba7f0}")
@Guid("9a02d3691c795a81871b0b90946ba7f0")
@WinRTInterface("9a02d3691c795a81871b0b90946ba7f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIconSourceOverrides.ByReference::class)
public interface IIconSourceOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateIconElementCore(): IconElement?

  @InterfaceMethod(1)
  public fun GetIconElementPropertyCore(iconSourceProperty: DependencyProperty?):
      DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIconSourceOverrides> {
    public override fun getValue() = ABI.makeIIconSourceOverrides(pointer.getPointer(0))

    public fun setValue(value: IIconSourceOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIconSourceOverrides {
    public val __1427729044_Ptr: Pointer?

    public val _1427729044_VtblPtr: Pointer?
      get() = __1427729044_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateIconElementCore(): IconElement? {
      val fnPtr = _1427729044_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconElement>()
      val hr = fn.invokeHR(arrayOf(__1427729044_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetIconElementPropertyCore(iconSourceProperty: DependencyProperty?):
        DependencyProperty? {
      val fnPtr = _1427729044_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1427729044_Ptr, marshalToNative(iconSourceProperty), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IIconSourceOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1427729044_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIconSourceOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a02d3691c795a81871b0b90946ba7f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIconSourceOverrides(ptr: Pointer?): WithDefault = IIconSourceOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIconSourceOverrides {
      val address = segment.toRawLongValue()
      return makeIIconSourceOverrides(Pointer(address))
    }

    public override fun toNative(obj: IIconSourceOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1427729044_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIconSourceOverrides): Array<IIconSourceOverrides?> =
        (elements as
        Array<IIconSourceOverrides?>).castToImpl<IIconSourceOverrides,IIconSourceOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIconSourceOverrides?> =
        arrayOfNulls<IIconSourceOverrides_Impl>(size) as Array<IIconSourceOverrides?>
  }
}
