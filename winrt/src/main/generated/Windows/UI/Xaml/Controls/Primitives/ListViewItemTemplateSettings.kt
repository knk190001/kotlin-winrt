package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(ListViewItemTemplateSettings.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.ListViewItemTemplateSettings;{67af84bf-8279-4686-9326-cd189f27575d})")
@WinRTByReference(brClass = ListViewItemTemplateSettings.ByReference::class)
public class ListViewItemTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IListViewItemTemplateSettings.WithDefault, IWinRTObject {
  private val __1714341425_Interface: IListViewItemTemplateSettings.WithDefault by lazy {
    as_1714341425()
  }


  public override val __1714341425_Ptr: JNAPointer? by lazy {
    __1714341425_Interface.__1714341425_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1714341425_Interface)

  private fun as_1714341425(): IListViewItemTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IListViewItemTemplateSettings.ABI.makeIListViewItemTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListViewItemTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListViewItemTemplateSettings.ABI.makeIListViewItemTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListViewItemTemplateSettings> {
    public override fun getValue() = ListViewItemTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ListViewItemTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListViewItemTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ListViewItemTemplateSettings {
      val address = segment.toRawLongValue()
      return ListViewItemTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ListViewItemTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
