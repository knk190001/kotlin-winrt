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

@ABIMarker(PenDockListener.ABI::class)
@Signature("rc(Windows.Devices.Input.PenDockListener;{759f4d90-1dc0-55cb-ad18-b9101456f592})")
@WinRTByReference(brClass = PenDockListener.ByReference::class)
public class PenDockListener(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPenDockListener.WithDefault, IWinRTObject {
  private val __509652187_Interface: IPenDockListener.WithDefault by lazy {
    as_509652187()
  }


  public override val __509652187_Ptr: JNAPointer? by lazy {
    __509652187_Interface.__509652187_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__509652187_Interface)

  private fun as_509652187(): IPenDockListener.WithDefault {
    if(pointer == NULL) {
      return(IPenDockListener.ABI.makeIPenDockListener(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPenDockListener>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPenDockListener.ABI.makeIPenDockListener(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PenDockListener> {
    public override fun getValue() = PenDockListener(pointer.getPointer(0))

    public fun setValue(value: PenDockListener): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PenDockListener, MemoryAddress> {
    public val IPenDockListenerStatics_Instance: IPenDockListenerStatics by lazy {
      createIPenDockListenerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPenDockListenerStatics(): IPenDockListenerStatics {
      val refiid = Guid.REFIID(IPenDockListenerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Input.PenDockListener".toHandle(),refiid,interfacePtr)
      val result = IPenDockListenerStatics.ABI.makeIPenDockListenerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PenDockListener {
      val address = segment.toRawLongValue()
      return PenDockListener(Pointer(address))
    }

    public override fun toNative(obj: PenDockListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IPenDockListenerStatics_Instance.GetDefault()
  }
}
