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

@ABIMarker(ICompositionTargetFactory.ABI::class)
@Signature("{93cd9d2b-8516-4b14-a8ce-f49e2119ec42}")
@Guid("93cd9d2b85164b14a8cef49e2119ec42")
@WinRTInterface("93cd9d2b85164b14a8cef49e2119ec42")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionTargetFactory.ByReference::class)
public interface ICompositionTargetFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionTargetFactory> {
    public override fun getValue() = ABI.makeICompositionTargetFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionTargetFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionTargetFactory {
    public val __718697891_Ptr: Pointer?

    public val _718697891_VtblPtr: Pointer?
      get() = __718697891_Ptr?.getPointer(0)
  }

  public class ICompositionTargetFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __718697891_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionTargetFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93cd9d2b85164b14a8cef49e2119ec42")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionTargetFactory(ptr: Pointer?): WithDefault =
        ICompositionTargetFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionTargetFactory {
      val address = segment.toRawLongValue()
      return makeICompositionTargetFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionTargetFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__718697891_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionTargetFactory):
        Array<ICompositionTargetFactory?> = (elements as
        Array<ICompositionTargetFactory?>).castToImpl<ICompositionTargetFactory,ICompositionTargetFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionTargetFactory?> =
        arrayOfNulls<ICompositionTargetFactory_Impl>(size) as Array<ICompositionTargetFactory?>
  }
}
