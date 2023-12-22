package Windows.ApplicationModel.Background

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

@ABIMarker(BackgroundTaskRegistration.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.BackgroundTaskRegistration;{10654cc2-a26e-43bf-8c12-1fb40dbfbfa0})")
@WinRTByReference(brClass = BackgroundTaskRegistration.ByReference::class)
public class BackgroundTaskRegistration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundTaskRegistration.WithDefault,
    IBackgroundTaskRegistration2.WithDefault, IBackgroundTaskRegistration3.WithDefault, IWinRTObject
    {
  private val __2000610595_Interface: IBackgroundTaskRegistration.WithDefault by lazy {
    as_2000610595()
  }


  private val __1889386251_Interface: IBackgroundTaskRegistration2.WithDefault by lazy {
    as_1889386251()
  }


  private val __1889386250_Interface: IBackgroundTaskRegistration3.WithDefault by lazy {
    as_1889386250()
  }


  public override val __2000610595_Ptr: JNAPointer? by lazy {
    __2000610595_Interface.__2000610595_Ptr
  }


  public override val __1889386251_Ptr: JNAPointer? by lazy {
    __1889386251_Interface.__1889386251_Ptr
  }


  public override val __1889386250_Ptr: JNAPointer? by lazy {
    __1889386250_Interface.__1889386250_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2000610595_Interface, __1889386251_Interface, __1889386250_Interface)

  private fun as_2000610595(): IBackgroundTaskRegistration.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTaskRegistration.ABI.makeIBackgroundTaskRegistration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTaskRegistration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTaskRegistration.ABI.makeIBackgroundTaskRegistration(ref.value))
  }

  private fun as_1889386251(): IBackgroundTaskRegistration2.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTaskRegistration2.ABI.makeIBackgroundTaskRegistration2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTaskRegistration2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTaskRegistration2.ABI.makeIBackgroundTaskRegistration2(ref.value))
  }

  private fun as_1889386250(): IBackgroundTaskRegistration3.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTaskRegistration3.ABI.makeIBackgroundTaskRegistration3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTaskRegistration3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTaskRegistration3.ABI.makeIBackgroundTaskRegistration3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundTaskRegistration> {
    public override fun getValue() = BackgroundTaskRegistration(pointer.getPointer(0))

    public fun setValue(value: BackgroundTaskRegistration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundTaskRegistration, MemoryAddress> {
    public val IBackgroundTaskRegistrationStatics_Instance: IBackgroundTaskRegistrationStatics by
        lazy {
      createIBackgroundTaskRegistrationStatics()
    }


    public val IBackgroundTaskRegistrationStatics2_Instance: IBackgroundTaskRegistrationStatics2 by
        lazy {
      createIBackgroundTaskRegistrationStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBackgroundTaskRegistrationStatics(): IBackgroundTaskRegistrationStatics {
      val refiid = Guid.REFIID(IBackgroundTaskRegistrationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.BackgroundTaskRegistration".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundTaskRegistrationStatics.ABI.makeIBackgroundTaskRegistrationStatics(interfacePtr.value)
      return result
    }

    public fun createIBackgroundTaskRegistrationStatics2(): IBackgroundTaskRegistrationStatics2 {
      val refiid = Guid.REFIID(IBackgroundTaskRegistrationStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.BackgroundTaskRegistration".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundTaskRegistrationStatics2.ABI.makeIBackgroundTaskRegistrationStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BackgroundTaskRegistration {
      val address = segment.toRawLongValue()
      return BackgroundTaskRegistration(Pointer(address))
    }

    public override fun toNative(obj: BackgroundTaskRegistration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AllTasks() = ABI.IBackgroundTaskRegistrationStatics_Instance.get_AllTasks()

    public fun get_AllTaskGroups() =
        ABI.IBackgroundTaskRegistrationStatics2_Instance.get_AllTaskGroups()

    public fun GetTaskGroup(groupId: String) =
        ABI.IBackgroundTaskRegistrationStatics2_Instance.GetTaskGroup(groupId)
  }
}
