package Microsoft.UI.Xaml.Controls

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

@ABIMarker(TabViewTabCloseRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TabViewTabCloseRequestedEventArgs;{d56ab9b2-e264-5c7e-a1cb-e41a16a6c6c6})")
@WinRTByReference(brClass = TabViewTabCloseRequestedEventArgs.ByReference::class)
public class TabViewTabCloseRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITabViewTabCloseRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1639730719_Interface: ITabViewTabCloseRequestedEventArgs.WithDefault by lazy {
    as_1639730719()
  }


  public override val __1639730719_Ptr: JNAPointer? by lazy {
    __1639730719_Interface.__1639730719_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1639730719_Interface)

  private fun as_1639730719(): ITabViewTabCloseRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITabViewTabCloseRequestedEventArgs.ABI.makeITabViewTabCloseRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITabViewTabCloseRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITabViewTabCloseRequestedEventArgs.ABI.makeITabViewTabCloseRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TabViewTabCloseRequestedEventArgs> {
    public override fun getValue() = TabViewTabCloseRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TabViewTabCloseRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TabViewTabCloseRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TabViewTabCloseRequestedEventArgs {
      val address = segment.toRawLongValue()
      return TabViewTabCloseRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TabViewTabCloseRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
