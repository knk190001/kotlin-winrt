package Windows.UI.Core.AnimationMetrics

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

@ABIMarker(OpacityAnimation.ABI::class)
@Signature("rc(Windows.UI.Core.AnimationMetrics.OpacityAnimation;{803aabe5-ee7e-455f-84e9-2506afb8d2b4})")
@WinRTByReference(brClass = OpacityAnimation.ByReference::class)
public class OpacityAnimation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOpacityAnimation.WithDefault, IPropertyAnimation.WithDefault, IWinRTObject {
  private val __1432038493_Interface: IOpacityAnimation.WithDefault by lazy {
    as_1432038493()
  }


  private val __359196293_Interface: IPropertyAnimation.WithDefault by lazy {
    as_359196293()
  }


  public override val __1432038493_Ptr: JNAPointer? by lazy {
    __1432038493_Interface.__1432038493_Ptr
  }


  public override val __359196293_Ptr: JNAPointer? by lazy {
    __359196293_Interface.__359196293_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1432038493_Interface, __359196293_Interface)

  private fun as_1432038493(): IOpacityAnimation.WithDefault {
    if(pointer == NULL) {
      return(IOpacityAnimation.ABI.makeIOpacityAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOpacityAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOpacityAnimation.ABI.makeIOpacityAnimation(ref.value))
  }

  private fun as_359196293(): IPropertyAnimation.WithDefault {
    if(pointer == NULL) {
      return(IPropertyAnimation.ABI.makeIPropertyAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPropertyAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPropertyAnimation.ABI.makeIPropertyAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OpacityAnimation> {
    public override fun getValue() = OpacityAnimation(pointer.getPointer(0))

    public fun setValue(value: OpacityAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OpacityAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): OpacityAnimation {
      val address = segment.toRawLongValue()
      return OpacityAnimation(Pointer(address))
    }

    public override fun toNative(obj: OpacityAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
