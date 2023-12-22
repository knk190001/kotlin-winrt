package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.ICommandBarFactory.ABI.IID
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

@ABIMarker(CommandBar.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.CommandBar;{98bc4280-4a3d-4cee-bd07-22ce94c5af76})")
@WinRTByReference(brClass = CommandBar.ByReference::class)
public open class CommandBar(
  ptr: JNAPointer? = NULL
) : AppBar(ptr), ICommandBar.WithDefault, ICommandBar2.WithDefault, ICommandBar3.WithDefault,
    IWinRTObject {
  private val __738474524_Interface: ICommandBar.WithDefault by lazy {
    as_738474524()
  }


  private val __1417873714_Interface: ICommandBar2.WithDefault by lazy {
    as_1417873714()
  }


  private val __1417873713_Interface: ICommandBar3.WithDefault by lazy {
    as_1417873713()
  }


  public override val __738474524_Ptr: JNAPointer? by lazy {
    __738474524_Interface.__738474524_Ptr
  }


  public override val __1417873714_Ptr: JNAPointer? by lazy {
    __1417873714_Interface.__1417873714_Ptr
  }


  public override val __1417873713_Ptr: JNAPointer? by lazy {
    __1417873713_Interface.__1417873713_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__738474524_Interface, __1417873714_Interface, __1417873713_Interface)

  public constructor() : this(ABI.activate())

  private fun as_738474524(): ICommandBar.WithDefault {
    if(pointer == NULL) {
      return(ICommandBar.ABI.makeICommandBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBar.ABI.makeICommandBar(ref.value))
  }

  private fun as_1417873714(): ICommandBar2.WithDefault {
    if(pointer == NULL) {
      return(ICommandBar2.ABI.makeICommandBar2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBar2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBar2.ABI.makeICommandBar2(ref.value))
  }

  private fun as_1417873713(): ICommandBar3.WithDefault {
    if(pointer == NULL) {
      return(ICommandBar3.ABI.makeICommandBar3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBar3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBar3.ABI.makeICommandBar3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CommandBar> {
    public override fun getValue() = CommandBar(pointer.getPointer(0))

    public fun setValue(value: CommandBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CommandBar, MemoryAddress> {
    public val ICommandBarStatics2_Instance: ICommandBarStatics2 by lazy {
      createICommandBarStatics2()
    }


    public val ICommandBarStatics3_Instance: ICommandBarStatics3 by lazy {
      createICommandBarStatics3()
    }


    public val ICommandBarStatics_Instance: ICommandBarStatics by lazy {
      createICommandBarStatics()
    }


    public val ICommandBarFactory_Instance: ICommandBarFactory by lazy {
      createICommandBarFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICommandBarStatics2(): ICommandBarStatics2 {
      val refiid = Guid.REFIID(ICommandBarStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.CommandBar".toHandle(),refiid,interfacePtr)
      val result = ICommandBarStatics2.ABI.makeICommandBarStatics2(interfacePtr.value)
      return result
    }

    public fun createICommandBarStatics3(): ICommandBarStatics3 {
      val refiid = Guid.REFIID(ICommandBarStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.CommandBar".toHandle(),refiid,interfacePtr)
      val result = ICommandBarStatics3.ABI.makeICommandBarStatics3(interfacePtr.value)
      return result
    }

    public fun createICommandBarStatics(): ICommandBarStatics {
      val refiid = Guid.REFIID(ICommandBarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.CommandBar".toHandle(),refiid,interfacePtr)
      val result = ICommandBarStatics.ABI.makeICommandBarStatics(interfacePtr.value)
      return result
    }

    public fun createICommandBarFactory(): ICommandBarFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.CommandBar".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICommandBarFactory.ABI.makeICommandBarFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ICommandBarFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CommandBar {
      val address = segment.toRawLongValue()
      return CommandBar(Pointer(address))
    }

    public override fun toNative(obj: CommandBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CommandBarOverflowPresenterStyleProperty() =
        ABI.ICommandBarStatics2_Instance.get_CommandBarOverflowPresenterStyleProperty()

    public fun get_DefaultLabelPositionProperty() =
        ABI.ICommandBarStatics3_Instance.get_DefaultLabelPositionProperty()

    public fun get_OverflowButtonVisibilityProperty() =
        ABI.ICommandBarStatics3_Instance.get_OverflowButtonVisibilityProperty()

    public fun get_IsDynamicOverflowEnabledProperty() =
        ABI.ICommandBarStatics3_Instance.get_IsDynamicOverflowEnabledProperty()

    public fun get_PrimaryCommandsProperty() =
        ABI.ICommandBarStatics_Instance.get_PrimaryCommandsProperty()

    public fun get_SecondaryCommandsProperty() =
        ABI.ICommandBarStatics_Instance.get_SecondaryCommandsProperty()
  }
}
