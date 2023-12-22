package Microsoft.Windows.AppNotifications

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppNotificationManager.ABI::class)
@Signature("rc(Microsoft.Windows.AppNotifications.AppNotificationManager;{55129688-b4bd-550b-ae6b-c24061954d91})")
@WinRTByReference(brClass = AppNotificationManager.ByReference::class)
public class AppNotificationManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppNotificationManager.WithDefault, IAppNotificationManager2.WithDefault,
    IWinRTObject {
  private val __629340648_Interface: IAppNotificationManager.WithDefault by lazy {
    as_629340648()
  }


  private val __1965276442_Interface: IAppNotificationManager2.WithDefault by lazy {
    as_1965276442()
  }


  public override val __629340648_Ptr: JNAPointer? by lazy {
    __629340648_Interface.__629340648_Ptr
  }


  public override val __1965276442_Ptr: JNAPointer? by lazy {
    __1965276442_Interface.__1965276442_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__629340648_Interface, __1965276442_Interface)

  private fun as_629340648(): IAppNotificationManager.WithDefault {
    if(pointer == NULL) {
      return(IAppNotificationManager.ABI.makeIAppNotificationManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppNotificationManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppNotificationManager.ABI.makeIAppNotificationManager(ref.value))
  }

  private fun as_1965276442(): IAppNotificationManager2.WithDefault {
    if(pointer == NULL) {
      return(IAppNotificationManager2.ABI.makeIAppNotificationManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppNotificationManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppNotificationManager2.ABI.makeIAppNotificationManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppNotificationManager> {
    public override fun getValue() = AppNotificationManager(pointer.getPointer(0))

    public fun setValue(value: AppNotificationManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppNotificationManager, MemoryAddress> {
    public val IAppNotificationManagerStatics_Instance: IAppNotificationManagerStatics by lazy {
      createIAppNotificationManagerStatics()
    }


    public val IAppNotificationManagerStatics2_Instance: IAppNotificationManagerStatics2 by lazy {
      createIAppNotificationManagerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppNotificationManagerStatics(): IAppNotificationManagerStatics {
      val refiid = Guid.REFIID(IAppNotificationManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.AppNotifications.AppNotificationManager".toHandle(),refiid,interfacePtr)
      val result =
          IAppNotificationManagerStatics.ABI.makeIAppNotificationManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIAppNotificationManagerStatics2(): IAppNotificationManagerStatics2 {
      val refiid = Guid.REFIID(IAppNotificationManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.AppNotifications.AppNotificationManager".toHandle(),refiid,interfacePtr)
      val result =
          IAppNotificationManagerStatics2.ABI.makeIAppNotificationManagerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppNotificationManager {
      val address = segment.toRawLongValue()
      return AppNotificationManager(Pointer(address))
    }

    public override fun toNative(obj: AppNotificationManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Default() = ABI.IAppNotificationManagerStatics_Instance.get_Default()

    public fun IsSupported() = ABI.IAppNotificationManagerStatics2_Instance.IsSupported()
  }
}
