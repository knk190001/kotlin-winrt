package Windows.Networking.BackgroundTransfer

import Windows.UI.Notifications.TileNotification
import Windows.UI.Notifications.ToastNotification
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

@ABIMarker(IBackgroundUploader2.ABI::class)
@Signature("{8e0612ce-0c34-4463-807f-198a1b8bd4ad}")
@Guid("8e0612ce0c344463807f198a1b8bd4ad")
@WinRTInterface("8e0612ce0c344463807f198a1b8bd4ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundUploader2.ByReference::class)
public interface IBackgroundUploader2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TransferGroup(): BackgroundTransferGroup?

  @InterfaceMethod(1)
  public fun put_TransferGroup(value: BackgroundTransferGroup?): Unit

  @InterfaceMethod(2)
  public fun get_SuccessToastNotification(): ToastNotification?

  @InterfaceMethod(3)
  public fun put_SuccessToastNotification(value: ToastNotification?): Unit

  @InterfaceMethod(4)
  public fun get_FailureToastNotification(): ToastNotification?

  @InterfaceMethod(5)
  public fun put_FailureToastNotification(value: ToastNotification?): Unit

  @InterfaceMethod(6)
  public fun get_SuccessTileNotification(): TileNotification?

  @InterfaceMethod(7)
  public fun put_SuccessTileNotification(value: TileNotification?): Unit

  @InterfaceMethod(8)
  public fun get_FailureTileNotification(): TileNotification?

  @InterfaceMethod(9)
  public fun put_FailureTileNotification(value: TileNotification?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundUploader2> {
    public override fun getValue() = ABI.makeIBackgroundUploader2(pointer.getPointer(0))

    public fun setValue(value: IBackgroundUploader2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundUploader2 {
    public val __1867120917_Ptr: Pointer?

    public val _1867120917_VtblPtr: Pointer?
      get() = __1867120917_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TransferGroup(): BackgroundTransferGroup? {
      val fnPtr = _1867120917_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTransferGroup>()
      val hr = fn.invokeHR(arrayOf(__1867120917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTransferGroup>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TransferGroup(value: BackgroundTransferGroup?): Unit {
      val fnPtr = _1867120917_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1867120917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SuccessToastNotification(): ToastNotification? {
      val fnPtr = _1867120917_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotification>()
      val hr = fn.invokeHR(arrayOf(__1867120917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SuccessToastNotification(value: ToastNotification?): Unit {
      val fnPtr = _1867120917_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1867120917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FailureToastNotification(): ToastNotification? {
      val fnPtr = _1867120917_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotification>()
      val hr = fn.invokeHR(arrayOf(__1867120917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FailureToastNotification(value: ToastNotification?): Unit {
      val fnPtr = _1867120917_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1867120917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SuccessTileNotification(): TileNotification? {
      val fnPtr = _1867120917_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileNotification>()
      val hr = fn.invokeHR(arrayOf(__1867120917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileNotification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_SuccessTileNotification(value: TileNotification?): Unit {
      val fnPtr = _1867120917_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1867120917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FailureTileNotification(): TileNotification? {
      val fnPtr = _1867120917_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileNotification>()
      val hr = fn.invokeHR(arrayOf(__1867120917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileNotification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_FailureTileNotification(value: TileNotification?): Unit {
      val fnPtr = _1867120917_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1867120917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackgroundUploader2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1867120917_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundUploader2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e0612ce0c344463807f198a1b8bd4ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundUploader2(ptr: Pointer?): WithDefault = IBackgroundUploader2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundUploader2 {
      val address = segment.toRawLongValue()
      return makeIBackgroundUploader2(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundUploader2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1867120917_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundUploader2): Array<IBackgroundUploader2?> =
        (elements as
        Array<IBackgroundUploader2?>).castToImpl<IBackgroundUploader2,IBackgroundUploader2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundUploader2?> =
        arrayOfNulls<IBackgroundUploader2_Impl>(size) as Array<IBackgroundUploader2?>
  }
}
