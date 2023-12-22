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

@ABIMarker(FrameFlashCapabilities.ABI::class)
@Signature("rc(Windows.Media.Devices.Core.FrameFlashCapabilities;{bb9341a2-5ebe-4f62-8223-0e2b05bfbbd0})")
@WinRTByReference(brClass = FrameFlashCapabilities.ByReference::class)
public class FrameFlashCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFrameFlashCapabilities.WithDefault, IWinRTObject {
  private val __894161469_Interface: IFrameFlashCapabilities.WithDefault by lazy {
    as_894161469()
  }


  public override val __894161469_Ptr: JNAPointer? by lazy {
    __894161469_Interface.__894161469_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__894161469_Interface)

  private fun as_894161469(): IFrameFlashCapabilities.WithDefault {
    if(pointer == NULL) {
      return(IFrameFlashCapabilities.ABI.makeIFrameFlashCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameFlashCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameFlashCapabilities.ABI.makeIFrameFlashCapabilities(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameFlashCapabilities> {
    public override fun getValue() = FrameFlashCapabilities(pointer.getPointer(0))

    public fun setValue(value: FrameFlashCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameFlashCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FrameFlashCapabilities {
      val address = segment.toRawLongValue()
      return FrameFlashCapabilities(Pointer(address))
    }

    public override fun toNative(obj: FrameFlashCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
