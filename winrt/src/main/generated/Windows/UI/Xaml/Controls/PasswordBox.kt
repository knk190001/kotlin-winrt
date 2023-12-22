package Windows.UI.Xaml.Controls

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

@ABIMarker(PasswordBox.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.PasswordBox;{02b9aa11-0b47-4e7d-ad91-3a4168ed230d})")
@WinRTByReference(brClass = PasswordBox.ByReference::class)
public class PasswordBox(
  ptr: JNAPointer? = NULL
) : Control(ptr), IPasswordBox.WithDefault, IPasswordBox2.WithDefault, IPasswordBox3.WithDefault,
    IPasswordBox4.WithDefault, IPasswordBox5.WithDefault, IWinRTObject {
  private val __1447672724_Interface: IPasswordBox.WithDefault by lazy {
    as_1447672724()
  }


  private val __1928181534_Interface: IPasswordBox2.WithDefault by lazy {
    as_1928181534()
  }


  private val __1928181535_Interface: IPasswordBox3.WithDefault by lazy {
    as_1928181535()
  }


  private val __1928181536_Interface: IPasswordBox4.WithDefault by lazy {
    as_1928181536()
  }


  private val __1928181537_Interface: IPasswordBox5.WithDefault by lazy {
    as_1928181537()
  }


  public override val __1447672724_Ptr: JNAPointer? by lazy {
    __1447672724_Interface.__1447672724_Ptr
  }


  public override val __1928181534_Ptr: JNAPointer? by lazy {
    __1928181534_Interface.__1928181534_Ptr
  }


  public override val __1928181535_Ptr: JNAPointer? by lazy {
    __1928181535_Interface.__1928181535_Ptr
  }


  public override val __1928181536_Ptr: JNAPointer? by lazy {
    __1928181536_Interface.__1928181536_Ptr
  }


  public override val __1928181537_Ptr: JNAPointer? by lazy {
    __1928181537_Interface.__1928181537_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1447672724_Interface, __1928181534_Interface, __1928181535_Interface,
        __1928181536_Interface, __1928181537_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1447672724(): IPasswordBox.WithDefault {
    if(pointer == NULL) {
      return(IPasswordBox.ABI.makeIPasswordBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPasswordBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPasswordBox.ABI.makeIPasswordBox(ref.value))
  }

  private fun as_1928181534(): IPasswordBox2.WithDefault {
    if(pointer == NULL) {
      return(IPasswordBox2.ABI.makeIPasswordBox2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPasswordBox2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPasswordBox2.ABI.makeIPasswordBox2(ref.value))
  }

  private fun as_1928181535(): IPasswordBox3.WithDefault {
    if(pointer == NULL) {
      return(IPasswordBox3.ABI.makeIPasswordBox3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPasswordBox3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPasswordBox3.ABI.makeIPasswordBox3(ref.value))
  }

  private fun as_1928181536(): IPasswordBox4.WithDefault {
    if(pointer == NULL) {
      return(IPasswordBox4.ABI.makeIPasswordBox4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPasswordBox4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPasswordBox4.ABI.makeIPasswordBox4(ref.value))
  }

  private fun as_1928181537(): IPasswordBox5.WithDefault {
    if(pointer == NULL) {
      return(IPasswordBox5.ABI.makeIPasswordBox5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPasswordBox5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPasswordBox5.ABI.makeIPasswordBox5(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PasswordBox> {
    public override fun getValue() = PasswordBox(pointer.getPointer(0))

    public fun setValue(value: PasswordBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PasswordBox, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPasswordBoxStatics3_Instance: IPasswordBoxStatics3 by lazy {
      createIPasswordBoxStatics3()
    }


    public val IPasswordBoxStatics_Instance: IPasswordBoxStatics by lazy {
      createIPasswordBoxStatics()
    }


    public val IPasswordBoxStatics5_Instance: IPasswordBoxStatics5 by lazy {
      createIPasswordBoxStatics5()
    }


    public val IPasswordBoxStatics2_Instance: IPasswordBoxStatics2 by lazy {
      createIPasswordBoxStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.PasswordBox".toHandle(),
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

    public fun createIPasswordBoxStatics3(): IPasswordBoxStatics3 {
      val refiid = Guid.REFIID(IPasswordBoxStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.PasswordBox".toHandle(),refiid,interfacePtr)
      val result = IPasswordBoxStatics3.ABI.makeIPasswordBoxStatics3(interfacePtr.value)
      return result
    }

    public fun createIPasswordBoxStatics(): IPasswordBoxStatics {
      val refiid = Guid.REFIID(IPasswordBoxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.PasswordBox".toHandle(),refiid,interfacePtr)
      val result = IPasswordBoxStatics.ABI.makeIPasswordBoxStatics(interfacePtr.value)
      return result
    }

    public fun createIPasswordBoxStatics5(): IPasswordBoxStatics5 {
      val refiid = Guid.REFIID(IPasswordBoxStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.PasswordBox".toHandle(),refiid,interfacePtr)
      val result = IPasswordBoxStatics5.ABI.makeIPasswordBoxStatics5(interfacePtr.value)
      return result
    }

    public fun createIPasswordBoxStatics2(): IPasswordBoxStatics2 {
      val refiid = Guid.REFIID(IPasswordBoxStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.PasswordBox".toHandle(),refiid,interfacePtr)
      val result = IPasswordBoxStatics2.ABI.makeIPasswordBoxStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PasswordBox {
      val address = segment.toRawLongValue()
      return PasswordBox(Pointer(address))
    }

    public override fun toNative(obj: PasswordBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PasswordRevealModeProperty() =
        ABI.IPasswordBoxStatics3_Instance.get_PasswordRevealModeProperty()

    public fun get_TextReadingOrderProperty() =
        ABI.IPasswordBoxStatics3_Instance.get_TextReadingOrderProperty()

    public fun get_InputScopeProperty() = ABI.IPasswordBoxStatics3_Instance.get_InputScopeProperty()

    public fun get_PasswordProperty() = ABI.IPasswordBoxStatics_Instance.get_PasswordProperty()

    public fun get_PasswordCharProperty() =
        ABI.IPasswordBoxStatics_Instance.get_PasswordCharProperty()

    public fun get_IsPasswordRevealButtonEnabledProperty() =
        ABI.IPasswordBoxStatics_Instance.get_IsPasswordRevealButtonEnabledProperty()

    public fun get_MaxLengthProperty() = ABI.IPasswordBoxStatics_Instance.get_MaxLengthProperty()

    public fun get_CanPasteClipboardContentProperty() =
        ABI.IPasswordBoxStatics5_Instance.get_CanPasteClipboardContentProperty()

    public fun get_SelectionFlyoutProperty() =
        ABI.IPasswordBoxStatics5_Instance.get_SelectionFlyoutProperty()

    public fun get_DescriptionProperty() =
        ABI.IPasswordBoxStatics5_Instance.get_DescriptionProperty()

    public fun get_HeaderProperty() = ABI.IPasswordBoxStatics2_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.IPasswordBoxStatics2_Instance.get_HeaderTemplateProperty()

    public fun get_PlaceholderTextProperty() =
        ABI.IPasswordBoxStatics2_Instance.get_PlaceholderTextProperty()

    public fun get_SelectionHighlightColorProperty() =
        ABI.IPasswordBoxStatics2_Instance.get_SelectionHighlightColorProperty()

    public fun get_PreventKeyboardDisplayOnProgrammaticFocusProperty() =
        ABI.IPasswordBoxStatics2_Instance.get_PreventKeyboardDisplayOnProgrammaticFocusProperty()
  }
}
