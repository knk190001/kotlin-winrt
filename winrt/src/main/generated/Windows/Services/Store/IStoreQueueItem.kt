package Windows.Services.Store

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStoreQueueItem.ABI::class)
@Signature("{56d5c32b-f830-4293-9188-cad2dcde7357}")
@Guid("56d5c32bf83042939188cad2dcde7357")
@WinRTInterface("56d5c32bf83042939188cad2dcde7357")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreQueueItem.ByReference::class)
public interface IStoreQueueItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProductId(): String?

  @InterfaceMethod(1)
  public fun get_PackageFamilyName(): String?

  @InterfaceMethod(2)
  public fun get_InstallKind(): StoreQueueItemKind?

  @InterfaceMethod(3)
  public fun GetCurrentStatus(): StoreQueueItemStatus?

  @InterfaceMethod(4)
  public fun add_Completed(handler: TypedEventHandler<StoreQueueItem?,
      StoreQueueItemCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Completed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_StatusChanged(handler: TypedEventHandler<StoreQueueItem?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_StatusChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreQueueItem> {
    public override fun getValue() = ABI.makeIStoreQueueItem(pointer.getPointer(0))

    public fun setValue(value: IStoreQueueItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreQueueItem {
    public val __1378810160_Ptr: Pointer?

    public val _1378810160_VtblPtr: Pointer?
      get() = __1378810160_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProductId(): String? {
      val fnPtr = _1378810160_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1378810160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PackageFamilyName(): String? {
      val fnPtr = _1378810160_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1378810160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_InstallKind(): StoreQueueItemKind? {
      val fnPtr = _1378810160_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreQueueItemKind>()
      val hr = fn.invokeHR(arrayOf(__1378810160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreQueueItemKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetCurrentStatus(): StoreQueueItemStatus? {
      val fnPtr = _1378810160_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreQueueItemStatus>()
      val hr = fn.invokeHR(arrayOf(__1378810160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreQueueItemStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_Completed(handler: TypedEventHandler<StoreQueueItem?,
        StoreQueueItemCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1378810160_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1378810160_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Completed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1378810160_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1378810160_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_StatusChanged(handler: TypedEventHandler<StoreQueueItem?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1378810160_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1378810160_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_StatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1378810160_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1378810160_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStoreQueueItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1378810160_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreQueueItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56d5c32bf83042939188cad2dcde7357")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreQueueItem(ptr: Pointer?): WithDefault = IStoreQueueItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreQueueItem {
      val address = segment.toRawLongValue()
      return makeIStoreQueueItem(Pointer(address))
    }

    public override fun toNative(obj: IStoreQueueItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1378810160_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreQueueItem): Array<IStoreQueueItem?> = (elements as
        Array<IStoreQueueItem?>).castToImpl<IStoreQueueItem,IStoreQueueItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreQueueItem?> =
        arrayOfNulls<IStoreQueueItem_Impl>(size) as Array<IStoreQueueItem?>
  }
}
