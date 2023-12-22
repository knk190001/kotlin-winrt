package Windows.Networking.NetworkOperators

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

@ABIMarker(UssdSession.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.UssdSession;{2f9acf82-2002-4d5d-bf81-2aba1b4be4a8})")
@WinRTByReference(brClass = UssdSession.ByReference::class)
public class UssdSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUssdSession.WithDefault, IWinRTObject {
  private val __1500990094_Interface: IUssdSession.WithDefault by lazy {
    as_1500990094()
  }


  public override val __1500990094_Ptr: JNAPointer? by lazy {
    __1500990094_Interface.__1500990094_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1500990094_Interface)

  private fun as_1500990094(): IUssdSession.WithDefault {
    if(pointer == NULL) {
      return(IUssdSession.ABI.makeIUssdSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUssdSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUssdSession.ABI.makeIUssdSession(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UssdSession> {
    public override fun getValue() = UssdSession(pointer.getPointer(0))

    public fun setValue(value: UssdSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UssdSession, MemoryAddress> {
    public val IUssdSessionStatics_Instance: IUssdSessionStatics by lazy {
      createIUssdSessionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUssdSessionStatics(): IUssdSessionStatics {
      val refiid = Guid.REFIID(IUssdSessionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.UssdSession".toHandle(),refiid,interfacePtr)
      val result = IUssdSessionStatics.ABI.makeIUssdSessionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UssdSession {
      val address = segment.toRawLongValue()
      return UssdSession(Pointer(address))
    }

    public override fun toNative(obj: UssdSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromNetworkAccountId(networkAccountId: String) =
        ABI.IUssdSessionStatics_Instance.CreateFromNetworkAccountId(networkAccountId)

    public fun CreateFromNetworkInterfaceId(networkInterfaceId: String) =
        ABI.IUssdSessionStatics_Instance.CreateFromNetworkInterfaceId(networkInterfaceId)
  }
}
