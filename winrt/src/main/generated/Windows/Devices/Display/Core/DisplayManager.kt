package Windows.Devices.Display.Core

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

@ABIMarker(DisplayManager.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayManager;{4ed9245b-15ec-56e2-9072-7fe5084a31a7})")
@WinRTByReference(brClass = DisplayManager.ByReference::class)
public class DisplayManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayManager.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1682026637_Interface: IDisplayManager.WithDefault by lazy {
    as_1682026637()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1682026637_Ptr: JNAPointer? by lazy {
    __1682026637_Interface.__1682026637_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1682026637_Interface, __1260617006_Interface)

  private fun as_1682026637(): IDisplayManager.WithDefault {
    if(pointer == NULL) {
      return(IDisplayManager.ABI.makeIDisplayManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayManager.ABI.makeIDisplayManager(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DisplayManager>
      {
    public override fun getValue() = DisplayManager(pointer.getPointer(0))

    public fun setValue(value: DisplayManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayManager, MemoryAddress> {
    public val IDisplayManagerStatics_Instance: IDisplayManagerStatics by lazy {
      createIDisplayManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDisplayManagerStatics(): IDisplayManagerStatics {
      val refiid = Guid.REFIID(IDisplayManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Display.Core.DisplayManager".toHandle(),refiid,interfacePtr)
      val result = IDisplayManagerStatics.ABI.makeIDisplayManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DisplayManager {
      val address = segment.toRawLongValue()
      return DisplayManager(Pointer(address))
    }

    public override fun toNative(obj: DisplayManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(options: DisplayManagerOptions) =
        ABI.IDisplayManagerStatics_Instance.Create(options)
  }
}
