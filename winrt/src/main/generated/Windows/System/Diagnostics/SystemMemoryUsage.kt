package Windows.System.Diagnostics

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

@ABIMarker(SystemMemoryUsage.ABI::class)
@Signature("rc(Windows.System.Diagnostics.SystemMemoryUsage;{17ffc595-1702-49cf-aa27-2f0a32591404})")
@WinRTByReference(brClass = SystemMemoryUsage.ByReference::class)
public class SystemMemoryUsage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemMemoryUsage.WithDefault, IWinRTObject {
  private val __1295227392_Interface: ISystemMemoryUsage.WithDefault by lazy {
    as_1295227392()
  }


  public override val __1295227392_Ptr: JNAPointer? by lazy {
    __1295227392_Interface.__1295227392_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1295227392_Interface)

  private fun as_1295227392(): ISystemMemoryUsage.WithDefault {
    if(pointer == NULL) {
      return(ISystemMemoryUsage.ABI.makeISystemMemoryUsage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemMemoryUsage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemMemoryUsage.ABI.makeISystemMemoryUsage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemMemoryUsage> {
    public override fun getValue() = SystemMemoryUsage(pointer.getPointer(0))

    public fun setValue(value: SystemMemoryUsage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemMemoryUsage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemMemoryUsage {
      val address = segment.toRawLongValue()
      return SystemMemoryUsage(Pointer(address))
    }

    public override fun toNative(obj: SystemMemoryUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
