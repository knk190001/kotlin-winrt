package Windows.Networking.Sockets

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

@ABIMarker(DatagramSocketControl.ABI::class)
@Signature("rc(Windows.Networking.Sockets.DatagramSocketControl;{52ac3f2e-349a-4135-bb58-b79b2647d390})")
@WinRTByReference(brClass = DatagramSocketControl.ByReference::class)
public class DatagramSocketControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDatagramSocketControl.WithDefault, IDatagramSocketControl2.WithDefault,
    IDatagramSocketControl3.WithDefault, IWinRTObject {
  private val __1328345905_Interface: IDatagramSocketControl.WithDefault by lazy {
    as_1328345905()
  }


  private val __1770949855_Interface: IDatagramSocketControl2.WithDefault by lazy {
    as_1770949855()
  }


  private val __1770949854_Interface: IDatagramSocketControl3.WithDefault by lazy {
    as_1770949854()
  }


  public override val __1328345905_Ptr: JNAPointer? by lazy {
    __1328345905_Interface.__1328345905_Ptr
  }


  public override val __1770949855_Ptr: JNAPointer? by lazy {
    __1770949855_Interface.__1770949855_Ptr
  }


  public override val __1770949854_Ptr: JNAPointer? by lazy {
    __1770949854_Interface.__1770949854_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1328345905_Interface, __1770949855_Interface, __1770949854_Interface)

  private fun as_1328345905(): IDatagramSocketControl.WithDefault {
    if(pointer == NULL) {
      return(IDatagramSocketControl.ABI.makeIDatagramSocketControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatagramSocketControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatagramSocketControl.ABI.makeIDatagramSocketControl(ref.value))
  }

  private fun as_1770949855(): IDatagramSocketControl2.WithDefault {
    if(pointer == NULL) {
      return(IDatagramSocketControl2.ABI.makeIDatagramSocketControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatagramSocketControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatagramSocketControl2.ABI.makeIDatagramSocketControl2(ref.value))
  }

  private fun as_1770949854(): IDatagramSocketControl3.WithDefault {
    if(pointer == NULL) {
      return(IDatagramSocketControl3.ABI.makeIDatagramSocketControl3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatagramSocketControl3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatagramSocketControl3.ABI.makeIDatagramSocketControl3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DatagramSocketControl> {
    public override fun getValue() = DatagramSocketControl(pointer.getPointer(0))

    public fun setValue(value: DatagramSocketControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DatagramSocketControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DatagramSocketControl {
      val address = segment.toRawLongValue()
      return DatagramSocketControl(Pointer(address))
    }

    public override fun toNative(obj: DatagramSocketControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
