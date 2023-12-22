package Windows.UI.Composition

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(ImplicitAnimationCollection.ABI::class)
@Signature("rc(Windows.UI.Composition.ImplicitAnimationCollection;{0598a3ff-0a92-4c9d-a427-b25519250dbf})")
@WinRTByReference(brClass = ImplicitAnimationCollection.ByReference::class)
public class ImplicitAnimationCollection(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IImplicitAnimationCollection.WithDefault,
    IIterable<IKeyValuePair<String?, ICompositionAnimationBase?>?>, IMap<String?,
    ICompositionAnimationBase?>, IWinRTObject {
  private val __501372241_Interface: IImplicitAnimationCollection.WithDefault by lazy {
    as_501372241()
  }


  private val __1449643190_Interface: IIterable<IKeyValuePair<String?, ICompositionAnimationBase?>?>
      by lazy {
    as_1449643190()
  }


  private val __8028824_Interface: IMap<String?, ICompositionAnimationBase?> by lazy {
    as_8028824()
  }


  public override val __1449643190_Type: KType = typeOf<IIterable<IKeyValuePair<String?,
      ICompositionAnimationBase?>?>>()

  public override val __8028824_Type: KType = typeOf<IMap<String?, ICompositionAnimationBase?>>()

  public override val __501372241_Ptr: JNAPointer? by lazy {
    __501372241_Interface.__501372241_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val __8028824_Ptr: JNAPointer? by lazy {
    __8028824_Interface.__8028824_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__501372241_Interface, __1449643190_Interface, __8028824_Interface)

  private fun as_501372241(): IImplicitAnimationCollection.WithDefault {
    if(pointer == NULL) {
      return(IImplicitAnimationCollection.ABI.makeIImplicitAnimationCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImplicitAnimationCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImplicitAnimationCollection.ABI.makeIImplicitAnimationCollection(ref.value))
  }

  private fun as_1449643190(): IIterable<IKeyValuePair<String?, ICompositionAnimationBase?>?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, ICompositionAnimationBase?>?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?,
        ICompositionAnimationBase?>?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IKeyValuePair<String?,
        ICompositionAnimationBase?>?>(ref.value))
  }

  private fun as_8028824(): IMap<String?, ICompositionAnimationBase?> {
    if(pointer == NULL) {
      return(IMap.ABI.makeIMap<String?, ICompositionAnimationBase?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMap<String?, ICompositionAnimationBase?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMap.ABI.makeIMap<String?, ICompositionAnimationBase?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ImplicitAnimationCollection> {
    public override fun getValue() = ImplicitAnimationCollection(pointer.getPointer(0))

    public fun setValue(value: ImplicitAnimationCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImplicitAnimationCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ImplicitAnimationCollection {
      val address = segment.toRawLongValue()
      return ImplicitAnimationCollection(Pointer(address))
    }

    public override fun toNative(obj: ImplicitAnimationCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
