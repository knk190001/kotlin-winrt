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

@ABIMarker(SystemVideoProperties.ABI::class)
@Signature("rc(Windows.Storage.SystemVideoProperties;{2040f715-67f8-4322-9b80-4fa9fefb83e8})")
@WinRTByReference(brClass = SystemVideoProperties.ByReference::class)
public class SystemVideoProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemVideoProperties.WithDefault, IWinRTObject {
  private val __657096986_Interface: ISystemVideoProperties.WithDefault by lazy {
    as_657096986()
  }


  public override val __657096986_Ptr: JNAPointer? by lazy {
    __657096986_Interface.__657096986_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__657096986_Interface)

  private fun as_657096986(): ISystemVideoProperties.WithDefault {
    if(pointer == NULL) {
      return(ISystemVideoProperties.ABI.makeISystemVideoProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemVideoProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemVideoProperties.ABI.makeISystemVideoProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemVideoProperties> {
    public override fun getValue() = SystemVideoProperties(pointer.getPointer(0))

    public fun setValue(value: SystemVideoProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemVideoProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemVideoProperties {
      val address = segment.toRawLongValue()
      return SystemVideoProperties(Pointer(address))
    }

    public override fun toNative(obj: SystemVideoProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
