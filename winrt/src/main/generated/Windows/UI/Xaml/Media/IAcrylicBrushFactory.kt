package Windows.UI.Xaml.Media

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

@ABIMarker(IAcrylicBrushFactory.ABI::class)
@Signature("{81a32568-f6cc-4013-8363-928ae23b7a61}")
@Guid("81a32568f6cc40138363928ae23b7a61")
@WinRTInterface("81a32568f6cc40138363928ae23b7a61")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAcrylicBrushFactory.ByReference::class)
public interface IAcrylicBrushFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): AcrylicBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAcrylicBrushFactory> {
    public override fun getValue() = ABI.makeIAcrylicBrushFactory(pointer.getPointer(0))

    public fun setValue(value: IAcrylicBrushFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAcrylicBrushFactory {
    public val __1891932783_Ptr: Pointer?

    public val _1891932783_VtblPtr: Pointer?
      get() = __1891932783_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        AcrylicBrush? {
      val fnPtr = _1891932783_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AcrylicBrush>()
      val hr = fn.invokeHR(arrayOf(__1891932783_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AcrylicBrush>(result.getValue())
      return resultValue
    }
  }

  public class IAcrylicBrushFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1891932783_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAcrylicBrushFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81a32568f6cc40138363928ae23b7a61")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAcrylicBrushFactory(ptr: Pointer?): WithDefault = IAcrylicBrushFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAcrylicBrushFactory {
      val address = segment.toRawLongValue()
      return makeIAcrylicBrushFactory(Pointer(address))
    }

    public override fun toNative(obj: IAcrylicBrushFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1891932783_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAcrylicBrushFactory): Array<IAcrylicBrushFactory?> =
        (elements as
        Array<IAcrylicBrushFactory?>).castToImpl<IAcrylicBrushFactory,IAcrylicBrushFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAcrylicBrushFactory?> =
        arrayOfNulls<IAcrylicBrushFactory_Impl>(size) as Array<IAcrylicBrushFactory?>
  }
}
