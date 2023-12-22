package Windows.Storage.Search

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Storage.StorageFolder
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IStorageQueryResultBase.ABI::class)
@Signature("{c297d70d-7353-47ab-ba58-8c61425dc54b}")
@Guid("c297d70d735347abba588c61425dc54b")
@WinRTInterface("c297d70d735347abba588c61425dc54b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageQueryResultBase.ByReference::class)
public interface IStorageQueryResultBase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetItemCountAsync(): IAsyncOperation<WinDef.UINT>?

  @InterfaceMethod(1)
  public fun get_Folder(): StorageFolder?

  @InterfaceMethod(2)
  public fun add_ContentsChanged(handler: TypedEventHandler<IStorageQueryResultBase?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ContentsChanged(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_OptionsChanged(changedHandler: TypedEventHandler<IStorageQueryResultBase?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_OptionsChanged(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun FindStartIndexAsync(value: IUnknown?): IAsyncOperation<WinDef.UINT>?

  @InterfaceMethod(7)
  public fun GetCurrentQueryOptions(): QueryOptions?

  @InterfaceMethod(8)
  public fun ApplyNewQueryOptions(newQueryOptions: QueryOptions?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageQueryResultBase> {
    public override fun getValue() = ABI.makeIStorageQueryResultBase(pointer.getPointer(0))

    public fun setValue(value: IStorageQueryResultBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageQueryResultBase {
    public val __1632583490_Ptr: Pointer?

    public val _1632583490_VtblPtr: Pointer?
      get() = __1632583490_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetItemCountAsync(): IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _1632583490_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1632583490_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Folder(): StorageFolder? {
      val fnPtr = _1632583490_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__1632583490_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_ContentsChanged(handler: TypedEventHandler<IStorageQueryResultBase?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1632583490_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1632583490_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ContentsChanged(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1632583490_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1632583490_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_OptionsChanged(changedHandler: TypedEventHandler<IStorageQueryResultBase?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1632583490_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1632583490_Ptr, marshalToNative(changedHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_OptionsChanged(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1632583490_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1632583490_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun FindStartIndexAsync(value: IUnknown?): IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _1632583490_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1632583490_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetCurrentQueryOptions(): QueryOptions? {
      val fnPtr = _1632583490_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<QueryOptions>()
      val hr = fn.invokeHR(arrayOf(__1632583490_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<QueryOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ApplyNewQueryOptions(newQueryOptions: QueryOptions?): Unit {
      val fnPtr = _1632583490_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1632583490_Ptr, marshalToNative(newQueryOptions),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorageQueryResultBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1632583490_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageQueryResultBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c297d70d735347abba588c61425dc54b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageQueryResultBase(ptr: Pointer?): WithDefault =
        IStorageQueryResultBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageQueryResultBase {
      val address = segment.toRawLongValue()
      return makeIStorageQueryResultBase(Pointer(address))
    }

    public override fun toNative(obj: IStorageQueryResultBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1632583490_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageQueryResultBase): Array<IStorageQueryResultBase?>
        = (elements as
        Array<IStorageQueryResultBase?>).castToImpl<IStorageQueryResultBase,IStorageQueryResultBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageQueryResultBase?> =
        arrayOfNulls<IStorageQueryResultBase_Impl>(size) as Array<IStorageQueryResultBase?>
  }
}
