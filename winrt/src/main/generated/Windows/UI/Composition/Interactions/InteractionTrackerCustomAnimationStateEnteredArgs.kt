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

@ABIMarker(InteractionTrackerCustomAnimationStateEnteredArgs.ABI::class)
@Signature("rc(Windows.UI.Composition.Interactions.InteractionTrackerCustomAnimationStateEnteredArgs;{8d1c8cf1-d7b0-434c-a5d2-2d7611864834})")
@WinRTByReference(brClass = InteractionTrackerCustomAnimationStateEnteredArgs.ByReference::class)
public class InteractionTrackerCustomAnimationStateEnteredArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInteractionTrackerCustomAnimationStateEnteredArgs.WithDefault,
    IInteractionTrackerCustomAnimationStateEnteredArgs2.WithDefault, IWinRTObject {
  private val __1855655269_Interface: IInteractionTrackerCustomAnimationStateEnteredArgs.WithDefault
      by lazy {
    as_1855655269()
  }


  private val __1690738441_Interface:
      IInteractionTrackerCustomAnimationStateEnteredArgs2.WithDefault by lazy {
    as_1690738441()
  }


  public override val __1855655269_Ptr: JNAPointer? by lazy {
    __1855655269_Interface.__1855655269_Ptr
  }


  public override val __1690738441_Ptr: JNAPointer? by lazy {
    __1690738441_Interface.__1690738441_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1855655269_Interface, __1690738441_Interface)

  private fun as_1855655269(): IInteractionTrackerCustomAnimationStateEnteredArgs.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerCustomAnimationStateEnteredArgs.ABI.makeIInteractionTrackerCustomAnimationStateEnteredArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerCustomAnimationStateEnteredArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerCustomAnimationStateEnteredArgs.ABI.makeIInteractionTrackerCustomAnimationStateEnteredArgs(ref.value))
  }

  private fun as_1690738441(): IInteractionTrackerCustomAnimationStateEnteredArgs2.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerCustomAnimationStateEnteredArgs2.ABI.makeIInteractionTrackerCustomAnimationStateEnteredArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerCustomAnimationStateEnteredArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerCustomAnimationStateEnteredArgs2.ABI.makeIInteractionTrackerCustomAnimationStateEnteredArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractionTrackerCustomAnimationStateEnteredArgs> {
    public override fun getValue() =
        InteractionTrackerCustomAnimationStateEnteredArgs(pointer.getPointer(0))

    public fun setValue(value: InteractionTrackerCustomAnimationStateEnteredArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractionTrackerCustomAnimationStateEnteredArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        InteractionTrackerCustomAnimationStateEnteredArgs {
      val address = segment.toRawLongValue()
      return InteractionTrackerCustomAnimationStateEnteredArgs(Pointer(address))
    }

    public override fun toNative(obj: InteractionTrackerCustomAnimationStateEnteredArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
