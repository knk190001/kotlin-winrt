package Windows.Devices.Input

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

@ABIMarker(PenButtonListener.ABI::class)
@Signature("rc(Windows.Devices.Input.PenButtonListener;{8245c376-1ee3-53f7-b1f7-8334a16f2815})")
@WinRTByReference(brClass = PenButtonListener.ByReference::class)
public class PenButtonListener(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPenButtonListener.WithDefault, IWinRTObject {
  private val __743794268_Interface: IPenButtonListener.WithDefault by lazy {
    as_743794268()
  }


  public override val __743794268_Ptr: JNAPointer? by lazy {
    __743794268_Interface.__743794268_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__743794268_Interface)

  private fun as_743794268(): IPenButtonListener.WithDefault {
    if(pointer == NULL) {
      return(IPenButtonListener.ABI.makeIPenButtonListener(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPenButtonListener>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPenButtonListener.ABI.makeIPenButtonListener(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PenButtonListener> {
    public override fun getValue() = PenButtonListener(pointer.getPointer(0))

    public fun setValue(value: PenButtonListener): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PenButtonListener, MemoryAddress> {
    public val IPenButtonListenerStatics_Instance: IPenButtonListenerStatics by lazy {
      createIPenButtonListenerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPenButtonListenerStatics(): IPenButtonListenerStatics {
      val refiid = Guid.REFIID(IPenButtonListenerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Input.PenButtonListener".toHandle(),refiid,interfacePtr)
      val result = IPenButtonListenerStatics.ABI.makeIPenButtonListenerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PenButtonListener {
      val address = segment.toRawLongValue()
      return PenButtonListener(Pointer(address))
    }

    public override fun toNative(obj: PenButtonListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IPenButtonListenerStatics_Instance.GetDefault()
  }
}
