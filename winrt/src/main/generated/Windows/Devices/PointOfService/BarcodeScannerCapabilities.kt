package Windows.Devices.PointOfService

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

@ABIMarker(BarcodeScannerCapabilities.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.BarcodeScannerCapabilities;{c60691e4-f2c8-4420-a307-b12ef6622857})")
@WinRTByReference(brClass = BarcodeScannerCapabilities.ByReference::class)
public class BarcodeScannerCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerCapabilities.WithDefault,
    IBarcodeScannerCapabilities1.WithDefault, IBarcodeScannerCapabilities2.WithDefault, IWinRTObject
    {
  private val __2023673491_Interface: IBarcodeScannerCapabilities.WithDefault by lazy {
    as_2023673491()
  }


  private val __1690631170_Interface: IBarcodeScannerCapabilities1.WithDefault by lazy {
    as_1690631170()
  }


  private val __1690631169_Interface: IBarcodeScannerCapabilities2.WithDefault by lazy {
    as_1690631169()
  }


  public override val __2023673491_Ptr: JNAPointer? by lazy {
    __2023673491_Interface.__2023673491_Ptr
  }


  public override val __1690631170_Ptr: JNAPointer? by lazy {
    __1690631170_Interface.__1690631170_Ptr
  }


  public override val __1690631169_Ptr: JNAPointer? by lazy {
    __1690631169_Interface.__1690631169_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2023673491_Interface, __1690631170_Interface, __1690631169_Interface)

  private fun as_2023673491(): IBarcodeScannerCapabilities.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerCapabilities.ABI.makeIBarcodeScannerCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerCapabilities.ABI.makeIBarcodeScannerCapabilities(ref.value))
  }

  private fun as_1690631170(): IBarcodeScannerCapabilities1.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerCapabilities1.ABI.makeIBarcodeScannerCapabilities1(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerCapabilities1>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerCapabilities1.ABI.makeIBarcodeScannerCapabilities1(ref.value))
  }

  private fun as_1690631169(): IBarcodeScannerCapabilities2.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerCapabilities2.ABI.makeIBarcodeScannerCapabilities2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerCapabilities2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerCapabilities2.ABI.makeIBarcodeScannerCapabilities2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerCapabilities> {
    public override fun getValue() = BarcodeScannerCapabilities(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BarcodeScannerCapabilities {
      val address = segment.toRawLongValue()
      return BarcodeScannerCapabilities(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
