package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.ISystemTriggerFactory.ABI.IID
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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SystemTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.SystemTrigger;{1d80c776-3748-4463-8d7e-276dc139ac1c})")
@WinRTByReference(brClass = SystemTrigger.ByReference::class)
public class SystemTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemTrigger.WithDefault, IBackgroundTrigger.WithDefault, IWinRTObject {
  private val __64070200_Interface: ISystemTrigger.WithDefault by lazy {
    as_64070200()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __64070200_Ptr: JNAPointer? by lazy {
    __64070200_Interface.__64070200_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__64070200_Interface, __54213927_Interface)

  public constructor(triggerType: SystemTriggerType, oneShot: Boolean) :
      this(ABI.activate(triggerType, oneShot))

  private fun as_64070200(): ISystemTrigger.WithDefault {
    if(pointer == NULL) {
      return(ISystemTrigger.ABI.makeISystemTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemTrigger.ABI.makeISystemTrigger(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SystemTrigger>
      {
    public override fun getValue() = SystemTrigger(pointer.getPointer(0))

    public fun setValue(value: SystemTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemTrigger, MemoryAddress> {
    public val ISystemTriggerFactory_Instance: ISystemTriggerFactory by lazy {
      createISystemTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISystemTriggerFactory(): ISystemTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.SystemTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISystemTriggerFactory.ABI.makeISystemTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(triggerType: SystemTriggerType, oneShot: Boolean): JNAPointer? =
        ISystemTriggerFactory_Instance.Create(triggerType, oneShot)?.pointer

    public override fun fromNative(segment: MemoryAddress): SystemTrigger {
      val address = segment.toRawLongValue()
      return SystemTrigger(Pointer(address))
    }

    public override fun toNative(obj: SystemTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
