package Windows.Perception.People

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

@ABIMarker(HandPose.ABI::class)
@Signature("rc(Windows.Perception.People.HandPose;{4d98e79a-bb08-5d09-91de-df0dd3fae46c})")
@WinRTByReference(brClass = HandPose.ByReference::class)
public class HandPose(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHandPose.WithDefault, IWinRTObject {
  private val __2048668284_Interface: IHandPose.WithDefault by lazy {
    as_2048668284()
  }


  public override val __2048668284_Ptr: JNAPointer? by lazy {
    __2048668284_Interface.__2048668284_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2048668284_Interface)

  private fun as_2048668284(): IHandPose.WithDefault {
    if(pointer == NULL) {
      return(IHandPose.ABI.makeIHandPose(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHandPose>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHandPose.ABI.makeIHandPose(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<HandPose> {
    public override fun getValue() = HandPose(pointer.getPointer(0))

    public fun setValue(value: HandPose): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HandPose, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HandPose {
      val address = segment.toRawLongValue()
      return HandPose(Pointer(address))
    }

    public override fun toNative(obj: HandPose): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
