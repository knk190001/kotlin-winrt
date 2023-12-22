package Windows.ApplicationModel.UserActivities

import Windows.ApplicationModel.UserActivities.IUserActivityFactory.ABI.IID
import Windows.Foundation.Collections.IIterable
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

@ABIMarker(UserActivity.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserActivities.UserActivity;{fc103e9e-2cab-4d36-aea2-b4bb556cef0f})")
@WinRTByReference(brClass = UserActivity.ByReference::class)
public class UserActivity(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserActivity.WithDefault, IUserActivity2.WithDefault,
    IUserActivity3.WithDefault, IWinRTObject {
  private val __1777016639_Interface: IUserActivity.WithDefault by lazy {
    as_1777016639()
  }


  private val __747059089_Interface: IUserActivity2.WithDefault by lazy {
    as_747059089()
  }


  private val __747059090_Interface: IUserActivity3.WithDefault by lazy {
    as_747059090()
  }


  public override val __1777016639_Ptr: JNAPointer? by lazy {
    __1777016639_Interface.__1777016639_Ptr
  }


  public override val __747059089_Ptr: JNAPointer? by lazy {
    __747059089_Interface.__747059089_Ptr
  }


  public override val __747059090_Ptr: JNAPointer? by lazy {
    __747059090_Interface.__747059090_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1777016639_Interface, __747059089_Interface, __747059090_Interface)

  public constructor(activityId: String) : this(ABI.activate(activityId))

  private fun as_1777016639(): IUserActivity.WithDefault {
    if(pointer == NULL) {
      return(IUserActivity.ABI.makeIUserActivity(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserActivity>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserActivity.ABI.makeIUserActivity(ref.value))
  }

  private fun as_747059089(): IUserActivity2.WithDefault {
    if(pointer == NULL) {
      return(IUserActivity2.ABI.makeIUserActivity2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserActivity2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserActivity2.ABI.makeIUserActivity2(ref.value))
  }

  private fun as_747059090(): IUserActivity3.WithDefault {
    if(pointer == NULL) {
      return(IUserActivity3.ABI.makeIUserActivity3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserActivity3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserActivity3.ABI.makeIUserActivity3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UserActivity> {
    public override fun getValue() = UserActivity(pointer.getPointer(0))

    public fun setValue(value: UserActivity): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserActivity, MemoryAddress> {
    public val IUserActivityStatics_Instance: IUserActivityStatics by lazy {
      createIUserActivityStatics()
    }


    public val IUserActivityFactory_Instance: IUserActivityFactory by lazy {
      createIUserActivityFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserActivityStatics(): IUserActivityStatics {
      val refiid = Guid.REFIID(IUserActivityStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserActivities.UserActivity".toHandle(),refiid,interfacePtr)
      val result = IUserActivityStatics.ABI.makeIUserActivityStatics(interfacePtr.value)
      return result
    }

    public fun createIUserActivityFactory(): IUserActivityFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserActivities.UserActivity".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IUserActivityFactory.ABI.makeIUserActivityFactory(factoryActivatorPtr.value))
    }

    public fun activate(activityId: String): JNAPointer? =
        IUserActivityFactory_Instance.CreateWithActivityId(activityId)?.pointer

    public override fun fromNative(segment: MemoryAddress): UserActivity {
      val address = segment.toRawLongValue()
      return UserActivity(Pointer(address))
    }

    public override fun toNative(obj: UserActivity): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryParseFromJson(json: String) =
        ABI.IUserActivityStatics_Instance.TryParseFromJson(json)

    public fun TryParseFromJsonArray(json: String) =
        ABI.IUserActivityStatics_Instance.TryParseFromJsonArray(json)

    public fun ToJsonArray(activities: IIterable<UserActivity?>) =
        ABI.IUserActivityStatics_Instance.ToJsonArray(activities)
  }
}
