package Windows.Storage

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

@ABIMarker(SystemMusicProperties.ABI::class)
@Signature("rc(Windows.Storage.SystemMusicProperties;{b47988d5-67af-4bc3-8d39-5b89022026a1})")
@WinRTByReference(brClass = SystemMusicProperties.ByReference::class)
public class SystemMusicProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemMusicProperties.WithDefault, IWinRTObject {
  private val __1681902608_Interface: ISystemMusicProperties.WithDefault by lazy {
    as_1681902608()
  }


  public override val __1681902608_Ptr: JNAPointer? by lazy {
    __1681902608_Interface.__1681902608_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1681902608_Interface)

  private fun as_1681902608(): ISystemMusicProperties.WithDefault {
    if(pointer == NULL) {
      return(ISystemMusicProperties.ABI.makeISystemMusicProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemMusicProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemMusicProperties.ABI.makeISystemMusicProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemMusicProperties> {
    public override fun getValue() = SystemMusicProperties(pointer.getPointer(0))

    public fun setValue(value: SystemMusicProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemMusicProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemMusicProperties {
      val address = segment.toRawLongValue()
      return SystemMusicProperties(Pointer(address))
    }

    public override fun toNative(obj: SystemMusicProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
