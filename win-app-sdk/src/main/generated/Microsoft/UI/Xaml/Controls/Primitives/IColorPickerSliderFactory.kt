package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IColorPickerSliderFactory.ABI::class)
@Signature("{d0cb1f0e-0771-5c7d-ba14-aa431179b2ac}")
@Guid("d0cb1f0e07715c7dba14aa431179b2ac")
@WinRTInterface("d0cb1f0e07715c7dba14aa431179b2ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorPickerSliderFactory.ByReference::class)
public interface IColorPickerSliderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ColorPickerSlider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorPickerSliderFactory> {
    public override fun getValue() = ABI.makeIColorPickerSliderFactory(pointer.getPointer(0))

    public fun setValue(value: IColorPickerSliderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorPickerSliderFactory {
    public val __2024969239_Ptr: Pointer?

    public val _2024969239_VtblPtr: Pointer?
      get() = __2024969239_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ColorPickerSlider? {
      val fnPtr = _2024969239_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorPickerSlider>()
      val hr = fn.invokeHR(arrayOf(__2024969239_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorPickerSlider>(result.getValue())
      return resultValue
    }
  }

  public class IColorPickerSliderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2024969239_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorPickerSliderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0cb1f0e07715c7dba14aa431179b2ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorPickerSliderFactory(ptr: Pointer?): WithDefault =
        IColorPickerSliderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorPickerSliderFactory {
      val address = segment.toRawLongValue()
      return makeIColorPickerSliderFactory(Pointer(address))
    }

    public override fun toNative(obj: IColorPickerSliderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2024969239_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorPickerSliderFactory):
        Array<IColorPickerSliderFactory?> = (elements as
        Array<IColorPickerSliderFactory?>).castToImpl<IColorPickerSliderFactory,IColorPickerSliderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorPickerSliderFactory?> =
        arrayOfNulls<IColorPickerSliderFactory_Impl>(size) as Array<IColorPickerSliderFactory?>
  }
}
