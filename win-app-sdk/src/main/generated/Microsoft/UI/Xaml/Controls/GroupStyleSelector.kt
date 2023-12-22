package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IGroupStyleSelectorFactory.ABI.IID
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

@ABIMarker(GroupStyleSelector.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.GroupStyleSelector;{524f5086-3e02-5b71-be7c-8a8fa0feaa2c})")
@WinRTByReference(brClass = GroupStyleSelector.ByReference::class)
public open class GroupStyleSelector(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGroupStyleSelector.WithDefault, IGroupStyleSelectorOverrides.WithDefault,
    IWinRTObject {
  private val __2146124168_Interface: IGroupStyleSelector.WithDefault by lazy {
    as_2146124168()
  }


  private val __1517517169_Interface: IGroupStyleSelectorOverrides.WithDefault by lazy {
    as_1517517169()
  }


  public override val __2146124168_Ptr: JNAPointer? by lazy {
    __2146124168_Interface.__2146124168_Ptr
  }


  public override val __1517517169_Ptr: JNAPointer? by lazy {
    __1517517169_Interface.__1517517169_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2146124168_Interface, __1517517169_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2146124168(): IGroupStyleSelector.WithDefault {
    if(pointer == NULL) {
      return(IGroupStyleSelector.ABI.makeIGroupStyleSelector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGroupStyleSelector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGroupStyleSelector.ABI.makeIGroupStyleSelector(ref.value))
  }

  private fun as_1517517169(): IGroupStyleSelectorOverrides.WithDefault {
    if(pointer == NULL) {
      return(IGroupStyleSelectorOverrides.ABI.makeIGroupStyleSelectorOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGroupStyleSelectorOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGroupStyleSelectorOverrides.ABI.makeIGroupStyleSelectorOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GroupStyleSelector> {
    public override fun getValue() = GroupStyleSelector(pointer.getPointer(0))

    public fun setValue(value: GroupStyleSelector): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GroupStyleSelector, MemoryAddress> {
    public val IGroupStyleSelectorFactory_Instance: IGroupStyleSelectorFactory by lazy {
      createIGroupStyleSelectorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGroupStyleSelectorFactory(): IGroupStyleSelectorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.GroupStyleSelector".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGroupStyleSelectorFactory.ABI.makeIGroupStyleSelectorFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IGroupStyleSelectorFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GroupStyleSelector {
      val address = segment.toRawLongValue()
      return GroupStyleSelector(Pointer(address))
    }

    public override fun toNative(obj: GroupStyleSelector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
