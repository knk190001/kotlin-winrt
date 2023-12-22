package Windows.Networking.Sockets

import Windows.Foundation.IClosable
import Windows.Networking.Sockets.IWebSocket.ABI.IID
import Windows.Storage.Streams.IInputStream
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IStreamWebSocket.ABI::class)
@Signature("{bd4a49d8-b289-45bb-97eb-c7525205a843}")
@Guid("bd4a49d8b28945bb97ebc7525205a843")
@WinRTInterface("bd4a49d8b28945bb97ebc7525205a843")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamWebSocket.ByReference::class)
public interface IStreamWebSocket : NativeMapped, IWinRTInterface, IWebSocket, IClosable {
  @InterfaceMethod(0)
  public fun get_Control(): StreamWebSocketControl?

  @InterfaceMethod(1)
  public fun get_Information(): StreamWebSocketInformation?

  @InterfaceMethod(2)
  public fun get_InputStream(): IInputStream?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamWebSocket> {
    public override fun getValue() = ABI.makeIStreamWebSocket(pointer.getPointer(0))

    public fun setValue(value: IStreamWebSocket_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamWebSocket, IWebSocket.WithDefault, IClosable.WithDefault {
    public val __818243215_Ptr: Pointer?

    public val _818243215_VtblPtr: Pointer?
      get() = __818243215_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Control(): StreamWebSocketControl? {
      val fnPtr = _818243215_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreamWebSocketControl>()
      val hr = fn.invokeHR(arrayOf(__818243215_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreamWebSocketControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Information(): StreamWebSocketInformation? {
      val fnPtr = _818243215_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreamWebSocketInformation>()
      val hr = fn.invokeHR(arrayOf(__818243215_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreamWebSocketInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_InputStream(): IInputStream? {
      val fnPtr = _818243215_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__818243215_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }
  }

  public class IStreamWebSocket_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebSocket, IClosable {
    public override val __1618117585_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_818243215_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_818243215_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __818243215_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamWebSocket, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd4a49d8b28945bb97ebc7525205a843")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamWebSocket(ptr: Pointer?): WithDefault = IStreamWebSocket_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamWebSocket {
      val address = segment.toRawLongValue()
      return makeIStreamWebSocket(Pointer(address))
    }

    public override fun toNative(obj: IStreamWebSocket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__818243215_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamWebSocket): Array<IStreamWebSocket?> = (elements as
        Array<IStreamWebSocket?>).castToImpl<IStreamWebSocket,IStreamWebSocket_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamWebSocket?> =
        arrayOfNulls<IStreamWebSocket_Impl>(size) as Array<IStreamWebSocket?>
  }
}
