package Windows.UI.ViewManagement

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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ApplicationViewScaling.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.ApplicationViewScaling;{1d0ddc23-23f3-4b2d-84fe-74bf37b48b66})")
@WinRTByReference(brClass = ApplicationViewScaling.ByReference::class)
public class ApplicationViewScaling(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IApplicationViewScaling.WithDefault, IWinRTObject {
  private val __749464260_Interface: IApplicationViewScaling.WithDefault by lazy {
    as_749464260()
  }


  public override val __749464260_Ptr: JNAPointer? by lazy {
    __749464260_Interface.__749464260_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__749464260_Interface)

  private fun as_749464260(): IApplicationViewScaling.WithDefault {
    if(pointer == NULL) {
      return(IApplicationViewScaling.ABI.makeIApplicationViewScaling(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationViewScaling>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationViewScaling.ABI.makeIApplicationViewScaling(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ApplicationViewScaling> {
    public override fun getValue() = ApplicationViewScaling(pointer.getPointer(0))

    public fun setValue(value: ApplicationViewScaling): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ApplicationViewScaling, MemoryAddress> {
    public val IApplicationViewScalingStatics_Instance: IApplicationViewScalingStatics by lazy {
      createIApplicationViewScalingStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIApplicationViewScalingStatics(): IApplicationViewScalingStatics {
      val refiid = Guid.REFIID(IApplicationViewScalingStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ApplicationViewScaling".toHandle(),refiid,interfacePtr)
      val result =
          IApplicationViewScalingStatics.ABI.makeIApplicationViewScalingStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ApplicationViewScaling {
      val address = segment.toRawLongValue()
      return ApplicationViewScaling(Pointer(address))
    }

    public override fun toNative(obj: ApplicationViewScaling): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DisableLayoutScaling() =
        ABI.IApplicationViewScalingStatics_Instance.get_DisableLayoutScaling()

    public fun TrySetDisableLayoutScaling(disableLayoutScaling: Boolean) =
        ABI.IApplicationViewScalingStatics_Instance.TrySetDisableLayoutScaling(disableLayoutScaling)
  }
}
