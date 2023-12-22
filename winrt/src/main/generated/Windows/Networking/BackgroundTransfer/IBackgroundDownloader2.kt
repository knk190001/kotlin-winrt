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

@ABIMarker(IBackgroundDownloader2.ABI::class)
@Signature("{a94a5847-348d-4a35-890e-8a1ef3798479}")
@Guid("a94a5847348d4a35890e8a1ef3798479")
@WinRTInterface("a94a5847348d4a35890e8a1ef3798479")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundDownloader2.ByReference::class)
public interface IBackgroundDownloader2 : NativeMapped, IWinRTInterface {
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
      IByReference<IBackgroundDownloader2> {
    public override fun getValue() = ABI.makeIBackgroundDownloader2(pointer.getPointer(0))

    public fun setValue(value: IBackgroundDownloader2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundDownloader2 {
    public val __1020282094_Ptr: Pointer?

    public val _1020282094_VtblPtr: Pointer?
      get() = __1020282094_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TransferGroup(): BackgroundTransferGroup? {
      val fnPtr = _1020282094_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTransferGroup>()
      val hr = fn.invokeHR(arrayOf(__1020282094_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTransferGroup>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TransferGroup(value: BackgroundTransferGroup?): Unit {
      val fnPtr = _1020282094_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1020282094_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SuccessToastNotification(): ToastNotification? {
      val fnPtr = _1020282094_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotification>()
      val hr = fn.invokeHR(arrayOf(__1020282094_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SuccessToastNotification(value: ToastNotification?): Unit {
      val fnPtr = _1020282094_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1020282094_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FailureToastNotification(): ToastNotification? {
      val fnPtr = _1020282094_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotification>()
      val hr = fn.invokeHR(arrayOf(__1020282094_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FailureToastNotification(value: ToastNotification?): Unit {
      val fnPtr = _1020282094_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1020282094_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SuccessTileNotification(): TileNotification? {
      val fnPtr = _1020282094_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileNotification>()
      val hr = fn.invokeHR(arrayOf(__1020282094_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileNotification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_SuccessTileNotification(value: TileNotification?): Unit {
      val fnPtr = _1020282094_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1020282094_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FailureTileNotification(): TileNotification? {
      val fnPtr = _1020282094_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileNotification>()
      val hr = fn.invokeHR(arrayOf(__1020282094_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileNotification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_FailureTileNotification(value: TileNotification?): Unit {
      val fnPtr = _1020282094_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1020282094_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackgroundDownloader2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1020282094_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundDownloader2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a94a5847348d4a35890e8a1ef3798479")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundDownloader2(ptr: Pointer?): WithDefault =
        IBackgroundDownloader2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundDownloader2 {
      val address = segment.toRawLongValue()
      return makeIBackgroundDownloader2(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundDownloader2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1020282094_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundDownloader2): Array<IBackgroundDownloader2?> =
        (elements as
        Array<IBackgroundDownloader2?>).castToImpl<IBackgroundDownloader2,IBackgroundDownloader2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundDownloader2?> =
        arrayOfNulls<IBackgroundDownloader2_Impl>(size) as Array<IBackgroundDownloader2?>
  }
}
