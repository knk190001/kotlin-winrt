package Windows.AI.MachineLearning.Preview

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

@ABIMarker(LearningModelDescriptionPreview.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.Preview.LearningModelDescriptionPreview;{f52c09c6-8611-40ad-8e59-de3fd7030a40})")
@WinRTByReference(brClass = LearningModelDescriptionPreview.ByReference::class)
public class LearningModelDescriptionPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILearningModelDescriptionPreview.WithDefault, IWinRTObject {
  private val __544560754_Interface: ILearningModelDescriptionPreview.WithDefault by lazy {
    as_544560754()
  }


  public override val __544560754_Ptr: JNAPointer? by lazy {
    __544560754_Interface.__544560754_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__544560754_Interface)

  private fun as_544560754(): ILearningModelDescriptionPreview.WithDefault {
    if(pointer == NULL) {
      return(ILearningModelDescriptionPreview.ABI.makeILearningModelDescriptionPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModelDescriptionPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModelDescriptionPreview.ABI.makeILearningModelDescriptionPreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LearningModelDescriptionPreview> {
    public override fun getValue() = LearningModelDescriptionPreview(pointer.getPointer(0))

    public fun setValue(value: LearningModelDescriptionPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LearningModelDescriptionPreview, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LearningModelDescriptionPreview {
      val address = segment.toRawLongValue()
      return LearningModelDescriptionPreview(Pointer(address))
    }

    public override fun toNative(obj: LearningModelDescriptionPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
