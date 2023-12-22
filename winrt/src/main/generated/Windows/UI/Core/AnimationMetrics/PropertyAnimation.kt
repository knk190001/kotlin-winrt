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

@ABIMarker(PropertyAnimation.ABI::class)
@Signature("rc(Windows.UI.Core.AnimationMetrics.PropertyAnimation;{3a01b4da-4d8c-411e-b615-1ade683a9903})")
@WinRTByReference(brClass = PropertyAnimation.ByReference::class)
public class PropertyAnimation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPropertyAnimation.WithDefault, IWinRTObject {
  private val __359196293_Interface: IPropertyAnimation.WithDefault by lazy {
    as_359196293()
  }


  public override val __359196293_Ptr: JNAPointer? by lazy {
    __359196293_Interface.__359196293_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__359196293_Interface)

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
      IByReference<PropertyAnimation> {
    public override fun getValue() = PropertyAnimation(pointer.getPointer(0))

    public fun setValue(value: PropertyAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PropertyAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PropertyAnimation {
      val address = segment.toRawLongValue()
      return PropertyAnimation(Pointer(address))
    }

    public override fun toNative(obj: PropertyAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
