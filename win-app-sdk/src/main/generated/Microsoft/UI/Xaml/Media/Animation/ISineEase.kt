package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(ISineEase.ABI::class)
@Signature("{6115539b-663d-5131-b7c2-74bb5fdc6a1d}")
@Guid("6115539b663d5131b7c274bb5fdc6a1d")
@WinRTInterface("6115539b663d5131b7c274bb5fdc6a1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISineEase.ByReference::class)
public interface ISineEase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISineEase> {
    public override fun getValue() = ABI.makeISineEase(pointer.getPointer(0))

    public fun setValue(value: ISineEase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISineEase {
    public val __500345622_Ptr: Pointer?

    public val _500345622_VtblPtr: Pointer?
      get() = __500345622_Ptr?.getPointer(0)
  }

  public class ISineEase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __500345622_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISineEase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6115539b663d5131b7c274bb5fdc6a1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISineEase(ptr: Pointer?): WithDefault = ISineEase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISineEase {
      val address = segment.toRawLongValue()
      return makeISineEase(Pointer(address))
    }

    public override fun toNative(obj: ISineEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__500345622_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISineEase): Array<ISineEase?> = (elements as
        Array<ISineEase?>).castToImpl<ISineEase,ISineEase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISineEase?> = arrayOfNulls<ISineEase_Impl>(size)
        as Array<ISineEase?>
  }
}
