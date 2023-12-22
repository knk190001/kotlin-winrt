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

@ABIMarker(IRemoteSystemAuthorizationKindFilterFactory.ABI::class)
@Signature("{ad65df4d-b66a-45a4-8177-8caed75d9e5a}")
@Guid("ad65df4db66a45a481778caed75d9e5a")
@WinRTInterface("ad65df4db66a45a481778caed75d9e5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemAuthorizationKindFilterFactory.ByReference::class)
public interface IRemoteSystemAuthorizationKindFilterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(remoteSystemAuthorizationKind: RemoteSystemAuthorizationKind?):
      RemoteSystemAuthorizationKindFilter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemAuthorizationKindFilterFactory> {
    public override fun getValue() =
        ABI.makeIRemoteSystemAuthorizationKindFilterFactory(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemAuthorizationKindFilterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemAuthorizationKindFilterFactory {
    public val __2100416519_Ptr: Pointer?

    public val _2100416519_VtblPtr: Pointer?
      get() = __2100416519_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(remoteSystemAuthorizationKind: RemoteSystemAuthorizationKind?):
        RemoteSystemAuthorizationKindFilter? {
      val fnPtr = _2100416519_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemAuthorizationKindFilter>()
      val hr = fn.invokeHR(arrayOf(__2100416519_Ptr, marshalToNative(remoteSystemAuthorizationKind),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemAuthorizationKindFilter>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemAuthorizationKindFilterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2100416519_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemAuthorizationKindFilterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ad65df4db66a45a481778caed75d9e5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemAuthorizationKindFilterFactory(ptr: Pointer?): WithDefault =
        IRemoteSystemAuthorizationKindFilterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRemoteSystemAuthorizationKindFilterFactory {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemAuthorizationKindFilterFactory(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemAuthorizationKindFilterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2100416519_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemAuthorizationKindFilterFactory):
        Array<IRemoteSystemAuthorizationKindFilterFactory?> = (elements as
        Array<IRemoteSystemAuthorizationKindFilterFactory?>).castToImpl<IRemoteSystemAuthorizationKindFilterFactory,IRemoteSystemAuthorizationKindFilterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemAuthorizationKindFilterFactory?> =
        arrayOfNulls<IRemoteSystemAuthorizationKindFilterFactory_Impl>(size) as
        Array<IRemoteSystemAuthorizationKindFilterFactory?>
  }
}
