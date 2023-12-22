package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IGroupItemFactory.ABI.IID
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

@ABIMarker(GroupItem.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.GroupItem;{60e5a62b-9df9-5dbd-9551-1d9e0f6cc3c3})")
@WinRTByReference(brClass = GroupItem.ByReference::class)
public open class GroupItem(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IGroupItem.WithDefault, IWinRTObject {
  private val __2065936309_Interface: IGroupItem.WithDefault by lazy {
    as_2065936309()
  }


  public override val __2065936309_Ptr: JNAPointer? by lazy {
    __2065936309_Interface.__2065936309_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2065936309_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2065936309(): IGroupItem.WithDefault {
    if(pointer == NULL) {
      return(IGroupItem.ABI.makeIGroupItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGroupItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGroupItem.ABI.makeIGroupItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GroupItem> {
    public override fun getValue() = GroupItem(pointer.getPointer(0))

    public fun setValue(value: GroupItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GroupItem, MemoryAddress> {
    public val IGroupItemFactory_Instance: IGroupItemFactory by lazy {
      createIGroupItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGroupItemFactory(): IGroupItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.GroupItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGroupItemFactory.ABI.makeIGroupItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IGroupItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GroupItem {
      val address = segment.toRawLongValue()
      return GroupItem(Pointer(address))
    }

    public override fun toNative(obj: GroupItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
