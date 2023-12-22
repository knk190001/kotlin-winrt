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

@ABIMarker(CompositionClip.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionClip;{1ccd2a52-cfc7-4ace-9983-146bb8eb6a3c})")
@WinRTByReference(brClass = CompositionClip.ByReference::class)
public open class CompositionClip(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionClip.WithDefault, ICompositionClip2.WithDefault,
    IWinRTObject {
  private val __510345900_Interface: ICompositionClip.WithDefault by lazy {
    as_510345900()
  }


  private val __1359146234_Interface: ICompositionClip2.WithDefault by lazy {
    as_1359146234()
  }


  public override val __510345900_Ptr: JNAPointer? by lazy {
    __510345900_Interface.__510345900_Ptr
  }


  public override val __1359146234_Ptr: JNAPointer? by lazy {
    __1359146234_Interface.__1359146234_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__510345900_Interface, __1359146234_Interface)

  private fun as_510345900(): ICompositionClip.WithDefault {
    if(pointer == NULL) {
      return(ICompositionClip.ABI.makeICompositionClip(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionClip>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionClip.ABI.makeICompositionClip(ref.value))
  }

  private fun as_1359146234(): ICompositionClip2.WithDefault {
    if(pointer == NULL) {
      return(ICompositionClip2.ABI.makeICompositionClip2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionClip2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionClip2.ABI.makeICompositionClip2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionClip> {
    public override fun getValue() = CompositionClip(pointer.getPointer(0))

    public fun setValue(value: CompositionClip): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionClip, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionClip {
      val address = segment.toRawLongValue()
      return CompositionClip(Pointer(address))
    }

    public override fun toNative(obj: CompositionClip): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
