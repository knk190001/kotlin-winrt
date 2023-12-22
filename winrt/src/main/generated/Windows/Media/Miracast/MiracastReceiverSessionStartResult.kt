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

@ABIMarker(MiracastReceiverSessionStartResult.ABI::class)
@Signature("rc(Windows.Media.Miracast.MiracastReceiverSessionStartResult;{b7c573ee-40ca-51ff-95f2-c9de34f2e90e})")
@WinRTByReference(brClass = MiracastReceiverSessionStartResult.ByReference::class)
public class MiracastReceiverSessionStartResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMiracastReceiverSessionStartResult.WithDefault, IWinRTObject {
  private val __1946690156_Interface: IMiracastReceiverSessionStartResult.WithDefault by lazy {
    as_1946690156()
  }


  public override val __1946690156_Ptr: JNAPointer? by lazy {
    __1946690156_Interface.__1946690156_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1946690156_Interface)

  private fun as_1946690156(): IMiracastReceiverSessionStartResult.WithDefault {
    if(pointer == NULL) {
      return(IMiracastReceiverSessionStartResult.ABI.makeIMiracastReceiverSessionStartResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMiracastReceiverSessionStartResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMiracastReceiverSessionStartResult.ABI.makeIMiracastReceiverSessionStartResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MiracastReceiverSessionStartResult> {
    public override fun getValue() = MiracastReceiverSessionStartResult(pointer.getPointer(0))

    public fun setValue(value: MiracastReceiverSessionStartResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MiracastReceiverSessionStartResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MiracastReceiverSessionStartResult {
      val address = segment.toRawLongValue()
      return MiracastReceiverSessionStartResult(Pointer(address))
    }

    public override fun toNative(obj: MiracastReceiverSessionStartResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
