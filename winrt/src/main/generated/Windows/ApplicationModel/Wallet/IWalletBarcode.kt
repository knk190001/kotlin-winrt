package Windows.ApplicationModel.Wallet

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

@ABIMarker(IWalletBarcode.ABI::class)
@Signature("{4f857b29-de80-4ea4-a1cd-81cd084dac27}")
@Guid("4f857b29de804ea4a1cd81cd084dac27")
@WinRTInterface("4f857b29de804ea4a1cd81cd084dac27")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletBarcode.ByReference::class)
public interface IWalletBarcode : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Symbology(): WalletBarcodeSymbology?

  @InterfaceMethod(1)
  public fun get_Value(): String?

  @InterfaceMethod(2)
  public fun GetImageAsync(): IAsyncOperation<IRandomAccessStreamReference?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWalletBarcode>
      {
    public override fun getValue() = ABI.makeIWalletBarcode(pointer.getPointer(0))

    public fun setValue(value: IWalletBarcode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletBarcode {
    public val __1380077697_Ptr: Pointer?

    public val _1380077697_VtblPtr: Pointer?
      get() = __1380077697_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Symbology(): WalletBarcodeSymbology? {
      val fnPtr = _1380077697_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WalletBarcodeSymbology>()
      val hr = fn.invokeHR(arrayOf(__1380077697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WalletBarcodeSymbology>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): String? {
      val fnPtr = _1380077697_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1380077697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetImageAsync(): IAsyncOperation<IRandomAccessStreamReference?>? {
      val fnPtr = _1380077697_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStreamReference?>>()
      val hr = fn.invokeHR(arrayOf(__1380077697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IRandomAccessStreamReference?>>(result.getValue())
      return resultValue
    }
  }

  public class IWalletBarcode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1380077697_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletBarcode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f857b29de804ea4a1cd81cd084dac27")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletBarcode(ptr: Pointer?): WithDefault = IWalletBarcode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletBarcode {
      val address = segment.toRawLongValue()
      return makeIWalletBarcode(Pointer(address))
    }

    public override fun toNative(obj: IWalletBarcode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1380077697_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletBarcode): Array<IWalletBarcode?> = (elements as
        Array<IWalletBarcode?>).castToImpl<IWalletBarcode,IWalletBarcode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletBarcode?> =
        arrayOfNulls<IWalletBarcode_Impl>(size) as Array<IWalletBarcode?>
  }
}
