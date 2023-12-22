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

@ABIMarker(SystemPhotoProperties.ABI::class)
@Signature("rc(Windows.Storage.SystemPhotoProperties;{4734fc3d-ab21-4424-b735-f4353a56c8fc})")
@WinRTByReference(brClass = SystemPhotoProperties.ByReference::class)
public class SystemPhotoProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemPhotoProperties.WithDefault, IWinRTObject {
  private val __1898106915_Interface: ISystemPhotoProperties.WithDefault by lazy {
    as_1898106915()
  }


  public override val __1898106915_Ptr: JNAPointer? by lazy {
    __1898106915_Interface.__1898106915_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1898106915_Interface)

  private fun as_1898106915(): ISystemPhotoProperties.WithDefault {
    if(pointer == NULL) {
      return(ISystemPhotoProperties.ABI.makeISystemPhotoProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemPhotoProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemPhotoProperties.ABI.makeISystemPhotoProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemPhotoProperties> {
    public override fun getValue() = SystemPhotoProperties(pointer.getPointer(0))

    public fun setValue(value: SystemPhotoProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemPhotoProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemPhotoProperties {
      val address = segment.toRawLongValue()
      return SystemPhotoProperties(Pointer(address))
    }

    public override fun toNative(obj: SystemPhotoProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
