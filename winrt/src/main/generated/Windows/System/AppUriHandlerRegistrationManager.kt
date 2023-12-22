package Windows.System

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

@ABIMarker(AppUriHandlerRegistrationManager.ABI::class)
@Signature("rc(Windows.System.AppUriHandlerRegistrationManager;{e62c9a52-ac94-5750-ac1b-6cfb6f250263})")
@WinRTByReference(brClass = AppUriHandlerRegistrationManager.ByReference::class)
public class AppUriHandlerRegistrationManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppUriHandlerRegistrationManager.WithDefault,
    IAppUriHandlerRegistrationManager2.WithDefault, IWinRTObject {
  private val __195979364_Interface: IAppUriHandlerRegistrationManager.WithDefault by lazy {
    as_195979364()
  }


  private val __1780393038_Interface: IAppUriHandlerRegistrationManager2.WithDefault by lazy {
    as_1780393038()
  }


  public override val __195979364_Ptr: JNAPointer? by lazy {
    __195979364_Interface.__195979364_Ptr
  }


  public override val __1780393038_Ptr: JNAPointer? by lazy {
    __1780393038_Interface.__1780393038_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__195979364_Interface, __1780393038_Interface)

  private fun as_195979364(): IAppUriHandlerRegistrationManager.WithDefault {
    if(pointer == NULL) {
      return(IAppUriHandlerRegistrationManager.ABI.makeIAppUriHandlerRegistrationManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppUriHandlerRegistrationManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppUriHandlerRegistrationManager.ABI.makeIAppUriHandlerRegistrationManager(ref.value))
  }

  private fun as_1780393038(): IAppUriHandlerRegistrationManager2.WithDefault {
    if(pointer == NULL) {
      return(IAppUriHandlerRegistrationManager2.ABI.makeIAppUriHandlerRegistrationManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppUriHandlerRegistrationManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppUriHandlerRegistrationManager2.ABI.makeIAppUriHandlerRegistrationManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppUriHandlerRegistrationManager> {
    public override fun getValue() = AppUriHandlerRegistrationManager(pointer.getPointer(0))

    public fun setValue(value: AppUriHandlerRegistrationManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppUriHandlerRegistrationManager, MemoryAddress> {
    public val IAppUriHandlerRegistrationManagerStatics2_Instance:
        IAppUriHandlerRegistrationManagerStatics2 by lazy {
      createIAppUriHandlerRegistrationManagerStatics2()
    }


    public val IAppUriHandlerRegistrationManagerStatics_Instance:
        IAppUriHandlerRegistrationManagerStatics by lazy {
      createIAppUriHandlerRegistrationManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppUriHandlerRegistrationManagerStatics2():
        IAppUriHandlerRegistrationManagerStatics2 {
      val refiid = Guid.REFIID(IAppUriHandlerRegistrationManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.AppUriHandlerRegistrationManager".toHandle(),refiid,interfacePtr)
      val result =
          IAppUriHandlerRegistrationManagerStatics2.ABI.makeIAppUriHandlerRegistrationManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIAppUriHandlerRegistrationManagerStatics():
        IAppUriHandlerRegistrationManagerStatics {
      val refiid = Guid.REFIID(IAppUriHandlerRegistrationManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.AppUriHandlerRegistrationManager".toHandle(),refiid,interfacePtr)
      val result =
          IAppUriHandlerRegistrationManagerStatics.ABI.makeIAppUriHandlerRegistrationManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppUriHandlerRegistrationManager {
      val address = segment.toRawLongValue()
      return AppUriHandlerRegistrationManager(Pointer(address))
    }

    public override fun toNative(obj: AppUriHandlerRegistrationManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForPackage(packageFamilyName: String) =
        ABI.IAppUriHandlerRegistrationManagerStatics2_Instance.GetForPackage(packageFamilyName)

    public fun GetForPackageForUser(packageFamilyName: String, user: User) =
        ABI.IAppUriHandlerRegistrationManagerStatics2_Instance.GetForPackageForUser(packageFamilyName,
        user)

    public fun GetDefault() = ABI.IAppUriHandlerRegistrationManagerStatics_Instance.GetDefault()

    public fun GetForUser(user: User) =
        ABI.IAppUriHandlerRegistrationManagerStatics_Instance.GetForUser(user)
  }
}
