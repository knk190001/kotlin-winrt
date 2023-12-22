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

@ABIMarker(IRemoteSystemStatusTypeFilterFactory.ABI::class)
@Signature("{33cf78fa-d724-4125-ac7a-8d281e44c949}")
@Guid("33cf78fad7244125ac7a8d281e44c949")
@WinRTInterface("33cf78fad7244125ac7a8d281e44c949")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemStatusTypeFilterFactory.ByReference::class)
public interface IRemoteSystemStatusTypeFilterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(remoteSystemStatusType: RemoteSystemStatusType?): RemoteSystemStatusTypeFilter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemStatusTypeFilterFactory> {
    public override fun getValue() =
        ABI.makeIRemoteSystemStatusTypeFilterFactory(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemStatusTypeFilterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemStatusTypeFilterFactory {
    public val __49474094_Ptr: Pointer?

    public val _49474094_VtblPtr: Pointer?
      get() = __49474094_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(remoteSystemStatusType: RemoteSystemStatusType?):
        RemoteSystemStatusTypeFilter? {
      val fnPtr = _49474094_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemStatusTypeFilter>()
      val hr = fn.invokeHR(arrayOf(__49474094_Ptr, marshalToNative(remoteSystemStatusType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemStatusTypeFilter>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemStatusTypeFilterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __49474094_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemStatusTypeFilterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33cf78fad7244125ac7a8d281e44c949")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemStatusTypeFilterFactory(ptr: Pointer?): WithDefault =
        IRemoteSystemStatusTypeFilterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemStatusTypeFilterFactory {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemStatusTypeFilterFactory(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemStatusTypeFilterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__49474094_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemStatusTypeFilterFactory):
        Array<IRemoteSystemStatusTypeFilterFactory?> = (elements as
        Array<IRemoteSystemStatusTypeFilterFactory?>).castToImpl<IRemoteSystemStatusTypeFilterFactory,IRemoteSystemStatusTypeFilterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemStatusTypeFilterFactory?> =
        arrayOfNulls<IRemoteSystemStatusTypeFilterFactory_Impl>(size) as
        Array<IRemoteSystemStatusTypeFilterFactory?>
  }
}
