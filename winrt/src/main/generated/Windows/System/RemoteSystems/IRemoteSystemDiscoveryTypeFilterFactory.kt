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

@ABIMarker(IRemoteSystemDiscoveryTypeFilterFactory.ABI::class)
@Signature("{9f9eb993-c260-4161-92f2-9c021f23fe5d}")
@Guid("9f9eb993c260416192f29c021f23fe5d")
@WinRTInterface("9f9eb993c260416192f29c021f23fe5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemDiscoveryTypeFilterFactory.ByReference::class)
public interface IRemoteSystemDiscoveryTypeFilterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(discoveryType: RemoteSystemDiscoveryType?): RemoteSystemDiscoveryTypeFilter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemDiscoveryTypeFilterFactory> {
    public override fun getValue() =
        ABI.makeIRemoteSystemDiscoveryTypeFilterFactory(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemDiscoveryTypeFilterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemDiscoveryTypeFilterFactory {
    public val __711638084_Ptr: Pointer?

    public val _711638084_VtblPtr: Pointer?
      get() = __711638084_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(discoveryType: RemoteSystemDiscoveryType?):
        RemoteSystemDiscoveryTypeFilter? {
      val fnPtr = _711638084_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemDiscoveryTypeFilter>()
      val hr = fn.invokeHR(arrayOf(__711638084_Ptr, marshalToNative(discoveryType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemDiscoveryTypeFilter>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemDiscoveryTypeFilterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __711638084_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemDiscoveryTypeFilterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f9eb993c260416192f29c021f23fe5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemDiscoveryTypeFilterFactory(ptr: Pointer?): WithDefault =
        IRemoteSystemDiscoveryTypeFilterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRemoteSystemDiscoveryTypeFilterFactory {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemDiscoveryTypeFilterFactory(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemDiscoveryTypeFilterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__711638084_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemDiscoveryTypeFilterFactory):
        Array<IRemoteSystemDiscoveryTypeFilterFactory?> = (elements as
        Array<IRemoteSystemDiscoveryTypeFilterFactory?>).castToImpl<IRemoteSystemDiscoveryTypeFilterFactory,IRemoteSystemDiscoveryTypeFilterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemDiscoveryTypeFilterFactory?> =
        arrayOfNulls<IRemoteSystemDiscoveryTypeFilterFactory_Impl>(size) as
        Array<IRemoteSystemDiscoveryTypeFilterFactory?>
  }
}
