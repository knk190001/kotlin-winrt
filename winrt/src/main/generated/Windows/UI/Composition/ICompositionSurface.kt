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

@ABIMarker(ICompositionSurface.ABI::class)
@Signature("{1527540d-42c7-47a6-a408-668f79a90dfb}")
@Guid("1527540d42c747a6a408668f79a90dfb")
@WinRTInterface("1527540d42c747a6a408668f79a90dfb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionSurface.ByReference::class)
public interface ICompositionSurface : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionSurface> {
    public override fun getValue() = ABI.makeICompositionSurface(pointer.getPointer(0))

    public fun setValue(value: ICompositionSurface_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionSurface {
    public val __1111408593_Ptr: Pointer?

    public val _1111408593_VtblPtr: Pointer?
      get() = __1111408593_Ptr?.getPointer(0)
  }

  public class ICompositionSurface_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1111408593_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionSurface, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1527540d42c747a6a408668f79a90dfb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionSurface(ptr: Pointer?): WithDefault = ICompositionSurface_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionSurface {
      val address = segment.toRawLongValue()
      return makeICompositionSurface(Pointer(address))
    }

    public override fun toNative(obj: ICompositionSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1111408593_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionSurface): Array<ICompositionSurface?> =
        (elements as
        Array<ICompositionSurface?>).castToImpl<ICompositionSurface,ICompositionSurface_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionSurface?> =
        arrayOfNulls<ICompositionSurface_Impl>(size) as Array<ICompositionSurface?>
  }
}
