package Windows.UI.Xaml.Controls

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ListViewPersistenceHelper.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ListViewPersistenceHelper;{05bde8a6-2191-4b4b-8c22-9b25676e806e})")
@WinRTByReference(brClass = ListViewPersistenceHelper.ByReference::class)
public class ListViewPersistenceHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IListViewPersistenceHelper.WithDefault, IWinRTObject {
  private val __547723374_Interface: IListViewPersistenceHelper.WithDefault by lazy {
    as_547723374()
  }


  public override val __547723374_Ptr: JNAPointer? by lazy {
    __547723374_Interface.__547723374_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__547723374_Interface)

  private fun as_547723374(): IListViewPersistenceHelper.WithDefault {
    if(pointer == NULL) {
      return(IListViewPersistenceHelper.ABI.makeIListViewPersistenceHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewPersistenceHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewPersistenceHelper.ABI.makeIListViewPersistenceHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListViewPersistenceHelper> {
    public override fun getValue() = ListViewPersistenceHelper(pointer.getPointer(0))

    public fun setValue(value: ListViewPersistenceHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListViewPersistenceHelper, MemoryAddress> {
    public val IListViewPersistenceHelperStatics_Instance: IListViewPersistenceHelperStatics by
        lazy {
      createIListViewPersistenceHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListViewPersistenceHelperStatics(): IListViewPersistenceHelperStatics {
      val refiid = Guid.REFIID(IListViewPersistenceHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ListViewPersistenceHelper".toHandle(),refiid,interfacePtr)
      val result =
          IListViewPersistenceHelperStatics.ABI.makeIListViewPersistenceHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ListViewPersistenceHelper {
      val address = segment.toRawLongValue()
      return ListViewPersistenceHelper(Pointer(address))
    }

    public override fun toNative(obj: ListViewPersistenceHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetRelativeScrollPosition(listViewBase: ListViewBase,
        itemToKeyHandler: ListViewItemToKeyHandler) =
        ABI.IListViewPersistenceHelperStatics_Instance.GetRelativeScrollPosition(listViewBase,
        itemToKeyHandler)

    public fun SetRelativeScrollPositionAsync(
      listViewBase: ListViewBase,
      relativeScrollPosition: String,
      keyToItemHandler: ListViewKeyToItemHandler
    ) = ABI.IListViewPersistenceHelperStatics_Instance.SetRelativeScrollPositionAsync(listViewBase,
        relativeScrollPosition, keyToItemHandler)
  }
}
