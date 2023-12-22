package Windows.System.RemoteSystems

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteSystemStatusTypeFilter.ABI::class)
@Signature("{0c39514e-cbb6-4777-8534-2e0c521affa2}")
@Guid("0c39514ecbb6477785342e0c521affa2")
@WinRTInterface("0c39514ecbb6477785342e0c521affa2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemStatusTypeFilter.ByReference::class)
public interface IRemoteSystemStatusTypeFilter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RemoteSystemStatusType(): RemoteSystemStatusType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemStatusTypeFilter> {
    public override fun getValue() = ABI.makeIRemoteSystemStatusTypeFilter(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemStatusTypeFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemStatusTypeFilter {
    public val __608036888_Ptr: Pointer?

    public val _608036888_VtblPtr: Pointer?
      get() = __608036888_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemoteSystemStatusType(): RemoteSystemStatusType? {
      val fnPtr = _608036888_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemStatusType>()
      val hr = fn.invokeHR(arrayOf(__608036888_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemStatusType>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemStatusTypeFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __608036888_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemStatusTypeFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c39514ecbb6477785342e0c521affa2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemStatusTypeFilter(ptr: Pointer?): WithDefault =
        IRemoteSystemStatusTypeFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemStatusTypeFilter {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemStatusTypeFilter(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemStatusTypeFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__608036888_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemStatusTypeFilter):
        Array<IRemoteSystemStatusTypeFilter?> = (elements as
        Array<IRemoteSystemStatusTypeFilter?>).castToImpl<IRemoteSystemStatusTypeFilter,IRemoteSystemStatusTypeFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemStatusTypeFilter?> =
        arrayOfNulls<IRemoteSystemStatusTypeFilter_Impl>(size) as
        Array<IRemoteSystemStatusTypeFilter?>
  }
}
