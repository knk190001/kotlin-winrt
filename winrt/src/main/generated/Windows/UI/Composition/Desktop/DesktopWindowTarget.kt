package Windows.UI.Composition.Desktop

import Windows.UI.Composition.CompositionTarget
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DesktopWindowTarget.ABI::class)
@Signature("rc(Windows.UI.Composition.Desktop.DesktopWindowTarget;{6329d6ca-3366-490e-9db3-25312929ac51})")
@WinRTByReference(brClass = DesktopWindowTarget.ByReference::class)
public class DesktopWindowTarget(
  ptr: JNAPointer? = NULL
) : CompositionTarget(ptr), IDesktopWindowTarget.WithDefault, IWinRTObject {
  private val __516135043_Interface: IDesktopWindowTarget.WithDefault by lazy {
    as_516135043()
  }


  public override val __516135043_Ptr: JNAPointer? by lazy {
    __516135043_Interface.__516135043_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__516135043_Interface)

  private fun as_516135043(): IDesktopWindowTarget.WithDefault {
    if(pointer == NULL) {
      return(IDesktopWindowTarget.ABI.makeIDesktopWindowTarget(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDesktopWindowTarget>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDesktopWindowTarget.ABI.makeIDesktopWindowTarget(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DesktopWindowTarget> {
    public override fun getValue() = DesktopWindowTarget(pointer.getPointer(0))

    public fun setValue(value: DesktopWindowTarget): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DesktopWindowTarget, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DesktopWindowTarget {
      val address = segment.toRawLongValue()
      return DesktopWindowTarget(Pointer(address))
    }

    public override fun toNative(obj: DesktopWindowTarget): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
