package Windows.UI.Xaml.Hosting

import Windows.Foundation.IClosable
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

@ABIMarker(DesignerAppView.ABI::class)
@Signature("rc(Windows.UI.Xaml.Hosting.DesignerAppView;{5c777cea-dd71-4a84-a56f-dacb4b14706f})")
@WinRTByReference(brClass = DesignerAppView.ByReference::class)
public class DesignerAppView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDesignerAppView.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __2135213931_Interface: IDesignerAppView.WithDefault by lazy {
    as_2135213931()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __2135213931_Ptr: JNAPointer? by lazy {
    __2135213931_Interface.__2135213931_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2135213931_Interface, __1260617006_Interface)

  private fun as_2135213931(): IDesignerAppView.WithDefault {
    if(pointer == NULL) {
      return(IDesignerAppView.ABI.makeIDesignerAppView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDesignerAppView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDesignerAppView.ABI.makeIDesignerAppView(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DesignerAppView> {
    public override fun getValue() = DesignerAppView(pointer.getPointer(0))

    public fun setValue(value: DesignerAppView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DesignerAppView, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DesignerAppView {
      val address = segment.toRawLongValue()
      return DesignerAppView(Pointer(address))
    }

    public override fun toNative(obj: DesignerAppView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
