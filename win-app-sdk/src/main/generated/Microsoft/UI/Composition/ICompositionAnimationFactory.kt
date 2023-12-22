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

@ABIMarker(ICompositionAnimationFactory.ABI::class)
@Signature("{2ed278ca-4cca-5f7f-8d47-f930552a7769}")
@Guid("2ed278ca4cca5f7f8d47f930552a7769")
@WinRTInterface("2ed278ca4cca5f7f8d47f930552a7769")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionAnimationFactory.ByReference::class)
public interface ICompositionAnimationFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionAnimationFactory> {
    public override fun getValue() = ABI.makeICompositionAnimationFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionAnimationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionAnimationFactory {
    public val __226368247_Ptr: Pointer?

    public val _226368247_VtblPtr: Pointer?
      get() = __226368247_Ptr?.getPointer(0)
  }

  public class ICompositionAnimationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __226368247_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionAnimationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ed278ca4cca5f7f8d47f930552a7769")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionAnimationFactory(ptr: Pointer?): WithDefault =
        ICompositionAnimationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionAnimationFactory {
      val address = segment.toRawLongValue()
      return makeICompositionAnimationFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionAnimationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__226368247_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionAnimationFactory):
        Array<ICompositionAnimationFactory?> = (elements as
        Array<ICompositionAnimationFactory?>).castToImpl<ICompositionAnimationFactory,ICompositionAnimationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionAnimationFactory?> =
        arrayOfNulls<ICompositionAnimationFactory_Impl>(size) as
        Array<ICompositionAnimationFactory?>
  }
}
