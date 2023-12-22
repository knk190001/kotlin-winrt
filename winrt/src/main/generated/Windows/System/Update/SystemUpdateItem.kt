package Windows.System.Update

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

@ABIMarker(SystemUpdateItem.ABI::class)
@Signature("rc(Windows.System.Update.SystemUpdateItem;{779740eb-5624-519e-a8e2-09e9173b3fb7})")
@WinRTByReference(brClass = SystemUpdateItem.ByReference::class)
public class SystemUpdateItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemUpdateItem.WithDefault, IWinRTObject {
  private val __1210251767_Interface: ISystemUpdateItem.WithDefault by lazy {
    as_1210251767()
  }


  public override val __1210251767_Ptr: JNAPointer? by lazy {
    __1210251767_Interface.__1210251767_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1210251767_Interface)

  private fun as_1210251767(): ISystemUpdateItem.WithDefault {
    if(pointer == NULL) {
      return(ISystemUpdateItem.ABI.makeISystemUpdateItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemUpdateItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemUpdateItem.ABI.makeISystemUpdateItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemUpdateItem> {
    public override fun getValue() = SystemUpdateItem(pointer.getPointer(0))

    public fun setValue(value: SystemUpdateItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemUpdateItem, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SystemUpdateItem {
      val address = segment.toRawLongValue()
      return SystemUpdateItem(Pointer(address))
    }

    public override fun toNative(obj: SystemUpdateItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
