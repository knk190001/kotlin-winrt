package Windows.ApplicationModel.UserDataTasks

import Windows.Foundation.DateTime
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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IUserDataTaskListSyncManager.ABI::class)
@Signature("{8e591a95-1dcf-469f-93ec-ba48bb553c6b}")
@Guid("8e591a951dcf469f93ecba48bb553c6b")
@WinRTInterface("8e591a951dcf469f93ecba48bb553c6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskListSyncManager.ByReference::class)
public interface IUserDataTaskListSyncManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LastAttemptedSyncTime(): DateTime?

  @InterfaceMethod(1)
  public fun put_LastAttemptedSyncTime(value: DateTime?): Unit

  @InterfaceMethod(2)
  public fun get_LastSuccessfulSyncTime(): DateTime?

  @InterfaceMethod(3)
  public fun put_LastSuccessfulSyncTime(value: DateTime?): Unit

  @InterfaceMethod(4)
  public fun get_Status(): UserDataTaskListSyncStatus?

  @InterfaceMethod(5)
  public fun put_Status(value: UserDataTaskListSyncStatus?): Unit

  @InterfaceMethod(6)
  public fun SyncAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(7)
  public fun add_SyncStatusChanged(handler: TypedEventHandler<UserDataTaskListSyncManager?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_SyncStatusChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskListSyncManager> {
    public override fun getValue() = ABI.makeIUserDataTaskListSyncManager(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskListSyncManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskListSyncManager {
    public val __1130310688_Ptr: Pointer?

    public val _1130310688_VtblPtr: Pointer?
      get() = __1130310688_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LastAttemptedSyncTime(): DateTime? {
      val fnPtr = _1130310688_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1130310688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_LastAttemptedSyncTime(value: DateTime?): Unit {
      val fnPtr = _1130310688_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1130310688_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_LastSuccessfulSyncTime(): DateTime? {
      val fnPtr = _1130310688_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1130310688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_LastSuccessfulSyncTime(value: DateTime?): Unit {
      val fnPtr = _1130310688_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1130310688_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Status(): UserDataTaskListSyncStatus? {
      val fnPtr = _1130310688_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskListSyncStatus>()
      val hr = fn.invokeHR(arrayOf(__1130310688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskListSyncStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Status(value: UserDataTaskListSyncStatus?): Unit {
      val fnPtr = _1130310688_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1130310688_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SyncAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1130310688_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1130310688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override
        fun add_SyncStatusChanged(handler: TypedEventHandler<UserDataTaskListSyncManager?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1130310688_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1130310688_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_SyncStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1130310688_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1130310688_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserDataTaskListSyncManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1130310688_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskListSyncManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e591a951dcf469f93ecba48bb553c6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskListSyncManager(ptr: Pointer?): WithDefault =
        IUserDataTaskListSyncManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTaskListSyncManager {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskListSyncManager(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskListSyncManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1130310688_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskListSyncManager):
        Array<IUserDataTaskListSyncManager?> = (elements as
        Array<IUserDataTaskListSyncManager?>).castToImpl<IUserDataTaskListSyncManager,IUserDataTaskListSyncManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskListSyncManager?> =
        arrayOfNulls<IUserDataTaskListSyncManager_Impl>(size) as
        Array<IUserDataTaskListSyncManager?>
  }
}
