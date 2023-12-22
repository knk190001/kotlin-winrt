package Windows.Security.Authorization.AppCapabilityAccess

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

@ABIMarker(IAppCapabilityAccessChangedEventArgs.ABI::class)
@Signature("{0a578d15-bdd7-457e-8cca-6f53bd2e5944}")
@Guid("0a578d15bdd7457e8cca6f53bd2e5944")
@WinRTInterface("0a578d15bdd7457e8cca6f53bd2e5944")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCapabilityAccessChangedEventArgs.ByReference::class)
public interface IAppCapabilityAccessChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCapabilityAccessChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppCapabilityAccessChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppCapabilityAccessChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCapabilityAccessChangedEventArgs {
    public val __566227268_Ptr: Pointer?

    public val _566227268_VtblPtr: Pointer?
      get() = __566227268_Ptr?.getPointer(0)
  }

  public class IAppCapabilityAccessChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __566227268_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCapabilityAccessChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0a578d15bdd7457e8cca6f53bd2e5944")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCapabilityAccessChangedEventArgs(ptr: Pointer?): WithDefault =
        IAppCapabilityAccessChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCapabilityAccessChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppCapabilityAccessChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppCapabilityAccessChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__566227268_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCapabilityAccessChangedEventArgs):
        Array<IAppCapabilityAccessChangedEventArgs?> = (elements as
        Array<IAppCapabilityAccessChangedEventArgs?>).castToImpl<IAppCapabilityAccessChangedEventArgs,IAppCapabilityAccessChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCapabilityAccessChangedEventArgs?> =
        arrayOfNulls<IAppCapabilityAccessChangedEventArgs_Impl>(size) as
        Array<IAppCapabilityAccessChangedEventArgs?>
  }
}
