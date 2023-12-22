package Windows.ApplicationModel.Calls

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IPhoneCallHistoryStore.ABI::class)
@Signature("{2f907db8-b40e-422b-8545-cb1910a61c52}")
@Guid("2f907db8b40e422b8545cb1910a61c52")
@WinRTInterface("2f907db8b40e422b8545cb1910a61c52")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallHistoryStore.ByReference::class)
public interface IPhoneCallHistoryStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetEntryAsync(callHistoryEntryId: String?): IAsyncOperation<PhoneCallHistoryEntry?>?

  @InterfaceMethod(1)
  public fun GetEntryReader(): PhoneCallHistoryEntryReader?

  @InterfaceMethod(2)
  public fun GetEntryReader(queryOptions: PhoneCallHistoryEntryQueryOptions?):
      PhoneCallHistoryEntryReader?

  @InterfaceMethod(3)
  public fun SaveEntryAsync(callHistoryEntry: PhoneCallHistoryEntry?): IAsyncAction?

  @InterfaceMethod(4)
  public fun DeleteEntryAsync(callHistoryEntry: PhoneCallHistoryEntry?): IAsyncAction?

  @InterfaceMethod(5)
  public fun DeleteEntriesAsync(callHistoryEntries: IIterable<PhoneCallHistoryEntry?>?):
      IAsyncAction?

  @InterfaceMethod(6)
  public fun MarkEntryAsSeenAsync(callHistoryEntry: PhoneCallHistoryEntry?): IAsyncAction?

  @InterfaceMethod(7)
  public fun MarkEntriesAsSeenAsync(callHistoryEntries: IIterable<PhoneCallHistoryEntry?>?):
      IAsyncAction?

  @InterfaceMethod(8)
  public fun GetUnseenCountAsync(): IAsyncOperation<WinDef.UINT>?

  @InterfaceMethod(9)
  public fun MarkAllAsSeenAsync(): IAsyncAction?

  @InterfaceMethod(10)
  public fun GetSourcesUnseenCountAsync(sourceIds: IIterable<String?>?):
      IAsyncOperation<WinDef.UINT>?

  @InterfaceMethod(11)
  public fun MarkSourcesAsSeenAsync(sourceIds: IIterable<String?>?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallHistoryStore> {
    public override fun getValue() = ABI.makeIPhoneCallHistoryStore(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallHistoryStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallHistoryStore {
    public val __1832409083_Ptr: Pointer?

    public val _1832409083_VtblPtr: Pointer?
      get() = __1832409083_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetEntryAsync(callHistoryEntryId: String?):
        IAsyncOperation<PhoneCallHistoryEntry?>? {
      val fnPtr = _1832409083_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallHistoryEntry?>>()
      val hr = fn.invokeHR(arrayOf(__1832409083_Ptr, marshalToNative(callHistoryEntryId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PhoneCallHistoryEntry?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetEntryReader(): PhoneCallHistoryEntryReader? {
      val fnPtr = _1832409083_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallHistoryEntryReader>()
      val hr = fn.invokeHR(arrayOf(__1832409083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallHistoryEntryReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetEntryReader(queryOptions: PhoneCallHistoryEntryQueryOptions?):
        PhoneCallHistoryEntryReader? {
      val fnPtr = _1832409083_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallHistoryEntryReader>()
      val hr = fn.invokeHR(arrayOf(__1832409083_Ptr, marshalToNative(queryOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallHistoryEntryReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SaveEntryAsync(callHistoryEntry: PhoneCallHistoryEntry?): IAsyncAction? {
      val fnPtr = _1832409083_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1832409083_Ptr, marshalToNative(callHistoryEntry), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun DeleteEntryAsync(callHistoryEntry: PhoneCallHistoryEntry?): IAsyncAction? {
      val fnPtr = _1832409083_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1832409083_Ptr, marshalToNative(callHistoryEntry), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun DeleteEntriesAsync(callHistoryEntries: IIterable<PhoneCallHistoryEntry?>?):
        IAsyncAction? {
      val fnPtr = _1832409083_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1832409083_Ptr, marshalToNative(callHistoryEntries), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun MarkEntryAsSeenAsync(callHistoryEntry: PhoneCallHistoryEntry?):
        IAsyncAction? {
      val fnPtr = _1832409083_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1832409083_Ptr, marshalToNative(callHistoryEntry), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override
        fun MarkEntriesAsSeenAsync(callHistoryEntries: IIterable<PhoneCallHistoryEntry?>?):
        IAsyncAction? {
      val fnPtr = _1832409083_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1832409083_Ptr, marshalToNative(callHistoryEntries), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetUnseenCountAsync(): IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _1832409083_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1832409083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun MarkAllAsSeenAsync(): IAsyncAction? {
      val fnPtr = _1832409083_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1832409083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetSourcesUnseenCountAsync(sourceIds: IIterable<String?>?):
        IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _1832409083_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1832409083_Ptr, marshalToNative(sourceIds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun MarkSourcesAsSeenAsync(sourceIds: IIterable<String?>?): IAsyncAction? {
      val fnPtr = _1832409083_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1832409083_Ptr, marshalToNative(sourceIds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallHistoryStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1832409083_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallHistoryStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f907db8b40e422b8545cb1910a61c52")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallHistoryStore(ptr: Pointer?): WithDefault =
        IPhoneCallHistoryStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallHistoryStore {
      val address = segment.toRawLongValue()
      return makeIPhoneCallHistoryStore(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallHistoryStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1832409083_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallHistoryStore): Array<IPhoneCallHistoryStore?> =
        (elements as
        Array<IPhoneCallHistoryStore?>).castToImpl<IPhoneCallHistoryStore,IPhoneCallHistoryStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallHistoryStore?> =
        arrayOfNulls<IPhoneCallHistoryStore_Impl>(size) as Array<IPhoneCallHistoryStore?>
  }
}
