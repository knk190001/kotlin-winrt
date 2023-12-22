package Windows.Networking.Sockets

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

@ABIMarker(IServerMessageWebSocketControl.ABI::class)
@Signature("{69c2f051-1c1f-587a-4519-2181610192b7}")
@Guid("69c2f0511c1f587a45192181610192b7")
@WinRTInterface("69c2f0511c1f587a45192181610192b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IServerMessageWebSocketControl.ByReference::class)
public interface IServerMessageWebSocketControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MessageType(): SocketMessageType?

  @InterfaceMethod(1)
  public fun put_MessageType(value: SocketMessageType?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IServerMessageWebSocketControl> {
    public override fun getValue() = ABI.makeIServerMessageWebSocketControl(pointer.getPointer(0))

    public fun setValue(value: IServerMessageWebSocketControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IServerMessageWebSocketControl {
    public val __922708190_Ptr: Pointer?

    public val _922708190_VtblPtr: Pointer?
      get() = __922708190_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MessageType(): SocketMessageType? {
      val fnPtr = _922708190_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketMessageType>()
      val hr = fn.invokeHR(arrayOf(__922708190_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketMessageType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_MessageType(value: SocketMessageType?): Unit {
      val fnPtr = _922708190_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__922708190_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IServerMessageWebSocketControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __922708190_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IServerMessageWebSocketControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69c2f0511c1f587a45192181610192b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIServerMessageWebSocketControl(ptr: Pointer?): WithDefault =
        IServerMessageWebSocketControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IServerMessageWebSocketControl {
      val address = segment.toRawLongValue()
      return makeIServerMessageWebSocketControl(Pointer(address))
    }

    public override fun toNative(obj: IServerMessageWebSocketControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__922708190_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IServerMessageWebSocketControl):
        Array<IServerMessageWebSocketControl?> = (elements as
        Array<IServerMessageWebSocketControl?>).castToImpl<IServerMessageWebSocketControl,IServerMessageWebSocketControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IServerMessageWebSocketControl?> =
        arrayOfNulls<IServerMessageWebSocketControl_Impl>(size) as
        Array<IServerMessageWebSocketControl?>
  }
}
