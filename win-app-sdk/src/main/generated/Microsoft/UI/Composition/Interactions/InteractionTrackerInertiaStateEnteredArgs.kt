package Microsoft.UI.Composition.Interactions

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

@ABIMarker(InteractionTrackerInertiaStateEnteredArgs.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Interactions.InteractionTrackerInertiaStateEnteredArgs;{5b76c949-a4d0-5c9d-9292-7013ae9656c7})")
@WinRTByReference(brClass = InteractionTrackerInertiaStateEnteredArgs.ByReference::class)
public class InteractionTrackerInertiaStateEnteredArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInteractionTrackerInertiaStateEnteredArgs.WithDefault,
    IInteractionTrackerInertiaStateEnteredArgs2.WithDefault,
    IInteractionTrackerInertiaStateEnteredArgs3.WithDefault, IWinRTObject {
  private val __811800429_Interface: IInteractionTrackerInertiaStateEnteredArgs.WithDefault by
      lazy {
    as_811800429()
  }


  private val __603990427_Interface: IInteractionTrackerInertiaStateEnteredArgs2.WithDefault by
      lazy {
    as_603990427()
  }


  private val __603990426_Interface: IInteractionTrackerInertiaStateEnteredArgs3.WithDefault by
      lazy {
    as_603990426()
  }


  public override val __811800429_Ptr: JNAPointer? by lazy {
    __811800429_Interface.__811800429_Ptr
  }


  public override val __603990427_Ptr: JNAPointer? by lazy {
    __603990427_Interface.__603990427_Ptr
  }


  public override val __603990426_Ptr: JNAPointer? by lazy {
    __603990426_Interface.__603990426_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__811800429_Interface, __603990427_Interface, __603990426_Interface)

  private fun as_811800429(): IInteractionTrackerInertiaStateEnteredArgs.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerInertiaStateEnteredArgs.ABI.makeIInteractionTrackerInertiaStateEnteredArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerInertiaStateEnteredArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerInertiaStateEnteredArgs.ABI.makeIInteractionTrackerInertiaStateEnteredArgs(ref.value))
  }

  private fun as_603990427(): IInteractionTrackerInertiaStateEnteredArgs2.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerInertiaStateEnteredArgs2.ABI.makeIInteractionTrackerInertiaStateEnteredArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerInertiaStateEnteredArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerInertiaStateEnteredArgs2.ABI.makeIInteractionTrackerInertiaStateEnteredArgs2(ref.value))
  }

  private fun as_603990426(): IInteractionTrackerInertiaStateEnteredArgs3.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerInertiaStateEnteredArgs3.ABI.makeIInteractionTrackerInertiaStateEnteredArgs3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerInertiaStateEnteredArgs3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerInertiaStateEnteredArgs3.ABI.makeIInteractionTrackerInertiaStateEnteredArgs3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractionTrackerInertiaStateEnteredArgs> {
    public override fun getValue() =
        InteractionTrackerInertiaStateEnteredArgs(pointer.getPointer(0))

    public fun setValue(value: InteractionTrackerInertiaStateEnteredArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractionTrackerInertiaStateEnteredArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        InteractionTrackerInertiaStateEnteredArgs {
      val address = segment.toRawLongValue()
      return InteractionTrackerInertiaStateEnteredArgs(Pointer(address))
    }

    public override fun toNative(obj: InteractionTrackerInertiaStateEnteredArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
