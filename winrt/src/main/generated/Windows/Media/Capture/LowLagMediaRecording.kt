package Windows.Media.Capture

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

@ABIMarker(LowLagMediaRecording.ABI::class)
@Signature("rc(Windows.Media.Capture.LowLagMediaRecording;{41c8baf7-ff3f-49f0-a477-f195e3ce5108})")
@WinRTByReference(brClass = LowLagMediaRecording.ByReference::class)
public class LowLagMediaRecording(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILowLagMediaRecording.WithDefault, ILowLagMediaRecording2.WithDefault,
    ILowLagMediaRecording3.WithDefault, IWinRTObject {
  private val __1084771203_Interface: ILowLagMediaRecording.WithDefault by lazy {
    as_1084771203()
  }


  private val __731831025_Interface: ILowLagMediaRecording2.WithDefault by lazy {
    as_731831025()
  }


  private val __731831024_Interface: ILowLagMediaRecording3.WithDefault by lazy {
    as_731831024()
  }


  public override val __1084771203_Ptr: JNAPointer? by lazy {
    __1084771203_Interface.__1084771203_Ptr
  }


  public override val __731831025_Ptr: JNAPointer? by lazy {
    __731831025_Interface.__731831025_Ptr
  }


  public override val __731831024_Ptr: JNAPointer? by lazy {
    __731831024_Interface.__731831024_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1084771203_Interface, __731831025_Interface, __731831024_Interface)

  private fun as_1084771203(): ILowLagMediaRecording.WithDefault {
    if(pointer == NULL) {
      return(ILowLagMediaRecording.ABI.makeILowLagMediaRecording(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILowLagMediaRecording>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILowLagMediaRecording.ABI.makeILowLagMediaRecording(ref.value))
  }

  private fun as_731831025(): ILowLagMediaRecording2.WithDefault {
    if(pointer == NULL) {
      return(ILowLagMediaRecording2.ABI.makeILowLagMediaRecording2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILowLagMediaRecording2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILowLagMediaRecording2.ABI.makeILowLagMediaRecording2(ref.value))
  }

  private fun as_731831024(): ILowLagMediaRecording3.WithDefault {
    if(pointer == NULL) {
      return(ILowLagMediaRecording3.ABI.makeILowLagMediaRecording3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILowLagMediaRecording3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILowLagMediaRecording3.ABI.makeILowLagMediaRecording3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LowLagMediaRecording> {
    public override fun getValue() = LowLagMediaRecording(pointer.getPointer(0))

    public fun setValue(value: LowLagMediaRecording): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LowLagMediaRecording, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LowLagMediaRecording {
      val address = segment.toRawLongValue()
      return LowLagMediaRecording(Pointer(address))
    }

    public override fun toNative(obj: LowLagMediaRecording): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
