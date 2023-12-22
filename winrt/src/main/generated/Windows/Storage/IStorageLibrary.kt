package Windows.Storage

import Windows.Foundation.Collections.IObservableVector
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

@ABIMarker(IStorageLibrary.ABI::class)
@Signature("{1edd7103-0e5e-4d6c-b5e8-9318983d6a03}")
@Guid("1edd71030e5e4d6cb5e89318983d6a03")
@WinRTInterface("1edd71030e5e4d6cb5e89318983d6a03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibrary.ByReference::class)
public interface IStorageLibrary : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAddFolderAsync(): IAsyncOperation<StorageFolder?>?

  @InterfaceMethod(1)
  public fun RequestRemoveFolderAsync(folder: StorageFolder?): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun get_Folders(): IObservableVector<StorageFolder?>?

  @InterfaceMethod(3)
  public fun get_SaveFolder(): StorageFolder?

  @InterfaceMethod(4)
  public fun add_DefinitionChanged(handler: TypedEventHandler<StorageLibrary?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_DefinitionChanged(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibrary> {
    public override fun getValue() = ABI.makeIStorageLibrary(pointer.getPointer(0))

    public fun setValue(value: IStorageLibrary_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibrary {
    public val __1260844697_Ptr: Pointer?

    public val _1260844697_VtblPtr: Pointer?
      get() = __1260844697_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAddFolderAsync(): IAsyncOperation<StorageFolder?>? {
      val fnPtr = _1260844697_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__1260844697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestRemoveFolderAsync(folder: StorageFolder?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1260844697_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1260844697_Ptr, marshalToNative(folder), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Folders(): IObservableVector<StorageFolder?>? {
      val fnPtr = _1260844697_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__1260844697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IObservableVector<StorageFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SaveFolder(): StorageFolder? {
      val fnPtr = _1260844697_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__1260844697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_DefinitionChanged(handler: TypedEventHandler<StorageLibrary?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1260844697_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1260844697_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_DefinitionChanged(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1260844697_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1260844697_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorageLibrary_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1260844697_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibrary, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1edd71030e5e4d6cb5e89318983d6a03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibrary(ptr: Pointer?): WithDefault = IStorageLibrary_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageLibrary {
      val address = segment.toRawLongValue()
      return makeIStorageLibrary(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibrary): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1260844697_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibrary): Array<IStorageLibrary?> = (elements as
        Array<IStorageLibrary?>).castToImpl<IStorageLibrary,IStorageLibrary_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibrary?> =
        arrayOfNulls<IStorageLibrary_Impl>(size) as Array<IStorageLibrary?>
  }
}
