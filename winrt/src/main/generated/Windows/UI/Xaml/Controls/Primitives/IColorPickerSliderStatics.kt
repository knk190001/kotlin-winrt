package Windows.UI.Xaml.Controls.Primitives

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IColorPickerSliderStatics.ABI::class)
@Signature("{22eafc6a-9fe3-4eee-8734-a1398ec4413a}")
@Guid("22eafc6a9fe34eee8734a1398ec4413a")
@WinRTInterface("22eafc6a9fe34eee8734a1398ec4413a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorPickerSliderStatics.ByReference::class)
public interface IColorPickerSliderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ColorChannelProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorPickerSliderStatics> {
    public override fun getValue() = ABI.makeIColorPickerSliderStatics(pointer.getPointer(0))

    public fun setValue(value: IColorPickerSliderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorPickerSliderStatics {
    public val __1268425775_Ptr: Pointer?

    public val _1268425775_VtblPtr: Pointer?
      get() = __1268425775_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ColorChannelProperty(): DependencyProperty? {
      val fnPtr = _1268425775_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1268425775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IColorPickerSliderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1268425775_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorPickerSliderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("22eafc6a9fe34eee8734a1398ec4413a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorPickerSliderStatics(ptr: Pointer?): WithDefault =
        IColorPickerSliderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorPickerSliderStatics {
      val address = segment.toRawLongValue()
      return makeIColorPickerSliderStatics(Pointer(address))
    }

    public override fun toNative(obj: IColorPickerSliderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1268425775_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorPickerSliderStatics):
        Array<IColorPickerSliderStatics?> = (elements as
        Array<IColorPickerSliderStatics?>).castToImpl<IColorPickerSliderStatics,IColorPickerSliderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorPickerSliderStatics?> =
        arrayOfNulls<IColorPickerSliderStatics_Impl>(size) as Array<IColorPickerSliderStatics?>
  }
}
