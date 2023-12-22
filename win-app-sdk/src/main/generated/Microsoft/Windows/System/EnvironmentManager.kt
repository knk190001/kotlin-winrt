package Microsoft.Windows.System

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

@ABIMarker(EnvironmentManager.ABI::class)
@Signature("rc(Microsoft.Windows.System.EnvironmentManager;{d1b239bb-7013-5176-b02a-63477410d986})")
@WinRTByReference(brClass = EnvironmentManager.ByReference::class)
public class EnvironmentManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEnvironmentManager.WithDefault, IEnvironmentManager2.WithDefault,
    IWinRTObject {
  private val __1374343511_Interface: IEnvironmentManager.WithDefault by lazy {
    as_1374343511()
  }


  private val __345024169_Interface: IEnvironmentManager2.WithDefault by lazy {
    as_345024169()
  }


  public override val __1374343511_Ptr: JNAPointer? by lazy {
    __1374343511_Interface.__1374343511_Ptr
  }


  public override val __345024169_Ptr: JNAPointer? by lazy {
    __345024169_Interface.__345024169_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1374343511_Interface, __345024169_Interface)

  private fun as_1374343511(): IEnvironmentManager.WithDefault {
    if(pointer == NULL) {
      return(IEnvironmentManager.ABI.makeIEnvironmentManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEnvironmentManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEnvironmentManager.ABI.makeIEnvironmentManager(ref.value))
  }

  private fun as_345024169(): IEnvironmentManager2.WithDefault {
    if(pointer == NULL) {
      return(IEnvironmentManager2.ABI.makeIEnvironmentManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEnvironmentManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEnvironmentManager2.ABI.makeIEnvironmentManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EnvironmentManager> {
    public override fun getValue() = EnvironmentManager(pointer.getPointer(0))

    public fun setValue(value: EnvironmentManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EnvironmentManager, MemoryAddress> {
    public val IEnvironmentManagerStatics_Instance: IEnvironmentManagerStatics by lazy {
      createIEnvironmentManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIEnvironmentManagerStatics(): IEnvironmentManagerStatics {
      val refiid = Guid.REFIID(IEnvironmentManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.System.EnvironmentManager".toHandle(),refiid,interfacePtr)
      val result = IEnvironmentManagerStatics.ABI.makeIEnvironmentManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): EnvironmentManager {
      val address = segment.toRawLongValue()
      return EnvironmentManager(Pointer(address))
    }

    public override fun toNative(obj: EnvironmentManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForProcess() = ABI.IEnvironmentManagerStatics_Instance.GetForProcess()

    public fun GetForUser() = ABI.IEnvironmentManagerStatics_Instance.GetForUser()

    public fun GetForMachine() = ABI.IEnvironmentManagerStatics_Instance.GetForMachine()

    public fun get_IsSupported() = ABI.IEnvironmentManagerStatics_Instance.get_IsSupported()
  }
}
