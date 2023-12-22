package Windows.ApplicationModel.Wallet.System

import Windows.ApplicationModel.Wallet.WalletItem
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWalletItemSystemStore.ABI::class)
@Signature("{522e2bff-96a2-4a17-8d19-fe1d9f837561}")
@Guid("522e2bff96a24a178d19fe1d9f837561")
@WinRTInterface("522e2bff96a24a178d19fe1d9f837561")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletItemSystemStore.ByReference::class)
public interface IWalletItemSystemStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetItemsAsync(): IAsyncOperation<IVectorView<WalletItem?>?>?

  @InterfaceMethod(1)
  public fun DeleteAsync(item: WalletItem?): IAsyncAction?

  @InterfaceMethod(2)
  public fun ImportItemAsync(stream: IRandomAccessStreamReference?): IAsyncOperation<WalletItem?>?

  @InterfaceMethod(3)
  public fun GetAppStatusForItem(item: WalletItem?): WalletItemAppAssociation?

  @InterfaceMethod(4)
  public fun LaunchAppForItemAsync(item: WalletItem?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWalletItemSystemStore> {
    public override fun getValue() = ABI.makeIWalletItemSystemStore(pointer.getPointer(0))

    public fun setValue(value: IWalletItemSystemStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletItemSystemStore {
    public val __328717641_Ptr: Pointer?

    public val _328717641_VtblPtr: Pointer?
      get() = __328717641_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetItemsAsync(): IAsyncOperation<IVectorView<WalletItem?>?>? {
      val fnPtr = _328717641_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<WalletItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__328717641_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<WalletItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun DeleteAsync(item: WalletItem?): IAsyncAction? {
      val fnPtr = _328717641_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__328717641_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ImportItemAsync(stream: IRandomAccessStreamReference?):
        IAsyncOperation<WalletItem?>? {
      val fnPtr = _328717641_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WalletItem?>>()
      val hr = fn.invokeHR(arrayOf(__328717641_Ptr, marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WalletItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetAppStatusForItem(item: WalletItem?): WalletItemAppAssociation? {
      val fnPtr = _328717641_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WalletItemAppAssociation>()
      val hr = fn.invokeHR(arrayOf(__328717641_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WalletItemAppAssociation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun LaunchAppForItemAsync(item: WalletItem?): IAsyncOperation<Boolean>? {
      val fnPtr = _328717641_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__328717641_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IWalletItemSystemStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __328717641_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletItemSystemStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("522e2bff96a24a178d19fe1d9f837561")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletItemSystemStore(ptr: Pointer?): WithDefault =
        IWalletItemSystemStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletItemSystemStore {
      val address = segment.toRawLongValue()
      return makeIWalletItemSystemStore(Pointer(address))
    }

    public override fun toNative(obj: IWalletItemSystemStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__328717641_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletItemSystemStore): Array<IWalletItemSystemStore?> =
        (elements as
        Array<IWalletItemSystemStore?>).castToImpl<IWalletItemSystemStore,IWalletItemSystemStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletItemSystemStore?> =
        arrayOfNulls<IWalletItemSystemStore_Impl>(size) as Array<IWalletItemSystemStore?>
  }
}
