package Windows.UI.WindowManagement

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

@ABIMarker(WindowingEnvironment.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.WindowingEnvironment;{264363c0-2a49-5417-b3ae-48a71c63a3bd})")
@WinRTByReference(brClass = WindowingEnvironment.ByReference::class)
public class WindowingEnvironment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWindowingEnvironment.WithDefault, IWinRTObject {
  private val __1309788008_Interface: IWindowingEnvironment.WithDefault by lazy {
    as_1309788008()
  }


  public override val __1309788008_Ptr: JNAPointer? by lazy {
    __1309788008_Interface.__1309788008_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1309788008_Interface)

  private fun as_1309788008(): IWindowingEnvironment.WithDefault {
    if(pointer == NULL) {
      return(IWindowingEnvironment.ABI.makeIWindowingEnvironment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindowingEnvironment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindowingEnvironment.ABI.makeIWindowingEnvironment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WindowingEnvironment> {
    public override fun getValue() = WindowingEnvironment(pointer.getPointer(0))

    public fun setValue(value: WindowingEnvironment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WindowingEnvironment, MemoryAddress> {
    public val IWindowingEnvironmentStatics_Instance: IWindowingEnvironmentStatics by lazy {
      createIWindowingEnvironmentStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWindowingEnvironmentStatics(): IWindowingEnvironmentStatics {
      val refiid = Guid.REFIID(IWindowingEnvironmentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WindowManagement.WindowingEnvironment".toHandle(),refiid,interfacePtr)
      val result =
          IWindowingEnvironmentStatics.ABI.makeIWindowingEnvironmentStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WindowingEnvironment {
      val address = segment.toRawLongValue()
      return WindowingEnvironment(Pointer(address))
    }

    public override fun toNative(obj: WindowingEnvironment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindAll() = ABI.IWindowingEnvironmentStatics_Instance.FindAll()

    public fun FindAll(kind: WindowingEnvironmentKind) =
        ABI.IWindowingEnvironmentStatics_Instance.FindAll(kind)
  }
}
