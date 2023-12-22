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

@ABIMarker(ICompositionPath.ABI::class)
@Signature("{17c518c0-d7a2-54be-ac7f-c408562a6a20}")
@Guid("17c518c0d7a254beac7fc408562a6a20")
@WinRTInterface("17c518c0d7a254beac7fc408562a6a20")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionPath.ByReference::class)
public interface ICompositionPath : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionPath> {
    public override fun getValue() = ABI.makeICompositionPath(pointer.getPointer(0))

    public fun setValue(value: ICompositionPath_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionPath {
    public val __1402150986_Ptr: Pointer?

    public val _1402150986_VtblPtr: Pointer?
      get() = __1402150986_Ptr?.getPointer(0)
  }

  public class ICompositionPath_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1402150986_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionPath, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17c518c0d7a254beac7fc408562a6a20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionPath(ptr: Pointer?): WithDefault = ICompositionPath_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionPath {
      val address = segment.toRawLongValue()
      return makeICompositionPath(Pointer(address))
    }

    public override fun toNative(obj: ICompositionPath): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1402150986_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionPath): Array<ICompositionPath?> = (elements as
        Array<ICompositionPath?>).castToImpl<ICompositionPath,ICompositionPath_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionPath?> =
        arrayOfNulls<ICompositionPath_Impl>(size) as Array<ICompositionPath?>
  }
}
