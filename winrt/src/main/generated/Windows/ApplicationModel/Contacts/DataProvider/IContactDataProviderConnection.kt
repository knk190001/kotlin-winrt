package Windows.ApplicationModel.Contacts.DataProvider

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

@ABIMarker(IContactDataProviderConnection.ABI::class)
@Signature("{1a398a52-8c9d-4d6f-a4e0-111e9a125a30}")
@Guid("1a398a528c9d4d6fa4e0111e9a125a30")
@WinRTInterface("1a398a528c9d4d6fa4e0111e9a125a30")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactDataProviderConnection.ByReference::class)
public interface IContactDataProviderConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SyncRequested(handler: TypedEventHandler<ContactDataProviderConnection?,
      ContactListSyncManagerSyncRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SyncRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public
      fun add_ServerSearchReadBatchRequested(handler: TypedEventHandler<ContactDataProviderConnection?,
      ContactListServerSearchReadBatchRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ServerSearchReadBatchRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun Start(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactDataProviderConnection> {
    public override fun getValue() = ABI.makeIContactDataProviderConnection(pointer.getPointer(0))

    public fun setValue(value: IContactDataProviderConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactDataProviderConnection {
    public val __93780860_Ptr: Pointer?

    public val _93780860_VtblPtr: Pointer?
      get() = __93780860_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_SyncRequested(handler: TypedEventHandler<ContactDataProviderConnection?,
        ContactListSyncManagerSyncRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _93780860_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__93780860_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SyncRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _93780860_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__93780860_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_ServerSearchReadBatchRequested(handler: TypedEventHandler<ContactDataProviderConnection?,
        ContactListServerSearchReadBatchRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _93780860_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__93780860_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ServerSearchReadBatchRequested(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _93780860_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__93780860_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Start(): Unit {
      val fnPtr = _93780860_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__93780860_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactDataProviderConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __93780860_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactDataProviderConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a398a528c9d4d6fa4e0111e9a125a30")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactDataProviderConnection(ptr: Pointer?): WithDefault =
        IContactDataProviderConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactDataProviderConnection {
      val address = segment.toRawLongValue()
      return makeIContactDataProviderConnection(Pointer(address))
    }

    public override fun toNative(obj: IContactDataProviderConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__93780860_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactDataProviderConnection):
        Array<IContactDataProviderConnection?> = (elements as
        Array<IContactDataProviderConnection?>).castToImpl<IContactDataProviderConnection,IContactDataProviderConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactDataProviderConnection?> =
        arrayOfNulls<IContactDataProviderConnection_Impl>(size) as
        Array<IContactDataProviderConnection?>
  }
}
