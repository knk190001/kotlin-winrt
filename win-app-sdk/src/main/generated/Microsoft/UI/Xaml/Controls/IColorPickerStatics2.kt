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

@ABIMarker(IColorPickerStatics2.ABI::class)
@Signature("{2f4af95b-81cf-5304-9950-49ec934c1b35}")
@Guid("2f4af95b81cf5304995049ec934c1b35")
@WinRTInterface("2f4af95b81cf5304995049ec934c1b35")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorPickerStatics2.ByReference::class)
public interface IColorPickerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OrientationProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorPickerStatics2> {
    public override fun getValue() = ABI.makeIColorPickerStatics2(pointer.getPointer(0))

    public fun setValue(value: IColorPickerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorPickerStatics2 {
    public val __1697939241_Ptr: Pointer?

    public val _1697939241_VtblPtr: Pointer?
      get() = __1697939241_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OrientationProperty(): DependencyProperty? {
      val fnPtr = _1697939241_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1697939241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IColorPickerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1697939241_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorPickerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f4af95b81cf5304995049ec934c1b35")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorPickerStatics2(ptr: Pointer?): WithDefault = IColorPickerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorPickerStatics2 {
      val address = segment.toRawLongValue()
      return makeIColorPickerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IColorPickerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1697939241_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorPickerStatics2): Array<IColorPickerStatics2?> =
        (elements as
        Array<IColorPickerStatics2?>).castToImpl<IColorPickerStatics2,IColorPickerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorPickerStatics2?> =
        arrayOfNulls<IColorPickerStatics2_Impl>(size) as Array<IColorPickerStatics2?>
  }
}
