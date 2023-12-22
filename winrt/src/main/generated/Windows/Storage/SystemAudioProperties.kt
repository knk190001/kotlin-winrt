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

@ABIMarker(SystemAudioProperties.ABI::class)
@Signature("rc(Windows.Storage.SystemAudioProperties;{3f8f38b7-308c-47e1-924d-8645348e5db7})")
@WinRTByReference(brClass = SystemAudioProperties.ByReference::class)
public class SystemAudioProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemAudioProperties.WithDefault, IWinRTObject {
  private val __788648065_Interface: ISystemAudioProperties.WithDefault by lazy {
    as_788648065()
  }


  public override val __788648065_Ptr: JNAPointer? by lazy {
    __788648065_Interface.__788648065_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__788648065_Interface)

  private fun as_788648065(): ISystemAudioProperties.WithDefault {
    if(pointer == NULL) {
      return(ISystemAudioProperties.ABI.makeISystemAudioProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemAudioProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemAudioProperties.ABI.makeISystemAudioProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemAudioProperties> {
    public override fun getValue() = SystemAudioProperties(pointer.getPointer(0))

    public fun setValue(value: SystemAudioProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemAudioProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemAudioProperties {
      val address = segment.toRawLongValue()
      return SystemAudioProperties(Pointer(address))
    }

    public override fun toNative(obj: SystemAudioProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
