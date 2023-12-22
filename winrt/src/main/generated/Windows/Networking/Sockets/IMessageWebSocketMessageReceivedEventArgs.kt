package Windows.Networking.Sockets

import Windows.Storage.Streams.DataReader
import Windows.Storage.Streams.IInputStream
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

@ABIMarker(IMessageWebSocketMessageReceivedEventArgs.ABI::class)
@Signature("{478c22ac-4c4b-42ed-9ed7-1ef9f94fa3d5}")
@Guid("478c22ac4c4b42ed9ed71ef9f94fa3d5")
@WinRTInterface("478c22ac4c4b42ed9ed71ef9f94fa3d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMessageWebSocketMessageReceivedEventArgs.ByReference::class)
public interface IMessageWebSocketMessageReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MessageType(): SocketMessageType?

  @InterfaceMethod(1)
  public fun GetDataReader(): DataReader?

  @InterfaceMethod(2)
  public fun GetDataStream(): IInputStream?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMessageWebSocketMessageReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIMessageWebSocketMessageReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMessageWebSocketMessageReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMessageWebSocketMessageReceivedEventArgs {
    public val __1341297383_Ptr: Pointer?

    public val _1341297383_VtblPtr: Pointer?
      get() = __1341297383_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MessageType(): SocketMessageType? {
      val fnPtr = _1341297383_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketMessageType>()
      val hr = fn.invokeHR(arrayOf(__1341297383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketMessageType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDataReader(): DataReader? {
      val fnPtr = _1341297383_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataReader>()
      val hr = fn.invokeHR(arrayOf(__1341297383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDataStream(): IInputStream? {
      val fnPtr = _1341297383_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__1341297383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }
  }

  public class IMessageWebSocketMessageReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1341297383_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMessageWebSocketMessageReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("478c22ac4c4b42ed9ed71ef9f94fa3d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMessageWebSocketMessageReceivedEventArgs(ptr: Pointer?): WithDefault =
        IMessageWebSocketMessageReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMessageWebSocketMessageReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMessageWebSocketMessageReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMessageWebSocketMessageReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1341297383_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMessageWebSocketMessageReceivedEventArgs):
        Array<IMessageWebSocketMessageReceivedEventArgs?> = (elements as
        Array<IMessageWebSocketMessageReceivedEventArgs?>).castToImpl<IMessageWebSocketMessageReceivedEventArgs,IMessageWebSocketMessageReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMessageWebSocketMessageReceivedEventArgs?> =
        arrayOfNulls<IMessageWebSocketMessageReceivedEventArgs_Impl>(size) as
        Array<IMessageWebSocketMessageReceivedEventArgs?>
  }
}
