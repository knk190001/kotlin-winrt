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

@ABIMarker(SystemGPSProperties.ABI::class)
@Signature("rc(Windows.Storage.SystemGPSProperties;{c0f46eb4-c174-481a-bc25-921986f6a6f3})")
@WinRTByReference(brClass = SystemGPSProperties.ByReference::class)
public class SystemGPSProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemGPSProperties.WithDefault, IWinRTObject {
  private val __1956093525_Interface: ISystemGPSProperties.WithDefault by lazy {
    as_1956093525()
  }


  public override val __1956093525_Ptr: JNAPointer? by lazy {
    __1956093525_Interface.__1956093525_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1956093525_Interface)

  private fun as_1956093525(): ISystemGPSProperties.WithDefault {
    if(pointer == NULL) {
      return(ISystemGPSProperties.ABI.makeISystemGPSProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemGPSProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemGPSProperties.ABI.makeISystemGPSProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemGPSProperties> {
    public override fun getValue() = SystemGPSProperties(pointer.getPointer(0))

    public fun setValue(value: SystemGPSProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemGPSProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemGPSProperties {
      val address = segment.toRawLongValue()
      return SystemGPSProperties(Pointer(address))
    }

    public override fun toNative(obj: SystemGPSProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
