package Windows.UI.Xaml

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
@Signature("rc(Windows.UI.Xaml.DebugSettings;{3d451f98-c6a7-4d17-8398-d83a067183d8})")
@WinRTByReference(brClass = DebugSettings.ByReference::class)
public class DebugSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDebugSettings.WithDefault, IDebugSettings2.WithDefault,
    IDebugSettings3.WithDefault, IDebugSettings4.WithDefault, IWinRTObject {
  private val __663207292_Interface: IDebugSettings.WithDefault by lazy {
    as_663207292()
  }


  private val __915410478_Interface: IDebugSettings2.WithDefault by lazy {
    as_915410478()
  }


  private val __915410479_Interface: IDebugSettings3.WithDefault by lazy {
    as_915410479()
  }


  private val __915410480_Interface: IDebugSettings4.WithDefault by lazy {
    as_915410480()
  }


  public override val __663207292_Ptr: JNAPointer? by lazy {
    __663207292_Interface.__663207292_Ptr
  }


  public override val __915410478_Ptr: JNAPointer? by lazy {
    __915410478_Interface.__915410478_Ptr
  }


  public override val __915410479_Ptr: JNAPointer? by lazy {
    __915410479_Interface.__915410479_Ptr
  }


  public override val __915410480_Ptr: JNAPointer? by lazy {
    __915410480_Interface.__915410480_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__663207292_Interface, __915410478_Interface, __915410479_Interface,
        __915410480_Interface)

  private fun as_663207292(): IDebugSettings.WithDefault {
    if(pointer == NULL) {
      return(IDebugSettings.ABI.makeIDebugSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDebugSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDebugSettings.ABI.makeIDebugSettings(ref.value))
  }

  private fun as_915410478(): IDebugSettings2.WithDefault {
    if(pointer == NULL) {
      return(IDebugSettings2.ABI.makeIDebugSettings2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDebugSettings2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDebugSettings2.ABI.makeIDebugSettings2(ref.value))
  }

  private fun as_915410479(): IDebugSettings3.WithDefault {
    if(pointer == NULL) {
      return(IDebugSettings3.ABI.makeIDebugSettings3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDebugSettings3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDebugSettings3.ABI.makeIDebugSettings3(ref.value))
  }

  private fun as_915410480(): IDebugSettings4.WithDefault {
    if(pointer == NULL) {
      return(IDebugSettings4.ABI.makeIDebugSettings4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDebugSettings4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDebugSettings4.ABI.makeIDebugSettings4(ref.value))
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
