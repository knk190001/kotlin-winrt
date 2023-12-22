package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IListBoxFactory.ABI.IID
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

@ABIMarker(ListBox.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ListBox;{e9f3b9ff-8e91-4ecf-a707-c927f694f881})")
@WinRTByReference(brClass = ListBox.ByReference::class)
public open class ListBox(
  ptr: JNAPointer? = NULL
) : Selector(ptr), IListBox.WithDefault, IListBox2.WithDefault, IWinRTObject {
  private val __665111375_Interface: IListBox.WithDefault by lazy {
    as_665111375()
  }


  private val __856383905_Interface: IListBox2.WithDefault by lazy {
    as_856383905()
  }


  public override val __665111375_Ptr: JNAPointer? by lazy {
    __665111375_Interface.__665111375_Ptr
  }


  public override val __856383905_Ptr: JNAPointer? by lazy {
    __856383905_Interface.__856383905_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__665111375_Interface, __856383905_Interface)

  public constructor() : this(ABI.activate())

  private fun as_665111375(): IListBox.WithDefault {
    if(pointer == NULL) {
      return(IListBox.ABI.makeIListBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListBox.ABI.makeIListBox(ref.value))
  }

  private fun as_856383905(): IListBox2.WithDefault {
    if(pointer == NULL) {
      return(IListBox2.ABI.makeIListBox2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListBox2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListBox2.ABI.makeIListBox2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ListBox> {
    public override fun getValue() = ListBox(pointer.getPointer(0))

    public fun setValue(value: ListBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListBox, MemoryAddress> {
    public val IListBoxStatics_Instance: IListBoxStatics by lazy {
      createIListBoxStatics()
    }


    public val IListBoxStatics2_Instance: IListBoxStatics2 by lazy {
      createIListBoxStatics2()
    }


    public val IListBoxFactory_Instance: IListBoxFactory by lazy {
      createIListBoxFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListBoxStatics(): IListBoxStatics {
      val refiid = Guid.REFIID(IListBoxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListBox".toHandle(),refiid,interfacePtr)
      val result = IListBoxStatics.ABI.makeIListBoxStatics(interfacePtr.value)
      return result
    }

    public fun createIListBoxStatics2(): IListBoxStatics2 {
      val refiid = Guid.REFIID(IListBoxStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListBox".toHandle(),refiid,interfacePtr)
      val result = IListBoxStatics2.ABI.makeIListBoxStatics2(interfacePtr.value)
      return result
    }

    public fun createIListBoxFactory(): IListBoxFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListBox".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListBoxFactory.ABI.makeIListBoxFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IListBoxFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListBox {
      val address = segment.toRawLongValue()
      return ListBox(Pointer(address))
    }

    public override fun toNative(obj: ListBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SelectionModeProperty() =
        ABI.IListBoxStatics_Instance.get_SelectionModeProperty()

    public fun get_SingleSelectionFollowsFocusProperty() =
        ABI.IListBoxStatics2_Instance.get_SingleSelectionFollowsFocusProperty()
  }
}
