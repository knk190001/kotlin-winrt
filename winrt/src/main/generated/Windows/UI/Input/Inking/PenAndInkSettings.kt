package Windows.UI.Input.Inking

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

@ABIMarker(PenAndInkSettings.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.PenAndInkSettings;{bc2ceb8f-0066-44a8-bb7a-b839b3deb8f5})")
@WinRTByReference(brClass = PenAndInkSettings.ByReference::class)
public class PenAndInkSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPenAndInkSettings.WithDefault, IPenAndInkSettings2.WithDefault, IWinRTObject
    {
  private val __103958799_Interface: IPenAndInkSettings.WithDefault by lazy {
    as_103958799()
  }


  private val __1072244577_Interface: IPenAndInkSettings2.WithDefault by lazy {
    as_1072244577()
  }


  public override val __103958799_Ptr: JNAPointer? by lazy {
    __103958799_Interface.__103958799_Ptr
  }


  public override val __1072244577_Ptr: JNAPointer? by lazy {
    __1072244577_Interface.__1072244577_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__103958799_Interface, __1072244577_Interface)

  private fun as_103958799(): IPenAndInkSettings.WithDefault {
    if(pointer == NULL) {
      return(IPenAndInkSettings.ABI.makeIPenAndInkSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPenAndInkSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPenAndInkSettings.ABI.makeIPenAndInkSettings(ref.value))
  }

  private fun as_1072244577(): IPenAndInkSettings2.WithDefault {
    if(pointer == NULL) {
      return(IPenAndInkSettings2.ABI.makeIPenAndInkSettings2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPenAndInkSettings2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPenAndInkSettings2.ABI.makeIPenAndInkSettings2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PenAndInkSettings> {
    public override fun getValue() = PenAndInkSettings(pointer.getPointer(0))

    public fun setValue(value: PenAndInkSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PenAndInkSettings, MemoryAddress> {
    public val IPenAndInkSettingsStatics_Instance: IPenAndInkSettingsStatics by lazy {
      createIPenAndInkSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPenAndInkSettingsStatics(): IPenAndInkSettingsStatics {
      val refiid = Guid.REFIID(IPenAndInkSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.PenAndInkSettings".toHandle(),refiid,interfacePtr)
      val result = IPenAndInkSettingsStatics.ABI.makeIPenAndInkSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PenAndInkSettings {
      val address = segment.toRawLongValue()
      return PenAndInkSettings(Pointer(address))
    }

    public override fun toNative(obj: PenAndInkSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IPenAndInkSettingsStatics_Instance.GetDefault()
  }
}
