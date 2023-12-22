package Windows.Media

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

@ABIMarker(SystemMediaTransportControls.ABI::class)
@Signature("rc(Windows.Media.SystemMediaTransportControls;{99fa3ff4-1742-42a6-902e-087d41f965ec})")
@WinRTByReference(brClass = SystemMediaTransportControls.ByReference::class)
public class SystemMediaTransportControls(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemMediaTransportControls.WithDefault,
    ISystemMediaTransportControls2.WithDefault, IWinRTObject {
  private val __1633449574_Interface: ISystemMediaTransportControls.WithDefault by lazy {
    as_1633449574()
  }


  private val __902670808_Interface: ISystemMediaTransportControls2.WithDefault by lazy {
    as_902670808()
  }


  public override val __1633449574_Ptr: JNAPointer? by lazy {
    __1633449574_Interface.__1633449574_Ptr
  }


  public override val __902670808_Ptr: JNAPointer? by lazy {
    __902670808_Interface.__902670808_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1633449574_Interface, __902670808_Interface)

  private fun as_1633449574(): ISystemMediaTransportControls.WithDefault {
    if(pointer == NULL) {
      return(ISystemMediaTransportControls.ABI.makeISystemMediaTransportControls(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemMediaTransportControls>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemMediaTransportControls.ABI.makeISystemMediaTransportControls(ref.value))
  }

  private fun as_902670808(): ISystemMediaTransportControls2.WithDefault {
    if(pointer == NULL) {
      return(ISystemMediaTransportControls2.ABI.makeISystemMediaTransportControls2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemMediaTransportControls2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemMediaTransportControls2.ABI.makeISystemMediaTransportControls2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemMediaTransportControls> {
    public override fun getValue() = SystemMediaTransportControls(pointer.getPointer(0))

    public fun setValue(value: SystemMediaTransportControls): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemMediaTransportControls, MemoryAddress> {
    public val ISystemMediaTransportControlsStatics_Instance: ISystemMediaTransportControlsStatics
        by lazy {
      createISystemMediaTransportControlsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISystemMediaTransportControlsStatics(): ISystemMediaTransportControlsStatics {
      val refiid = Guid.REFIID(ISystemMediaTransportControlsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.SystemMediaTransportControls".toHandle(),refiid,interfacePtr)
      val result =
          ISystemMediaTransportControlsStatics.ABI.makeISystemMediaTransportControlsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SystemMediaTransportControls {
      val address = segment.toRawLongValue()
      return SystemMediaTransportControls(Pointer(address))
    }

    public override fun toNative(obj: SystemMediaTransportControls): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() =
        ABI.ISystemMediaTransportControlsStatics_Instance.GetForCurrentView()
  }
}
