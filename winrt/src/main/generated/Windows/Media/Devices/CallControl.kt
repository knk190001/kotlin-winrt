package Windows.Media.Devices

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CallControl.ABI::class)
@Signature("rc(Windows.Media.Devices.CallControl;{a520d0d6-ae8d-45db-8011-ca49d3b3e578})")
@WinRTByReference(brClass = CallControl.ByReference::class)
public class CallControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICallControl.WithDefault, IWinRTObject {
  private val __596458846_Interface: ICallControl.WithDefault by lazy {
    as_596458846()
  }


  public override val __596458846_Ptr: JNAPointer? by lazy {
    __596458846_Interface.__596458846_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__596458846_Interface)

  private fun as_596458846(): ICallControl.WithDefault {
    if(pointer == NULL) {
      return(ICallControl.ABI.makeICallControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICallControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICallControl.ABI.makeICallControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CallControl> {
    public override fun getValue() = CallControl(pointer.getPointer(0))

    public fun setValue(value: CallControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CallControl, MemoryAddress> {
    public val ICallControlStatics_Instance: ICallControlStatics by lazy {
      createICallControlStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICallControlStatics(): ICallControlStatics {
      val refiid = Guid.REFIID(ICallControlStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Devices.CallControl".toHandle(),refiid,interfacePtr)
      val result = ICallControlStatics.ABI.makeICallControlStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CallControl {
      val address = segment.toRawLongValue()
      return CallControl(Pointer(address))
    }

    public override fun toNative(obj: CallControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.ICallControlStatics_Instance.GetDefault()

    public fun FromId(deviceId: String) = ABI.ICallControlStatics_Instance.FromId(deviceId)
  }
}
