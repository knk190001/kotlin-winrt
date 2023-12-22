package Windows.Devices.Sensors

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

@ABIMarker(AltimeterReadingChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Sensors.AltimeterReadingChangedEventArgs;{7069d077-446d-47f7-998c-ebc23b45e4a2})")
@WinRTByReference(brClass = AltimeterReadingChangedEventArgs.ByReference::class)
public class AltimeterReadingChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAltimeterReadingChangedEventArgs.WithDefault, IWinRTObject {
  private val __28709646_Interface: IAltimeterReadingChangedEventArgs.WithDefault by lazy {
    as_28709646()
  }


  public override val __28709646_Ptr: JNAPointer? by lazy {
    __28709646_Interface.__28709646_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__28709646_Interface)

  private fun as_28709646(): IAltimeterReadingChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAltimeterReadingChangedEventArgs.ABI.makeIAltimeterReadingChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAltimeterReadingChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAltimeterReadingChangedEventArgs.ABI.makeIAltimeterReadingChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AltimeterReadingChangedEventArgs> {
    public override fun getValue() = AltimeterReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AltimeterReadingChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AltimeterReadingChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AltimeterReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return AltimeterReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AltimeterReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
