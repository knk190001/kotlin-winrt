package Windows.UI.WindowManagement

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

@ABIMarker(IWindowingEnvironmentChangedEventArgs.ABI::class)
@Signature("{4160cfc6-023d-5e9a-b431-350e67dc978a}")
@Guid("4160cfc6023d5e9ab431350e67dc978a")
@WinRTInterface("4160cfc6023d5e9ab431350e67dc978a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowingEnvironmentChangedEventArgs.ByReference::class)
public interface IWindowingEnvironmentChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowingEnvironmentChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIWindowingEnvironmentChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWindowingEnvironmentChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowingEnvironmentChangedEventArgs {
    public val __888774091_Ptr: Pointer?

    public val _888774091_VtblPtr: Pointer?
      get() = __888774091_Ptr?.getPointer(0)
  }

  public class IWindowingEnvironmentChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __888774091_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowingEnvironmentChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4160cfc6023d5e9ab431350e67dc978a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowingEnvironmentChangedEventArgs(ptr: Pointer?): WithDefault =
        IWindowingEnvironmentChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowingEnvironmentChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWindowingEnvironmentChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWindowingEnvironmentChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__888774091_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowingEnvironmentChangedEventArgs):
        Array<IWindowingEnvironmentChangedEventArgs?> = (elements as
        Array<IWindowingEnvironmentChangedEventArgs?>).castToImpl<IWindowingEnvironmentChangedEventArgs,IWindowingEnvironmentChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowingEnvironmentChangedEventArgs?> =
        arrayOfNulls<IWindowingEnvironmentChangedEventArgs_Impl>(size) as
        Array<IWindowingEnvironmentChangedEventArgs?>
  }
}
