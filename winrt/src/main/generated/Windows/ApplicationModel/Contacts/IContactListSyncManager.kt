package Windows.ApplicationModel.Contacts

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

@ABIMarker(IContactListSyncManager.ABI::class)
@Signature("{146e83be-7925-4acc-9de5-21ddd06f8674}")
@Guid("146e83be79254acc9de521ddd06f8674")
@WinRTInterface("146e83be79254acc9de521ddd06f8674")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactListSyncManager.ByReference::class)
public interface IContactListSyncManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): ContactListSyncStatus?

  @InterfaceMethod(1)
  public fun get_LastSuccessfulSyncTime(): DateTime?

  @InterfaceMethod(2)
  public fun get_LastAttemptedSyncTime(): DateTime?

  @InterfaceMethod(3)
  public fun SyncAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(4)
  public fun add_SyncStatusChanged(handler: TypedEventHandler<ContactListSyncManager?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_SyncStatusChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactListSyncManager> {
    public override fun getValue() = ABI.makeIContactListSyncManager(pointer.getPointer(0))

    public fun setValue(value: IContactListSyncManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactListSyncManager {
    public val __1279099712_Ptr: Pointer?

    public val _1279099712_VtblPtr: Pointer?
      get() = __1279099712_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): ContactListSyncStatus? {
      val fnPtr = _1279099712_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactListSyncStatus>()
      val hr = fn.invokeHR(arrayOf(__1279099712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactListSyncStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LastSuccessfulSyncTime(): DateTime? {
      val fnPtr = _1279099712_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1279099712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LastAttemptedSyncTime(): DateTime? {
      val fnPtr = _1279099712_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1279099712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SyncAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1279099712_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1279099712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_SyncStatusChanged(handler: TypedEventHandler<ContactListSyncManager?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1279099712_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1279099712_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_SyncStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1279099712_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1279099712_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactListSyncManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1279099712_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactListSyncManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("146e83be79254acc9de521ddd06f8674")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactListSyncManager(ptr: Pointer?): WithDefault =
        IContactListSyncManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactListSyncManager {
      val address = segment.toRawLongValue()
      return makeIContactListSyncManager(Pointer(address))
    }

    public override fun toNative(obj: IContactListSyncManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1279099712_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactListSyncManager): Array<IContactListSyncManager?>
        = (elements as
        Array<IContactListSyncManager?>).castToImpl<IContactListSyncManager,IContactListSyncManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactListSyncManager?> =
        arrayOfNulls<IContactListSyncManager_Impl>(size) as Array<IContactListSyncManager?>
  }
}
