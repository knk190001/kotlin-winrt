package Windows.UI.Xaml.Hosting

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

@ABIMarker(WindowsXamlManager.ABI::class)
@Signature("rc(Windows.UI.Xaml.Hosting.WindowsXamlManager;{56096c31-1aa0-5288-8818-6e74a2dcaff5})")
@WinRTByReference(brClass = WindowsXamlManager.ByReference::class)
public class WindowsXamlManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWindowsXamlManager.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1292923368_Interface: IWindowsXamlManager.WithDefault by lazy {
    as_1292923368()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1292923368_Ptr: JNAPointer? by lazy {
    __1292923368_Interface.__1292923368_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1292923368_Interface, __1260617006_Interface)

  private fun as_1292923368(): IWindowsXamlManager.WithDefault {
    if(pointer == NULL) {
      return(IWindowsXamlManager.ABI.makeIWindowsXamlManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindowsXamlManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindowsXamlManager.ABI.makeIWindowsXamlManager(ref.value))
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
      IByReference<WindowsXamlManager> {
    public override fun getValue() = WindowsXamlManager(pointer.getPointer(0))

    public fun setValue(value: WindowsXamlManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WindowsXamlManager, MemoryAddress> {
    public val IWindowsXamlManagerStatics_Instance: IWindowsXamlManagerStatics by lazy {
      createIWindowsXamlManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWindowsXamlManagerStatics(): IWindowsXamlManagerStatics {
      val refiid = Guid.REFIID(IWindowsXamlManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Hosting.WindowsXamlManager".toHandle(),refiid,interfacePtr)
      val result = IWindowsXamlManagerStatics.ABI.makeIWindowsXamlManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WindowsXamlManager {
      val address = segment.toRawLongValue()
      return WindowsXamlManager(Pointer(address))
    }

    public override fun toNative(obj: WindowsXamlManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun InitializeForCurrentThread() =
        ABI.IWindowsXamlManagerStatics_Instance.InitializeForCurrentThread()
  }
}
