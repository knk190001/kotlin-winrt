package Windows.Devices.Input.Preview

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

@ABIMarker(GazeInputSourcePreview.ABI::class)
@Signature("rc(Windows.Devices.Input.Preview.GazeInputSourcePreview;{e79e7ee8-b389-11e7-b201-c8d3ffb75721})")
@WinRTByReference(brClass = GazeInputSourcePreview.ByReference::class)
public class GazeInputSourcePreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGazeInputSourcePreview.WithDefault, IWinRTObject {
  private val __576828393_Interface: IGazeInputSourcePreview.WithDefault by lazy {
    as_576828393()
  }


  public override val __576828393_Ptr: JNAPointer? by lazy {
    __576828393_Interface.__576828393_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__576828393_Interface)

  private fun as_576828393(): IGazeInputSourcePreview.WithDefault {
    if(pointer == NULL) {
      return(IGazeInputSourcePreview.ABI.makeIGazeInputSourcePreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGazeInputSourcePreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGazeInputSourcePreview.ABI.makeIGazeInputSourcePreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GazeInputSourcePreview> {
    public override fun getValue() = GazeInputSourcePreview(pointer.getPointer(0))

    public fun setValue(value: GazeInputSourcePreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GazeInputSourcePreview, MemoryAddress> {
    public val IGazeInputSourcePreviewStatics_Instance: IGazeInputSourcePreviewStatics by lazy {
      createIGazeInputSourcePreviewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGazeInputSourcePreviewStatics(): IGazeInputSourcePreviewStatics {
      val refiid = Guid.REFIID(IGazeInputSourcePreviewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Input.Preview.GazeInputSourcePreview".toHandle(),refiid,interfacePtr)
      val result =
          IGazeInputSourcePreviewStatics.ABI.makeIGazeInputSourcePreviewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GazeInputSourcePreview {
      val address = segment.toRawLongValue()
      return GazeInputSourcePreview(Pointer(address))
    }

    public override fun toNative(obj: GazeInputSourcePreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.IGazeInputSourcePreviewStatics_Instance.GetForCurrentView()

    public fun CreateWatcher() = ABI.IGazeInputSourcePreviewStatics_Instance.CreateWatcher()
  }
}
