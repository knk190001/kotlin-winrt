package Windows.System.RemoteSystems

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

@ABIMarker(IRemoteSystemFilter.ABI::class)
@Signature("{4a3ba9e4-99eb-45eb-ba16-0367728ff374}")
@Guid("4a3ba9e499eb45ebba160367728ff374")
@WinRTInterface("4a3ba9e499eb45ebba160367728ff374")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemFilter.ByReference::class)
public interface IRemoteSystemFilter : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemFilter> {
    public override fun getValue() = ABI.makeIRemoteSystemFilter(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemFilter {
    public val __31591340_Ptr: Pointer?

    public val _31591340_VtblPtr: Pointer?
      get() = __31591340_Ptr?.getPointer(0)
  }

  public class IRemoteSystemFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __31591340_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a3ba9e499eb45ebba160367728ff374")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemFilter(ptr: Pointer?): WithDefault = IRemoteSystemFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemFilter {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemFilter(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__31591340_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemFilter): Array<IRemoteSystemFilter?> =
        (elements as
        Array<IRemoteSystemFilter?>).castToImpl<IRemoteSystemFilter,IRemoteSystemFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemFilter?> =
        arrayOfNulls<IRemoteSystemFilter_Impl>(size) as Array<IRemoteSystemFilter?>
  }
}
