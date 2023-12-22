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

@ABIMarker(ICompositionTransformFactory.ABI::class)
@Signature("{78cc7bf2-cdc0-59d2-9c04-8d208de7ef5e}")
@Guid("78cc7bf2cdc059d29c048d208de7ef5e")
@WinRTInterface("78cc7bf2cdc059d29c048d208de7ef5e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionTransformFactory.ByReference::class)
public interface ICompositionTransformFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionTransformFactory> {
    public override fun getValue() = ABI.makeICompositionTransformFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionTransformFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionTransformFactory {
    public val __2030791153_Ptr: Pointer?

    public val _2030791153_VtblPtr: Pointer?
      get() = __2030791153_Ptr?.getPointer(0)
  }

  public class ICompositionTransformFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2030791153_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionTransformFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("78cc7bf2cdc059d29c048d208de7ef5e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionTransformFactory(ptr: Pointer?): WithDefault =
        ICompositionTransformFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionTransformFactory {
      val address = segment.toRawLongValue()
      return makeICompositionTransformFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionTransformFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2030791153_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionTransformFactory):
        Array<ICompositionTransformFactory?> = (elements as
        Array<ICompositionTransformFactory?>).castToImpl<ICompositionTransformFactory,ICompositionTransformFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionTransformFactory?> =
        arrayOfNulls<ICompositionTransformFactory_Impl>(size) as
        Array<ICompositionTransformFactory?>
  }
}
