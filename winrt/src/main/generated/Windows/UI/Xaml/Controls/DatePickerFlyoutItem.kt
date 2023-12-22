package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Data.ICustomPropertyProvider
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(DatePickerFlyoutItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.DatePickerFlyoutItem;{9d9bc289-00d2-4aac-9c85-d74f06367887})")
@WinRTByReference(brClass = DatePickerFlyoutItem.ByReference::class)
public class DatePickerFlyoutItem(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IDatePickerFlyoutItem.WithDefault, ICustomPropertyProvider.WithDefault,
    IWinRTObject {
  private val __1455799494_Interface: IDatePickerFlyoutItem.WithDefault by lazy {
    as_1455799494()
  }


  private val __1567289503_Interface: ICustomPropertyProvider.WithDefault by lazy {
    as_1567289503()
  }


  public override val __1455799494_Ptr: JNAPointer? by lazy {
    __1455799494_Interface.__1455799494_Ptr
  }


  public override val __1567289503_Ptr: JNAPointer? by lazy {
    __1567289503_Interface.__1567289503_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1455799494_Interface, __1567289503_Interface)

  private fun as_1455799494(): IDatePickerFlyoutItem.WithDefault {
    if(pointer == NULL) {
      return(IDatePickerFlyoutItem.ABI.makeIDatePickerFlyoutItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatePickerFlyoutItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatePickerFlyoutItem.ABI.makeIDatePickerFlyoutItem(ref.value))
  }

  private fun as_1567289503(): ICustomPropertyProvider.WithDefault {
    if(pointer == NULL) {
      return(ICustomPropertyProvider.ABI.makeICustomPropertyProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICustomPropertyProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICustomPropertyProvider.ABI.makeICustomPropertyProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DatePickerFlyoutItem> {
    public override fun getValue() = DatePickerFlyoutItem(pointer.getPointer(0))

    public fun setValue(value: DatePickerFlyoutItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DatePickerFlyoutItem, MemoryAddress> {
    public val IDatePickerFlyoutItemStatics_Instance: IDatePickerFlyoutItemStatics by lazy {
      createIDatePickerFlyoutItemStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDatePickerFlyoutItemStatics(): IDatePickerFlyoutItemStatics {
      val refiid = Guid.REFIID(IDatePickerFlyoutItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.DatePickerFlyoutItem".toHandle(),refiid,interfacePtr)
      val result =
          IDatePickerFlyoutItemStatics.ABI.makeIDatePickerFlyoutItemStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DatePickerFlyoutItem {
      val address = segment.toRawLongValue()
      return DatePickerFlyoutItem(Pointer(address))
    }

    public override fun toNative(obj: DatePickerFlyoutItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PrimaryTextProperty() =
        ABI.IDatePickerFlyoutItemStatics_Instance.get_PrimaryTextProperty()

    public fun get_SecondaryTextProperty() =
        ABI.IDatePickerFlyoutItemStatics_Instance.get_SecondaryTextProperty()
  }
}
