package Windows.Media.Capture

import Windows.System.User
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

@ABIMarker(AppBroadcastPlugInManager.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastPlugInManager;{e550d979-27a1-49a7-bbf4-d7a9e9d07668})")
@WinRTByReference(brClass = AppBroadcastPlugInManager.ByReference::class)
public class AppBroadcastPlugInManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastPlugInManager.WithDefault, IWinRTObject {
  private val __1568946242_Interface: IAppBroadcastPlugInManager.WithDefault by lazy {
    as_1568946242()
  }


  public override val __1568946242_Ptr: JNAPointer? by lazy {
    __1568946242_Interface.__1568946242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1568946242_Interface)

  private fun as_1568946242(): IAppBroadcastPlugInManager.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastPlugInManager.ABI.makeIAppBroadcastPlugInManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastPlugInManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastPlugInManager.ABI.makeIAppBroadcastPlugInManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastPlugInManager> {
    public override fun getValue() = AppBroadcastPlugInManager(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastPlugInManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastPlugInManager, MemoryAddress> {
    public val IAppBroadcastPlugInManagerStatics_Instance: IAppBroadcastPlugInManagerStatics by
        lazy {
      createIAppBroadcastPlugInManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBroadcastPlugInManagerStatics(): IAppBroadcastPlugInManagerStatics {
      val refiid = Guid.REFIID(IAppBroadcastPlugInManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Capture.AppBroadcastPlugInManager".toHandle(),refiid,interfacePtr)
      val result =
          IAppBroadcastPlugInManagerStatics.ABI.makeIAppBroadcastPlugInManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppBroadcastPlugInManager {
      val address = segment.toRawLongValue()
      return AppBroadcastPlugInManager(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastPlugInManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IAppBroadcastPlugInManagerStatics_Instance.GetDefault()

    public fun GetForUser(user: User) =
        ABI.IAppBroadcastPlugInManagerStatics_Instance.GetForUser(user)
  }
}
