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

@ABIMarker(IColorSpectrumFactory.ABI::class)
@Signature("{efecd442-8c2a-50a6-88a3-3999ea01f096}")
@Guid("efecd4428c2a50a688a33999ea01f096")
@WinRTInterface("efecd4428c2a50a688a33999ea01f096")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorSpectrumFactory.ByReference::class)
public interface IColorSpectrumFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ColorSpectrum?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorSpectrumFactory> {
    public override fun getValue() = ABI.makeIColorSpectrumFactory(pointer.getPointer(0))

    public fun setValue(value: IColorSpectrumFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorSpectrumFactory {
    public val __1660995559_Ptr: Pointer?

    public val _1660995559_VtblPtr: Pointer?
      get() = __1660995559_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ColorSpectrum? {
      val fnPtr = _1660995559_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorSpectrum>()
      val hr = fn.invokeHR(arrayOf(__1660995559_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorSpectrum>(result.getValue())
      return resultValue
    }
  }

  public class IColorSpectrumFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1660995559_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorSpectrumFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("efecd4428c2a50a688a33999ea01f096")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorSpectrumFactory(ptr: Pointer?): WithDefault =
        IColorSpectrumFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorSpectrumFactory {
      val address = segment.toRawLongValue()
      return makeIColorSpectrumFactory(Pointer(address))
    }

    public override fun toNative(obj: IColorSpectrumFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1660995559_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorSpectrumFactory): Array<IColorSpectrumFactory?> =
        (elements as
        Array<IColorSpectrumFactory?>).castToImpl<IColorSpectrumFactory,IColorSpectrumFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorSpectrumFactory?> =
        arrayOfNulls<IColorSpectrumFactory_Impl>(size) as Array<IColorSpectrumFactory?>
  }
}
