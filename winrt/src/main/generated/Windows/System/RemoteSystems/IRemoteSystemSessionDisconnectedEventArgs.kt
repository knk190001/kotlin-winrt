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

@ABIMarker(IRemoteSystemSessionDisconnectedEventArgs.ABI::class)
@Signature("{de0bc69b-77c5-461c-8209-7c6c5d3111ab}")
@Guid("de0bc69b77c5461c82097c6c5d3111ab")
@WinRTInterface("de0bc69b77c5461c82097c6c5d3111ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionDisconnectedEventArgs.ByReference::class)
public interface IRemoteSystemSessionDisconnectedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): RemoteSystemSessionDisconnectedReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionDisconnectedEventArgs> {
    public override fun getValue() =
        ABI.makeIRemoteSystemSessionDisconnectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionDisconnectedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionDisconnectedEventArgs {
    public val __45999834_Ptr: Pointer?

    public val _45999834_VtblPtr: Pointer?
      get() = __45999834_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): RemoteSystemSessionDisconnectedReason? {
      val fnPtr = _45999834_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionDisconnectedReason>()
      val hr = fn.invokeHR(arrayOf(__45999834_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionDisconnectedReason>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemSessionDisconnectedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __45999834_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionDisconnectedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de0bc69b77c5461c82097c6c5d3111ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionDisconnectedEventArgs(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionDisconnectedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRemoteSystemSessionDisconnectedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionDisconnectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionDisconnectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__45999834_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionDisconnectedEventArgs):
        Array<IRemoteSystemSessionDisconnectedEventArgs?> = (elements as
        Array<IRemoteSystemSessionDisconnectedEventArgs?>).castToImpl<IRemoteSystemSessionDisconnectedEventArgs,IRemoteSystemSessionDisconnectedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionDisconnectedEventArgs?> =
        arrayOfNulls<IRemoteSystemSessionDisconnectedEventArgs_Impl>(size) as
        Array<IRemoteSystemSessionDisconnectedEventArgs?>
  }
}
