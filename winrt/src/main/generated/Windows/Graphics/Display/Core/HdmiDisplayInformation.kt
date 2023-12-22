package Windows.Graphics.Display.Core

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

@ABIMarker(HdmiDisplayInformation.ABI::class)
@Signature("rc(Windows.Graphics.Display.Core.HdmiDisplayInformation;{130b3c0a-f565-476e-abd5-ea05aee74c69})")
@WinRTByReference(brClass = HdmiDisplayInformation.ByReference::class)
public class HdmiDisplayInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHdmiDisplayInformation.WithDefault, IWinRTObject {
  private val __767594904_Interface: IHdmiDisplayInformation.WithDefault by lazy {
    as_767594904()
  }


  public override val __767594904_Ptr: JNAPointer? by lazy {
    __767594904_Interface.__767594904_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__767594904_Interface)

  private fun as_767594904(): IHdmiDisplayInformation.WithDefault {
    if(pointer == NULL) {
      return(IHdmiDisplayInformation.ABI.makeIHdmiDisplayInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHdmiDisplayInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHdmiDisplayInformation.ABI.makeIHdmiDisplayInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HdmiDisplayInformation> {
    public override fun getValue() = HdmiDisplayInformation(pointer.getPointer(0))

    public fun setValue(value: HdmiDisplayInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HdmiDisplayInformation, MemoryAddress> {
    public val IHdmiDisplayInformationStatics_Instance: IHdmiDisplayInformationStatics by lazy {
      createIHdmiDisplayInformationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHdmiDisplayInformationStatics(): IHdmiDisplayInformationStatics {
      val refiid = Guid.REFIID(IHdmiDisplayInformationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Display.Core.HdmiDisplayInformation".toHandle(),refiid,interfacePtr)
      val result =
          IHdmiDisplayInformationStatics.ABI.makeIHdmiDisplayInformationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HdmiDisplayInformation {
      val address = segment.toRawLongValue()
      return HdmiDisplayInformation(Pointer(address))
    }

    public override fun toNative(obj: HdmiDisplayInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.IHdmiDisplayInformationStatics_Instance.GetForCurrentView()
  }
}
