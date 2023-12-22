package Windows.UI.Composition

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

@ABIMarker(CompositionPropertySet.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionPropertySet;{c9d6d202-5f67-4453-9117-9eadd430d3c2})")
@WinRTByReference(brClass = CompositionPropertySet.ByReference::class)
public class CompositionPropertySet(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionPropertySet.WithDefault,
    ICompositionPropertySet2.WithDefault, IWinRTObject {
  private val __653900657_Interface: ICompositionPropertySet.WithDefault by lazy {
    as_653900657()
  }


  private val __1203916063_Interface: ICompositionPropertySet2.WithDefault by lazy {
    as_1203916063()
  }


  public override val __653900657_Ptr: JNAPointer? by lazy {
    __653900657_Interface.__653900657_Ptr
  }


  public override val __1203916063_Ptr: JNAPointer? by lazy {
    __1203916063_Interface.__1203916063_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__653900657_Interface, __1203916063_Interface)

  private fun as_653900657(): ICompositionPropertySet.WithDefault {
    if(pointer == NULL) {
      return(ICompositionPropertySet.ABI.makeICompositionPropertySet(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionPropertySet>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionPropertySet.ABI.makeICompositionPropertySet(ref.value))
  }

  private fun as_1203916063(): ICompositionPropertySet2.WithDefault {
    if(pointer == NULL) {
      return(ICompositionPropertySet2.ABI.makeICompositionPropertySet2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionPropertySet2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionPropertySet2.ABI.makeICompositionPropertySet2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionPropertySet> {
    public override fun getValue() = CompositionPropertySet(pointer.getPointer(0))

    public fun setValue(value: CompositionPropertySet): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionPropertySet, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionPropertySet {
      val address = segment.toRawLongValue()
      return CompositionPropertySet(Pointer(address))
    }

    public override fun toNative(obj: CompositionPropertySet): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
