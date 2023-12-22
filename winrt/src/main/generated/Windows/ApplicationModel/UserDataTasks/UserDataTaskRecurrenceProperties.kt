package Windows.ApplicationModel.UserDataTasks

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

@ABIMarker(UserDataTaskRecurrenceProperties.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.UserDataTaskRecurrenceProperties;{73df80b0-27c6-40ce-b149-9cd41485a69e})")
@WinRTByReference(brClass = UserDataTaskRecurrenceProperties.ByReference::class)
public class UserDataTaskRecurrenceProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskRecurrenceProperties.WithDefault, IWinRTObject {
  private val __950545097_Interface: IUserDataTaskRecurrenceProperties.WithDefault by lazy {
    as_950545097()
  }


  public override val __950545097_Ptr: JNAPointer? by lazy {
    __950545097_Interface.__950545097_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__950545097_Interface)

  public constructor() : this(ABI.activate())

  private fun as_950545097(): IUserDataTaskRecurrenceProperties.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskRecurrenceProperties.ABI.makeIUserDataTaskRecurrenceProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskRecurrenceProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskRecurrenceProperties.ABI.makeIUserDataTaskRecurrenceProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskRecurrenceProperties> {
    public override fun getValue() = UserDataTaskRecurrenceProperties(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskRecurrenceProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskRecurrenceProperties, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserDataTasks.UserDataTaskRecurrenceProperties".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): UserDataTaskRecurrenceProperties {
      val address = segment.toRawLongValue()
      return UserDataTaskRecurrenceProperties(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskRecurrenceProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
