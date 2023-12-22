package Microsoft.UI.Xaml

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

@ABIMarker(DebugSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.DebugSettings;{4004943b-2509-5476-bba2-3fe05ecf615d})")
@WinRTByReference(brClass = DebugSettings.ByReference::class)
public class DebugSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDebugSettings.WithDefault, IDebugSettings2.WithDefault, IWinRTObject {
  private val __1282742609_Interface: IDebugSettings.WithDefault by lazy {
    as_1282742609()
  }


  private val __1110315165_Interface: IDebugSettings2.WithDefault by lazy {
    as_1110315165()
  }


  public override val __1282742609_Ptr: JNAPointer? by lazy {
    __1282742609_Interface.__1282742609_Ptr
  }


  public override val __1110315165_Ptr: JNAPointer? by lazy {
    __1110315165_Interface.__1110315165_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1282742609_Interface, __1110315165_Interface)

  private fun as_1282742609(): IDebugSettings.WithDefault {
    if(pointer == NULL) {
      return(IDebugSettings.ABI.makeIDebugSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDebugSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDebugSettings.ABI.makeIDebugSettings(ref.value))
  }

  private fun as_1110315165(): IDebugSettings2.WithDefault {
    if(pointer == NULL) {
      return(IDebugSettings2.ABI.makeIDebugSettings2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDebugSettings2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDebugSettings2.ABI.makeIDebugSettings2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DebugSettings>
      {
    public override fun getValue() = DebugSettings(pointer.getPointer(0))

    public fun setValue(value: DebugSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DebugSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DebugSettings {
      val address = segment.toRawLongValue()
      return DebugSettings(Pointer(address))
    }

    public override fun toNative(obj: DebugSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
