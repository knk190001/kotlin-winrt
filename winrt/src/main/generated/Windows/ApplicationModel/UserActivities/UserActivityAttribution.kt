package Windows.ApplicationModel.UserActivities

import Windows.Foundation.Uri
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(UserActivityAttribution.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserActivities.UserActivityAttribution;{34a5c8b5-86dd-4aec-a491-6a4faea5d22e})")
@WinRTByReference(brClass = UserActivityAttribution.ByReference::class)
public class UserActivityAttribution(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserActivityAttribution.WithDefault, IWinRTObject {
  private val __603849982_Interface: IUserActivityAttribution.WithDefault by lazy {
    as_603849982()
  }


  public override val __603849982_Ptr: JNAPointer? by lazy {
    __603849982_Interface.__603849982_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__603849982_Interface)

  public constructor() : this(ABI.activate())

  public constructor(iconUri: Uri) : this(ABI.activate(iconUri))

  private fun as_603849982(): IUserActivityAttribution.WithDefault {
    if(pointer == NULL) {
      return(IUserActivityAttribution.ABI.makeIUserActivityAttribution(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserActivityAttribution>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserActivityAttribution.ABI.makeIUserActivityAttribution(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserActivityAttribution> {
    public override fun getValue() = UserActivityAttribution(pointer.getPointer(0))

    public fun setValue(value: UserActivityAttribution): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserActivityAttribution, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IUserActivityAttributionFactory_Instance: IUserActivityAttributionFactory by lazy {
      createIUserActivityAttributionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserActivities.UserActivityAttribution".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIUserActivityAttributionFactory(): IUserActivityAttributionFactory {
      val refiid = Guid.REFIID(IUserActivityAttributionFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserActivities.UserActivityAttribution".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IUserActivityAttributionFactory.ABI.makeIUserActivityAttributionFactory(factoryActivatorPtr.value))
    }

    public fun activate(iconUri: Uri): JNAPointer? =
        IUserActivityAttributionFactory_Instance.CreateWithUri(iconUri)?.pointer

    public override fun fromNative(segment: MemoryAddress): UserActivityAttribution {
      val address = segment.toRawLongValue()
      return UserActivityAttribution(Pointer(address))
    }

    public override fun toNative(obj: UserActivityAttribution): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
