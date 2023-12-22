package Windows.ApplicationModel.UserDataTasks.DataProvider

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

@ABIMarker(IUserDataTaskDataProviderConnection.ABI::class)
@Signature("{9ff39d1d-a447-428b-afe9-e5402bdeb041}")
@Guid("9ff39d1da447428bafe9e5402bdeb041")
@WinRTInterface("9ff39d1da447428bafe9e5402bdeb041")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskDataProviderConnection.ByReference::class)
public interface IUserDataTaskDataProviderConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun add_CreateOrUpdateTaskRequested(handler: TypedEventHandler<UserDataTaskDataProviderConnection?,
      UserDataTaskListCreateOrUpdateTaskRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_CreateOrUpdateTaskRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_SyncRequested(handler: TypedEventHandler<UserDataTaskDataProviderConnection?,
      UserDataTaskListSyncManagerSyncRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_SyncRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public
      fun add_SkipOccurrenceRequested(handler: TypedEventHandler<UserDataTaskDataProviderConnection?,
      UserDataTaskListSkipOccurrenceRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_SkipOccurrenceRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public
      fun add_CompleteTaskRequested(handler: TypedEventHandler<UserDataTaskDataProviderConnection?,
      UserDataTaskListCompleteTaskRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_CompleteTaskRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_DeleteTaskRequested(handler: TypedEventHandler<UserDataTaskDataProviderConnection?,
      UserDataTaskListDeleteTaskRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_DeleteTaskRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun Start(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskDataProviderConnection> {
    public override fun getValue() =
        ABI.makeIUserDataTaskDataProviderConnection(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskDataProviderConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskDataProviderConnection {
    public val __1749520706_Ptr: Pointer?

    public val _1749520706_VtblPtr: Pointer?
      get() = __1749520706_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_CreateOrUpdateTaskRequested(handler: TypedEventHandler<UserDataTaskDataProviderConnection?,
        UserDataTaskListCreateOrUpdateTaskRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1749520706_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1749520706_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_CreateOrUpdateTaskRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1749520706_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1749520706_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_SyncRequested(handler: TypedEventHandler<UserDataTaskDataProviderConnection?,
        UserDataTaskListSyncManagerSyncRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1749520706_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1749520706_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_SyncRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1749520706_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1749520706_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_SkipOccurrenceRequested(handler: TypedEventHandler<UserDataTaskDataProviderConnection?,
        UserDataTaskListSkipOccurrenceRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1749520706_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1749520706_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_SkipOccurrenceRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1749520706_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1749520706_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_CompleteTaskRequested(handler: TypedEventHandler<UserDataTaskDataProviderConnection?,
        UserDataTaskListCompleteTaskRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1749520706_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1749520706_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_CompleteTaskRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1749520706_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1749520706_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override
        fun add_DeleteTaskRequested(handler: TypedEventHandler<UserDataTaskDataProviderConnection?,
        UserDataTaskListDeleteTaskRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1749520706_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1749520706_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_DeleteTaskRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1749520706_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1749520706_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun Start(): Unit {
      val fnPtr = _1749520706_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1749520706_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserDataTaskDataProviderConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1749520706_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskDataProviderConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9ff39d1da447428bafe9e5402bdeb041")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskDataProviderConnection(ptr: Pointer?): WithDefault =
        IUserDataTaskDataProviderConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTaskDataProviderConnection {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskDataProviderConnection(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskDataProviderConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1749520706_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskDataProviderConnection):
        Array<IUserDataTaskDataProviderConnection?> = (elements as
        Array<IUserDataTaskDataProviderConnection?>).castToImpl<IUserDataTaskDataProviderConnection,IUserDataTaskDataProviderConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskDataProviderConnection?> =
        arrayOfNulls<IUserDataTaskDataProviderConnection_Impl>(size) as
        Array<IUserDataTaskDataProviderConnection?>
  }
}
