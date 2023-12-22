package Microsoft.Graphics.Display

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

@ABIMarker(DisplayAdvancedColorInfo.ABI::class)
@Signature("rc(Microsoft.Graphics.Display.DisplayAdvancedColorInfo;{b44f0f47-7065-5175-ba3e-714489c85a3e})")
@WinRTByReference(brClass = DisplayAdvancedColorInfo.ByReference::class)
public class DisplayAdvancedColorInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayAdvancedColorInfo.WithDefault, IWinRTObject {
  private val __1022515415_Interface: IDisplayAdvancedColorInfo.WithDefault by lazy {
    as_1022515415()
  }


  public override val __1022515415_Ptr: JNAPointer? by lazy {
    __1022515415_Interface.__1022515415_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1022515415_Interface)

  private fun as_1022515415(): IDisplayAdvancedColorInfo.WithDefault {
    if(pointer == NULL) {
      return(IDisplayAdvancedColorInfo.ABI.makeIDisplayAdvancedColorInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayAdvancedColorInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayAdvancedColorInfo.ABI.makeIDisplayAdvancedColorInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayAdvancedColorInfo> {
    public override fun getValue() = DisplayAdvancedColorInfo(pointer.getPointer(0))

    public fun setValue(value: DisplayAdvancedColorInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayAdvancedColorInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayAdvancedColorInfo {
      val address = segment.toRawLongValue()
      return DisplayAdvancedColorInfo(Pointer(address))
    }

    public override fun toNative(obj: DisplayAdvancedColorInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
