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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteSystemSessionMessageChannelFactory.ABI::class)
@Signature("{295e1c4a-bd16-4298-b7ce-415482b0e11d}")
@Guid("295e1c4abd164298b7ce415482b0e11d")
@WinRTInterface("295e1c4abd164298b7ce415482b0e11d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionMessageChannelFactory.ByReference::class)
public interface IRemoteSystemSessionMessageChannelFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(session: RemoteSystemSession?, channelName: String?):
      RemoteSystemSessionMessageChannel?

  @InterfaceMethod(1)
  public fun Create(
    session: RemoteSystemSession?,
    channelName: String?,
    reliability: RemoteSystemSessionMessageChannelReliability?
  ): RemoteSystemSessionMessageChannel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionMessageChannelFactory> {
    public override fun getValue() =
        ABI.makeIRemoteSystemSessionMessageChannelFactory(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionMessageChannelFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionMessageChannelFactory {
    public val __979676844_Ptr: Pointer?

    public val _979676844_VtblPtr: Pointer?
      get() = __979676844_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(session: RemoteSystemSession?, channelName: String?):
        RemoteSystemSessionMessageChannel? {
      val fnPtr = _979676844_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionMessageChannel>()
      val hr = fn.invokeHR(arrayOf(__979676844_Ptr, marshalToNative(session),
          marshalToNative(channelName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionMessageChannel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(
      session: RemoteSystemSession?,
      channelName: String?,
      reliability: RemoteSystemSessionMessageChannelReliability?
    ): RemoteSystemSessionMessageChannel? {
      val fnPtr = _979676844_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionMessageChannel>()
      val hr = fn.invokeHR(arrayOf(__979676844_Ptr, marshalToNative(session),
          marshalToNative(channelName), marshalToNative(reliability), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionMessageChannel>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemSessionMessageChannelFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __979676844_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionMessageChannelFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("295e1c4abd164298b7ce415482b0e11d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionMessageChannelFactory(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionMessageChannelFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRemoteSystemSessionMessageChannelFactory {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionMessageChannelFactory(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionMessageChannelFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__979676844_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionMessageChannelFactory):
        Array<IRemoteSystemSessionMessageChannelFactory?> = (elements as
        Array<IRemoteSystemSessionMessageChannelFactory?>).castToImpl<IRemoteSystemSessionMessageChannelFactory,IRemoteSystemSessionMessageChannelFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionMessageChannelFactory?> =
        arrayOfNulls<IRemoteSystemSessionMessageChannelFactory_Impl>(size) as
        Array<IRemoteSystemSessionMessageChannelFactory?>
  }
}
