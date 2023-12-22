package Microsoft.Windows.AppLifecycle

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppInstance.ABI::class)
@Signature("rc(Microsoft.Windows.AppLifecycle.AppInstance;{75766ae4-0239-5a26-b9da-d5bfc75a4866})")
@WinRTByReference(brClass = AppInstance.ByReference::class)
public class AppInstance(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppInstance.WithDefault, IWinRTObject {
  private val __545275137_Interface: IAppInstance.WithDefault by lazy {
    as_545275137()
  }


  public override val __545275137_Ptr: JNAPointer? by lazy {
    __545275137_Interface.__545275137_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__545275137_Interface)

  private fun as_545275137(): IAppInstance.WithDefault {
    if(pointer == NULL) {
      return(IAppInstance.ABI.makeIAppInstance(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstance>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstance.ABI.makeIAppInstance(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AppInstance> {
    public override fun getValue() = AppInstance(pointer.getPointer(0))

    public fun setValue(value: AppInstance): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppInstance, MemoryAddress> {
    public val IAppInstanceStatics_Instance: IAppInstanceStatics by lazy {
      createIAppInstanceStatics()
    }


    public val IAppInstanceStatics2_Instance: IAppInstanceStatics2 by lazy {
      createIAppInstanceStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppInstanceStatics(): IAppInstanceStatics {
      val refiid = Guid.REFIID(IAppInstanceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.AppLifecycle.AppInstance".toHandle(),refiid,interfacePtr)
      val result = IAppInstanceStatics.ABI.makeIAppInstanceStatics(interfacePtr.value)
      return result
    }

    public fun createIAppInstanceStatics2(): IAppInstanceStatics2 {
      val refiid = Guid.REFIID(IAppInstanceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.AppLifecycle.AppInstance".toHandle(),refiid,interfacePtr)
      val result = IAppInstanceStatics2.ABI.makeIAppInstanceStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppInstance {
      val address = segment.toRawLongValue()
      return AppInstance(Pointer(address))
    }

    public override fun toNative(obj: AppInstance): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetCurrent() = ABI.IAppInstanceStatics_Instance.GetCurrent()

    public fun GetInstances() = ABI.IAppInstanceStatics_Instance.GetInstances()

    public fun FindOrRegisterForKey(key: String) =
        ABI.IAppInstanceStatics_Instance.FindOrRegisterForKey(key)

    public fun Restart(arguments: String) = ABI.IAppInstanceStatics2_Instance.Restart(arguments)
  }
}
