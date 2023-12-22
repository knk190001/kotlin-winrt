package Windows.ApplicationModel.ExtendedExecution.Foreground

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IExtendedExecutionForegroundSession.ABI::class)
@Signature("{fbf440e1-9d10-4201-b01e-c83275296f2e}")
@Guid("fbf440e19d104201b01ec83275296f2e")
@WinRTInterface("fbf440e19d104201b01ec83275296f2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExtendedExecutionForegroundSession.ByReference::class)
public interface IExtendedExecutionForegroundSession : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Description(): String?

  @InterfaceMethod(1)
  public fun put_Description(value: String?): Unit

  @InterfaceMethod(2)
  public fun add_Revoked(handler: TypedEventHandler<IUnknown?,
      ExtendedExecutionForegroundRevokedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Revoked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun RequestExtensionAsync(): IAsyncOperation<ExtendedExecutionForegroundResult?>?

  @InterfaceMethod(5)
  public fun get_Reason(): ExtendedExecutionForegroundReason?

  @InterfaceMethod(6)
  public fun put_Reason(value: ExtendedExecutionForegroundReason?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExtendedExecutionForegroundSession> {
    public override fun getValue() =
        ABI.makeIExtendedExecutionForegroundSession(pointer.getPointer(0))

    public fun setValue(value: IExtendedExecutionForegroundSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExtendedExecutionForegroundSession, IClosable.WithDefault {
    public val __903921215_Ptr: Pointer?

    public val _903921215_VtblPtr: Pointer?
      get() = __903921215_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Description(): String? {
      val fnPtr = _903921215_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__903921215_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Description(value: String?): Unit {
      val fnPtr = _903921215_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__903921215_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Revoked(handler: TypedEventHandler<IUnknown?,
        ExtendedExecutionForegroundRevokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _903921215_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__903921215_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Revoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _903921215_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__903921215_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun RequestExtensionAsync():
        IAsyncOperation<ExtendedExecutionForegroundResult?>? {
      val fnPtr = _903921215_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ExtendedExecutionForegroundResult?>>()
      val hr = fn.invokeHR(arrayOf(__903921215_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ExtendedExecutionForegroundResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Reason(): ExtendedExecutionForegroundReason? {
      val fnPtr = _903921215_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExtendedExecutionForegroundReason>()
      val hr = fn.invokeHR(arrayOf(__903921215_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExtendedExecutionForegroundReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Reason(value: ExtendedExecutionForegroundReason?): Unit {
      val fnPtr = _903921215_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__903921215_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IExtendedExecutionForegroundSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_903921215_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __903921215_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExtendedExecutionForegroundSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbf440e19d104201b01ec83275296f2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExtendedExecutionForegroundSession(ptr: Pointer?): WithDefault =
        IExtendedExecutionForegroundSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExtendedExecutionForegroundSession {
      val address = segment.toRawLongValue()
      return makeIExtendedExecutionForegroundSession(Pointer(address))
    }

    public override fun toNative(obj: IExtendedExecutionForegroundSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__903921215_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExtendedExecutionForegroundSession):
        Array<IExtendedExecutionForegroundSession?> = (elements as
        Array<IExtendedExecutionForegroundSession?>).castToImpl<IExtendedExecutionForegroundSession,IExtendedExecutionForegroundSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExtendedExecutionForegroundSession?> =
        arrayOfNulls<IExtendedExecutionForegroundSession_Impl>(size) as
        Array<IExtendedExecutionForegroundSession?>
  }
}
