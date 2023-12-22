package Microsoft.UI.Xaml.Media

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

@ABIMarker(IGradientBrushFactory.ABI::class)
@Signature("{64ff6177-1eda-565b-b7aa-ac50152e3136}")
@Guid("64ff61771eda565bb7aaac50152e3136")
@WinRTInterface("64ff61771eda565bb7aaac50152e3136")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGradientBrushFactory.ByReference::class)
public interface IGradientBrushFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): GradientBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGradientBrushFactory> {
    public override fun getValue() = ABI.makeIGradientBrushFactory(pointer.getPointer(0))

    public fun setValue(value: IGradientBrushFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGradientBrushFactory {
    public val __407079567_Ptr: Pointer?

    public val _407079567_VtblPtr: Pointer?
      get() = __407079567_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        GradientBrush? {
      val fnPtr = _407079567_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GradientBrush>()
      val hr = fn.invokeHR(arrayOf(__407079567_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GradientBrush>(result.getValue())
      return resultValue
    }
  }

  public class IGradientBrushFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __407079567_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGradientBrushFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64ff61771eda565bb7aaac50152e3136")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGradientBrushFactory(ptr: Pointer?): WithDefault =
        IGradientBrushFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGradientBrushFactory {
      val address = segment.toRawLongValue()
      return makeIGradientBrushFactory(Pointer(address))
    }

    public override fun toNative(obj: IGradientBrushFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__407079567_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGradientBrushFactory): Array<IGradientBrushFactory?> =
        (elements as
        Array<IGradientBrushFactory?>).castToImpl<IGradientBrushFactory,IGradientBrushFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGradientBrushFactory?> =
        arrayOfNulls<IGradientBrushFactory_Impl>(size) as Array<IGradientBrushFactory?>
  }
}
