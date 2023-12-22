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

@ABIMarker(UserDataTask.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.UserDataTask;{7c6585d1-e0d4-4f99-aee2-bc2d5ddadf4c})")
@WinRTByReference(brClass = UserDataTask.ByReference::class)
public class UserDataTask(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTask.WithDefault, IWinRTObject {
  private val __819828076_Interface: IUserDataTask.WithDefault by lazy {
    as_819828076()
  }


  public override val __819828076_Ptr: JNAPointer? by lazy {
    __819828076_Interface.__819828076_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__819828076_Interface)

  public constructor() : this(ABI.activate())

  private fun as_819828076(): IUserDataTask.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTask.ABI.makeIUserDataTask(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTask>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTask.ABI.makeIUserDataTask(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UserDataTask> {
    public override fun getValue() = UserDataTask(pointer.getPointer(0))

    public fun setValue(value: UserDataTask): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTask, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserDataTasks.UserDataTask".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): UserDataTask {
      val address = segment.toRawLongValue()
      return UserDataTask(Pointer(address))
    }

    public override fun toNative(obj: UserDataTask): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
