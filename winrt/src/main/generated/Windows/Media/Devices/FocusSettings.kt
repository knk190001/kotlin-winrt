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

@ABIMarker(FocusSettings.ABI::class)
@Signature("rc(Windows.Media.Devices.FocusSettings;{79958f6b-3263-4275-85d6-aeae891c96ee})")
@WinRTByReference(brClass = FocusSettings.ByReference::class)
public class FocusSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFocusSettings.WithDefault, IWinRTObject {
  private val __1691121254_Interface: IFocusSettings.WithDefault by lazy {
    as_1691121254()
  }


  public override val __1691121254_Ptr: JNAPointer? by lazy {
    __1691121254_Interface.__1691121254_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1691121254_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1691121254(): IFocusSettings.WithDefault {
    if(pointer == NULL) {
      return(IFocusSettings.ABI.makeIFocusSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFocusSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFocusSettings.ABI.makeIFocusSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FocusSettings>
      {
    public override fun getValue() = FocusSettings(pointer.getPointer(0))

    public fun setValue(value: FocusSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FocusSettings, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Devices.FocusSettings".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): FocusSettings {
      val address = segment.toRawLongValue()
      return FocusSettings(Pointer(address))
    }

    public override fun toNative(obj: FocusSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
