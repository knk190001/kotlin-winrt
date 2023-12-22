package Windows.Media.Devices.Core

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

@ABIMarker(FrameExposureCapabilities.ABI::class)
@Signature("rc(Windows.Media.Devices.Core.FrameExposureCapabilities;{bdbe9ce3-3985-4e72-97c2-0590d61307a1})")
@WinRTByReference(brClass = FrameExposureCapabilities.ByReference::class)
public class FrameExposureCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFrameExposureCapabilities.WithDefault, IWinRTObject {
  private val __628752250_Interface: IFrameExposureCapabilities.WithDefault by lazy {
    as_628752250()
  }


  public override val __628752250_Ptr: JNAPointer? by lazy {
    __628752250_Interface.__628752250_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__628752250_Interface)

  private fun as_628752250(): IFrameExposureCapabilities.WithDefault {
    if(pointer == NULL) {
      return(IFrameExposureCapabilities.ABI.makeIFrameExposureCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameExposureCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameExposureCapabilities.ABI.makeIFrameExposureCapabilities(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameExposureCapabilities> {
    public override fun getValue() = FrameExposureCapabilities(pointer.getPointer(0))

    public fun setValue(value: FrameExposureCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameExposureCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FrameExposureCapabilities {
      val address = segment.toRawLongValue()
      return FrameExposureCapabilities(Pointer(address))
    }

    public override fun toNative(obj: FrameExposureCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
