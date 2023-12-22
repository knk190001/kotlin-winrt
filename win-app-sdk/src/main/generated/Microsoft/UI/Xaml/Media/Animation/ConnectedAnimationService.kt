package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(ConnectedAnimationService.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.ConnectedAnimationService;{85f72163-c3c8-586a-91fe-3e0315a3a4fc})")
@WinRTByReference(brClass = ConnectedAnimationService.ByReference::class)
public class ConnectedAnimationService(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConnectedAnimationService.WithDefault, IWinRTObject {
  private val __684851681_Interface: IConnectedAnimationService.WithDefault by lazy {
    as_684851681()
  }


  public override val __684851681_Ptr: JNAPointer? by lazy {
    __684851681_Interface.__684851681_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__684851681_Interface)

  private fun as_684851681(): IConnectedAnimationService.WithDefault {
    if(pointer == NULL) {
      return(IConnectedAnimationService.ABI.makeIConnectedAnimationService(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectedAnimationService>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectedAnimationService.ABI.makeIConnectedAnimationService(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConnectedAnimationService> {
    public override fun getValue() = ConnectedAnimationService(pointer.getPointer(0))

    public fun setValue(value: ConnectedAnimationService): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConnectedAnimationService, MemoryAddress> {
    public val IConnectedAnimationServiceStatics_Instance: IConnectedAnimationServiceStatics by
        lazy {
      createIConnectedAnimationServiceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIConnectedAnimationServiceStatics(): IConnectedAnimationServiceStatics {
      val refiid = Guid.REFIID(IConnectedAnimationServiceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.ConnectedAnimationService".toHandle(),refiid,interfacePtr)
      val result =
          IConnectedAnimationServiceStatics.ABI.makeIConnectedAnimationServiceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ConnectedAnimationService {
      val address = segment.toRawLongValue()
      return ConnectedAnimationService(Pointer(address))
    }

    public override fun toNative(obj: ConnectedAnimationService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() =
        ABI.IConnectedAnimationServiceStatics_Instance.GetForCurrentView()
  }
}
