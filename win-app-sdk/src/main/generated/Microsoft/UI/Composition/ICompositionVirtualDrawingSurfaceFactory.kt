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

@ABIMarker(ICompositionVirtualDrawingSurfaceFactory.ABI::class)
@Signature("{85895891-3f06-52e2-b5ea-d1fb595f6574}")
@Guid("858958913f0652e2b5ead1fb595f6574")
@WinRTInterface("858958913f0652e2b5ead1fb595f6574")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionVirtualDrawingSurfaceFactory.ByReference::class)
public interface ICompositionVirtualDrawingSurfaceFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionVirtualDrawingSurfaceFactory> {
    public override fun getValue() =
        ABI.makeICompositionVirtualDrawingSurfaceFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionVirtualDrawingSurfaceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionVirtualDrawingSurfaceFactory {
    public val __725626463_Ptr: Pointer?

    public val _725626463_VtblPtr: Pointer?
      get() = __725626463_Ptr?.getPointer(0)
  }

  public class ICompositionVirtualDrawingSurfaceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __725626463_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionVirtualDrawingSurfaceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("858958913f0652e2b5ead1fb595f6574")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionVirtualDrawingSurfaceFactory(ptr: Pointer?): WithDefault =
        ICompositionVirtualDrawingSurfaceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICompositionVirtualDrawingSurfaceFactory {
      val address = segment.toRawLongValue()
      return makeICompositionVirtualDrawingSurfaceFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionVirtualDrawingSurfaceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__725626463_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionVirtualDrawingSurfaceFactory):
        Array<ICompositionVirtualDrawingSurfaceFactory?> = (elements as
        Array<ICompositionVirtualDrawingSurfaceFactory?>).castToImpl<ICompositionVirtualDrawingSurfaceFactory,ICompositionVirtualDrawingSurfaceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionVirtualDrawingSurfaceFactory?> =
        arrayOfNulls<ICompositionVirtualDrawingSurfaceFactory_Impl>(size) as
        Array<ICompositionVirtualDrawingSurfaceFactory?>
  }
}
