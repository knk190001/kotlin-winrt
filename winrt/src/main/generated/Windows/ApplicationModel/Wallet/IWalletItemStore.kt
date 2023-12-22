package Windows.ApplicationModel.Wallet

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWalletItemStore.ABI::class)
@Signature("{7160484b-6d49-48f8-91a9-40a1d0f13ef4}")
@Guid("7160484b6d4948f891a940a1d0f13ef4")
@WinRTInterface("7160484b6d4948f891a940a1d0f13ef4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletItemStore.ByReference::class)
public interface IWalletItemStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddAsync(id: String?, item: WalletItem?): IAsyncAction?

  @InterfaceMethod(1)
  public fun ClearAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun GetWalletItemAsync(id: String?): IAsyncOperation<WalletItem?>?

  @InterfaceMethod(3)
  public fun GetItemsAsync(): IAsyncOperation<IVectorView<WalletItem?>?>?

  @InterfaceMethod(4)
  public fun GetItemsAsync(kind: WalletItemKind?): IAsyncOperation<IVectorView<WalletItem?>?>?

  @InterfaceMethod(5)
  public fun ImportItemAsync(stream: IRandomAccessStreamReference?): IAsyncOperation<WalletItem?>?

  @InterfaceMethod(6)
  public fun DeleteAsync(id: String?): IAsyncAction?

  @InterfaceMethod(7)
  public fun ShowAsync(): IAsyncAction?

  @InterfaceMethod(8)
  public fun ShowAsync(id: String?): IAsyncAction?

  @InterfaceMethod(9)
  public fun UpdateAsync(item: WalletItem?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWalletItemStore> {
    public override fun getValue() = ABI.makeIWalletItemStore(pointer.getPointer(0))

    public fun setValue(value: IWalletItemStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletItemStore {
    public val __295572145_Ptr: Pointer?

    public val _295572145_VtblPtr: Pointer?
      get() = __295572145_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddAsync(id: String?, item: WalletItem?): IAsyncAction? {
      val fnPtr = _295572145_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__295572145_Ptr, marshalToNative(id), marshalToNative(item),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ClearAsync(): IAsyncAction? {
      val fnPtr = _295572145_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__295572145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetWalletItemAsync(id: String?): IAsyncOperation<WalletItem?>? {
      val fnPtr = _295572145_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WalletItem?>>()
      val hr = fn.invokeHR(arrayOf(__295572145_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WalletItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetItemsAsync(): IAsyncOperation<IVectorView<WalletItem?>?>? {
      val fnPtr = _295572145_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<WalletItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__295572145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<WalletItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetItemsAsync(kind: WalletItemKind?):
        IAsyncOperation<IVectorView<WalletItem?>?>? {
      val fnPtr = _295572145_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<WalletItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__295572145_Ptr, marshalToNative(kind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<WalletItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ImportItemAsync(stream: IRandomAccessStreamReference?):
        IAsyncOperation<WalletItem?>? {
      val fnPtr = _295572145_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WalletItem?>>()
      val hr = fn.invokeHR(arrayOf(__295572145_Ptr, marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WalletItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun DeleteAsync(id: String?): IAsyncAction? {
      val fnPtr = _295572145_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__295572145_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ShowAsync(): IAsyncAction? {
      val fnPtr = _295572145_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__295572145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ShowAsync(id: String?): IAsyncAction? {
      val fnPtr = _295572145_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__295572145_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun UpdateAsync(item: WalletItem?): IAsyncAction? {
      val fnPtr = _295572145_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__295572145_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IWalletItemStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __295572145_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletItemStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7160484b6d4948f891a940a1d0f13ef4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletItemStore(ptr: Pointer?): WithDefault = IWalletItemStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletItemStore {
      val address = segment.toRawLongValue()
      return makeIWalletItemStore(Pointer(address))
    }

    public override fun toNative(obj: IWalletItemStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__295572145_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletItemStore): Array<IWalletItemStore?> = (elements as
        Array<IWalletItemStore?>).castToImpl<IWalletItemStore,IWalletItemStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletItemStore?> =
        arrayOfNulls<IWalletItemStore_Impl>(size) as Array<IWalletItemStore?>
  }
}
