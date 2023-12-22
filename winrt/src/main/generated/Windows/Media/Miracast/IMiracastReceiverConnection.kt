package Windows.Media.Miracast

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IMiracastReceiverConnection.ABI::class)
@Signature("{704b2f36-d2e5-551f-a854-f822b7917d28}")
@Guid("704b2f36d2e5551fa854f822b7917d28")
@WinRTInterface("704b2f36d2e5551fa854f822b7917d28")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverConnection.ByReference::class)
public interface IMiracastReceiverConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Disconnect(reason: MiracastReceiverDisconnectReason?): Unit

  @InterfaceMethod(1)
  public fun Disconnect(reason: MiracastReceiverDisconnectReason?, message: String?): Unit

  @InterfaceMethod(2)
  public fun Pause(): Unit

  @InterfaceMethod(3)
  public fun PauseAsync(): IAsyncAction?

  @InterfaceMethod(4)
  public fun Resume(): Unit

  @InterfaceMethod(5)
  public fun ResumeAsync(): IAsyncAction?

  @InterfaceMethod(6)
  public fun get_Transmitter(): MiracastTransmitter?

  @InterfaceMethod(7)
  public fun get_InputDevices(): MiracastReceiverInputDevices?

  @InterfaceMethod(8)
  public fun get_CursorImageChannel(): MiracastReceiverCursorImageChannel?

  @InterfaceMethod(9)
  public fun get_StreamControl(): MiracastReceiverStreamControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverConnection> {
    public override fun getValue() = ABI.makeIMiracastReceiverConnection(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverConnection {
    public val __1224334943_Ptr: Pointer?

    public val _1224334943_VtblPtr: Pointer?
      get() = __1224334943_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Disconnect(reason: MiracastReceiverDisconnectReason?): Unit {
      val fnPtr = _1224334943_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1224334943_Ptr, marshalToNative(reason),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Disconnect(reason: MiracastReceiverDisconnectReason?, message: String?):
        Unit {
      val fnPtr = _1224334943_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1224334943_Ptr, marshalToNative(reason),
          marshalToNative(message),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Pause(): Unit {
      val fnPtr = _1224334943_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1224334943_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun PauseAsync(): IAsyncAction? {
      val fnPtr = _1224334943_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1224334943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun Resume(): Unit {
      val fnPtr = _1224334943_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1224334943_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun ResumeAsync(): IAsyncAction? {
      val fnPtr = _1224334943_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1224334943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Transmitter(): MiracastTransmitter? {
      val fnPtr = _1224334943_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastTransmitter>()
      val hr = fn.invokeHR(arrayOf(__1224334943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastTransmitter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_InputDevices(): MiracastReceiverInputDevices? {
      val fnPtr = _1224334943_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverInputDevices>()
      val hr = fn.invokeHR(arrayOf(__1224334943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverInputDevices>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_CursorImageChannel(): MiracastReceiverCursorImageChannel? {
      val fnPtr = _1224334943_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverCursorImageChannel>()
      val hr = fn.invokeHR(arrayOf(__1224334943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverCursorImageChannel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_StreamControl(): MiracastReceiverStreamControl? {
      val fnPtr = _1224334943_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverStreamControl>()
      val hr = fn.invokeHR(arrayOf(__1224334943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverStreamControl>(result.getValue())
      return resultValue
    }
  }

  public class IMiracastReceiverConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1224334943_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("704b2f36d2e5551fa854f822b7917d28")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverConnection(ptr: Pointer?): WithDefault =
        IMiracastReceiverConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMiracastReceiverConnection {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverConnection(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1224334943_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverConnection):
        Array<IMiracastReceiverConnection?> = (elements as
        Array<IMiracastReceiverConnection?>).castToImpl<IMiracastReceiverConnection,IMiracastReceiverConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverConnection?> =
        arrayOfNulls<IMiracastReceiverConnection_Impl>(size) as Array<IMiracastReceiverConnection?>
  }
}
