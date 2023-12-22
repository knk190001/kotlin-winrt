package Windows.UI.Xaml.Controls

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

@ABIMarker(IColorPickerFactory.ABI::class)
@Signature("{abae07ff-aecf-481d-9204-201c3894cd1b}")
@Guid("abae07ffaecf481d9204201c3894cd1b")
@WinRTInterface("abae07ffaecf481d9204201c3894cd1b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorPickerFactory.ByReference::class)
public interface IColorPickerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ColorPicker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorPickerFactory> {
    public override fun getValue() = ABI.makeIColorPickerFactory(pointer.getPointer(0))

    public fun setValue(value: IColorPickerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorPickerFactory {
    public val __39843051_Ptr: Pointer?

    public val _39843051_VtblPtr: Pointer?
      get() = __39843051_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ColorPicker? {
      val fnPtr = _39843051_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorPicker>()
      val hr = fn.invokeHR(arrayOf(__39843051_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorPicker>(result.getValue())
      return resultValue
    }
  }

  public class IColorPickerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __39843051_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorPickerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("abae07ffaecf481d9204201c3894cd1b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorPickerFactory(ptr: Pointer?): WithDefault = IColorPickerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorPickerFactory {
      val address = segment.toRawLongValue()
      return makeIColorPickerFactory(Pointer(address))
    }

    public override fun toNative(obj: IColorPickerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__39843051_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorPickerFactory): Array<IColorPickerFactory?> =
        (elements as
        Array<IColorPickerFactory?>).castToImpl<IColorPickerFactory,IColorPickerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorPickerFactory?> =
        arrayOfNulls<IColorPickerFactory_Impl>(size) as Array<IColorPickerFactory?>
  }
}
