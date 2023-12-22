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

@ABIMarker(SpriteVisual.ABI::class)
@Signature("rc(Windows.UI.Composition.SpriteVisual;{08e05581-1ad1-4f97-9757-402d76e4233b})")
@WinRTByReference(brClass = SpriteVisual.ByReference::class)
public class SpriteVisual(
  ptr: JNAPointer? = NULL
) : ContainerVisual(ptr), ISpriteVisual.WithDefault, ISpriteVisual2.WithDefault, IWinRTObject {
  private val __174481683_Interface: ISpriteVisual.WithDefault by lazy {
    as_174481683()
  }


  private val __1113964927_Interface: ISpriteVisual2.WithDefault by lazy {
    as_1113964927()
  }


  public override val __174481683_Ptr: JNAPointer? by lazy {
    __174481683_Interface.__174481683_Ptr
  }


  public override val __1113964927_Ptr: JNAPointer? by lazy {
    __1113964927_Interface.__1113964927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__174481683_Interface, __1113964927_Interface)

  private fun as_174481683(): ISpriteVisual.WithDefault {
    if(pointer == NULL) {
      return(ISpriteVisual.ABI.makeISpriteVisual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpriteVisual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpriteVisual.ABI.makeISpriteVisual(ref.value))
  }

  private fun as_1113964927(): ISpriteVisual2.WithDefault {
    if(pointer == NULL) {
      return(ISpriteVisual2.ABI.makeISpriteVisual2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpriteVisual2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpriteVisual2.ABI.makeISpriteVisual2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SpriteVisual> {
    public override fun getValue() = SpriteVisual(pointer.getPointer(0))

    public fun setValue(value: SpriteVisual): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpriteVisual, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpriteVisual {
      val address = segment.toRawLongValue()
      return SpriteVisual(Pointer(address))
    }

    public override fun toNative(obj: SpriteVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
