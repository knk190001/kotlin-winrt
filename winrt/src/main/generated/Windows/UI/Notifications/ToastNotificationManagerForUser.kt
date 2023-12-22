package Windows.UI.Notifications

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

@ABIMarker(ToastNotificationManagerForUser.ABI::class)
@Signature("rc(Windows.UI.Notifications.ToastNotificationManagerForUser;{79ab57f6-43fe-487b-8a7f-99567200ae94})")
@WinRTByReference(brClass = ToastNotificationManagerForUser.ByReference::class)
public class ToastNotificationManagerForUser(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IToastNotificationManagerForUser.WithDefault,
    IToastNotificationManagerForUser2.WithDefault, IToastNotificationManagerForUser3.WithDefault,
    IWinRTObject {
  private val __664381783_Interface: IToastNotificationManagerForUser.WithDefault by lazy {
    as_664381783()
  }


  private val __879001257_Interface: IToastNotificationManagerForUser2.WithDefault by lazy {
    as_879001257()
  }


  private val __879001258_Interface: IToastNotificationManagerForUser3.WithDefault by lazy {
    as_879001258()
  }


  public override val __664381783_Ptr: JNAPointer? by lazy {
    __664381783_Interface.__664381783_Ptr
  }


  public override val __879001257_Ptr: JNAPointer? by lazy {
    __879001257_Interface.__879001257_Ptr
  }


  public override val __879001258_Ptr: JNAPointer? by lazy {
    __879001258_Interface.__879001258_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__664381783_Interface, __879001257_Interface, __879001258_Interface)

  private fun as_664381783(): IToastNotificationManagerForUser.WithDefault {
    if(pointer == NULL) {
      return(IToastNotificationManagerForUser.ABI.makeIToastNotificationManagerForUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotificationManagerForUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationManagerForUser.ABI.makeIToastNotificationManagerForUser(ref.value))
  }

  private fun as_879001257(): IToastNotificationManagerForUser2.WithDefault {
    if(pointer == NULL) {
      return(IToastNotificationManagerForUser2.ABI.makeIToastNotificationManagerForUser2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotificationManagerForUser2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationManagerForUser2.ABI.makeIToastNotificationManagerForUser2(ref.value))
  }

  private fun as_879001258(): IToastNotificationManagerForUser3.WithDefault {
    if(pointer == NULL) {
      return(IToastNotificationManagerForUser3.ABI.makeIToastNotificationManagerForUser3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastNotificationManagerForUser3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastNotificationManagerForUser3.ABI.makeIToastNotificationManagerForUser3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToastNotificationManagerForUser> {
    public override fun getValue() = ToastNotificationManagerForUser(pointer.getPointer(0))

    public fun setValue(value: ToastNotificationManagerForUser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToastNotificationManagerForUser, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ToastNotificationManagerForUser {
      val address = segment.toRawLongValue()
      return ToastNotificationManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: ToastNotificationManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
