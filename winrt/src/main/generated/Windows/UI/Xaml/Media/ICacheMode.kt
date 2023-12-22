package Windows.UI.Xaml.Media

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

@ABIMarker(ICacheMode.ABI::class)
@Signature("{98dc8b11-c6f9-4dab-b838-5fd5ec8c7350}")
@Guid("98dc8b11c6f94dabb8385fd5ec8c7350")
@WinRTInterface("98dc8b11c6f94dabb8385fd5ec8c7350")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICacheMode.ByReference::class)
public interface ICacheMode : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICacheMode> {
    public override fun getValue() = ABI.makeICacheMode(pointer.getPointer(0))

    public fun setValue(value: ICacheMode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICacheMode {
    public val __2048444983_Ptr: Pointer?

    public val _2048444983_VtblPtr: Pointer?
      get() = __2048444983_Ptr?.getPointer(0)
  }

  public class ICacheMode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2048444983_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICacheMode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("98dc8b11c6f94dabb8385fd5ec8c7350")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICacheMode(ptr: Pointer?): WithDefault = ICacheMode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICacheMode {
      val address = segment.toRawLongValue()
      return makeICacheMode(Pointer(address))
    }

    public override fun toNative(obj: ICacheMode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2048444983_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICacheMode): Array<ICacheMode?> = (elements as
        Array<ICacheMode?>).castToImpl<ICacheMode,ICacheMode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICacheMode?> = arrayOfNulls<ICacheMode_Impl>(size)
        as Array<ICacheMode?>
  }
}
