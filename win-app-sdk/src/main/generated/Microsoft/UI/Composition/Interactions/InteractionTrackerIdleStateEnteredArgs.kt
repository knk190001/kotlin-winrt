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

@ABIMarker(InteractionTrackerIdleStateEnteredArgs.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Interactions.InteractionTrackerIdleStateEnteredArgs;{199094ab-15fd-539c-97b8-964a8196f777})")
@WinRTByReference(brClass = InteractionTrackerIdleStateEnteredArgs.ByReference::class)
public class InteractionTrackerIdleStateEnteredArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInteractionTrackerIdleStateEnteredArgs.WithDefault,
    IInteractionTrackerIdleStateEnteredArgs2.WithDefault, IWinRTObject {
  private val __1266348199_Interface: IInteractionTrackerIdleStateEnteredArgs.WithDefault by lazy {
    as_1266348199()
  }


  private val __602088555_Interface: IInteractionTrackerIdleStateEnteredArgs2.WithDefault by lazy {
    as_602088555()
  }


  public override val __1266348199_Ptr: JNAPointer? by lazy {
    __1266348199_Interface.__1266348199_Ptr
  }


  public override val __602088555_Ptr: JNAPointer? by lazy {
    __602088555_Interface.__602088555_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1266348199_Interface, __602088555_Interface)

  private fun as_1266348199(): IInteractionTrackerIdleStateEnteredArgs.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerIdleStateEnteredArgs.ABI.makeIInteractionTrackerIdleStateEnteredArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerIdleStateEnteredArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerIdleStateEnteredArgs.ABI.makeIInteractionTrackerIdleStateEnteredArgs(ref.value))
  }

  private fun as_602088555(): IInteractionTrackerIdleStateEnteredArgs2.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerIdleStateEnteredArgs2.ABI.makeIInteractionTrackerIdleStateEnteredArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerIdleStateEnteredArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerIdleStateEnteredArgs2.ABI.makeIInteractionTrackerIdleStateEnteredArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractionTrackerIdleStateEnteredArgs> {
    public override fun getValue() = InteractionTrackerIdleStateEnteredArgs(pointer.getPointer(0))

    public fun setValue(value: InteractionTrackerIdleStateEnteredArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractionTrackerIdleStateEnteredArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InteractionTrackerIdleStateEnteredArgs {
      val address = segment.toRawLongValue()
      return InteractionTrackerIdleStateEnteredArgs(Pointer(address))
    }

    public override fun toNative(obj: InteractionTrackerIdleStateEnteredArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
