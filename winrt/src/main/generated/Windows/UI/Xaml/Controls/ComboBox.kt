package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IComboBoxFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.Selector
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

@ABIMarker(ComboBox.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ComboBox;{b9a8d05c-ac97-47f1-a5f4-3f9f4d4b116c})")
@WinRTByReference(brClass = ComboBox.ByReference::class)
public open class ComboBox(
  ptr: JNAPointer? = NULL
) : Selector(ptr), IComboBox.WithDefault, IComboBox2.WithDefault, IComboBox3.WithDefault,
    IComboBox4.WithDefault, IComboBox5.WithDefault, IComboBox6.WithDefault,
    IComboBoxOverrides.WithDefault, IWinRTObject {
  private val __1101053575_Interface: IComboBox.WithDefault by lazy {
    as_1101053575()
  }


  private val __227077593_Interface: IComboBox2.WithDefault by lazy {
    as_227077593()
  }


  private val __227077594_Interface: IComboBox3.WithDefault by lazy {
    as_227077594()
  }


  private val __227077595_Interface: IComboBox4.WithDefault by lazy {
    as_227077595()
  }


  private val __227077596_Interface: IComboBox5.WithDefault by lazy {
    as_227077596()
  }


  private val __227077597_Interface: IComboBox6.WithDefault by lazy {
    as_227077597()
  }


  private val __1672402094_Interface: IComboBoxOverrides.WithDefault by lazy {
    as_1672402094()
  }


  public override val __1101053575_Ptr: JNAPointer? by lazy {
    __1101053575_Interface.__1101053575_Ptr
  }


  public override val __227077593_Ptr: JNAPointer? by lazy {
    __227077593_Interface.__227077593_Ptr
  }


  public override val __227077594_Ptr: JNAPointer? by lazy {
    __227077594_Interface.__227077594_Ptr
  }


  public override val __227077595_Ptr: JNAPointer? by lazy {
    __227077595_Interface.__227077595_Ptr
  }


  public override val __227077596_Ptr: JNAPointer? by lazy {
    __227077596_Interface.__227077596_Ptr
  }


  public override val __227077597_Ptr: JNAPointer? by lazy {
    __227077597_Interface.__227077597_Ptr
  }


  public override val __1672402094_Ptr: JNAPointer? by lazy {
    __1672402094_Interface.__1672402094_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1101053575_Interface, __227077593_Interface, __227077594_Interface,
        __227077595_Interface, __227077596_Interface, __227077597_Interface, __1672402094_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1101053575(): IComboBox.WithDefault {
    if(pointer == NULL) {
      return(IComboBox.ABI.makeIComboBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBox.ABI.makeIComboBox(ref.value))
  }

  private fun as_227077593(): IComboBox2.WithDefault {
    if(pointer == NULL) {
      return(IComboBox2.ABI.makeIComboBox2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBox2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBox2.ABI.makeIComboBox2(ref.value))
  }

  private fun as_227077594(): IComboBox3.WithDefault {
    if(pointer == NULL) {
      return(IComboBox3.ABI.makeIComboBox3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBox3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBox3.ABI.makeIComboBox3(ref.value))
  }

  private fun as_227077595(): IComboBox4.WithDefault {
    if(pointer == NULL) {
      return(IComboBox4.ABI.makeIComboBox4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBox4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBox4.ABI.makeIComboBox4(ref.value))
  }

  private fun as_227077596(): IComboBox5.WithDefault {
    if(pointer == NULL) {
      return(IComboBox5.ABI.makeIComboBox5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBox5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBox5.ABI.makeIComboBox5(ref.value))
  }

  private fun as_227077597(): IComboBox6.WithDefault {
    if(pointer == NULL) {
      return(IComboBox6.ABI.makeIComboBox6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBox6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBox6.ABI.makeIComboBox6(ref.value))
  }

  private fun as_1672402094(): IComboBoxOverrides.WithDefault {
    if(pointer == NULL) {
      return(IComboBoxOverrides.ABI.makeIComboBoxOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBoxOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBoxOverrides.ABI.makeIComboBoxOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ComboBox> {
    public override fun getValue() = ComboBox(pointer.getPointer(0))

    public fun setValue(value: ComboBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ComboBox, MemoryAddress> {
    public val IComboBoxStatics2_Instance: IComboBoxStatics2 by lazy {
      createIComboBoxStatics2()
    }


    public val IComboBoxStatics5_Instance: IComboBoxStatics5 by lazy {
      createIComboBoxStatics5()
    }


    public val IComboBoxStatics_Instance: IComboBoxStatics by lazy {
      createIComboBoxStatics()
    }


    public val IComboBoxStatics4_Instance: IComboBoxStatics4 by lazy {
      createIComboBoxStatics4()
    }


    public val IComboBoxStatics3_Instance: IComboBoxStatics3 by lazy {
      createIComboBoxStatics3()
    }


    public val IComboBoxStatics6_Instance: IComboBoxStatics6 by lazy {
      createIComboBoxStatics6()
    }


    public val IComboBoxFactory_Instance: IComboBoxFactory by lazy {
      createIComboBoxFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIComboBoxStatics2(): IComboBoxStatics2 {
      val refiid = Guid.REFIID(IComboBoxStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ComboBox".toHandle(),refiid,interfacePtr)
      val result = IComboBoxStatics2.ABI.makeIComboBoxStatics2(interfacePtr.value)
      return result
    }

    public fun createIComboBoxStatics5(): IComboBoxStatics5 {
      val refiid = Guid.REFIID(IComboBoxStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ComboBox".toHandle(),refiid,interfacePtr)
      val result = IComboBoxStatics5.ABI.makeIComboBoxStatics5(interfacePtr.value)
      return result
    }

    public fun createIComboBoxStatics(): IComboBoxStatics {
      val refiid = Guid.REFIID(IComboBoxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ComboBox".toHandle(),refiid,interfacePtr)
      val result = IComboBoxStatics.ABI.makeIComboBoxStatics(interfacePtr.value)
      return result
    }

    public fun createIComboBoxStatics4(): IComboBoxStatics4 {
      val refiid = Guid.REFIID(IComboBoxStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ComboBox".toHandle(),refiid,interfacePtr)
      val result = IComboBoxStatics4.ABI.makeIComboBoxStatics4(interfacePtr.value)
      return result
    }

    public fun createIComboBoxStatics3(): IComboBoxStatics3 {
      val refiid = Guid.REFIID(IComboBoxStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ComboBox".toHandle(),refiid,interfacePtr)
      val result = IComboBoxStatics3.ABI.makeIComboBoxStatics3(interfacePtr.value)
      return result
    }

    public fun createIComboBoxStatics6(): IComboBoxStatics6 {
      val refiid = Guid.REFIID(IComboBoxStatics6.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ComboBox".toHandle(),refiid,interfacePtr)
      val result = IComboBoxStatics6.ABI.makeIComboBoxStatics6(interfacePtr.value)
      return result
    }

    public fun createIComboBoxFactory(): IComboBoxFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ComboBox".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IComboBoxFactory.ABI.makeIComboBoxFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IComboBoxFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ComboBox {
      val address = segment.toRawLongValue()
      return ComboBox(Pointer(address))
    }

    public override fun toNative(obj: ComboBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HeaderProperty() = ABI.IComboBoxStatics2_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.IComboBoxStatics2_Instance.get_HeaderTemplateProperty()

    public fun get_PlaceholderTextProperty() =
        ABI.IComboBoxStatics2_Instance.get_PlaceholderTextProperty()

    public fun get_PlaceholderForegroundProperty() =
        ABI.IComboBoxStatics5_Instance.get_PlaceholderForegroundProperty()

    public fun get_IsDropDownOpenProperty() =
        ABI.IComboBoxStatics_Instance.get_IsDropDownOpenProperty()

    public fun get_MaxDropDownHeightProperty() =
        ABI.IComboBoxStatics_Instance.get_MaxDropDownHeightProperty()

    public fun get_SelectionChangedTriggerProperty() =
        ABI.IComboBoxStatics4_Instance.get_SelectionChangedTriggerProperty()

    public fun get_LightDismissOverlayModeProperty() =
        ABI.IComboBoxStatics3_Instance.get_LightDismissOverlayModeProperty()

    public fun get_IsTextSearchEnabledProperty() =
        ABI.IComboBoxStatics3_Instance.get_IsTextSearchEnabledProperty()

    public fun get_IsEditableProperty() = ABI.IComboBoxStatics6_Instance.get_IsEditableProperty()

    public fun get_TextProperty() = ABI.IComboBoxStatics6_Instance.get_TextProperty()

    public fun get_TextBoxStyleProperty() =
        ABI.IComboBoxStatics6_Instance.get_TextBoxStyleProperty()

    public fun get_DescriptionProperty() = ABI.IComboBoxStatics6_Instance.get_DescriptionProperty()
  }
}
