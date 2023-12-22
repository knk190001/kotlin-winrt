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

@ABIMarker(CompositionAnimation.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionAnimation;{464c4c2c-1caa-4061-9b40-e13fde1503ca})")
@WinRTByReference(brClass = CompositionAnimation.ByReference::class)
public open class CompositionAnimation(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionAnimation.WithDefault, ICompositionAnimation2.WithDefault,
    ICompositionAnimation3.WithDefault, ICompositionAnimation4.WithDefault,
    ICompositionAnimationBase.WithDefault, IWinRTObject {
  private val __1720207960_Interface: ICompositionAnimation.WithDefault by lazy {
    as_1720207960()
  }


  private val __1786839158_Interface: ICompositionAnimation2.WithDefault by lazy {
    as_1786839158()
  }


  private val __1786839157_Interface: ICompositionAnimation3.WithDefault by lazy {
    as_1786839157()
  }


  private val __1786839156_Interface: ICompositionAnimation4.WithDefault by lazy {
    as_1786839156()
  }


  private val __99884185_Interface: ICompositionAnimationBase.WithDefault by lazy {
    as_99884185()
  }


  public override val __1720207960_Ptr: JNAPointer? by lazy {
    __1720207960_Interface.__1720207960_Ptr
  }


  public override val __1786839158_Ptr: JNAPointer? by lazy {
    __1786839158_Interface.__1786839158_Ptr
  }


  public override val __1786839157_Ptr: JNAPointer? by lazy {
    __1786839157_Interface.__1786839157_Ptr
  }


  public override val __1786839156_Ptr: JNAPointer? by lazy {
    __1786839156_Interface.__1786839156_Ptr
  }


  public override val __99884185_Ptr: JNAPointer? by lazy {
    __99884185_Interface.__99884185_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1720207960_Interface, __1786839158_Interface, __1786839157_Interface,
        __1786839156_Interface, __99884185_Interface)

  private fun as_1720207960(): ICompositionAnimation.WithDefault {
    if(pointer == NULL) {
      return(ICompositionAnimation.ABI.makeICompositionAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionAnimation.ABI.makeICompositionAnimation(ref.value))
  }

  private fun as_1786839158(): ICompositionAnimation2.WithDefault {
    if(pointer == NULL) {
      return(ICompositionAnimation2.ABI.makeICompositionAnimation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionAnimation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionAnimation2.ABI.makeICompositionAnimation2(ref.value))
  }

  private fun as_1786839157(): ICompositionAnimation3.WithDefault {
    if(pointer == NULL) {
      return(ICompositionAnimation3.ABI.makeICompositionAnimation3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionAnimation3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionAnimation3.ABI.makeICompositionAnimation3(ref.value))
  }

  private fun as_1786839156(): ICompositionAnimation4.WithDefault {
    if(pointer == NULL) {
      return(ICompositionAnimation4.ABI.makeICompositionAnimation4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionAnimation4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionAnimation4.ABI.makeICompositionAnimation4(ref.value))
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
      IByReference<CompositionAnimation> {
    public override fun getValue() = CompositionAnimation(pointer.getPointer(0))

    public fun setValue(value: CompositionAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionAnimation {
      val address = segment.toRawLongValue()
      return CompositionAnimation(Pointer(address))
    }

    public override fun toNative(obj: CompositionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
