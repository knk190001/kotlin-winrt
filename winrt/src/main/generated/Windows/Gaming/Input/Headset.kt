package Windows.Gaming.Input

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

@ABIMarker(Headset.ABI::class)
@Signature("rc(Windows.Gaming.Input.Headset;{3fd156ef-6925-3fa8-9181-029c5223ae3b})")
@WinRTByReference(brClass = Headset.ByReference::class)
public class Headset(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHeadset.WithDefault, IGameControllerBatteryInfo.WithDefault, IWinRTObject {
  private val __1409717999_Interface: IHeadset.WithDefault by lazy {
    as_1409717999()
  }


  private val __1091749242_Interface: IGameControllerBatteryInfo.WithDefault by lazy {
    as_1091749242()
  }


  public override val __1409717999_Ptr: JNAPointer? by lazy {
    __1409717999_Interface.__1409717999_Ptr
  }


  public override val __1091749242_Ptr: JNAPointer? by lazy {
    __1091749242_Interface.__1091749242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1409717999_Interface, __1091749242_Interface)

  private fun as_1409717999(): IHeadset.WithDefault {
    if(pointer == NULL) {
      return(IHeadset.ABI.makeIHeadset(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHeadset>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHeadset.ABI.makeIHeadset(ref.value))
  }

  private fun as_1091749242(): IGameControllerBatteryInfo.WithDefault {
    if(pointer == NULL) {
      return(IGameControllerBatteryInfo.ABI.makeIGameControllerBatteryInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameControllerBatteryInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameControllerBatteryInfo.ABI.makeIGameControllerBatteryInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Headset> {
    public override fun getValue() = Headset(pointer.getPointer(0))

    public fun setValue(value: Headset): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Headset, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Headset {
      val address = segment.toRawLongValue()
      return Headset(Pointer(address))
    }

    public override fun toNative(obj: Headset): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
