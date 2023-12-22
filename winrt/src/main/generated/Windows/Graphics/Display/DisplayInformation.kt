package Windows.Graphics.Display

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(DisplayInformation.ABI::class)
@Signature("rc(Windows.Graphics.Display.DisplayInformation;{bed112ae-adc3-4dc9-ae65-851f4d7d4799})")
@WinRTByReference(brClass = DisplayInformation.ByReference::class)
public class DisplayInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayInformation.WithDefault, IDisplayInformation2.WithDefault,
    IDisplayInformation3.WithDefault, IDisplayInformation4.WithDefault,
    IDisplayInformation5.WithDefault, IWinRTObject {
  private val __604622231_Interface: IDisplayInformation.WithDefault by lazy {
    as_604622231()
  }


  private val __1563419927_Interface: IDisplayInformation2.WithDefault by lazy {
    as_1563419927()
  }


  private val __1563419926_Interface: IDisplayInformation3.WithDefault by lazy {
    as_1563419926()
  }


  private val __1563419925_Interface: IDisplayInformation4.WithDefault by lazy {
    as_1563419925()
  }


  private val __1563419924_Interface: IDisplayInformation5.WithDefault by lazy {
    as_1563419924()
  }


  public override val __604622231_Ptr: JNAPointer? by lazy {
    __604622231_Interface.__604622231_Ptr
  }


  public override val __1563419927_Ptr: JNAPointer? by lazy {
    __1563419927_Interface.__1563419927_Ptr
  }


  public override val __1563419926_Ptr: JNAPointer? by lazy {
    __1563419926_Interface.__1563419926_Ptr
  }


  public override val __1563419925_Ptr: JNAPointer? by lazy {
    __1563419925_Interface.__1563419925_Ptr
  }


  public override val __1563419924_Ptr: JNAPointer? by lazy {
    __1563419924_Interface.__1563419924_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__604622231_Interface, __1563419927_Interface, __1563419926_Interface,
        __1563419925_Interface, __1563419924_Interface)

  private fun as_604622231(): IDisplayInformation.WithDefault {
    if(pointer == NULL) {
      return(IDisplayInformation.ABI.makeIDisplayInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayInformation.ABI.makeIDisplayInformation(ref.value))
  }

  private fun as_1563419927(): IDisplayInformation2.WithDefault {
    if(pointer == NULL) {
      return(IDisplayInformation2.ABI.makeIDisplayInformation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayInformation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayInformation2.ABI.makeIDisplayInformation2(ref.value))
  }

  private fun as_1563419926(): IDisplayInformation3.WithDefault {
    if(pointer == NULL) {
      return(IDisplayInformation3.ABI.makeIDisplayInformation3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayInformation3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayInformation3.ABI.makeIDisplayInformation3(ref.value))
  }

  private fun as_1563419925(): IDisplayInformation4.WithDefault {
    if(pointer == NULL) {
      return(IDisplayInformation4.ABI.makeIDisplayInformation4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayInformation4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayInformation4.ABI.makeIDisplayInformation4(ref.value))
  }

  private fun as_1563419924(): IDisplayInformation5.WithDefault {
    if(pointer == NULL) {
      return(IDisplayInformation5.ABI.makeIDisplayInformation5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayInformation5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayInformation5.ABI.makeIDisplayInformation5(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayInformation> {
    public override fun getValue() = DisplayInformation(pointer.getPointer(0))

    public fun setValue(value: DisplayInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayInformation, MemoryAddress> {
    public val IDisplayInformationStatics_Instance: IDisplayInformationStatics by lazy {
      createIDisplayInformationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDisplayInformationStatics(): IDisplayInformationStatics {
      val refiid = Guid.REFIID(IDisplayInformationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Display.DisplayInformation".toHandle(),refiid,interfacePtr)
      val result = IDisplayInformationStatics.ABI.makeIDisplayInformationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DisplayInformation {
      val address = segment.toRawLongValue()
      return DisplayInformation(Pointer(address))
    }

    public override fun toNative(obj: DisplayInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.IDisplayInformationStatics_Instance.GetForCurrentView()

    public fun get_AutoRotationPreferences() =
        ABI.IDisplayInformationStatics_Instance.get_AutoRotationPreferences()

    public fun put_AutoRotationPreferences(value: DisplayOrientations) =
        ABI.IDisplayInformationStatics_Instance.put_AutoRotationPreferences(value)

    public fun add_DisplayContentsInvalidated(handler: TypedEventHandler<DisplayInformation?,
        IUnknown?>) =
        ABI.IDisplayInformationStatics_Instance.add_DisplayContentsInvalidated(handler)

    public fun remove_DisplayContentsInvalidated(token: EventRegistrationToken) =
        ABI.IDisplayInformationStatics_Instance.remove_DisplayContentsInvalidated(token)
  }
}
