package Windows.Graphics.Display

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(DisplayServices.ABI::class)
@Signature("rc(Windows.Graphics.Display.DisplayServices;{1b54f32b-890d-5747-bd26-fdbdeb0c8a71})")
@WinRTByReference(brClass = DisplayServices.ByReference::class)
public class DisplayServices(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayServices.WithDefault, IWinRTObject {
  private val __1485808705_Interface: IDisplayServices.WithDefault by lazy {
    as_1485808705()
  }


  public override val __1485808705_Ptr: JNAPointer? by lazy {
    __1485808705_Interface.__1485808705_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1485808705_Interface)

  private fun as_1485808705(): IDisplayServices.WithDefault {
    if(pointer == NULL) {
      return(IDisplayServices.ABI.makeIDisplayServices(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayServices>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayServices.ABI.makeIDisplayServices(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayServices> {
    public override fun getValue() = DisplayServices(pointer.getPointer(0))

    public fun setValue(value: DisplayServices): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayServices, MemoryAddress> {
    public val IDisplayServicesStatics_Instance: IDisplayServicesStatics by lazy {
      createIDisplayServicesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDisplayServicesStatics(): IDisplayServicesStatics {
      val refiid = Guid.REFIID(IDisplayServicesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Display.DisplayServices".toHandle(),refiid,interfacePtr)
      val result = IDisplayServicesStatics.ABI.makeIDisplayServicesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DisplayServices {
      val address = segment.toRawLongValue()
      return DisplayServices(Pointer(address))
    }

    public override fun toNative(obj: DisplayServices): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindAll() = ABI.IDisplayServicesStatics_Instance.FindAll()
  }
}
