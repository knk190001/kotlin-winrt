package Windows.Graphics.Display

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

@ABIMarker(DisplayEnhancementOverrideCapabilitiesChangedEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Display.DisplayEnhancementOverrideCapabilitiesChangedEventArgs;{db61e664-15fa-49da-8b77-07dbd2af585d})")
@WinRTByReference(brClass =
    DisplayEnhancementOverrideCapabilitiesChangedEventArgs.ByReference::class)
public class DisplayEnhancementOverrideCapabilitiesChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayEnhancementOverrideCapabilitiesChangedEventArgs.WithDefault,
    IWinRTObject {
  private val __689250798_Interface:
      IDisplayEnhancementOverrideCapabilitiesChangedEventArgs.WithDefault by lazy {
    as_689250798()
  }


  public override val __689250798_Ptr: JNAPointer? by lazy {
    __689250798_Interface.__689250798_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__689250798_Interface)

  private fun as_689250798(): IDisplayEnhancementOverrideCapabilitiesChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDisplayEnhancementOverrideCapabilitiesChangedEventArgs.ABI.makeIDisplayEnhancementOverrideCapabilitiesChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayEnhancementOverrideCapabilitiesChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayEnhancementOverrideCapabilitiesChangedEventArgs.ABI.makeIDisplayEnhancementOverrideCapabilitiesChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayEnhancementOverrideCapabilitiesChangedEventArgs> {
    public override fun getValue() =
        DisplayEnhancementOverrideCapabilitiesChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DisplayEnhancementOverrideCapabilitiesChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayEnhancementOverrideCapabilitiesChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        DisplayEnhancementOverrideCapabilitiesChangedEventArgs {
      val address = segment.toRawLongValue()
      return DisplayEnhancementOverrideCapabilitiesChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DisplayEnhancementOverrideCapabilitiesChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
