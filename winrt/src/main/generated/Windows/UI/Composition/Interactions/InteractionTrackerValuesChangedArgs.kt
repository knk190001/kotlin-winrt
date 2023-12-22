package Windows.UI.Composition.Interactions

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

@ABIMarker(InteractionTrackerValuesChangedArgs.ABI::class)
@Signature("rc(Windows.UI.Composition.Interactions.InteractionTrackerValuesChangedArgs;{cf1578ef-d3df-4501-b9e6-f02fb22f73d0})")
@WinRTByReference(brClass = InteractionTrackerValuesChangedArgs.ByReference::class)
public class InteractionTrackerValuesChangedArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInteractionTrackerValuesChangedArgs.WithDefault, IWinRTObject {
  private val __1980066892_Interface: IInteractionTrackerValuesChangedArgs.WithDefault by lazy {
    as_1980066892()
  }


  public override val __1980066892_Ptr: JNAPointer? by lazy {
    __1980066892_Interface.__1980066892_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1980066892_Interface)

  private fun as_1980066892(): IInteractionTrackerValuesChangedArgs.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerValuesChangedArgs.ABI.makeIInteractionTrackerValuesChangedArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerValuesChangedArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerValuesChangedArgs.ABI.makeIInteractionTrackerValuesChangedArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractionTrackerValuesChangedArgs> {
    public override fun getValue() = InteractionTrackerValuesChangedArgs(pointer.getPointer(0))

    public fun setValue(value: InteractionTrackerValuesChangedArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractionTrackerValuesChangedArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InteractionTrackerValuesChangedArgs {
      val address = segment.toRawLongValue()
      return InteractionTrackerValuesChangedArgs(Pointer(address))
    }

    public override fun toNative(obj: InteractionTrackerValuesChangedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
