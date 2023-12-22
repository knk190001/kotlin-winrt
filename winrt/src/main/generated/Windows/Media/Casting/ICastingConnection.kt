package Windows.Media.Casting

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ICastingConnection.ABI::class)
@Signature("{cd951653-c2f1-4498-8b78-5fb4cd3640dd}")
@Guid("cd951653c2f144988b785fb4cd3640dd")
@WinRTInterface("cd951653c2f144988b785fb4cd3640dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICastingConnection.ByReference::class)
public interface ICastingConnection : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_State(): CastingConnectionState?

  @InterfaceMethod(1)
  public fun get_Device(): CastingDevice?

  @InterfaceMethod(2)
  public fun get_Source(): CastingSource?

  @InterfaceMethod(3)
  public fun put_Source(value: CastingSource?): Unit

  @InterfaceMethod(4)
  public fun add_StateChanged(handler: TypedEventHandler<CastingConnection?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_StateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_ErrorOccurred(handler: TypedEventHandler<CastingConnection?,
      CastingConnectionErrorOccurredEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_ErrorOccurred(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun RequestStartCastingAsync(value: CastingSource?):
      IAsyncOperation<CastingConnectionErrorStatus?>?

  @InterfaceMethod(9)
  public fun DisconnectAsync(): IAsyncOperation<CastingConnectionErrorStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICastingConnection> {
    public override fun getValue() = ABI.makeICastingConnection(pointer.getPointer(0))

    public fun setValue(value: ICastingConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICastingConnection, IClosable.WithDefault {
    public val __372473446_Ptr: Pointer?

    public val _372473446_VtblPtr: Pointer?
      get() = __372473446_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): CastingConnectionState? {
      val fnPtr = _372473446_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CastingConnectionState>()
      val hr = fn.invokeHR(arrayOf(__372473446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CastingConnectionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Device(): CastingDevice? {
      val fnPtr = _372473446_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CastingDevice>()
      val hr = fn.invokeHR(arrayOf(__372473446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CastingDevice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Source(): CastingSource? {
      val fnPtr = _372473446_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CastingSource>()
      val hr = fn.invokeHR(arrayOf(__372473446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CastingSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Source(value: CastingSource?): Unit {
      val fnPtr = _372473446_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__372473446_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_StateChanged(handler: TypedEventHandler<CastingConnection?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _372473446_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__372473446_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_StateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _372473446_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__372473446_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_ErrorOccurred(handler: TypedEventHandler<CastingConnection?,
        CastingConnectionErrorOccurredEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _372473446_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__372473446_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_ErrorOccurred(token: EventRegistrationToken?): Unit {
      val fnPtr = _372473446_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__372473446_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun RequestStartCastingAsync(value: CastingSource?):
        IAsyncOperation<CastingConnectionErrorStatus?>? {
      val fnPtr = _372473446_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CastingConnectionErrorStatus?>>()
      val hr = fn.invokeHR(arrayOf(__372473446_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CastingConnectionErrorStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun DisconnectAsync(): IAsyncOperation<CastingConnectionErrorStatus?>? {
      val fnPtr = _372473446_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CastingConnectionErrorStatus?>>()
      val hr = fn.invokeHR(arrayOf(__372473446_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CastingConnectionErrorStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class ICastingConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_372473446_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __372473446_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICastingConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd951653c2f144988b785fb4cd3640dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICastingConnection(ptr: Pointer?): WithDefault = ICastingConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICastingConnection {
      val address = segment.toRawLongValue()
      return makeICastingConnection(Pointer(address))
    }

    public override fun toNative(obj: ICastingConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__372473446_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICastingConnection): Array<ICastingConnection?> =
        (elements as
        Array<ICastingConnection?>).castToImpl<ICastingConnection,ICastingConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICastingConnection?> =
        arrayOfNulls<ICastingConnection_Impl>(size) as Array<ICastingConnection?>
  }
}
