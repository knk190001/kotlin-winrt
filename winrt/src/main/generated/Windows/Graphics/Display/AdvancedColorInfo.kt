package Windows.Graphics.Display

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

@ABIMarker(AdvancedColorInfo.ABI::class)
@Signature("rc(Windows.Graphics.Display.AdvancedColorInfo;{8797dcfb-b229-4081-ae9a-2cc85e34ad6a})")
@WinRTByReference(brClass = AdvancedColorInfo.ByReference::class)
public class AdvancedColorInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdvancedColorInfo.WithDefault, IWinRTObject {
  private val __2141919600_Interface: IAdvancedColorInfo.WithDefault by lazy {
    as_2141919600()
  }


  public override val __2141919600_Ptr: JNAPointer? by lazy {
    __2141919600_Interface.__2141919600_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2141919600_Interface)

  private fun as_2141919600(): IAdvancedColorInfo.WithDefault {
    if(pointer == NULL) {
      return(IAdvancedColorInfo.ABI.makeIAdvancedColorInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvancedColorInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvancedColorInfo.ABI.makeIAdvancedColorInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdvancedColorInfo> {
    public override fun getValue() = AdvancedColorInfo(pointer.getPointer(0))

    public fun setValue(value: AdvancedColorInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdvancedColorInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AdvancedColorInfo {
      val address = segment.toRawLongValue()
      return AdvancedColorInfo(Pointer(address))
    }

    public override fun toNative(obj: AdvancedColorInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
