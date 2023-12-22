package Windows.Devices.PointOfService

import Windows.Foundation.IClosable
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ClaimedBarcodeScanner.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.ClaimedBarcodeScanner;{4a63b49c-8fa4-4332-bb26-945d11d81e0f})")
@WinRTByReference(brClass = ClaimedBarcodeScanner.ByReference::class)
public class ClaimedBarcodeScanner(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClaimedBarcodeScanner.WithDefault, IClaimedBarcodeScanner1.WithDefault,
    IClaimedBarcodeScanner2.WithDefault, IClaimedBarcodeScanner3.WithDefault,
    IClaimedBarcodeScanner4.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __514255450_Interface: IClaimedBarcodeScanner.WithDefault by lazy {
    as_514255450()
  }


  private val __1237950185_Interface: IClaimedBarcodeScanner1.WithDefault by lazy {
    as_1237950185()
  }


  private val __1237950184_Interface: IClaimedBarcodeScanner2.WithDefault by lazy {
    as_1237950184()
  }


  private val __1237950183_Interface: IClaimedBarcodeScanner3.WithDefault by lazy {
    as_1237950183()
  }


  private val __1237950182_Interface: IClaimedBarcodeScanner4.WithDefault by lazy {
    as_1237950182()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __514255450_Ptr: JNAPointer? by lazy {
    __514255450_Interface.__514255450_Ptr
  }


  public override val __1237950185_Ptr: JNAPointer? by lazy {
    __1237950185_Interface.__1237950185_Ptr
  }


  public override val __1237950184_Ptr: JNAPointer? by lazy {
    __1237950184_Interface.__1237950184_Ptr
  }


  public override val __1237950183_Ptr: JNAPointer? by lazy {
    __1237950183_Interface.__1237950183_Ptr
  }


  public override val __1237950182_Ptr: JNAPointer? by lazy {
    __1237950182_Interface.__1237950182_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__514255450_Interface, __1237950185_Interface, __1237950184_Interface,
        __1237950183_Interface, __1237950182_Interface, __1260617006_Interface)

  private fun as_514255450(): IClaimedBarcodeScanner.WithDefault {
    if(pointer == NULL) {
      return(IClaimedBarcodeScanner.ABI.makeIClaimedBarcodeScanner(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedBarcodeScanner>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedBarcodeScanner.ABI.makeIClaimedBarcodeScanner(ref.value))
  }

  private fun as_1237950185(): IClaimedBarcodeScanner1.WithDefault {
    if(pointer == NULL) {
      return(IClaimedBarcodeScanner1.ABI.makeIClaimedBarcodeScanner1(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedBarcodeScanner1>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedBarcodeScanner1.ABI.makeIClaimedBarcodeScanner1(ref.value))
  }

  private fun as_1237950184(): IClaimedBarcodeScanner2.WithDefault {
    if(pointer == NULL) {
      return(IClaimedBarcodeScanner2.ABI.makeIClaimedBarcodeScanner2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedBarcodeScanner2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedBarcodeScanner2.ABI.makeIClaimedBarcodeScanner2(ref.value))
  }

  private fun as_1237950183(): IClaimedBarcodeScanner3.WithDefault {
    if(pointer == NULL) {
      return(IClaimedBarcodeScanner3.ABI.makeIClaimedBarcodeScanner3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedBarcodeScanner3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedBarcodeScanner3.ABI.makeIClaimedBarcodeScanner3(ref.value))
  }

  private fun as_1237950182(): IClaimedBarcodeScanner4.WithDefault {
    if(pointer == NULL) {
      return(IClaimedBarcodeScanner4.ABI.makeIClaimedBarcodeScanner4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedBarcodeScanner4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedBarcodeScanner4.ABI.makeIClaimedBarcodeScanner4(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ClaimedBarcodeScanner> {
    public override fun getValue() = ClaimedBarcodeScanner(pointer.getPointer(0))

    public fun setValue(value: ClaimedBarcodeScanner): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClaimedBarcodeScanner, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ClaimedBarcodeScanner {
      val address = segment.toRawLongValue()
      return ClaimedBarcodeScanner(Pointer(address))
    }

    public override fun toNative(obj: ClaimedBarcodeScanner): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
