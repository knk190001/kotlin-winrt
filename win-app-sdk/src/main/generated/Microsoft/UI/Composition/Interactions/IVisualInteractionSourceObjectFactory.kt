package Microsoft.UI.Composition.Interactions

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

@ABIMarker(IVisualInteractionSourceObjectFactory.ABI::class)
@Signature("{feb73102-238c-52aa-8e03-b68d5ecc44b3}")
@Guid("feb73102238c52aa8e03b68d5ecc44b3")
@WinRTInterface("feb73102238c52aa8e03b68d5ecc44b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualInteractionSourceObjectFactory.ByReference::class)
public interface IVisualInteractionSourceObjectFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualInteractionSourceObjectFactory> {
    public override fun getValue() =
        ABI.makeIVisualInteractionSourceObjectFactory(pointer.getPointer(0))

    public fun setValue(value: IVisualInteractionSourceObjectFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualInteractionSourceObjectFactory {
    public val __1806845960_Ptr: Pointer?

    public val _1806845960_VtblPtr: Pointer?
      get() = __1806845960_Ptr?.getPointer(0)
  }

  public class IVisualInteractionSourceObjectFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1806845960_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualInteractionSourceObjectFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("feb73102238c52aa8e03b68d5ecc44b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualInteractionSourceObjectFactory(ptr: Pointer?): WithDefault =
        IVisualInteractionSourceObjectFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualInteractionSourceObjectFactory {
      val address = segment.toRawLongValue()
      return makeIVisualInteractionSourceObjectFactory(Pointer(address))
    }

    public override fun toNative(obj: IVisualInteractionSourceObjectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1806845960_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualInteractionSourceObjectFactory):
        Array<IVisualInteractionSourceObjectFactory?> = (elements as
        Array<IVisualInteractionSourceObjectFactory?>).castToImpl<IVisualInteractionSourceObjectFactory,IVisualInteractionSourceObjectFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualInteractionSourceObjectFactory?> =
        arrayOfNulls<IVisualInteractionSourceObjectFactory_Impl>(size) as
        Array<IVisualInteractionSourceObjectFactory?>
  }
}
