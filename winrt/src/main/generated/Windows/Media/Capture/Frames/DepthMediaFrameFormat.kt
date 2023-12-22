package Windows.Media.Capture.Frames

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

@ABIMarker(DepthMediaFrameFormat.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.DepthMediaFrameFormat;{c312cf40-d729-453e-8780-2e04f140d28e})")
@WinRTByReference(brClass = DepthMediaFrameFormat.ByReference::class)
public class DepthMediaFrameFormat(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDepthMediaFrameFormat.WithDefault, IWinRTObject {
  private val __1110725565_Interface: IDepthMediaFrameFormat.WithDefault by lazy {
    as_1110725565()
  }


  public override val __1110725565_Ptr: JNAPointer? by lazy {
    __1110725565_Interface.__1110725565_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1110725565_Interface)

  private fun as_1110725565(): IDepthMediaFrameFormat.WithDefault {
    if(pointer == NULL) {
      return(IDepthMediaFrameFormat.ABI.makeIDepthMediaFrameFormat(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDepthMediaFrameFormat>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDepthMediaFrameFormat.ABI.makeIDepthMediaFrameFormat(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DepthMediaFrameFormat> {
    public override fun getValue() = DepthMediaFrameFormat(pointer.getPointer(0))

    public fun setValue(value: DepthMediaFrameFormat): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DepthMediaFrameFormat, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DepthMediaFrameFormat {
      val address = segment.toRawLongValue()
      return DepthMediaFrameFormat(Pointer(address))
    }

    public override fun toNative(obj: DepthMediaFrameFormat): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
