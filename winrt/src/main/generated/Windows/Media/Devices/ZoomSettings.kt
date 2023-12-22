package Windows.Media.Devices

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

@ABIMarker(ZoomSettings.ABI::class)
@Signature("rc(Windows.Media.Devices.ZoomSettings;{6ad66b24-14b4-4bfd-b18f-88fe24463b52})")
@WinRTByReference(brClass = ZoomSettings.ByReference::class)
public class ZoomSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IZoomSettings.WithDefault, IWinRTObject {
  private val __201345207_Interface: IZoomSettings.WithDefault by lazy {
    as_201345207()
  }


  public override val __201345207_Ptr: JNAPointer? by lazy {
    __201345207_Interface.__201345207_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__201345207_Interface)

  public constructor() : this(ABI.activate())

  private fun as_201345207(): IZoomSettings.WithDefault {
    if(pointer == NULL) {
      return(IZoomSettings.ABI.makeIZoomSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IZoomSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IZoomSettings.ABI.makeIZoomSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ZoomSettings> {
    public override fun getValue() = ZoomSettings(pointer.getPointer(0))

    public fun setValue(value: ZoomSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ZoomSettings, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Devices.ZoomSettings".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ZoomSettings {
      val address = segment.toRawLongValue()
      return ZoomSettings(Pointer(address))
    }

    public override fun toNative(obj: ZoomSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
