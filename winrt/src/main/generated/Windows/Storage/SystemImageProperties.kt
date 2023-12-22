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

@ABIMarker(SystemImageProperties.ABI::class)
@Signature("rc(Windows.Storage.SystemImageProperties;{011b2e30-8b39-4308-bea1-e8aa61e47826})")
@WinRTByReference(brClass = SystemImageProperties.ByReference::class)
public class SystemImageProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemImageProperties.WithDefault, IWinRTObject {
  private val __1125350342_Interface: ISystemImageProperties.WithDefault by lazy {
    as_1125350342()
  }


  public override val __1125350342_Ptr: JNAPointer? by lazy {
    __1125350342_Interface.__1125350342_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1125350342_Interface)

  private fun as_1125350342(): ISystemImageProperties.WithDefault {
    if(pointer == NULL) {
      return(ISystemImageProperties.ABI.makeISystemImageProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemImageProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemImageProperties.ABI.makeISystemImageProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemImageProperties> {
    public override fun getValue() = SystemImageProperties(pointer.getPointer(0))

    public fun setValue(value: SystemImageProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemImageProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemImageProperties {
      val address = segment.toRawLongValue()
      return SystemImageProperties(Pointer(address))
    }

    public override fun toNative(obj: SystemImageProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
