package Windows.Devices.AllJoyn

import Windows.Foundation.Collections.IVector
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAllJoynBusAttachment.ABI::class)
@Signature("{f309f153-1eed-42c3-a20e-436d41fe62f6}")
@Guid("f309f1531eed42c3a20e436d41fe62f6")
@WinRTInterface("f309f1531eed42c3a20e436d41fe62f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynBusAttachment.ByReference::class)
public interface IAllJoynBusAttachment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AboutData(): AllJoynAboutData?

  @InterfaceMethod(1)
  public fun get_ConnectionSpecification(): String?

  @InterfaceMethod(2)
  public fun get_State(): AllJoynBusAttachmentState?

  @InterfaceMethod(3)
  public fun get_UniqueName(): String?

  @InterfaceMethod(4)
  public fun PingAsync(uniqueName: String?): IAsyncOperation<Int>?

  @InterfaceMethod(5)
  public fun Connect(): Unit

  @InterfaceMethod(6)
  public fun Disconnect(): Unit

  @InterfaceMethod(7)
  public fun add_StateChanged(handler: TypedEventHandler<AllJoynBusAttachment?,
      AllJoynBusAttachmentStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_StateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun get_AuthenticationMechanisms(): IVector<AllJoynAuthenticationMechanism?>?

  @InterfaceMethod(10)
  public fun add_CredentialsRequested(handler: TypedEventHandler<AllJoynBusAttachment?,
      AllJoynCredentialsRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_CredentialsRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_CredentialsVerificationRequested(handler: TypedEventHandler<AllJoynBusAttachment?,
      AllJoynCredentialsVerificationRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_CredentialsVerificationRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_AuthenticationComplete(handler: TypedEventHandler<AllJoynBusAttachment?,
      AllJoynAuthenticationCompleteEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_AuthenticationComplete(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynBusAttachment> {
    public override fun getValue() = ABI.makeIAllJoynBusAttachment(pointer.getPointer(0))

    public fun setValue(value: IAllJoynBusAttachment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynBusAttachment {
    public val __733708302_Ptr: Pointer?

    public val _733708302_VtblPtr: Pointer?
      get() = __733708302_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AboutData(): AllJoynAboutData? {
      val fnPtr = _733708302_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynAboutData>()
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynAboutData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ConnectionSpecification(): String? {
      val fnPtr = _733708302_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_State(): AllJoynBusAttachmentState? {
      val fnPtr = _733708302_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynBusAttachmentState>()
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynBusAttachmentState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_UniqueName(): String? {
      val fnPtr = _733708302_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun PingAsync(uniqueName: String?): IAsyncOperation<Int>? {
      val fnPtr = _733708302_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Int>>()
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr, marshalToNative(uniqueName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun Connect(): Unit {
      val fnPtr = _733708302_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Disconnect(): Unit {
      val fnPtr = _733708302_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_StateChanged(handler: TypedEventHandler<AllJoynBusAttachment?,
        AllJoynBusAttachmentStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _733708302_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_StateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _733708302_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_AuthenticationMechanisms(): IVector<AllJoynAuthenticationMechanism?>? {
      val fnPtr = _733708302_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AllJoynAuthenticationMechanism?>>()
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<AllJoynAuthenticationMechanism?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun add_CredentialsRequested(handler: TypedEventHandler<AllJoynBusAttachment?,
        AllJoynCredentialsRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _733708302_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_CredentialsRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _733708302_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override
        fun add_CredentialsVerificationRequested(handler: TypedEventHandler<AllJoynBusAttachment?,
        AllJoynCredentialsVerificationRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _733708302_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_CredentialsVerificationRequested(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _733708302_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_AuthenticationComplete(handler: TypedEventHandler<AllJoynBusAttachment?,
        AllJoynAuthenticationCompleteEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _733708302_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_AuthenticationComplete(token: EventRegistrationToken?): Unit {
      val fnPtr = _733708302_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__733708302_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAllJoynBusAttachment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __733708302_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynBusAttachment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f309f1531eed42c3a20e436d41fe62f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynBusAttachment(ptr: Pointer?): WithDefault =
        IAllJoynBusAttachment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynBusAttachment {
      val address = segment.toRawLongValue()
      return makeIAllJoynBusAttachment(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynBusAttachment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__733708302_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynBusAttachment): Array<IAllJoynBusAttachment?> =
        (elements as
        Array<IAllJoynBusAttachment?>).castToImpl<IAllJoynBusAttachment,IAllJoynBusAttachment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynBusAttachment?> =
        arrayOfNulls<IAllJoynBusAttachment_Impl>(size) as Array<IAllJoynBusAttachment?>
  }
}
