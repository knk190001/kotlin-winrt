package Windows.Media.Devices

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

@ABIMarker(SceneModeControl.ABI::class)
@Signature("rc(Windows.Media.Devices.SceneModeControl;{d48e5af7-8d59-4854-8c62-12c70ba89b7c})")
@WinRTByReference(brClass = SceneModeControl.ByReference::class)
public class SceneModeControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISceneModeControl.WithDefault, IWinRTObject {
  private val __570489553_Interface: ISceneModeControl.WithDefault by lazy {
    as_570489553()
  }


  public override val __570489553_Ptr: JNAPointer? by lazy {
    __570489553_Interface.__570489553_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__570489553_Interface)

  private fun as_570489553(): ISceneModeControl.WithDefault {
    if(pointer == NULL) {
      return(ISceneModeControl.ABI.makeISceneModeControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneModeControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneModeControl.ABI.makeISceneModeControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SceneModeControl> {
    public override fun getValue() = SceneModeControl(pointer.getPointer(0))

    public fun setValue(value: SceneModeControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneModeControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SceneModeControl {
      val address = segment.toRawLongValue()
      return SceneModeControl(Pointer(address))
    }

    public override fun toNative(obj: SceneModeControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
