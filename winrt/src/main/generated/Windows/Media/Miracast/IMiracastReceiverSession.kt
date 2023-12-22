package Windows.Media.Miracast

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMiracastReceiverSession.ABI::class)
@Signature("{1d2bcdb4-ef8b-5209-bfc9-c32116504803}")
@Guid("1d2bcdb4ef8b5209bfc9c32116504803")
@WinRTInterface("1d2bcdb4ef8b5209bfc9c32116504803")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverSession.ByReference::class)
public interface IMiracastReceiverSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ConnectionCreated(handler: TypedEventHandler<MiracastReceiverSession?,
      MiracastReceiverConnectionCreatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ConnectionCreated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_MediaSourceCreated(handler: TypedEventHandler<MiracastReceiverSession?,
      MiracastReceiverMediaSourceCreatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_MediaSourceCreated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_Disconnected(handler: TypedEventHandler<MiracastReceiverSession?,
      MiracastReceiverDisconnectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Disconnected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun get_AllowConnectionTakeover(): Boolean

  @InterfaceMethod(7)
  public fun put_AllowConnectionTakeover(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_MaxSimultaneousConnections(): Int

  @InterfaceMethod(9)
  public fun put_MaxSimultaneousConnections(value: Int): Unit

  @InterfaceMethod(10)
  public fun Start(): MiracastReceiverSessionStartResult?

  @InterfaceMethod(11)
  public fun StartAsync(): IAsyncOperation<MiracastReceiverSessionStartResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverSession> {
    public override fun getValue() = ABI.makeIMiracastReceiverSession(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverSession {
    public val __1366257997_Ptr: Pointer?

    public val _1366257997_VtblPtr: Pointer?
      get() = __1366257997_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ConnectionCreated(handler: TypedEventHandler<MiracastReceiverSession?,
        MiracastReceiverConnectionCreatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1366257997_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1366257997_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ConnectionCreated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1366257997_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1366257997_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_MediaSourceCreated(handler: TypedEventHandler<MiracastReceiverSession?,
        MiracastReceiverMediaSourceCreatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1366257997_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1366257997_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_MediaSourceCreated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1366257997_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1366257997_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Disconnected(handler: TypedEventHandler<MiracastReceiverSession?,
        MiracastReceiverDisconnectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1366257997_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1366257997_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Disconnected(token: EventRegistrationToken?): Unit {
      val fnPtr = _1366257997_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1366257997_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AllowConnectionTakeover(): Boolean {
      val fnPtr = _1366257997_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1366257997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_AllowConnectionTakeover(value: Boolean): Unit {
      val fnPtr = _1366257997_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1366257997_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_MaxSimultaneousConnections(): Int {
      val fnPtr = _1366257997_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1366257997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_MaxSimultaneousConnections(value: Int): Unit {
      val fnPtr = _1366257997_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1366257997_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun Start(): MiracastReceiverSessionStartResult? {
      val fnPtr = _1366257997_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverSessionStartResult>()
      val hr = fn.invokeHR(arrayOf(__1366257997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverSessionStartResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun StartAsync(): IAsyncOperation<MiracastReceiverSessionStartResult?>? {
      val fnPtr = _1366257997_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MiracastReceiverSessionStartResult?>>()
      val hr = fn.invokeHR(arrayOf(__1366257997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MiracastReceiverSessionStartResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IMiracastReceiverSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1366257997_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d2bcdb4ef8b5209bfc9c32116504803")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverSession(ptr: Pointer?): WithDefault =
        IMiracastReceiverSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMiracastReceiverSession {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverSession(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1366257997_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverSession):
        Array<IMiracastReceiverSession?> = (elements as
        Array<IMiracastReceiverSession?>).castToImpl<IMiracastReceiverSession,IMiracastReceiverSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverSession?> =
        arrayOfNulls<IMiracastReceiverSession_Impl>(size) as Array<IMiracastReceiverSession?>
  }
}
