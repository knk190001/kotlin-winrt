package Windows.UI.Composition

import Windows.Foundation.Collections.IIterable
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(CompositionAnimationGroup.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionAnimationGroup;{5e7cc90c-cd14-4e07-8a55-c72527aabdac})")
@WinRTByReference(brClass = CompositionAnimationGroup.ByReference::class)
public class CompositionAnimationGroup(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionAnimationGroup.WithDefault,
    IIterable<CompositionAnimation?>, ICompositionAnimationBase.WithDefault, IWinRTObject {
  private val __1193436745_Interface: ICompositionAnimationGroup.WithDefault by lazy {
    as_1193436745()
  }


  private val __1449643190_Interface: IIterable<CompositionAnimation?> by lazy {
    as_1449643190()
  }


  private val __99884185_Interface: ICompositionAnimationBase.WithDefault by lazy {
    as_99884185()
  }


  public override val __1449643190_Type: KType = typeOf<IIterable<CompositionAnimation?>>()

  public override val __1193436745_Ptr: JNAPointer? by lazy {
    __1193436745_Interface.__1193436745_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val __99884185_Ptr: JNAPointer? by lazy {
    __99884185_Interface.__99884185_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1193436745_Interface, __1449643190_Interface, __99884185_Interface)

  private fun as_1193436745(): ICompositionAnimationGroup.WithDefault {
    if(pointer == NULL) {
      return(ICompositionAnimationGroup.ABI.makeICompositionAnimationGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionAnimationGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionAnimationGroup.ABI.makeICompositionAnimationGroup(ref.value))
  }

  private fun as_1449643190(): IIterable<CompositionAnimation?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<CompositionAnimation?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<CompositionAnimation?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<CompositionAnimation?>(ref.value))
  }

  private fun as_99884185(): ICompositionAnimationBase.WithDefault {
    if(pointer == NULL) {
      return(ICompositionAnimationBase.ABI.makeICompositionAnimationBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionAnimationBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionAnimationBase.ABI.makeICompositionAnimationBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionAnimationGroup> {
    public override fun getValue() = CompositionAnimationGroup(pointer.getPointer(0))

    public fun setValue(value: CompositionAnimationGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionAnimationGroup, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionAnimationGroup {
      val address = segment.toRawLongValue()
      return CompositionAnimationGroup(Pointer(address))
    }

    public override fun toNative(obj: CompositionAnimationGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
