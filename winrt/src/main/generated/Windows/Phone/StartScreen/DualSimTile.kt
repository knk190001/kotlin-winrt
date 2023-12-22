package Windows.Phone.StartScreen

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(DualSimTile.ABI::class)
@Signature("rc(Windows.Phone.StartScreen.DualSimTile;{143ab213-d05f-4041-a18c-3e3fcb75b41e})")
@WinRTByReference(brClass = DualSimTile.ByReference::class)
public class DualSimTile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDualSimTile.WithDefault, IWinRTObject {
  private val __1944772451_Interface: IDualSimTile.WithDefault by lazy {
    as_1944772451()
  }


  public override val __1944772451_Ptr: JNAPointer? by lazy {
    __1944772451_Interface.__1944772451_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1944772451_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1944772451(): IDualSimTile.WithDefault {
    if(pointer == NULL) {
      return(IDualSimTile.ABI.makeIDualSimTile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDualSimTile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDualSimTile.ABI.makeIDualSimTile(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DualSimTile> {
    public override fun getValue() = DualSimTile(pointer.getPointer(0))

    public fun setValue(value: DualSimTile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DualSimTile, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IDualSimTileStatics_Instance: IDualSimTileStatics by lazy {
      createIDualSimTileStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Phone.StartScreen.DualSimTile".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIDualSimTileStatics(): IDualSimTileStatics {
      val refiid = Guid.REFIID(IDualSimTileStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.StartScreen.DualSimTile".toHandle(),refiid,interfacePtr)
      val result = IDualSimTileStatics.ABI.makeIDualSimTileStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DualSimTile {
      val address = segment.toRawLongValue()
      return DualSimTile(Pointer(address))
    }

    public override fun toNative(obj: DualSimTile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetTileForSim2() = ABI.IDualSimTileStatics_Instance.GetTileForSim2()

    public fun UpdateDisplayNameForSim1Async(name: String) =
        ABI.IDualSimTileStatics_Instance.UpdateDisplayNameForSim1Async(name)

    public fun CreateTileUpdaterForSim1() =
        ABI.IDualSimTileStatics_Instance.CreateTileUpdaterForSim1()

    public fun CreateTileUpdaterForSim2() =
        ABI.IDualSimTileStatics_Instance.CreateTileUpdaterForSim2()

    public fun CreateBadgeUpdaterForSim1() =
        ABI.IDualSimTileStatics_Instance.CreateBadgeUpdaterForSim1()

    public fun CreateBadgeUpdaterForSim2() =
        ABI.IDualSimTileStatics_Instance.CreateBadgeUpdaterForSim2()

    public fun CreateToastNotifierForSim1() =
        ABI.IDualSimTileStatics_Instance.CreateToastNotifierForSim1()

    public fun CreateToastNotifierForSim2() =
        ABI.IDualSimTileStatics_Instance.CreateToastNotifierForSim2()
  }
}
