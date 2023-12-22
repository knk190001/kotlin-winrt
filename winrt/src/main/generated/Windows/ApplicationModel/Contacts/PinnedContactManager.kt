package Windows.ApplicationModel.Contacts

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

@ABIMarker(PinnedContactManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.PinnedContactManager;{fcbc740c-e1d6-45c3-b8b6-a35604e167a0})")
@WinRTByReference(brClass = PinnedContactManager.ByReference::class)
public class PinnedContactManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPinnedContactManager.WithDefault, IWinRTObject {
  private val __487660625_Interface: IPinnedContactManager.WithDefault by lazy {
    as_487660625()
  }


  public override val __487660625_Ptr: JNAPointer? by lazy {
    __487660625_Interface.__487660625_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__487660625_Interface)

  private fun as_487660625(): IPinnedContactManager.WithDefault {
    if(pointer == NULL) {
      return(IPinnedContactManager.ABI.makeIPinnedContactManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPinnedContactManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPinnedContactManager.ABI.makeIPinnedContactManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PinnedContactManager> {
    public override fun getValue() = PinnedContactManager(pointer.getPointer(0))

    public fun setValue(value: PinnedContactManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PinnedContactManager, MemoryAddress> {
    public val IPinnedContactManagerStatics_Instance: IPinnedContactManagerStatics by lazy {
      createIPinnedContactManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPinnedContactManagerStatics(): IPinnedContactManagerStatics {
      val refiid = Guid.REFIID(IPinnedContactManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.PinnedContactManager".toHandle(),refiid,interfacePtr)
      val result =
          IPinnedContactManagerStatics.ABI.makeIPinnedContactManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PinnedContactManager {
      val address = segment.toRawLongValue()
      return PinnedContactManager(Pointer(address))
    }

    public override fun toNative(obj: PinnedContactManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IPinnedContactManagerStatics_Instance.GetDefault()

    public fun GetForUser(user: User) = ABI.IPinnedContactManagerStatics_Instance.GetForUser(user)

    public fun IsSupported() = ABI.IPinnedContactManagerStatics_Instance.IsSupported()
  }
}
