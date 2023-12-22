package Windows.Devices.PointOfService.Provider

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

@ABIMarker(BarcodeScannerProviderConnection.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.Provider.BarcodeScannerProviderConnection;{b44acbed-0b3a-4fa3-86c5-491ea30780eb})")
@WinRTByReference(brClass = BarcodeScannerProviderConnection.ByReference::class)
public class BarcodeScannerProviderConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerProviderConnection.WithDefault,
    IBarcodeScannerProviderConnection2.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1092666305_Interface: IBarcodeScannerProviderConnection.WithDefault by lazy {
    as_1092666305()
  }


  private val __487082863_Interface: IBarcodeScannerProviderConnection2.WithDefault by lazy {
    as_487082863()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1092666305_Ptr: JNAPointer? by lazy {
    __1092666305_Interface.__1092666305_Ptr
  }


  public override val __487082863_Ptr: JNAPointer? by lazy {
    __487082863_Interface.__487082863_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1092666305_Interface, __487082863_Interface, __1260617006_Interface)

  private fun as_1092666305(): IBarcodeScannerProviderConnection.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerProviderConnection.ABI.makeIBarcodeScannerProviderConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerProviderConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerProviderConnection.ABI.makeIBarcodeScannerProviderConnection(ref.value))
  }

  private fun as_487082863(): IBarcodeScannerProviderConnection2.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerProviderConnection2.ABI.makeIBarcodeScannerProviderConnection2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerProviderConnection2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerProviderConnection2.ABI.makeIBarcodeScannerProviderConnection2(ref.value))
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
      IByReference<BarcodeScannerProviderConnection> {
    public override fun getValue() = BarcodeScannerProviderConnection(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerProviderConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerProviderConnection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BarcodeScannerProviderConnection {
      val address = segment.toRawLongValue()
      return BarcodeScannerProviderConnection(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerProviderConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
