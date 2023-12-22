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

@ABIMarker(ICompositionShapeFactory.ABI::class)
@Signature("{7aa2b987-9cdd-5b6e-8ac1-e989d78b4811}")
@Guid("7aa2b9879cdd5b6e8ac1e989d78b4811")
@WinRTInterface("7aa2b9879cdd5b6e8ac1e989d78b4811")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionShapeFactory.ByReference::class)
public interface ICompositionShapeFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionShapeFactory> {
    public override fun getValue() = ABI.makeICompositionShapeFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionShapeFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionShapeFactory {
    public val __1304767674_Ptr: Pointer?

    public val _1304767674_VtblPtr: Pointer?
      get() = __1304767674_Ptr?.getPointer(0)
  }

  public class ICompositionShapeFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1304767674_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionShapeFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7aa2b9879cdd5b6e8ac1e989d78b4811")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionShapeFactory(ptr: Pointer?): WithDefault =
        ICompositionShapeFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionShapeFactory {
      val address = segment.toRawLongValue()
      return makeICompositionShapeFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionShapeFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1304767674_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionShapeFactory):
        Array<ICompositionShapeFactory?> = (elements as
        Array<ICompositionShapeFactory?>).castToImpl<ICompositionShapeFactory,ICompositionShapeFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionShapeFactory?> =
        arrayOfNulls<ICompositionShapeFactory_Impl>(size) as Array<ICompositionShapeFactory?>
  }
}
