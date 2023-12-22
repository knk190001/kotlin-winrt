package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IGroupStyleFactory.ABI.IID
import Microsoft.UI.Xaml.Data.INotifyPropertyChanged
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
@Signature("rc(Microsoft.UI.Xaml.Controls.GroupStyle;{a77d937e-0188-584c-ab1d-9df1916edc75})")
@WinRTByReference(brClass = GroupStyle.ByReference::class)
public open class GroupStyle(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGroupStyle.WithDefault, INotifyPropertyChanged.WithDefault, IWinRTObject {
  private val __389738361_Interface: IGroupStyle.WithDefault by lazy {
    as_389738361()
  }


  private val __542577373_Interface: INotifyPropertyChanged.WithDefault by lazy {
    as_542577373()
  }


  public override val __389738361_Ptr: JNAPointer? by lazy {
    __389738361_Interface.__389738361_Ptr
  }


  public override val __542577373_Ptr: JNAPointer? by lazy {
    __542577373_Interface.__542577373_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__389738361_Interface, __542577373_Interface)

  public constructor() : this(ABI.activate())

  private fun as_389738361(): IGroupStyle.WithDefault {
    if(pointer == NULL) {
      return(IGroupStyle.ABI.makeIGroupStyle(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGroupStyle>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGroupStyle.ABI.makeIGroupStyle(ref.value))
  }

  private fun as_542577373(): INotifyPropertyChanged.WithDefault {
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.GroupStyle".toHandle(),refiid,factoryActivatorPtr)
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
