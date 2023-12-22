package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IMaintenanceTriggerFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MaintenanceTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.MaintenanceTrigger;{68184c83-fc22-4ce5-841a-7239a9810047})")
@WinRTByReference(brClass = MaintenanceTrigger.ByReference::class)
public class MaintenanceTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMaintenanceTrigger.WithDefault, IBackgroundTrigger.WithDefault, IWinRTObject
    {
  private val __1162771158_Interface: IMaintenanceTrigger.WithDefault by lazy {
    as_1162771158()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __1162771158_Ptr: JNAPointer? by lazy {
    __1162771158_Interface.__1162771158_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1162771158_Interface, __54213927_Interface)

  public constructor(freshnessTime: WinDef.UINT, oneShot: Boolean) :
      this(ABI.activate(freshnessTime, oneShot))

  private fun as_1162771158(): IMaintenanceTrigger.WithDefault {
    if(pointer == NULL) {
      return(IMaintenanceTrigger.ABI.makeIMaintenanceTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMaintenanceTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMaintenanceTrigger.ABI.makeIMaintenanceTrigger(ref.value))
  }

  private fun as_54213927(): IBackgroundTrigger.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MaintenanceTrigger> {
    public override fun getValue() = MaintenanceTrigger(pointer.getPointer(0))

    public fun setValue(value: MaintenanceTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MaintenanceTrigger, MemoryAddress> {
    public val IMaintenanceTriggerFactory_Instance: IMaintenanceTriggerFactory by lazy {
      createIMaintenanceTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMaintenanceTriggerFactory(): IMaintenanceTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.MaintenanceTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMaintenanceTriggerFactory.ABI.makeIMaintenanceTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(freshnessTime: WinDef.UINT, oneShot: Boolean): JNAPointer? =
        IMaintenanceTriggerFactory_Instance.Create(freshnessTime, oneShot)?.pointer

    public override fun fromNative(segment: MemoryAddress): MaintenanceTrigger {
      val address = segment.toRawLongValue()
      return MaintenanceTrigger(Pointer(address))
    }

    public override fun toNative(obj: MaintenanceTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
