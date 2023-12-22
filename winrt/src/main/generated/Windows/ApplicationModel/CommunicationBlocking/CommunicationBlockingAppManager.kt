package Windows.ApplicationModel.CommunicationBlocking

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(CommunicationBlockingAppManager.ABI::class)
@WinRTByReference(brClass = CommunicationBlockingAppManager.ByReference::class)
public class CommunicationBlockingAppManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CommunicationBlockingAppManager> {
    public override fun getValue() = CommunicationBlockingAppManager(pointer.getPointer(0))

    public fun setValue(value: CommunicationBlockingAppManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CommunicationBlockingAppManager, MemoryAddress> {
    public val ICommunicationBlockingAppManagerStatics2_Instance:
        ICommunicationBlockingAppManagerStatics2 by lazy {
      createICommunicationBlockingAppManagerStatics2()
    }


    public val ICommunicationBlockingAppManagerStatics_Instance:
        ICommunicationBlockingAppManagerStatics by lazy {
      createICommunicationBlockingAppManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICommunicationBlockingAppManagerStatics2():
        ICommunicationBlockingAppManagerStatics2 {
      val refiid = Guid.REFIID(ICommunicationBlockingAppManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.CommunicationBlocking.CommunicationBlockingAppManager".toHandle(),refiid,interfacePtr)
      val result =
          ICommunicationBlockingAppManagerStatics2.ABI.makeICommunicationBlockingAppManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createICommunicationBlockingAppManagerStatics():
        ICommunicationBlockingAppManagerStatics {
      val refiid = Guid.REFIID(ICommunicationBlockingAppManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.CommunicationBlocking.CommunicationBlockingAppManager".toHandle(),refiid,interfacePtr)
      val result =
          ICommunicationBlockingAppManagerStatics.ABI.makeICommunicationBlockingAppManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CommunicationBlockingAppManager {
      val address = segment.toRawLongValue()
      return CommunicationBlockingAppManager(Pointer(address))
    }

    public override fun toNative(obj: CommunicationBlockingAppManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestSetAsActiveBlockingAppAsync() =
        ABI.ICommunicationBlockingAppManagerStatics2_Instance.RequestSetAsActiveBlockingAppAsync()

    public fun get_IsCurrentAppActiveBlockingApp() =
        ABI.ICommunicationBlockingAppManagerStatics_Instance.get_IsCurrentAppActiveBlockingApp()

    public fun ShowCommunicationBlockingSettingsUI() =
        ABI.ICommunicationBlockingAppManagerStatics_Instance.ShowCommunicationBlockingSettingsUI()
  }
}
