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

@ABIMarker(HeadPose.ABI::class)
@Signature("rc(Windows.Perception.People.HeadPose;{7f5ac5a5-49db-379f-9429-32a2faf34fa6})")
@WinRTByReference(brClass = HeadPose.ByReference::class)
public class HeadPose(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHeadPose.WithDefault, IWinRTObject {
  private val __931536749_Interface: IHeadPose.WithDefault by lazy {
    as_931536749()
  }


  public override val __931536749_Ptr: JNAPointer? by lazy {
    __931536749_Interface.__931536749_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__931536749_Interface)

  private fun as_931536749(): IHeadPose.WithDefault {
    if(pointer == NULL) {
      return(IHeadPose.ABI.makeIHeadPose(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHeadPose>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHeadPose.ABI.makeIHeadPose(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<HeadPose> {
    public override fun getValue() = HeadPose(pointer.getPointer(0))

    public fun setValue(value: HeadPose): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HeadPose, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HeadPose {
      val address = segment.toRawLongValue()
      return HeadPose(Pointer(address))
    }

    public override fun toNative(obj: HeadPose): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
