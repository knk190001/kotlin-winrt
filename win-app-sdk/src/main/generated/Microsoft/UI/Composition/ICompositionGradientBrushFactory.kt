package Microsoft.UI.Composition

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionGradientBrushFactory.ABI::class)
@Signature("{b043b155-4b40-590d-a0d9-f8c1a7e0c88f}")
@Guid("b043b1554b40590da0d9f8c1a7e0c88f")
@WinRTInterface("b043b1554b40590da0d9f8c1a7e0c88f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionGradientBrushFactory.ByReference::class)
public interface ICompositionGradientBrushFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionGradientBrushFactory> {
    public override fun getValue() = ABI.makeICompositionGradientBrushFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionGradientBrushFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionGradientBrushFactory {
    public val __1213774161_Ptr: Pointer?

    public val _1213774161_VtblPtr: Pointer?
      get() = __1213774161_Ptr?.getPointer(0)
  }

  public class ICompositionGradientBrushFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1213774161_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionGradientBrushFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b043b1554b40590da0d9f8c1a7e0c88f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionGradientBrushFactory(ptr: Pointer?): WithDefault =
        ICompositionGradientBrushFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionGradientBrushFactory {
      val address = segment.toRawLongValue()
      return makeICompositionGradientBrushFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionGradientBrushFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1213774161_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionGradientBrushFactory):
        Array<ICompositionGradientBrushFactory?> = (elements as
        Array<ICompositionGradientBrushFactory?>).castToImpl<ICompositionGradientBrushFactory,ICompositionGradientBrushFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionGradientBrushFactory?> =
        arrayOfNulls<ICompositionGradientBrushFactory_Impl>(size) as
        Array<ICompositionGradientBrushFactory?>
  }
}
