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

@ABIMarker(InteractionTrackerInteractingStateEnteredArgs.ABI::class)
@Signature("rc(Windows.UI.Composition.Interactions.InteractionTrackerInteractingStateEnteredArgs;{a7263939-a17b-4011-99fd-b5c24f143748})")
@WinRTByReference(brClass = InteractionTrackerInteractingStateEnteredArgs.ByReference::class)
public class InteractionTrackerInteractingStateEnteredArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInteractionTrackerInteractingStateEnteredArgs.WithDefault,
    IInteractionTrackerInteractingStateEnteredArgs2.WithDefault, IWinRTObject {
  private val __84384244_Interface: IInteractionTrackerInteractingStateEnteredArgs.WithDefault by
      lazy {
    as_84384244()
  }


  private val __1679055682_Interface: IInteractionTrackerInteractingStateEnteredArgs2.WithDefault by
      lazy {
    as_1679055682()
  }


  public override val __84384244_Ptr: JNAPointer? by lazy {
    __84384244_Interface.__84384244_Ptr
  }


  public override val __1679055682_Ptr: JNAPointer? by lazy {
    __1679055682_Interface.__1679055682_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__84384244_Interface, __1679055682_Interface)

  private fun as_84384244(): IInteractionTrackerInteractingStateEnteredArgs.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerInteractingStateEnteredArgs.ABI.makeIInteractionTrackerInteractingStateEnteredArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerInteractingStateEnteredArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerInteractingStateEnteredArgs.ABI.makeIInteractionTrackerInteractingStateEnteredArgs(ref.value))
  }

  private fun as_1679055682(): IInteractionTrackerInteractingStateEnteredArgs2.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerInteractingStateEnteredArgs2.ABI.makeIInteractionTrackerInteractingStateEnteredArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerInteractingStateEnteredArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerInteractingStateEnteredArgs2.ABI.makeIInteractionTrackerInteractingStateEnteredArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractionTrackerInteractingStateEnteredArgs> {
    public override fun getValue() =
        InteractionTrackerInteractingStateEnteredArgs(pointer.getPointer(0))

    public fun setValue(value: InteractionTrackerInteractingStateEnteredArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractionTrackerInteractingStateEnteredArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        InteractionTrackerInteractingStateEnteredArgs {
      val address = segment.toRawLongValue()
      return InteractionTrackerInteractingStateEnteredArgs(Pointer(address))
    }

    public override fun toNative(obj: InteractionTrackerInteractingStateEnteredArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
