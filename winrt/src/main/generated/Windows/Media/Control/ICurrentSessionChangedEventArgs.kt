package Windows.Media.Control

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

@ABIMarker(ICurrentSessionChangedEventArgs.ABI::class)
@Signature("{6969cb39-0bfa-5fe0-8d73-09cc5e5408e1}")
@Guid("6969cb390bfa5fe08d7309cc5e5408e1")
@WinRTInterface("6969cb390bfa5fe08d7309cc5e5408e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrentSessionChangedEventArgs.ByReference::class)
public interface ICurrentSessionChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrentSessionChangedEventArgs> {
    public override fun getValue() = ABI.makeICurrentSessionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICurrentSessionChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrentSessionChangedEventArgs {
    public val __859093025_Ptr: Pointer?

    public val _859093025_VtblPtr: Pointer?
      get() = __859093025_Ptr?.getPointer(0)
  }

  public class ICurrentSessionChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __859093025_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrentSessionChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6969cb390bfa5fe08d7309cc5e5408e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrentSessionChangedEventArgs(ptr: Pointer?): WithDefault =
        ICurrentSessionChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICurrentSessionChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeICurrentSessionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICurrentSessionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__859093025_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrentSessionChangedEventArgs):
        Array<ICurrentSessionChangedEventArgs?> = (elements as
        Array<ICurrentSessionChangedEventArgs?>).castToImpl<ICurrentSessionChangedEventArgs,ICurrentSessionChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrentSessionChangedEventArgs?> =
        arrayOfNulls<ICurrentSessionChangedEventArgs_Impl>(size) as
        Array<ICurrentSessionChangedEventArgs?>
  }
}
