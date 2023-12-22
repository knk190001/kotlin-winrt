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

@ABIMarker(IRemoteSystemDiscoveryTypeFilter.ABI::class)
@Signature("{42d9041f-ee5a-43da-ac6a-6fee25460741}")
@Guid("42d9041fee5a43daac6a6fee25460741")
@WinRTInterface("42d9041fee5a43daac6a6fee25460741")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemDiscoveryTypeFilter.ByReference::class)
public interface IRemoteSystemDiscoveryTypeFilter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RemoteSystemDiscoveryType(): RemoteSystemDiscoveryType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemDiscoveryTypeFilter> {
    public override fun getValue() = ABI.makeIRemoteSystemDiscoveryTypeFilter(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemDiscoveryTypeFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemDiscoveryTypeFilter {
    public val __2133643922_Ptr: Pointer?

    public val _2133643922_VtblPtr: Pointer?
      get() = __2133643922_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemoteSystemDiscoveryType(): RemoteSystemDiscoveryType? {
      val fnPtr = _2133643922_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemDiscoveryType>()
      val hr = fn.invokeHR(arrayOf(__2133643922_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemDiscoveryType>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemDiscoveryTypeFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2133643922_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemDiscoveryTypeFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("42d9041fee5a43daac6a6fee25460741")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemDiscoveryTypeFilter(ptr: Pointer?): WithDefault =
        IRemoteSystemDiscoveryTypeFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemDiscoveryTypeFilter {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemDiscoveryTypeFilter(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemDiscoveryTypeFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2133643922_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemDiscoveryTypeFilter):
        Array<IRemoteSystemDiscoveryTypeFilter?> = (elements as
        Array<IRemoteSystemDiscoveryTypeFilter?>).castToImpl<IRemoteSystemDiscoveryTypeFilter,IRemoteSystemDiscoveryTypeFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemDiscoveryTypeFilter?> =
        arrayOfNulls<IRemoteSystemDiscoveryTypeFilter_Impl>(size) as
        Array<IRemoteSystemDiscoveryTypeFilter?>
  }
}
