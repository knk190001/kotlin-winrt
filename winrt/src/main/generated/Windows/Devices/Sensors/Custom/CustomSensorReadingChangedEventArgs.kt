package Windows.Devices.Sensors.Custom

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

@ABIMarker(CustomSensorReadingChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Sensors.Custom.CustomSensorReadingChangedEventArgs;{6b202023-cffd-4cc1-8ff0-e21823d76fcc})")
@WinRTByReference(brClass = CustomSensorReadingChangedEventArgs.ByReference::class)
public class CustomSensorReadingChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICustomSensorReadingChangedEventArgs.WithDefault, IWinRTObject {
  private val __450407331_Interface: ICustomSensorReadingChangedEventArgs.WithDefault by lazy {
    as_450407331()
  }


  public override val __450407331_Ptr: JNAPointer? by lazy {
    __450407331_Interface.__450407331_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__450407331_Interface)

  private fun as_450407331(): ICustomSensorReadingChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICustomSensorReadingChangedEventArgs.ABI.makeICustomSensorReadingChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICustomSensorReadingChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICustomSensorReadingChangedEventArgs.ABI.makeICustomSensorReadingChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CustomSensorReadingChangedEventArgs> {
    public override fun getValue() = CustomSensorReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CustomSensorReadingChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CustomSensorReadingChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CustomSensorReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return CustomSensorReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CustomSensorReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
