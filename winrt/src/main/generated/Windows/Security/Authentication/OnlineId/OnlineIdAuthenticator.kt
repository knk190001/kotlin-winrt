package Windows.Security.Authentication.OnlineId

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

@ABIMarker(OnlineIdAuthenticator.ABI::class)
@Signature("rc(Windows.Security.Authentication.OnlineId.OnlineIdAuthenticator;{a003f58a-29ab-4817-b884-d7516dad18b9})")
@WinRTByReference(brClass = OnlineIdAuthenticator.ByReference::class)
public class OnlineIdAuthenticator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOnlineIdAuthenticator.WithDefault, IWinRTObject {
  private val __861768925_Interface: IOnlineIdAuthenticator.WithDefault by lazy {
    as_861768925()
  }


  public override val __861768925_Ptr: JNAPointer? by lazy {
    __861768925_Interface.__861768925_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__861768925_Interface)

  public constructor() : this(ABI.activate())

  private fun as_861768925(): IOnlineIdAuthenticator.WithDefault {
    if(pointer == NULL) {
      return(IOnlineIdAuthenticator.ABI.makeIOnlineIdAuthenticator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOnlineIdAuthenticator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOnlineIdAuthenticator.ABI.makeIOnlineIdAuthenticator(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OnlineIdAuthenticator> {
    public override fun getValue() = OnlineIdAuthenticator(pointer.getPointer(0))

    public fun setValue(value: OnlineIdAuthenticator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OnlineIdAuthenticator, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.OnlineId.OnlineIdAuthenticator".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): OnlineIdAuthenticator {
      val address = segment.toRawLongValue()
      return OnlineIdAuthenticator(Pointer(address))
    }

    public override fun toNative(obj: OnlineIdAuthenticator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
