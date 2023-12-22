package Windows.UI.ViewManagement

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(UISettings.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.UISettings;{85361600-1c63-4627-bcb1-3a89e0bc9c55})")
@WinRTByReference(brClass = UISettings.ByReference::class)
public class UISettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUISettings.WithDefault, IUISettings2.WithDefault, IUISettings3.WithDefault,
    IUISettings4.WithDefault, IUISettings5.WithDefault, IUISettings6.WithDefault, IWinRTObject {
  private val __913226441_Interface: IUISettings.WithDefault by lazy {
    as_913226441()
  }


  private val __1754751351_Interface: IUISettings2.WithDefault by lazy {
    as_1754751351()
  }


  private val __1754751350_Interface: IUISettings3.WithDefault by lazy {
    as_1754751350()
  }


  private val __1754751349_Interface: IUISettings4.WithDefault by lazy {
    as_1754751349()
  }


  private val __1754751348_Interface: IUISettings5.WithDefault by lazy {
    as_1754751348()
  }


  private val __1754751347_Interface: IUISettings6.WithDefault by lazy {
    as_1754751347()
  }


  public override val __913226441_Ptr: JNAPointer? by lazy {
    __913226441_Interface.__913226441_Ptr
  }


  public override val __1754751351_Ptr: JNAPointer? by lazy {
    __1754751351_Interface.__1754751351_Ptr
  }


  public override val __1754751350_Ptr: JNAPointer? by lazy {
    __1754751350_Interface.__1754751350_Ptr
  }


  public override val __1754751349_Ptr: JNAPointer? by lazy {
    __1754751349_Interface.__1754751349_Ptr
  }


  public override val __1754751348_Ptr: JNAPointer? by lazy {
    __1754751348_Interface.__1754751348_Ptr
  }


  public override val __1754751347_Ptr: JNAPointer? by lazy {
    __1754751347_Interface.__1754751347_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__913226441_Interface, __1754751351_Interface, __1754751350_Interface,
        __1754751349_Interface, __1754751348_Interface, __1754751347_Interface)

  public constructor() : this(ABI.activate())

  private fun as_913226441(): IUISettings.WithDefault {
    if(pointer == NULL) {
      return(IUISettings.ABI.makeIUISettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUISettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUISettings.ABI.makeIUISettings(ref.value))
  }

  private fun as_1754751351(): IUISettings2.WithDefault {
    if(pointer == NULL) {
      return(IUISettings2.ABI.makeIUISettings2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUISettings2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUISettings2.ABI.makeIUISettings2(ref.value))
  }

  private fun as_1754751350(): IUISettings3.WithDefault {
    if(pointer == NULL) {
      return(IUISettings3.ABI.makeIUISettings3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUISettings3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUISettings3.ABI.makeIUISettings3(ref.value))
  }

  private fun as_1754751349(): IUISettings4.WithDefault {
    if(pointer == NULL) {
      return(IUISettings4.ABI.makeIUISettings4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUISettings4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUISettings4.ABI.makeIUISettings4(ref.value))
  }

  private fun as_1754751348(): IUISettings5.WithDefault {
    if(pointer == NULL) {
      return(IUISettings5.ABI.makeIUISettings5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUISettings5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUISettings5.ABI.makeIUISettings5(ref.value))
  }

  private fun as_1754751347(): IUISettings6.WithDefault {
    if(pointer == NULL) {
      return(IUISettings6.ABI.makeIUISettings6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUISettings6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUISettings6.ABI.makeIUISettings6(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UISettings> {
    public override fun getValue() = UISettings(pointer.getPointer(0))

    public fun setValue(value: UISettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UISettings, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.UISettings".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): UISettings {
      val address = segment.toRawLongValue()
      return UISettings(Pointer(address))
    }

    public override fun toNative(obj: UISettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
