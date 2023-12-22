package Windows.System.RemoteSystems

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

@ABIMarker(RemoteSystemSessionInvitationListener.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionInvitationListener;{08f4003f-bc71-49e1-874a-31ddff9a27b9})")
@WinRTByReference(brClass = RemoteSystemSessionInvitationListener.ByReference::class)
public class RemoteSystemSessionInvitationListener(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionInvitationListener.WithDefault, IWinRTObject {
  private val __476137455_Interface: IRemoteSystemSessionInvitationListener.WithDefault by lazy {
    as_476137455()
  }


  public override val __476137455_Ptr: JNAPointer? by lazy {
    __476137455_Interface.__476137455_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__476137455_Interface)

  public constructor() : this(ABI.activate())

  private fun as_476137455(): IRemoteSystemSessionInvitationListener.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionInvitationListener.ABI.makeIRemoteSystemSessionInvitationListener(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionInvitationListener>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionInvitationListener.ABI.makeIRemoteSystemSessionInvitationListener(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionInvitationListener> {
    public override fun getValue() = RemoteSystemSessionInvitationListener(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionInvitationListener): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionInvitationListener, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemSessionInvitationListener".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): RemoteSystemSessionInvitationListener {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionInvitationListener(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionInvitationListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
