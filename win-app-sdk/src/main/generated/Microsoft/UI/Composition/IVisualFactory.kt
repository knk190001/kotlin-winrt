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

@ABIMarker(IVisualFactory.ABI::class)
@Signature("{77bb4668-83fa-5bb5-b78b-5e6fdc3d4038}")
@Guid("77bb466883fa5bb5b78b5e6fdc3d4038")
@WinRTInterface("77bb466883fa5bb5b78b5e6fdc3d4038")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualFactory.ByReference::class)
public interface IVisualFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVisualFactory>
      {
    public override fun getValue() = ABI.makeIVisualFactory(pointer.getPointer(0))

    public fun setValue(value: IVisualFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualFactory {
    public val __103775695_Ptr: Pointer?

    public val _103775695_VtblPtr: Pointer?
      get() = __103775695_Ptr?.getPointer(0)
  }

  public class IVisualFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __103775695_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("77bb466883fa5bb5b78b5e6fdc3d4038")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualFactory(ptr: Pointer?): WithDefault = IVisualFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualFactory {
      val address = segment.toRawLongValue()
      return makeIVisualFactory(Pointer(address))
    }

    public override fun toNative(obj: IVisualFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__103775695_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualFactory): Array<IVisualFactory?> = (elements as
        Array<IVisualFactory?>).castToImpl<IVisualFactory,IVisualFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualFactory?> =
        arrayOfNulls<IVisualFactory_Impl>(size) as Array<IVisualFactory?>
  }
}
