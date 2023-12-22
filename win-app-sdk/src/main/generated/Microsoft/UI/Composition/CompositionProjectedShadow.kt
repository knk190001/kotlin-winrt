package Microsoft.UI.Composition

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

@ABIMarker(CompositionProjectedShadow.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionProjectedShadow;{d400ab10-8b92-5abb-9e23-807974fc6961})")
@WinRTByReference(brClass = CompositionProjectedShadow.ByReference::class)
public class CompositionProjectedShadow(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionProjectedShadow.WithDefault,
    IExpCompositionProjectedShadow.WithDefault, IWinRTObject {
  private val __722554745_Interface: ICompositionProjectedShadow.WithDefault by lazy {
    as_722554745()
  }


  private val __1171010510_Interface: IExpCompositionProjectedShadow.WithDefault by lazy {
    as_1171010510()
  }


  public override val __722554745_Ptr: JNAPointer? by lazy {
    __722554745_Interface.__722554745_Ptr
  }


  public override val __1171010510_Ptr: JNAPointer? by lazy {
    __1171010510_Interface.__1171010510_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__722554745_Interface, __1171010510_Interface)

  private fun as_722554745(): ICompositionProjectedShadow.WithDefault {
    if(pointer == NULL) {
      return(ICompositionProjectedShadow.ABI.makeICompositionProjectedShadow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionProjectedShadow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionProjectedShadow.ABI.makeICompositionProjectedShadow(ref.value))
  }

  private fun as_1171010510(): IExpCompositionProjectedShadow.WithDefault {
    if(pointer == NULL) {
      return(IExpCompositionProjectedShadow.ABI.makeIExpCompositionProjectedShadow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpCompositionProjectedShadow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpCompositionProjectedShadow.ABI.makeIExpCompositionProjectedShadow(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionProjectedShadow> {
    public override fun getValue() = CompositionProjectedShadow(pointer.getPointer(0))

    public fun setValue(value: CompositionProjectedShadow): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionProjectedShadow, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionProjectedShadow {
      val address = segment.toRawLongValue()
      return CompositionProjectedShadow(Pointer(address))
    }

    public override fun toNative(obj: CompositionProjectedShadow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
