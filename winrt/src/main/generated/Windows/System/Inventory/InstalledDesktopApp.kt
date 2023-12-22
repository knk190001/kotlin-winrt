package Windows.System.Inventory

import Windows.Foundation.IStringable
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InstalledDesktopApp.ABI::class)
@Signature("rc(Windows.System.Inventory.InstalledDesktopApp;{75eab8ed-c0bc-5364-4c28-166e0545167a})")
@WinRTByReference(brClass = InstalledDesktopApp.ByReference::class)
public class InstalledDesktopApp(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInstalledDesktopApp.WithDefault, IStringable.WithDefault, IWinRTObject {
  private val __2047281922_Interface: IInstalledDesktopApp.WithDefault by lazy {
    as_2047281922()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __2047281922_Ptr: JNAPointer? by lazy {
    __2047281922_Interface.__2047281922_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2047281922_Interface, __328683030_Interface)

  private fun as_2047281922(): IInstalledDesktopApp.WithDefault {
    if(pointer == NULL) {
      return(IInstalledDesktopApp.ABI.makeIInstalledDesktopApp(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInstalledDesktopApp>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInstalledDesktopApp.ABI.makeIInstalledDesktopApp(ref.value))
  }

  private fun as_328683030(): IStringable.WithDefault {
    if(pointer == NULL) {
      return(IStringable.ABI.makeIStringable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStringable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStringable.ABI.makeIStringable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InstalledDesktopApp> {
    public override fun getValue() = InstalledDesktopApp(pointer.getPointer(0))

    public fun setValue(value: InstalledDesktopApp): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InstalledDesktopApp, MemoryAddress> {
    public val IInstalledDesktopAppStatics_Instance: IInstalledDesktopAppStatics by lazy {
      createIInstalledDesktopAppStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInstalledDesktopAppStatics(): IInstalledDesktopAppStatics {
      val refiid = Guid.REFIID(IInstalledDesktopAppStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Inventory.InstalledDesktopApp".toHandle(),refiid,interfacePtr)
      val result =
          IInstalledDesktopAppStatics.ABI.makeIInstalledDesktopAppStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InstalledDesktopApp {
      val address = segment.toRawLongValue()
      return InstalledDesktopApp(Pointer(address))
    }

    public override fun toNative(obj: InstalledDesktopApp): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetInventoryAsync() = ABI.IInstalledDesktopAppStatics_Instance.GetInventoryAsync()
  }
}
