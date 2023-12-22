package Windows.ApplicationModel.ExtendedExecution

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IExtendedExecutionSession.ABI::class)
@Signature("{af908a2d-118b-48f1-9308-0c4fc41e200f}")
@Guid("af908a2d118b48f193080c4fc41e200f")
@WinRTInterface("af908a2d118b48f193080c4fc41e200f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExtendedExecutionSession.ByReference::class)
public interface IExtendedExecutionSession : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Reason(): ExtendedExecutionReason?

  @InterfaceMethod(1)
  public fun put_Reason(value: ExtendedExecutionReason?): Unit

  @InterfaceMethod(2)
  public fun get_Description(): String?

  @InterfaceMethod(3)
  public fun put_Description(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_PercentProgress(): WinDef.UINT

  @InterfaceMethod(5)
  public fun put_PercentProgress(value: WinDef.UINT): Unit

  @InterfaceMethod(6)
  public fun add_Revoked(handler: TypedEventHandler<IUnknown?,
      ExtendedExecutionRevokedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_Revoked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun RequestExtensionAsync(): IAsyncOperation<ExtendedExecutionResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExtendedExecutionSession> {
    public override fun getValue() = ABI.makeIExtendedExecutionSession(pointer.getPointer(0))

    public fun setValue(value: IExtendedExecutionSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExtendedExecutionSession, IClosable.WithDefault {
    public val __1986005099_Ptr: Pointer?

    public val _1986005099_VtblPtr: Pointer?
      get() = __1986005099_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): ExtendedExecutionReason? {
      val fnPtr = _1986005099_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExtendedExecutionReason>()
      val hr = fn.invokeHR(arrayOf(__1986005099_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExtendedExecutionReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Reason(value: ExtendedExecutionReason?): Unit {
      val fnPtr = _1986005099_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1986005099_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Description(): String? {
      val fnPtr = _1986005099_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1986005099_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Description(value: String?): Unit {
      val fnPtr = _1986005099_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1986005099_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PercentProgress(): WinDef.UINT {
      val fnPtr = _1986005099_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1986005099_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_PercentProgress(value: WinDef.UINT): Unit {
      val fnPtr = _1986005099_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1986005099_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_Revoked(handler: TypedEventHandler<IUnknown?,
        ExtendedExecutionRevokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1986005099_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1986005099_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_Revoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _1986005099_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1986005099_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun RequestExtensionAsync(): IAsyncOperation<ExtendedExecutionResult?>? {
      val fnPtr = _1986005099_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ExtendedExecutionResult?>>()
      val hr = fn.invokeHR(arrayOf(__1986005099_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ExtendedExecutionResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IExtendedExecutionSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1986005099_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1986005099_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExtendedExecutionSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("af908a2d118b48f193080c4fc41e200f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExtendedExecutionSession(ptr: Pointer?): WithDefault =
        IExtendedExecutionSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExtendedExecutionSession {
      val address = segment.toRawLongValue()
      return makeIExtendedExecutionSession(Pointer(address))
    }

    public override fun toNative(obj: IExtendedExecutionSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1986005099_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExtendedExecutionSession):
        Array<IExtendedExecutionSession?> = (elements as
        Array<IExtendedExecutionSession?>).castToImpl<IExtendedExecutionSession,IExtendedExecutionSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExtendedExecutionSession?> =
        arrayOfNulls<IExtendedExecutionSession_Impl>(size) as Array<IExtendedExecutionSession?>
  }
}
