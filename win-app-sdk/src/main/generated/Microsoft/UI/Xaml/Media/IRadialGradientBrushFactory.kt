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

@ABIMarker(IRadialGradientBrushFactory.ABI::class)
@Signature("{d90ba26e-9e67-54bd-a2d9-61c8f9f1d433}")
@Guid("d90ba26e9e6754bda2d961c8f9f1d433")
@WinRTInterface("d90ba26e9e6754bda2d961c8f9f1d433")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialGradientBrushFactory.ByReference::class)
public interface IRadialGradientBrushFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      RadialGradientBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialGradientBrushFactory> {
    public override fun getValue() = ABI.makeIRadialGradientBrushFactory(pointer.getPointer(0))

    public fun setValue(value: IRadialGradientBrushFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialGradientBrushFactory {
    public val __509606544_Ptr: Pointer?

    public val _509606544_VtblPtr: Pointer?
      get() = __509606544_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RadialGradientBrush? {
      val fnPtr = _509606544_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialGradientBrush>()
      val hr = fn.invokeHR(arrayOf(__509606544_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialGradientBrush>(result.getValue())
      return resultValue
    }
  }

  public class IRadialGradientBrushFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __509606544_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialGradientBrushFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d90ba26e9e6754bda2d961c8f9f1d433")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialGradientBrushFactory(ptr: Pointer?): WithDefault =
        IRadialGradientBrushFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialGradientBrushFactory {
      val address = segment.toRawLongValue()
      return makeIRadialGradientBrushFactory(Pointer(address))
    }

    public override fun toNative(obj: IRadialGradientBrushFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__509606544_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialGradientBrushFactory):
        Array<IRadialGradientBrushFactory?> = (elements as
        Array<IRadialGradientBrushFactory?>).castToImpl<IRadialGradientBrushFactory,IRadialGradientBrushFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialGradientBrushFactory?> =
        arrayOfNulls<IRadialGradientBrushFactory_Impl>(size) as Array<IRadialGradientBrushFactory?>
  }
}
