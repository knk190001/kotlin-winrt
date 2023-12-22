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

@ABIMarker(WidgetCustomizationRequestedArgs.ABI::class)
@Signature("rc(Microsoft.Windows.Widgets.Providers.WidgetCustomizationRequestedArgs;{41dea311-dd9b-5b8b-b493-3a30552116b8})")
@WinRTByReference(brClass = WidgetCustomizationRequestedArgs.ByReference::class)
public class WidgetCustomizationRequestedArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWidgetCustomizationRequestedArgs.WithDefault, IWinRTObject {
  private val __578422061_Interface: IWidgetCustomizationRequestedArgs.WithDefault by lazy {
    as_578422061()
  }


  public override val __578422061_Ptr: JNAPointer? by lazy {
    __578422061_Interface.__578422061_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__578422061_Interface)

  private fun as_578422061(): IWidgetCustomizationRequestedArgs.WithDefault {
    if(pointer == NULL) {
      return(IWidgetCustomizationRequestedArgs.ABI.makeIWidgetCustomizationRequestedArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWidgetCustomizationRequestedArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWidgetCustomizationRequestedArgs.ABI.makeIWidgetCustomizationRequestedArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WidgetCustomizationRequestedArgs> {
    public override fun getValue() = WidgetCustomizationRequestedArgs(pointer.getPointer(0))

    public fun setValue(value: WidgetCustomizationRequestedArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WidgetCustomizationRequestedArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WidgetCustomizationRequestedArgs {
      val address = segment.toRawLongValue()
      return WidgetCustomizationRequestedArgs(Pointer(address))
    }

    public override fun toNative(obj: WidgetCustomizationRequestedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
