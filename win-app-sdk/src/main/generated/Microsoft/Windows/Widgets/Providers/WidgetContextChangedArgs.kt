package Microsoft.Windows.Widgets.Providers

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

@ABIMarker(WidgetContextChangedArgs.ABI::class)
@Signature("rc(Microsoft.Windows.Widgets.Providers.WidgetContextChangedArgs;{2c226d54-2252-576b-a197-370b28d25c2f})")
@WinRTByReference(brClass = WidgetContextChangedArgs.ByReference::class)
public class WidgetContextChangedArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWidgetContextChangedArgs.WithDefault, IWinRTObject {
  private val __1443146327_Interface: IWidgetContextChangedArgs.WithDefault by lazy {
    as_1443146327()
  }


  public override val __1443146327_Ptr: JNAPointer? by lazy {
    __1443146327_Interface.__1443146327_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1443146327_Interface)

  private fun as_1443146327(): IWidgetContextChangedArgs.WithDefault {
    if(pointer == NULL) {
      return(IWidgetContextChangedArgs.ABI.makeIWidgetContextChangedArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWidgetContextChangedArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWidgetContextChangedArgs.ABI.makeIWidgetContextChangedArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WidgetContextChangedArgs> {
    public override fun getValue() = WidgetContextChangedArgs(pointer.getPointer(0))

    public fun setValue(value: WidgetContextChangedArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WidgetContextChangedArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WidgetContextChangedArgs {
      val address = segment.toRawLongValue()
      return WidgetContextChangedArgs(Pointer(address))
    }

    public override fun toNative(obj: WidgetContextChangedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
