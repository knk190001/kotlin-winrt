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

@ABIMarker(ICompositionClipFactory.ABI::class)
@Signature("{611dec65-d302-52bc-92ab-a295bd141ae4}")
@Guid("611dec65d30252bc92aba295bd141ae4")
@WinRTInterface("611dec65d30252bc92aba295bd141ae4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionClipFactory.ByReference::class)
public interface ICompositionClipFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionClipFactory> {
    public override fun getValue() = ABI.makeICompositionClipFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionClipFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionClipFactory {
    public val __1274586391_Ptr: Pointer?

    public val _1274586391_VtblPtr: Pointer?
      get() = __1274586391_Ptr?.getPointer(0)
  }

  public class ICompositionClipFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1274586391_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionClipFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("611dec65d30252bc92aba295bd141ae4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionClipFactory(ptr: Pointer?): WithDefault =
        ICompositionClipFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionClipFactory {
      val address = segment.toRawLongValue()
      return makeICompositionClipFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionClipFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1274586391_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionClipFactory): Array<ICompositionClipFactory?>
        = (elements as
        Array<ICompositionClipFactory?>).castToImpl<ICompositionClipFactory,ICompositionClipFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionClipFactory?> =
        arrayOfNulls<ICompositionClipFactory_Impl>(size) as Array<ICompositionClipFactory?>
  }
}
