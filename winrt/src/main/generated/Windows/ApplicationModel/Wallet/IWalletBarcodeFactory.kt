package Windows.ApplicationModel.Wallet

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

@ABIMarker(IWalletBarcodeFactory.ABI::class)
@Signature("{30117161-ed9c-469e-bbfd-306c95ea7108}")
@Guid("30117161ed9c469ebbfd306c95ea7108")
@WinRTInterface("30117161ed9c469ebbfd306c95ea7108")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletBarcodeFactory.ByReference::class)
public interface IWalletBarcodeFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWalletBarcode(symbology: WalletBarcodeSymbology?, value: String?): WalletBarcode?

  @InterfaceMethod(1)
  public fun CreateCustomWalletBarcode(streamToBarcodeImage: IRandomAccessStreamReference?):
      WalletBarcode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWalletBarcodeFactory> {
    public override fun getValue() = ABI.makeIWalletBarcodeFactory(pointer.getPointer(0))

    public fun setValue(value: IWalletBarcodeFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletBarcodeFactory {
    public val __669051575_Ptr: Pointer?

    public val _669051575_VtblPtr: Pointer?
      get() = __669051575_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWalletBarcode(symbology: WalletBarcodeSymbology?, value: String?):
        WalletBarcode? {
      val fnPtr = _669051575_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WalletBarcode>()
      val hr = fn.invokeHR(arrayOf(__669051575_Ptr, marshalToNative(symbology),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WalletBarcode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun CreateCustomWalletBarcode(streamToBarcodeImage: IRandomAccessStreamReference?):
        WalletBarcode? {
      val fnPtr = _669051575_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WalletBarcode>()
      val hr = fn.invokeHR(arrayOf(__669051575_Ptr, marshalToNative(streamToBarcodeImage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WalletBarcode>(result.getValue())
      return resultValue
    }
  }

  public class IWalletBarcodeFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __669051575_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletBarcodeFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30117161ed9c469ebbfd306c95ea7108")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletBarcodeFactory(ptr: Pointer?): WithDefault =
        IWalletBarcodeFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletBarcodeFactory {
      val address = segment.toRawLongValue()
      return makeIWalletBarcodeFactory(Pointer(address))
    }

    public override fun toNative(obj: IWalletBarcodeFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__669051575_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletBarcodeFactory): Array<IWalletBarcodeFactory?> =
        (elements as
        Array<IWalletBarcodeFactory?>).castToImpl<IWalletBarcodeFactory,IWalletBarcodeFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletBarcodeFactory?> =
        arrayOfNulls<IWalletBarcodeFactory_Impl>(size) as Array<IWalletBarcodeFactory?>
  }
}
