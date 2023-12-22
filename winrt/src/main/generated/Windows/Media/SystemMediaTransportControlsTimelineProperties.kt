package Windows.Media

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(SystemMediaTransportControlsTimelineProperties.ABI::class)
@Signature("rc(Windows.Media.SystemMediaTransportControlsTimelineProperties;{5125316a-c3a2-475b-8507-93534dc88f15})")
@WinRTByReference(brClass = SystemMediaTransportControlsTimelineProperties.ByReference::class)
public class SystemMediaTransportControlsTimelineProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemMediaTransportControlsTimelineProperties.WithDefault, IWinRTObject {
  private val __1067027570_Interface: ISystemMediaTransportControlsTimelineProperties.WithDefault by
      lazy {
    as_1067027570()
  }


  public override val __1067027570_Ptr: JNAPointer? by lazy {
    __1067027570_Interface.__1067027570_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1067027570_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1067027570(): ISystemMediaTransportControlsTimelineProperties.WithDefault {
    if(pointer == NULL) {
      return(ISystemMediaTransportControlsTimelineProperties.ABI.makeISystemMediaTransportControlsTimelineProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemMediaTransportControlsTimelineProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemMediaTransportControlsTimelineProperties.ABI.makeISystemMediaTransportControlsTimelineProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemMediaTransportControlsTimelineProperties> {
    public override fun getValue() =
        SystemMediaTransportControlsTimelineProperties(pointer.getPointer(0))

    public fun setValue(value: SystemMediaTransportControlsTimelineProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemMediaTransportControlsTimelineProperties, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.SystemMediaTransportControlsTimelineProperties".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress):
        SystemMediaTransportControlsTimelineProperties {
      val address = segment.toRawLongValue()
      return SystemMediaTransportControlsTimelineProperties(Pointer(address))
    }

    public override fun toNative(obj: SystemMediaTransportControlsTimelineProperties): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
