package Microsoft.UI.Xaml.Media

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

@ABIMarker(IXamlCompositionBrushBaseOverrides.ABI::class)
@Signature("{8881b559-54a0-56c4-a79a-135152fb1dfa}")
@Guid("8881b55954a056c4a79a135152fb1dfa")
@WinRTInterface("8881b55954a056c4a79a135152fb1dfa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlCompositionBrushBaseOverrides.ByReference::class)
public interface IXamlCompositionBrushBaseOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnConnected(): Unit

  @InterfaceMethod(1)
  public fun OnDisconnected(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlCompositionBrushBaseOverrides> {
    public override fun getValue() =
        ABI.makeIXamlCompositionBrushBaseOverrides(pointer.getPointer(0))

    public fun setValue(value: IXamlCompositionBrushBaseOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlCompositionBrushBaseOverrides {
    public val __1839769869_Ptr: Pointer?

    public val _1839769869_VtblPtr: Pointer?
      get() = __1839769869_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnConnected(): Unit {
      val fnPtr = _1839769869_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1839769869_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnDisconnected(): Unit {
      val fnPtr = _1839769869_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1839769869_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlCompositionBrushBaseOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1839769869_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlCompositionBrushBaseOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8881b55954a056c4a79a135152fb1dfa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlCompositionBrushBaseOverrides(ptr: Pointer?): WithDefault =
        IXamlCompositionBrushBaseOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlCompositionBrushBaseOverrides {
      val address = segment.toRawLongValue()
      return makeIXamlCompositionBrushBaseOverrides(Pointer(address))
    }

    public override fun toNative(obj: IXamlCompositionBrushBaseOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1839769869_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlCompositionBrushBaseOverrides):
        Array<IXamlCompositionBrushBaseOverrides?> = (elements as
        Array<IXamlCompositionBrushBaseOverrides?>).castToImpl<IXamlCompositionBrushBaseOverrides,IXamlCompositionBrushBaseOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlCompositionBrushBaseOverrides?> =
        arrayOfNulls<IXamlCompositionBrushBaseOverrides_Impl>(size) as
        Array<IXamlCompositionBrushBaseOverrides?>
  }
}
