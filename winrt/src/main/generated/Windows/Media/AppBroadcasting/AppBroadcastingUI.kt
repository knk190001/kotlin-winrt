package Windows.Media.AppBroadcasting

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

@ABIMarker(AppBroadcastingUI.ABI::class)
@Signature("rc(Windows.Media.AppBroadcasting.AppBroadcastingUI;{e56f9f8f-ee99-4dca-a3c3-70af3db44f5f})")
@WinRTByReference(brClass = AppBroadcastingUI.ByReference::class)
public class AppBroadcastingUI(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastingUI.WithDefault, IWinRTObject {
  private val __1149862010_Interface: IAppBroadcastingUI.WithDefault by lazy {
    as_1149862010()
  }


  public override val __1149862010_Ptr: JNAPointer? by lazy {
    __1149862010_Interface.__1149862010_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1149862010_Interface)

  private fun as_1149862010(): IAppBroadcastingUI.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastingUI.ABI.makeIAppBroadcastingUI(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastingUI>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastingUI.ABI.makeIAppBroadcastingUI(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastingUI> {
    public override fun getValue() = AppBroadcastingUI(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastingUI): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastingUI, MemoryAddress> {
    public val IAppBroadcastingUIStatics_Instance: IAppBroadcastingUIStatics by lazy {
      createIAppBroadcastingUIStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBroadcastingUIStatics(): IAppBroadcastingUIStatics {
      val refiid = Guid.REFIID(IAppBroadcastingUIStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.AppBroadcasting.AppBroadcastingUI".toHandle(),refiid,interfacePtr)
      val result = IAppBroadcastingUIStatics.ABI.makeIAppBroadcastingUIStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppBroadcastingUI {
      val address = segment.toRawLongValue()
      return AppBroadcastingUI(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastingUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IAppBroadcastingUIStatics_Instance.GetDefault()

    public fun GetForUser(user: User) = ABI.IAppBroadcastingUIStatics_Instance.GetForUser(user)
  }
}
