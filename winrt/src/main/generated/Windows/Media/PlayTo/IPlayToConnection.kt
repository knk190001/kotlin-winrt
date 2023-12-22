package Windows.Media.PlayTo

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IPlayToConnection.ABI::class)
@Signature("{112fbfc8-f235-4fde-8d41-9bf27c9e9a40}")
@Guid("112fbfc8f2354fde8d419bf27c9e9a40")
@WinRTInterface("112fbfc8f2354fde8d419bf27c9e9a40")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayToConnection.ByReference::class)
public interface IPlayToConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): PlayToConnectionState?

  @InterfaceMethod(1)
  public fun add_StateChanged(handler: TypedEventHandler<PlayToConnection?,
      PlayToConnectionStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_StateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_Transferred(handler: TypedEventHandler<PlayToConnection?,
      PlayToConnectionTransferredEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Transferred(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_Error(handler: TypedEventHandler<PlayToConnection?,
      PlayToConnectionErrorEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Error(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayToConnection> {
    public override fun getValue() = ABI.makeIPlayToConnection(pointer.getPointer(0))

    public fun setValue(value: IPlayToConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayToConnection {
    public val __1038858254_Ptr: Pointer?

    public val _1038858254_VtblPtr: Pointer?
      get() = __1038858254_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): PlayToConnectionState? {
      val fnPtr = _1038858254_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayToConnectionState>()
      val hr = fn.invokeHR(arrayOf(__1038858254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayToConnectionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_StateChanged(handler: TypedEventHandler<PlayToConnection?,
        PlayToConnectionStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1038858254_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1038858254_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_StateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1038858254_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1038858254_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_Transferred(handler: TypedEventHandler<PlayToConnection?,
        PlayToConnectionTransferredEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1038858254_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1038858254_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Transferred(token: EventRegistrationToken?): Unit {
      val fnPtr = _1038858254_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1038858254_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_Error(handler: TypedEventHandler<PlayToConnection?,
        PlayToConnectionErrorEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1038858254_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1038858254_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Error(token: EventRegistrationToken?): Unit {
      val fnPtr = _1038858254_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1038858254_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPlayToConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1038858254_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayToConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("112fbfc8f2354fde8d419bf27c9e9a40")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayToConnection(ptr: Pointer?): WithDefault = IPlayToConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayToConnection {
      val address = segment.toRawLongValue()
      return makeIPlayToConnection(Pointer(address))
    }

    public override fun toNative(obj: IPlayToConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1038858254_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayToConnection): Array<IPlayToConnection?> = (elements
        as Array<IPlayToConnection?>).castToImpl<IPlayToConnection,IPlayToConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayToConnection?> =
        arrayOfNulls<IPlayToConnection_Impl>(size) as Array<IPlayToConnection?>
  }
}
