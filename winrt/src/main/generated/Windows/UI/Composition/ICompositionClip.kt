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

@ABIMarker(ICompositionClip.ABI::class)
@Signature("{1ccd2a52-cfc7-4ace-9983-146bb8eb6a3c}")
@Guid("1ccd2a52cfc74ace9983146bb8eb6a3c")
@WinRTInterface("1ccd2a52cfc74ace9983146bb8eb6a3c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionClip.ByReference::class)
public interface ICompositionClip : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionClip> {
    public override fun getValue() = ABI.makeICompositionClip(pointer.getPointer(0))

    public fun setValue(value: ICompositionClip_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionClip {
    public val __510345900_Ptr: Pointer?

    public val _510345900_VtblPtr: Pointer?
      get() = __510345900_Ptr?.getPointer(0)
  }

  public class ICompositionClip_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __510345900_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionClip, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ccd2a52cfc74ace9983146bb8eb6a3c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionClip(ptr: Pointer?): WithDefault = ICompositionClip_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionClip {
      val address = segment.toRawLongValue()
      return makeICompositionClip(Pointer(address))
    }

    public override fun toNative(obj: ICompositionClip): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__510345900_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionClip): Array<ICompositionClip?> = (elements as
        Array<ICompositionClip?>).castToImpl<ICompositionClip,ICompositionClip_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionClip?> =
        arrayOfNulls<ICompositionClip_Impl>(size) as Array<ICompositionClip?>
  }
}
