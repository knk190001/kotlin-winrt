package Windows.Devices.Spi

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

@ABIMarker(SpiBusInfo.ABI::class)
@Signature("rc(Windows.Devices.Spi.SpiBusInfo;{9929444a-54f2-48c6-b952-9c32fc02c669})")
@WinRTByReference(brClass = SpiBusInfo.ByReference::class)
public class SpiBusInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpiBusInfo.WithDefault, IWinRTObject {
  private val __1205520731_Interface: ISpiBusInfo.WithDefault by lazy {
    as_1205520731()
  }


  public override val __1205520731_Ptr: JNAPointer? by lazy {
    __1205520731_Interface.__1205520731_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1205520731_Interface)

  private fun as_1205520731(): ISpiBusInfo.WithDefault {
    if(pointer == NULL) {
      return(ISpiBusInfo.ABI.makeISpiBusInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpiBusInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpiBusInfo.ABI.makeISpiBusInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SpiBusInfo> {
    public override fun getValue() = SpiBusInfo(pointer.getPointer(0))

    public fun setValue(value: SpiBusInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpiBusInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpiBusInfo {
      val address = segment.toRawLongValue()
      return SpiBusInfo(Pointer(address))
    }

    public override fun toNative(obj: SpiBusInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
