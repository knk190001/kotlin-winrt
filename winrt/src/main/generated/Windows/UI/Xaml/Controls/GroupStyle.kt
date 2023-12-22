package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IGroupStyleFactory.ABI.IID
import Windows.UI.Xaml.Data.INotifyPropertyChanged
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GroupStyle.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.GroupStyle;{71ca300b-b89e-4184-b0df-a9e95447de8d})")
@WinRTByReference(brClass = GroupStyle.ByReference::class)
public open class GroupStyle(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGroupStyle.WithDefault, IGroupStyle2.WithDefault,
    INotifyPropertyChanged.WithDefault, IWinRTObject {
  private val __251177074_Interface: IGroupStyle.WithDefault by lazy {
    as_251177074()
  }


  private val __803445348_Interface: IGroupStyle2.WithDefault by lazy {
    as_803445348()
  }


  private val __1475333266_Interface: INotifyPropertyChanged.WithDefault by lazy {
    as_1475333266()
  }


  public override val __251177074_Ptr: JNAPointer? by lazy {
    __251177074_Interface.__251177074_Ptr
  }


  public override val __803445348_Ptr: JNAPointer? by lazy {
    __803445348_Interface.__803445348_Ptr
  }


  public override val __1475333266_Ptr: JNAPointer? by lazy {
    __1475333266_Interface.__1475333266_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__251177074_Interface, __803445348_Interface, __1475333266_Interface)

  public constructor() : this(ABI.activate())

  private fun as_251177074(): IGroupStyle.WithDefault {
    if(pointer == NULL) {
      return(IGroupStyle.ABI.makeIGroupStyle(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGroupStyle>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGroupStyle.ABI.makeIGroupStyle(ref.value))
  }

  private fun as_803445348(): IGroupStyle2.WithDefault {
    if(pointer == NULL) {
      return(IGroupStyle2.ABI.makeIGroupStyle2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGroupStyle2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGroupStyle2.ABI.makeIGroupStyle2(ref.value))
  }

  private fun as_1475333266(): INotifyPropertyChanged.WithDefault {
    if(pointer == NULL) {
      return(INotifyPropertyChanged.ABI.makeINotifyPropertyChanged(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INotifyPropertyChanged>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INotifyPropertyChanged.ABI.makeINotifyPropertyChanged(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GroupStyle> {
    public override fun getValue() = GroupStyle(pointer.getPointer(0))

    public fun setValue(value: GroupStyle): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GroupStyle, MemoryAddress> {
    public val IGroupStyleFactory_Instance: IGroupStyleFactory by lazy {
      createIGroupStyleFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGroupStyleFactory(): IGroupStyleFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.GroupStyle".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGroupStyleFactory.ABI.makeIGroupStyleFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IGroupStyleFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GroupStyle {
      val address = segment.toRawLongValue()
      return GroupStyle(Pointer(address))
    }

    public override fun toNative(obj: GroupStyle): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
