package Windows.Devices.AllJoyn

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

@ABIMarker(AllJoynSession.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynSession;{e8d11b0c-c0d4-406c-88a9-a93efa85d4b1})")
@WinRTByReference(brClass = AllJoynSession.ByReference::class)
public class AllJoynSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynSession.WithDefault, IWinRTObject {
  private val __521470459_Interface: IAllJoynSession.WithDefault by lazy {
    as_521470459()
  }


  public override val __521470459_Ptr: JNAPointer? by lazy {
    __521470459_Interface.__521470459_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__521470459_Interface)

  private fun as_521470459(): IAllJoynSession.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynSession.ABI.makeIAllJoynSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynSession.ABI.makeIAllJoynSession(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AllJoynSession>
      {
    public override fun getValue() = AllJoynSession(pointer.getPointer(0))

    public fun setValue(value: AllJoynSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynSession, MemoryAddress> {
    public val IAllJoynSessionStatics_Instance: IAllJoynSessionStatics by lazy {
      createIAllJoynSessionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAllJoynSessionStatics(): IAllJoynSessionStatics {
      val refiid = Guid.REFIID(IAllJoynSessionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynSession".toHandle(),refiid,interfacePtr)
      val result = IAllJoynSessionStatics.ABI.makeIAllJoynSessionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AllJoynSession {
      val address = segment.toRawLongValue()
      return AllJoynSession(Pointer(address))
    }

    public override fun toNative(obj: AllJoynSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetFromServiceInfoAsync(serviceInfo: AllJoynServiceInfo) =
        ABI.IAllJoynSessionStatics_Instance.GetFromServiceInfoAsync(serviceInfo)

    public fun GetFromServiceInfoAsync(serviceInfo: AllJoynServiceInfo,
        busAttachment: AllJoynBusAttachment) =
        ABI.IAllJoynSessionStatics_Instance.GetFromServiceInfoAsync(serviceInfo, busAttachment)
  }
}
