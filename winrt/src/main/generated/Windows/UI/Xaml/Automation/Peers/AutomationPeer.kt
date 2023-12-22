package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.AutomationPeer;{35aac87a-62ee-4d3e-a24c-2bc8432d68b7})")
@WinRTByReference(brClass = AutomationPeer.ByReference::class)
public open class AutomationPeer(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IAutomationPeer.WithDefault, IAutomationPeer2.WithDefault,
    IAutomationPeer3.WithDefault, IAutomationPeer4.WithDefault, IAutomationPeer5.WithDefault,
    IAutomationPeer6.WithDefault, IAutomationPeer7.WithDefault, IAutomationPeer8.WithDefault,
    IAutomationPeer9.WithDefault, IAutomationPeerProtected.WithDefault,
    IAutomationPeerOverrides.WithDefault, IAutomationPeerOverrides2.WithDefault,
    IAutomationPeerOverrides3.WithDefault, IAutomationPeerOverrides4.WithDefault,
    IAutomationPeerOverrides5.WithDefault, IAutomationPeerOverrides6.WithDefault,
    IAutomationPeerOverrides8.WithDefault, IAutomationPeerOverrides9.WithDefault, IWinRTObject {
  private val __935140305_Interface: IAutomationPeer.WithDefault by lazy {
    as_935140305()
  }


  private val __1075421567_Interface: IAutomationPeer2.WithDefault by lazy {
    as_1075421567()
  }


  private val __1075421566_Interface: IAutomationPeer3.WithDefault by lazy {
    as_1075421566()
  }


  private val __1075421565_Interface: IAutomationPeer4.WithDefault by lazy {
    as_1075421565()
  }


  private val __1075421564_Interface: IAutomationPeer5.WithDefault by lazy {
    as_1075421564()
  }


  private val __1075421563_Interface: IAutomationPeer6.WithDefault by lazy {
    as_1075421563()
  }


  private val __1075421562_Interface: IAutomationPeer7.WithDefault by lazy {
    as_1075421562()
  }


  private val __1075421561_Interface: IAutomationPeer8.WithDefault by lazy {
    as_1075421561()
  }


  private val __1075421560_Interface: IAutomationPeer9.WithDefault by lazy {
    as_1075421560()
  }


  private val __1359795491_Interface: IAutomationPeerProtected.WithDefault by lazy {
    as_1359795491()
  }


  private val __1501225642_Interface: IAutomationPeerOverrides.WithDefault by lazy {
    as_1501225642()
  }


  private val __706645404_Interface: IAutomationPeerOverrides2.WithDefault by lazy {
    as_706645404()
  }


  private val __706645405_Interface: IAutomationPeerOverrides3.WithDefault by lazy {
    as_706645405()
  }


  private val __706645406_Interface: IAutomationPeerOverrides4.WithDefault by lazy {
    as_706645406()
  }


  private val __706645407_Interface: IAutomationPeerOverrides5.WithDefault by lazy {
    as_706645407()
  }


  private val __706645408_Interface: IAutomationPeerOverrides6.WithDefault by lazy {
    as_706645408()
  }


  private val __706645410_Interface: IAutomationPeerOverrides8.WithDefault by lazy {
    as_706645410()
  }


  private val __706645411_Interface: IAutomationPeerOverrides9.WithDefault by lazy {
    as_706645411()
  }


  public override val __935140305_Ptr: JNAPointer? by lazy {
    __935140305_Interface.__935140305_Ptr
  }


  public override val __1075421567_Ptr: JNAPointer? by lazy {
    __1075421567_Interface.__1075421567_Ptr
  }


  public override val __1075421566_Ptr: JNAPointer? by lazy {
    __1075421566_Interface.__1075421566_Ptr
  }


  public override val __1075421565_Ptr: JNAPointer? by lazy {
    __1075421565_Interface.__1075421565_Ptr
  }


  public override val __1075421564_Ptr: JNAPointer? by lazy {
    __1075421564_Interface.__1075421564_Ptr
  }


  public override val __1075421563_Ptr: JNAPointer? by lazy {
    __1075421563_Interface.__1075421563_Ptr
  }


  public override val __1075421562_Ptr: JNAPointer? by lazy {
    __1075421562_Interface.__1075421562_Ptr
  }


  public override val __1075421561_Ptr: JNAPointer? by lazy {
    __1075421561_Interface.__1075421561_Ptr
  }


  public override val __1075421560_Ptr: JNAPointer? by lazy {
    __1075421560_Interface.__1075421560_Ptr
  }


  public override val __1359795491_Ptr: JNAPointer? by lazy {
    __1359795491_Interface.__1359795491_Ptr
  }


  public override val __1501225642_Ptr: JNAPointer? by lazy {
    __1501225642_Interface.__1501225642_Ptr
  }


  public override val __706645404_Ptr: JNAPointer? by lazy {
    __706645404_Interface.__706645404_Ptr
  }


  public override val __706645405_Ptr: JNAPointer? by lazy {
    __706645405_Interface.__706645405_Ptr
  }


  public override val __706645406_Ptr: JNAPointer? by lazy {
    __706645406_Interface.__706645406_Ptr
  }


  public override val __706645407_Ptr: JNAPointer? by lazy {
    __706645407_Interface.__706645407_Ptr
  }


  public override val __706645408_Ptr: JNAPointer? by lazy {
    __706645408_Interface.__706645408_Ptr
  }


  public override val __706645410_Ptr: JNAPointer? by lazy {
    __706645410_Interface.__706645410_Ptr
  }


  public override val __706645411_Ptr: JNAPointer? by lazy {
    __706645411_Interface.__706645411_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__935140305_Interface, __1075421567_Interface, __1075421566_Interface,
        __1075421565_Interface, __1075421564_Interface, __1075421563_Interface,
        __1075421562_Interface, __1075421561_Interface, __1075421560_Interface,
        __1359795491_Interface, __1501225642_Interface, __706645404_Interface,
        __706645405_Interface, __706645406_Interface, __706645407_Interface, __706645408_Interface,
        __706645410_Interface, __706645411_Interface)

  public constructor() : this(ABI.activate())

  private fun as_935140305(): IAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeer.ABI.makeIAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeer.ABI.makeIAutomationPeer(ref.value))
  }

  private fun as_1075421567(): IAutomationPeer2.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeer2.ABI.makeIAutomationPeer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeer2.ABI.makeIAutomationPeer2(ref.value))
  }

  private fun as_1075421566(): IAutomationPeer3.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeer3.ABI.makeIAutomationPeer3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeer3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeer3.ABI.makeIAutomationPeer3(ref.value))
  }

  private fun as_1075421565(): IAutomationPeer4.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeer4.ABI.makeIAutomationPeer4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeer4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeer4.ABI.makeIAutomationPeer4(ref.value))
  }

  private fun as_1075421564(): IAutomationPeer5.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeer5.ABI.makeIAutomationPeer5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeer5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeer5.ABI.makeIAutomationPeer5(ref.value))
  }

  private fun as_1075421563(): IAutomationPeer6.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeer6.ABI.makeIAutomationPeer6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeer6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeer6.ABI.makeIAutomationPeer6(ref.value))
  }

  private fun as_1075421562(): IAutomationPeer7.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeer7.ABI.makeIAutomationPeer7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeer7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeer7.ABI.makeIAutomationPeer7(ref.value))
  }

  private fun as_1075421561(): IAutomationPeer8.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeer8.ABI.makeIAutomationPeer8(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeer8>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeer8.ABI.makeIAutomationPeer8(ref.value))
  }

  private fun as_1075421560(): IAutomationPeer9.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeer9.ABI.makeIAutomationPeer9(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeer9>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeer9.ABI.makeIAutomationPeer9(ref.value))
  }

  private fun as_1359795491(): IAutomationPeerProtected.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeerProtected.ABI.makeIAutomationPeerProtected(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeerProtected>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeerProtected.ABI.makeIAutomationPeerProtected(ref.value))
  }

  private fun as_1501225642(): IAutomationPeerOverrides.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeerOverrides.ABI.makeIAutomationPeerOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeerOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeerOverrides.ABI.makeIAutomationPeerOverrides(ref.value))
  }

  private fun as_706645404(): IAutomationPeerOverrides2.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeerOverrides2.ABI.makeIAutomationPeerOverrides2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeerOverrides2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeerOverrides2.ABI.makeIAutomationPeerOverrides2(ref.value))
  }

  private fun as_706645405(): IAutomationPeerOverrides3.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeerOverrides3.ABI.makeIAutomationPeerOverrides3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeerOverrides3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeerOverrides3.ABI.makeIAutomationPeerOverrides3(ref.value))
  }

  private fun as_706645406(): IAutomationPeerOverrides4.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeerOverrides4.ABI.makeIAutomationPeerOverrides4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeerOverrides4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeerOverrides4.ABI.makeIAutomationPeerOverrides4(ref.value))
  }

  private fun as_706645407(): IAutomationPeerOverrides5.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeerOverrides5.ABI.makeIAutomationPeerOverrides5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeerOverrides5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeerOverrides5.ABI.makeIAutomationPeerOverrides5(ref.value))
  }

  private fun as_706645408(): IAutomationPeerOverrides6.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeerOverrides6.ABI.makeIAutomationPeerOverrides6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeerOverrides6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeerOverrides6.ABI.makeIAutomationPeerOverrides6(ref.value))
  }

  private fun as_706645410(): IAutomationPeerOverrides8.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeerOverrides8.ABI.makeIAutomationPeerOverrides8(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeerOverrides8>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeerOverrides8.ABI.makeIAutomationPeerOverrides8(ref.value))
  }

  private fun as_706645411(): IAutomationPeerOverrides9.WithDefault {
    if(pointer == NULL) {
      return(IAutomationPeerOverrides9.ABI.makeIAutomationPeerOverrides9(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationPeerOverrides9>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationPeerOverrides9.ABI.makeIAutomationPeerOverrides9(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AutomationPeer>
      {
    public override fun getValue() = AutomationPeer(pointer.getPointer(0))

    public fun setValue(value: AutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutomationPeer, MemoryAddress> {
    public val IAutomationPeerStatics3_Instance: IAutomationPeerStatics3 by lazy {
      createIAutomationPeerStatics3()
    }


    public val IAutomationPeerStatics_Instance: IAutomationPeerStatics by lazy {
      createIAutomationPeerStatics()
    }


    public val IAutomationPeerFactory_Instance: IAutomationPeerFactory by lazy {
      createIAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAutomationPeerStatics3(): IAutomationPeerStatics3 {
      val refiid = Guid.REFIID(IAutomationPeerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.AutomationPeer".toHandle(),refiid,interfacePtr)
      val result = IAutomationPeerStatics3.ABI.makeIAutomationPeerStatics3(interfacePtr.value)
      return result
    }

    public fun createIAutomationPeerStatics(): IAutomationPeerStatics {
      val refiid = Guid.REFIID(IAutomationPeerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.AutomationPeer".toHandle(),refiid,interfacePtr)
      val result = IAutomationPeerStatics.ABI.makeIAutomationPeerStatics(interfacePtr.value)
      return result
    }

    public fun createIAutomationPeerFactory(): IAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.AutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAutomationPeerFactory.ABI.makeIAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IAutomationPeerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AutomationPeer {
      val address = segment.toRawLongValue()
      return AutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: AutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GenerateRawElementProviderRuntimeId() =
        ABI.IAutomationPeerStatics3_Instance.GenerateRawElementProviderRuntimeId()

    public fun ListenerExists(eventId: AutomationEvents) =
        ABI.IAutomationPeerStatics_Instance.ListenerExists(eventId)
  }
}
