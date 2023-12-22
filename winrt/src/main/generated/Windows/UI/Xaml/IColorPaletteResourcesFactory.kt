package Windows.UI.Xaml

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

@ABIMarker(IColorPaletteResourcesFactory.ABI::class)
@Signature("{a57f0783-1876-5cc0-8ea5-bc77b17e0f7e}")
@Guid("a57f078318765cc08ea5bc77b17e0f7e")
@WinRTInterface("a57f078318765cc08ea5bc77b17e0f7e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorPaletteResourcesFactory.ByReference::class)
public interface IColorPaletteResourcesFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      ColorPaletteResources?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorPaletteResourcesFactory> {
    public override fun getValue() = ABI.makeIColorPaletteResourcesFactory(pointer.getPointer(0))

    public fun setValue(value: IColorPaletteResourcesFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorPaletteResourcesFactory {
    public val __467579857_Ptr: Pointer?

    public val _467579857_VtblPtr: Pointer?
      get() = __467579857_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ColorPaletteResources? {
      val fnPtr = _467579857_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorPaletteResources>()
      val hr = fn.invokeHR(arrayOf(__467579857_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorPaletteResources>(result.getValue())
      return resultValue
    }
  }

  public class IColorPaletteResourcesFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __467579857_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorPaletteResourcesFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a57f078318765cc08ea5bc77b17e0f7e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorPaletteResourcesFactory(ptr: Pointer?): WithDefault =
        IColorPaletteResourcesFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorPaletteResourcesFactory {
      val address = segment.toRawLongValue()
      return makeIColorPaletteResourcesFactory(Pointer(address))
    }

    public override fun toNative(obj: IColorPaletteResourcesFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__467579857_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorPaletteResourcesFactory):
        Array<IColorPaletteResourcesFactory?> = (elements as
        Array<IColorPaletteResourcesFactory?>).castToImpl<IColorPaletteResourcesFactory,IColorPaletteResourcesFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorPaletteResourcesFactory?> =
        arrayOfNulls<IColorPaletteResourcesFactory_Impl>(size) as
        Array<IColorPaletteResourcesFactory?>
  }
}
