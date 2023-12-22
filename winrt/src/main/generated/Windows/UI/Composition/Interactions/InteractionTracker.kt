package Windows.UI.Composition.Interactions

import Windows.UI.Composition.CompositionObject
import Windows.UI.Composition.Compositor
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(InteractionTracker.ABI::class)
@Signature("rc(Windows.UI.Composition.Interactions.InteractionTracker;{2a8e8cb1-1000-4416-8363-cc27fb877308})")
@WinRTByReference(brClass = InteractionTracker.ByReference::class)
public class InteractionTracker(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IInteractionTracker.WithDefault, IInteractionTracker2.WithDefault,
    IInteractionTracker3.WithDefault, IInteractionTracker4.WithDefault,
    IInteractionTracker5.WithDefault, IWinRTObject {
  private val __1388255045_Interface: IInteractionTracker.WithDefault by lazy {
    as_1388255045()
  }


  private val __86233385_Interface: IInteractionTracker2.WithDefault by lazy {
    as_86233385()
  }


  private val __86233384_Interface: IInteractionTracker3.WithDefault by lazy {
    as_86233384()
  }


  private val __86233383_Interface: IInteractionTracker4.WithDefault by lazy {
    as_86233383()
  }


  private val __86233382_Interface: IInteractionTracker5.WithDefault by lazy {
    as_86233382()
  }


  public override val __1388255045_Ptr: JNAPointer? by lazy {
    __1388255045_Interface.__1388255045_Ptr
  }


  public override val __86233385_Ptr: JNAPointer? by lazy {
    __86233385_Interface.__86233385_Ptr
  }


  public override val __86233384_Ptr: JNAPointer? by lazy {
    __86233384_Interface.__86233384_Ptr
  }


  public override val __86233383_Ptr: JNAPointer? by lazy {
    __86233383_Interface.__86233383_Ptr
  }


  public override val __86233382_Ptr: JNAPointer? by lazy {
    __86233382_Interface.__86233382_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1388255045_Interface, __86233385_Interface, __86233384_Interface,
        __86233383_Interface, __86233382_Interface)

  private fun as_1388255045(): IInteractionTracker.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTracker.ABI.makeIInteractionTracker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTracker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTracker.ABI.makeIInteractionTracker(ref.value))
  }

  private fun as_86233385(): IInteractionTracker2.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTracker2.ABI.makeIInteractionTracker2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTracker2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTracker2.ABI.makeIInteractionTracker2(ref.value))
  }

  private fun as_86233384(): IInteractionTracker3.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTracker3.ABI.makeIInteractionTracker3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTracker3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTracker3.ABI.makeIInteractionTracker3(ref.value))
  }

  private fun as_86233383(): IInteractionTracker4.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTracker4.ABI.makeIInteractionTracker4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTracker4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTracker4.ABI.makeIInteractionTracker4(ref.value))
  }

  private fun as_86233382(): IInteractionTracker5.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTracker5.ABI.makeIInteractionTracker5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTracker5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTracker5.ABI.makeIInteractionTracker5(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractionTracker> {
    public override fun getValue() = InteractionTracker(pointer.getPointer(0))

    public fun setValue(value: InteractionTracker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractionTracker, MemoryAddress> {
    public val IInteractionTrackerStatics2_Instance: IInteractionTrackerStatics2 by lazy {
      createIInteractionTrackerStatics2()
    }


    public val IInteractionTrackerStatics_Instance: IInteractionTrackerStatics by lazy {
      createIInteractionTrackerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInteractionTrackerStatics2(): IInteractionTrackerStatics2 {
      val refiid = Guid.REFIID(IInteractionTrackerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Composition.Interactions.InteractionTracker".toHandle(),refiid,interfacePtr)
      val result =
          IInteractionTrackerStatics2.ABI.makeIInteractionTrackerStatics2(interfacePtr.value)
      return result
    }

    public fun createIInteractionTrackerStatics(): IInteractionTrackerStatics {
      val refiid = Guid.REFIID(IInteractionTrackerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Composition.Interactions.InteractionTracker".toHandle(),refiid,interfacePtr)
      val result = IInteractionTrackerStatics.ABI.makeIInteractionTrackerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InteractionTracker {
      val address = segment.toRawLongValue()
      return InteractionTracker(Pointer(address))
    }

    public override fun toNative(obj: InteractionTracker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun SetBindingMode(
      boundTracker1: InteractionTracker,
      boundTracker2: InteractionTracker,
      axisMode: InteractionBindingAxisModes
    ) = ABI.IInteractionTrackerStatics2_Instance.SetBindingMode(boundTracker1, boundTracker2,
        axisMode)

    public fun GetBindingMode(boundTracker1: InteractionTracker, boundTracker2: InteractionTracker)
        = ABI.IInteractionTrackerStatics2_Instance.GetBindingMode(boundTracker1, boundTracker2)

    public fun Create(compositor: Compositor) =
        ABI.IInteractionTrackerStatics_Instance.Create(compositor)

    public fun CreateWithOwner(compositor: Compositor, owner: IInteractionTrackerOwner) =
        ABI.IInteractionTrackerStatics_Instance.CreateWithOwner(compositor, owner)
  }
}
