package Windows.ApplicationModel.UserActivities

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

@ABIMarker(UserActivityRequestManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserActivities.UserActivityRequestManager;{0c30be4e-903d-48d6-82d4-4043ed57791b})")
@WinRTByReference(brClass = UserActivityRequestManager.ByReference::class)
public class UserActivityRequestManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserActivityRequestManager.WithDefault, IWinRTObject {
  private val __1511699137_Interface: IUserActivityRequestManager.WithDefault by lazy {
    as_1511699137()
  }


  public override val __1511699137_Ptr: JNAPointer? by lazy {
    __1511699137_Interface.__1511699137_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1511699137_Interface)

  private fun as_1511699137(): IUserActivityRequestManager.WithDefault {
    if(pointer == NULL) {
      return(IUserActivityRequestManager.ABI.makeIUserActivityRequestManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserActivityRequestManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserActivityRequestManager.ABI.makeIUserActivityRequestManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserActivityRequestManager> {
    public override fun getValue() = UserActivityRequestManager(pointer.getPointer(0))

    public fun setValue(value: UserActivityRequestManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserActivityRequestManager, MemoryAddress> {
    public val IUserActivityRequestManagerStatics_Instance: IUserActivityRequestManagerStatics by
        lazy {
      createIUserActivityRequestManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserActivityRequestManagerStatics(): IUserActivityRequestManagerStatics {
      val refiid = Guid.REFIID(IUserActivityRequestManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserActivities.UserActivityRequestManager".toHandle(),refiid,interfacePtr)
      val result =
          IUserActivityRequestManagerStatics.ABI.makeIUserActivityRequestManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UserActivityRequestManager {
      val address = segment.toRawLongValue()
      return UserActivityRequestManager(Pointer(address))
    }

    public override fun toNative(obj: UserActivityRequestManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() =
        ABI.IUserActivityRequestManagerStatics_Instance.GetForCurrentView()
  }
}
