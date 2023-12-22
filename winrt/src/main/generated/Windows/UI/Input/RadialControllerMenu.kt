package Windows.UI.Input

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

@ABIMarker(RadialControllerMenu.ABI::class)
@Signature("rc(Windows.UI.Input.RadialControllerMenu;{8506b35d-f640-4412-aba0-bad077e5ea8a})")
@WinRTByReference(brClass = RadialControllerMenu.ByReference::class)
public class RadialControllerMenu(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialControllerMenu.WithDefault, IWinRTObject {
  private val __520776936_Interface: IRadialControllerMenu.WithDefault by lazy {
    as_520776936()
  }


  public override val __520776936_Ptr: JNAPointer? by lazy {
    __520776936_Interface.__520776936_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__520776936_Interface)

  private fun as_520776936(): IRadialControllerMenu.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerMenu.ABI.makeIRadialControllerMenu(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerMenu>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerMenu.ABI.makeIRadialControllerMenu(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialControllerMenu> {
    public override fun getValue() = RadialControllerMenu(pointer.getPointer(0))

    public fun setValue(value: RadialControllerMenu): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialControllerMenu, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RadialControllerMenu {
      val address = segment.toRawLongValue()
      return RadialControllerMenu(Pointer(address))
    }

    public override fun toNative(obj: RadialControllerMenu): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
