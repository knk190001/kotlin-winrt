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

@ABIMarker(IRemoteSystemSessionInvitation.ABI::class)
@Signature("{3e32cc91-51d7-4766-a121-25516c3b8294}")
@Guid("3e32cc9151d74766a12125516c3b8294")
@WinRTInterface("3e32cc9151d74766a12125516c3b8294")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionInvitation.ByReference::class)
public interface IRemoteSystemSessionInvitation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Sender(): RemoteSystem?

  @InterfaceMethod(1)
  public fun get_SessionInfo(): RemoteSystemSessionInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionInvitation> {
    public override fun getValue() = ABI.makeIRemoteSystemSessionInvitation(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionInvitation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionInvitation {
    public val __1424201189_Ptr: Pointer?

    public val _1424201189_VtblPtr: Pointer?
      get() = __1424201189_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Sender(): RemoteSystem? {
      val fnPtr = _1424201189_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystem>()
      val hr = fn.invokeHR(arrayOf(__1424201189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SessionInfo(): RemoteSystemSessionInfo? {
      val fnPtr = _1424201189_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionInfo>()
      val hr = fn.invokeHR(arrayOf(__1424201189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionInfo>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemSessionInvitation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1424201189_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionInvitation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3e32cc9151d74766a12125516c3b8294")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionInvitation(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionInvitation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemSessionInvitation {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionInvitation(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionInvitation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1424201189_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionInvitation):
        Array<IRemoteSystemSessionInvitation?> = (elements as
        Array<IRemoteSystemSessionInvitation?>).castToImpl<IRemoteSystemSessionInvitation,IRemoteSystemSessionInvitation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionInvitation?> =
        arrayOfNulls<IRemoteSystemSessionInvitation_Impl>(size) as
        Array<IRemoteSystemSessionInvitation?>
  }
}
