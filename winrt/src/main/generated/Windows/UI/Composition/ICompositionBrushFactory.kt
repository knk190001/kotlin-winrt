package Windows.UI.Composition

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

@ABIMarker(ICompositionBrushFactory.ABI::class)
@Signature("{da53fb4c-4650-47c4-ad76-765379607ed6}")
@Guid("da53fb4c465047c4ad76765379607ed6")
@WinRTInterface("da53fb4c465047c4ad76765379607ed6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionBrushFactory.ByReference::class)
public interface ICompositionBrushFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionBrushFactory> {
    public override fun getValue() = ABI.makeICompositionBrushFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionBrushFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionBrushFactory {
    public val __1047855156_Ptr: Pointer?

    public val _1047855156_VtblPtr: Pointer?
      get() = __1047855156_Ptr?.getPointer(0)
  }

  public class ICompositionBrushFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1047855156_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionBrushFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da53fb4c465047c4ad76765379607ed6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionBrushFactory(ptr: Pointer?): WithDefault =
        ICompositionBrushFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionBrushFactory {
      val address = segment.toRawLongValue()
      return makeICompositionBrushFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionBrushFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1047855156_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionBrushFactory):
        Array<ICompositionBrushFactory?> = (elements as
        Array<ICompositionBrushFactory?>).castToImpl<ICompositionBrushFactory,ICompositionBrushFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionBrushFactory?> =
        arrayOfNulls<ICompositionBrushFactory_Impl>(size) as Array<ICompositionBrushFactory?>
  }
}
