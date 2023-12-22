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

@ABIMarker(KeyFrameAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Composition.KeyFrameAnimation;{5a8f57f0-f059-5b47-b308-c4c80fc71248})")
@WinRTByReference(brClass = KeyFrameAnimation.ByReference::class)
public open class KeyFrameAnimation(
  ptr: JNAPointer? = NULL
) : CompositionAnimation(ptr), IKeyFrameAnimation.WithDefault, IKeyFrameAnimation2.WithDefault,
    IKeyFrameAnimation3.WithDefault, IWinRTObject {
  private val __51281443_Interface: IKeyFrameAnimation.WithDefault by lazy {
    as_51281443()
  }


  private val __1589724683_Interface: IKeyFrameAnimation2.WithDefault by lazy {
    as_1589724683()
  }


  private val __1589724682_Interface: IKeyFrameAnimation3.WithDefault by lazy {
    as_1589724682()
  }


  public override val __51281443_Ptr: JNAPointer? by lazy {
    __51281443_Interface.__51281443_Ptr
  }


  public override val __1589724683_Ptr: JNAPointer? by lazy {
    __1589724683_Interface.__1589724683_Ptr
  }


  public override val __1589724682_Ptr: JNAPointer? by lazy {
    __1589724682_Interface.__1589724682_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__51281443_Interface, __1589724683_Interface, __1589724682_Interface)

  private fun as_51281443(): IKeyFrameAnimation.WithDefault {
    if(pointer == NULL) {
      return(IKeyFrameAnimation.ABI.makeIKeyFrameAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyFrameAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyFrameAnimation.ABI.makeIKeyFrameAnimation(ref.value))
  }

  private fun as_1589724683(): IKeyFrameAnimation2.WithDefault {
    if(pointer == NULL) {
      return(IKeyFrameAnimation2.ABI.makeIKeyFrameAnimation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyFrameAnimation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyFrameAnimation2.ABI.makeIKeyFrameAnimation2(ref.value))
  }

  private fun as_1589724682(): IKeyFrameAnimation3.WithDefault {
    if(pointer == NULL) {
      return(IKeyFrameAnimation3.ABI.makeIKeyFrameAnimation3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyFrameAnimation3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyFrameAnimation3.ABI.makeIKeyFrameAnimation3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyFrameAnimation> {
    public override fun getValue() = KeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: KeyFrameAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyFrameAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): KeyFrameAnimation {
      val address = segment.toRawLongValue()
      return KeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: KeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
