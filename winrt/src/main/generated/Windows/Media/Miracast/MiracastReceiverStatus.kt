package Windows.Media.Miracast

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

@ABIMarker(MiracastReceiverStatus.ABI::class)
@Signature("rc(Windows.Media.Miracast.MiracastReceiverStatus;{c28a5591-23ab-519e-ad09-90bff6dcc87e})")
@WinRTByReference(brClass = MiracastReceiverStatus.ByReference::class)
public class MiracastReceiverStatus(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMiracastReceiverStatus.WithDefault, IWinRTObject {
  private val __1216171061_Interface: IMiracastReceiverStatus.WithDefault by lazy {
    as_1216171061()
  }


  public override val __1216171061_Ptr: JNAPointer? by lazy {
    __1216171061_Interface.__1216171061_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1216171061_Interface)

  private fun as_1216171061(): IMiracastReceiverStatus.WithDefault {
    if(pointer == NULL) {
      return(IMiracastReceiverStatus.ABI.makeIMiracastReceiverStatus(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMiracastReceiverStatus>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMiracastReceiverStatus.ABI.makeIMiracastReceiverStatus(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MiracastReceiverStatus> {
    public override fun getValue() = MiracastReceiverStatus(pointer.getPointer(0))

    public fun setValue(value: MiracastReceiverStatus): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MiracastReceiverStatus, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MiracastReceiverStatus {
      val address = segment.toRawLongValue()
      return MiracastReceiverStatus(Pointer(address))
    }

    public override fun toNative(obj: MiracastReceiverStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
