package Microsoft.UI.Xaml.Controls

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ToggleSwitch.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ToggleSwitch;{1b17eeb1-74bf-5a83-8161-a86f0fdcdf24})")
@WinRTByReference(brClass = ToggleSwitch.ByReference::class)
public class ToggleSwitch(
  ptr: JNAPointer? = NULL
) : Control(ptr), IToggleSwitch.WithDefault, IToggleSwitchOverrides.WithDefault, IWinRTObject {
  private val __70718737_Interface: IToggleSwitch.WithDefault by lazy {
    as_70718737()
  }


  private val __1106079736_Interface: IToggleSwitchOverrides.WithDefault by lazy {
    as_1106079736()
  }


  public override val __70718737_Ptr: JNAPointer? by lazy {
    __70718737_Interface.__70718737_Ptr
  }


  public override val __1106079736_Ptr: JNAPointer? by lazy {
    __1106079736_Interface.__1106079736_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__70718737_Interface, __1106079736_Interface)

  public constructor() : this(ABI.activate())

  private fun as_70718737(): IToggleSwitch.WithDefault {
    if(pointer == NULL) {
      return(IToggleSwitch.ABI.makeIToggleSwitch(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleSwitch>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleSwitch.ABI.makeIToggleSwitch(ref.value))
  }

  private fun as_1106079736(): IToggleSwitchOverrides.WithDefault {
    if(pointer == NULL) {
      return(IToggleSwitchOverrides.ABI.makeIToggleSwitchOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleSwitchOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleSwitchOverrides.ABI.makeIToggleSwitchOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ToggleSwitch> {
    public override fun getValue() = ToggleSwitch(pointer.getPointer(0))

    public fun setValue(value: ToggleSwitch): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToggleSwitch, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IToggleSwitchStatics_Instance: IToggleSwitchStatics by lazy {
      createIToggleSwitchStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ToggleSwitch".toHandle(),
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

    public fun createIToggleSwitchStatics(): IToggleSwitchStatics {
      val refiid = Guid.REFIID(IToggleSwitchStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ToggleSwitch".toHandle(),refiid,interfacePtr)
      val result = IToggleSwitchStatics.ABI.makeIToggleSwitchStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ToggleSwitch {
      val address = segment.toRawLongValue()
      return ToggleSwitch(Pointer(address))
    }

    public override fun toNative(obj: ToggleSwitch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsOnProperty() = ABI.IToggleSwitchStatics_Instance.get_IsOnProperty()

    public fun get_HeaderProperty() = ABI.IToggleSwitchStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.IToggleSwitchStatics_Instance.get_HeaderTemplateProperty()

    public fun get_OnContentProperty() = ABI.IToggleSwitchStatics_Instance.get_OnContentProperty()

    public fun get_OnContentTemplateProperty() =
        ABI.IToggleSwitchStatics_Instance.get_OnContentTemplateProperty()

    public fun get_OffContentProperty() = ABI.IToggleSwitchStatics_Instance.get_OffContentProperty()

    public fun get_OffContentTemplateProperty() =
        ABI.IToggleSwitchStatics_Instance.get_OffContentTemplateProperty()
  }
}
