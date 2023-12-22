package Windows.Media.Control

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

@ABIMarker(GlobalSystemMediaTransportControlsSessionManager.ABI::class)
@Signature("rc(Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager;{cace8eac-e86e-504a-ab31-5ff8ff1bce49})")
@WinRTByReference(brClass = GlobalSystemMediaTransportControlsSessionManager.ByReference::class)
public class GlobalSystemMediaTransportControlsSessionManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGlobalSystemMediaTransportControlsSessionManager.WithDefault, IWinRTObject {
  private val __1612675067_Interface: IGlobalSystemMediaTransportControlsSessionManager.WithDefault
      by lazy {
    as_1612675067()
  }


  public override val __1612675067_Ptr: JNAPointer? by lazy {
    __1612675067_Interface.__1612675067_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1612675067_Interface)

  private fun as_1612675067(): IGlobalSystemMediaTransportControlsSessionManager.WithDefault {
    if(pointer == NULL) {
      return(IGlobalSystemMediaTransportControlsSessionManager.ABI.makeIGlobalSystemMediaTransportControlsSessionManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGlobalSystemMediaTransportControlsSessionManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGlobalSystemMediaTransportControlsSessionManager.ABI.makeIGlobalSystemMediaTransportControlsSessionManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GlobalSystemMediaTransportControlsSessionManager> {
    public override fun getValue() =
        GlobalSystemMediaTransportControlsSessionManager(pointer.getPointer(0))

    public fun setValue(value: GlobalSystemMediaTransportControlsSessionManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GlobalSystemMediaTransportControlsSessionManager, MemoryAddress> {
    public val IGlobalSystemMediaTransportControlsSessionManagerStatics_Instance:
        IGlobalSystemMediaTransportControlsSessionManagerStatics by lazy {
      createIGlobalSystemMediaTransportControlsSessionManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGlobalSystemMediaTransportControlsSessionManagerStatics():
        IGlobalSystemMediaTransportControlsSessionManagerStatics {
      val refiid = Guid.REFIID(IGlobalSystemMediaTransportControlsSessionManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager".toHandle(),refiid,interfacePtr)
      val result =
          IGlobalSystemMediaTransportControlsSessionManagerStatics.ABI.makeIGlobalSystemMediaTransportControlsSessionManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        GlobalSystemMediaTransportControlsSessionManager {
      val address = segment.toRawLongValue()
      return GlobalSystemMediaTransportControlsSessionManager(Pointer(address))
    }

    public override fun toNative(obj: GlobalSystemMediaTransportControlsSessionManager):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestAsync() =
        ABI.IGlobalSystemMediaTransportControlsSessionManagerStatics_Instance.RequestAsync()
  }
}
