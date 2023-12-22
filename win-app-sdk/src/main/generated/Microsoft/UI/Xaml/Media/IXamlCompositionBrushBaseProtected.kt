package Microsoft.UI.Xaml.Media

import Microsoft.UI.Composition.CompositionBrush
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

@ABIMarker(IXamlCompositionBrushBaseProtected.ABI::class)
@Signature("{6617e1a5-e27a-5b95-b03e-6758b58f92a0}")
@Guid("6617e1a5e27a5b95b03e6758b58f92a0")
@WinRTInterface("6617e1a5e27a5b95b03e6758b58f92a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlCompositionBrushBaseProtected.ByReference::class)
public interface IXamlCompositionBrushBaseProtected : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CompositionBrush(): CompositionBrush?

  @InterfaceMethod(1)
  public fun put_CompositionBrush(value: CompositionBrush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlCompositionBrushBaseProtected> {
    public override fun getValue() =
        ABI.makeIXamlCompositionBrushBaseProtected(pointer.getPointer(0))

    public fun setValue(value: IXamlCompositionBrushBaseProtected_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlCompositionBrushBaseProtected {
    public val __1981200020_Ptr: Pointer?

    public val _1981200020_VtblPtr: Pointer?
      get() = __1981200020_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CompositionBrush(): CompositionBrush? {
      val fnPtr = _1981200020_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__1981200020_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CompositionBrush(value: CompositionBrush?): Unit {
      val fnPtr = _1981200020_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1981200020_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlCompositionBrushBaseProtected_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1981200020_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlCompositionBrushBaseProtected, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6617e1a5e27a5b95b03e6758b58f92a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlCompositionBrushBaseProtected(ptr: Pointer?): WithDefault =
        IXamlCompositionBrushBaseProtected_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlCompositionBrushBaseProtected {
      val address = segment.toRawLongValue()
      return makeIXamlCompositionBrushBaseProtected(Pointer(address))
    }

    public override fun toNative(obj: IXamlCompositionBrushBaseProtected): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1981200020_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlCompositionBrushBaseProtected):
        Array<IXamlCompositionBrushBaseProtected?> = (elements as
        Array<IXamlCompositionBrushBaseProtected?>).castToImpl<IXamlCompositionBrushBaseProtected,IXamlCompositionBrushBaseProtected_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlCompositionBrushBaseProtected?> =
        arrayOfNulls<IXamlCompositionBrushBaseProtected_Impl>(size) as
        Array<IXamlCompositionBrushBaseProtected?>
  }
}
