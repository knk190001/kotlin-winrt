package Windows.ApplicationModel

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
@Signature("rc(Windows.ApplicationModel.AppInstance;{675f2b47-f25f-4532-9fd6-3633e0634d01})")
@WinRTByReference(brClass = AppInstance.ByReference::class)
public class AppInstance(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppInstance.WithDefault, IWinRTObject {
  private val __1851251759_Interface: IAppInstance.WithDefault by lazy {
    as_1851251759()
  }


  public override val __1851251759_Ptr: JNAPointer? by lazy {
    __1851251759_Interface.__1851251759_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1851251759_Interface)

  private fun as_1851251759(): IAppInstance.WithDefault {
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


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppInstanceStatics(): IAppInstanceStatics {
      val refiid = Guid.REFIID(IAppInstanceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.AppInstance".toHandle(),refiid,interfacePtr)
      val result = IAppInstanceStatics.ABI.makeIAppInstanceStatics(interfacePtr.value)
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
    public fun get_RecommendedInstance() =
        ABI.IAppInstanceStatics_Instance.get_RecommendedInstance()

    public fun GetActivatedEventArgs() = ABI.IAppInstanceStatics_Instance.GetActivatedEventArgs()

    public fun FindOrRegisterInstanceForKey(key: String) =
        ABI.IAppInstanceStatics_Instance.FindOrRegisterInstanceForKey(key)

    public fun Unregister() = ABI.IAppInstanceStatics_Instance.Unregister()

    public fun GetInstances() = ABI.IAppInstanceStatics_Instance.GetInstances()
  }
}
