package Microsoft.UI.Xaml

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

@ABIMarker(IRectHelper.ABI::class)
@Signature("{5fece92a-a3d2-5bc0-aca1-e9e1fa86ae9d}")
@Guid("5fece92aa3d25bc0aca1e9e1fa86ae9d")
@WinRTInterface("5fece92aa3d25bc0aca1e9e1fa86ae9d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRectHelper.ByReference::class)
public interface IRectHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRectHelper> {
    public override fun getValue() = ABI.makeIRectHelper(pointer.getPointer(0))

    public fun setValue(value: IRectHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRectHelper {
    public val __1284286009_Ptr: Pointer?

    public val _1284286009_VtblPtr: Pointer?
      get() = __1284286009_Ptr?.getPointer(0)
  }

  public class IRectHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1284286009_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRectHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5fece92aa3d25bc0aca1e9e1fa86ae9d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRectHelper(ptr: Pointer?): WithDefault = IRectHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRectHelper {
      val address = segment.toRawLongValue()
      return makeIRectHelper(Pointer(address))
    }

    public override fun toNative(obj: IRectHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1284286009_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRectHelper): Array<IRectHelper?> = (elements as
        Array<IRectHelper?>).castToImpl<IRectHelper,IRectHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRectHelper?> =
        arrayOfNulls<IRectHelper_Impl>(size) as Array<IRectHelper?>
  }
}
