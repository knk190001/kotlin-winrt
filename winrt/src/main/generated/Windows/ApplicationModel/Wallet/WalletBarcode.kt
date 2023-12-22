package Windows.ApplicationModel.Wallet

import Windows.ApplicationModel.Wallet.IWalletBarcodeFactory.ABI.IID
import Windows.Storage.Streams.IRandomAccessStreamReference
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WalletBarcode.ABI::class)
@Signature("rc(Windows.ApplicationModel.Wallet.WalletBarcode;{4f857b29-de80-4ea4-a1cd-81cd084dac27})")
@WinRTByReference(brClass = WalletBarcode.ByReference::class)
public class WalletBarcode(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWalletBarcode.WithDefault, IWinRTObject {
  private val __1380077697_Interface: IWalletBarcode.WithDefault by lazy {
    as_1380077697()
  }


  public override val __1380077697_Ptr: JNAPointer? by lazy {
    __1380077697_Interface.__1380077697_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1380077697_Interface)

  public constructor(symbology: WalletBarcodeSymbology, value: String) :
      this(ABI.activate(symbology, value))

  public constructor(streamToBarcodeImage: IRandomAccessStreamReference) :
      this(ABI.activate(streamToBarcodeImage))

  private fun as_1380077697(): IWalletBarcode.WithDefault {
    if(pointer == NULL) {
      return(IWalletBarcode.ABI.makeIWalletBarcode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWalletBarcode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWalletBarcode.ABI.makeIWalletBarcode(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WalletBarcode>
      {
    public override fun getValue() = WalletBarcode(pointer.getPointer(0))

    public fun setValue(value: WalletBarcode): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WalletBarcode, MemoryAddress> {
    public val IWalletBarcodeFactory_Instance: IWalletBarcodeFactory by lazy {
      createIWalletBarcodeFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWalletBarcodeFactory(): IWalletBarcodeFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Wallet.WalletBarcode".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWalletBarcodeFactory.ABI.makeIWalletBarcodeFactory(factoryActivatorPtr.value))
    }

    public fun activate(symbology: WalletBarcodeSymbology, value: String): JNAPointer? =
        IWalletBarcodeFactory_Instance.CreateWalletBarcode(symbology, value)?.pointer

    public fun activate(streamToBarcodeImage: IRandomAccessStreamReference): JNAPointer? =
        IWalletBarcodeFactory_Instance.CreateCustomWalletBarcode(streamToBarcodeImage)?.pointer

    public override fun fromNative(segment: MemoryAddress): WalletBarcode {
      val address = segment.toRawLongValue()
      return WalletBarcode(Pointer(address))
    }

    public override fun toNative(obj: WalletBarcode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
