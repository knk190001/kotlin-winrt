package Microsoft.Graphics.Display

import Microsoft.UI.DisplayId
import Microsoft.UI.WindowId
import Windows.Foundation.IClosable
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

@ABIMarker(DisplayInformation.ABI::class)
@Signature("rc(Microsoft.Graphics.Display.DisplayInformation;{f0d58d4f-84ce-5b27-b222-4f8f7dc0aaeb})")
@WinRTByReference(brClass = DisplayInformation.ByReference::class)
public class DisplayInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayInformation.WithDefault, IDisplayInformation2.WithDefault,
    IClosable.WithDefault, IWinRTObject {
  private val __1753960620_Interface: IDisplayInformation.WithDefault by lazy {
    as_1753960620()
  }


  private val __1461795678_Interface: IDisplayInformation2.WithDefault by lazy {
    as_1461795678()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1753960620_Ptr: JNAPointer? by lazy {
    __1753960620_Interface.__1753960620_Ptr
  }


  public override val __1461795678_Ptr: JNAPointer? by lazy {
    __1461795678_Interface.__1461795678_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1753960620_Interface, __1461795678_Interface, __1260617006_Interface)

  private fun as_1753960620(): IDisplayInformation.WithDefault {
    if(pointer == NULL) {
      return(IDisplayInformation.ABI.makeIDisplayInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayInformation.ABI.makeIDisplayInformation(ref.value))
  }

  private fun as_1461795678(): IDisplayInformation2.WithDefault {
    if(pointer == NULL) {
      return(IDisplayInformation2.ABI.makeIDisplayInformation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayInformation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayInformation2.ABI.makeIDisplayInformation2(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
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
          INSTANCE.RoGetActivationFactory("Microsoft.Graphics.Display.DisplayInformation".toHandle(),refiid,interfacePtr)
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
    public fun CreateForWindowId(windowId: WindowId) =
        ABI.IDisplayInformationStatics_Instance.CreateForWindowId(windowId)

    public fun CreateForDisplayId(displayId: DisplayId) =
        ABI.IDisplayInformationStatics_Instance.CreateForDisplayId(displayId)
  }
}
