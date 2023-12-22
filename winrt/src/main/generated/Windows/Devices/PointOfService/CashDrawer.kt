package Windows.Devices.PointOfService

import Windows.Foundation.IClosable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(CashDrawer.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.CashDrawer;{9f88f5c8-de54-4aee-a890-920bcbfe30fc})")
@WinRTByReference(brClass = CashDrawer.ByReference::class)
public class CashDrawer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICashDrawer.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1179582051_Interface: ICashDrawer.WithDefault by lazy {
    as_1179582051()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1179582051_Ptr: JNAPointer? by lazy {
    __1179582051_Interface.__1179582051_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1179582051_Interface, __1260617006_Interface)

  private fun as_1179582051(): ICashDrawer.WithDefault {
    if(pointer == NULL) {
      return(ICashDrawer.ABI.makeICashDrawer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICashDrawer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICashDrawer.ABI.makeICashDrawer(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CashDrawer> {
    public override fun getValue() = CashDrawer(pointer.getPointer(0))

    public fun setValue(value: CashDrawer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CashDrawer, MemoryAddress> {
    public val ICashDrawerStatics_Instance: ICashDrawerStatics by lazy {
      createICashDrawerStatics()
    }


    public val ICashDrawerStatics2_Instance: ICashDrawerStatics2 by lazy {
      createICashDrawerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICashDrawerStatics(): ICashDrawerStatics {
      val refiid = Guid.REFIID(ICashDrawerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.CashDrawer".toHandle(),refiid,interfacePtr)
      val result = ICashDrawerStatics.ABI.makeICashDrawerStatics(interfacePtr.value)
      return result
    }

    public fun createICashDrawerStatics2(): ICashDrawerStatics2 {
      val refiid = Guid.REFIID(ICashDrawerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.CashDrawer".toHandle(),refiid,interfacePtr)
      val result = ICashDrawerStatics2.ABI.makeICashDrawerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CashDrawer {
      val address = segment.toRawLongValue()
      return CashDrawer(Pointer(address))
    }

    public override fun toNative(obj: CashDrawer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefaultAsync() = ABI.ICashDrawerStatics_Instance.GetDefaultAsync()

    public fun FromIdAsync(deviceId: String) = ABI.ICashDrawerStatics_Instance.FromIdAsync(deviceId)

    public fun GetDeviceSelector() = ABI.ICashDrawerStatics_Instance.GetDeviceSelector()

    public fun GetDeviceSelector(connectionTypes: PosConnectionTypes) =
        ABI.ICashDrawerStatics2_Instance.GetDeviceSelector(connectionTypes)
  }
}
