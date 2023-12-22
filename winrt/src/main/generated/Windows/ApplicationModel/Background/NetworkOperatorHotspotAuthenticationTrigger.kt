package Windows.ApplicationModel.Background

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

@ABIMarker(NetworkOperatorHotspotAuthenticationTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.NetworkOperatorHotspotAuthenticationTrigger;{e756c791-3001-4de5-83c7-de61d88831d0})")
@WinRTByReference(brClass = NetworkOperatorHotspotAuthenticationTrigger.ByReference::class)
public class NetworkOperatorHotspotAuthenticationTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INetworkOperatorHotspotAuthenticationTrigger.WithDefault,
    IBackgroundTrigger.WithDefault, IWinRTObject {
  private val __58812434_Interface: INetworkOperatorHotspotAuthenticationTrigger.WithDefault by
      lazy {
    as_58812434()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __58812434_Ptr: JNAPointer? by lazy {
    __58812434_Interface.__58812434_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__58812434_Interface, __54213927_Interface)

  public constructor() : this(ABI.activate())

  private fun as_58812434(): INetworkOperatorHotspotAuthenticationTrigger.WithDefault {
    if(pointer == NULL) {
      return(INetworkOperatorHotspotAuthenticationTrigger.ABI.makeINetworkOperatorHotspotAuthenticationTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkOperatorHotspotAuthenticationTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkOperatorHotspotAuthenticationTrigger.ABI.makeINetworkOperatorHotspotAuthenticationTrigger(ref.value))
  }

  private fun as_54213927(): IBackgroundTrigger.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NetworkOperatorHotspotAuthenticationTrigger> {
    public override fun getValue() =
        NetworkOperatorHotspotAuthenticationTrigger(pointer.getPointer(0))

    public fun setValue(value: NetworkOperatorHotspotAuthenticationTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NetworkOperatorHotspotAuthenticationTrigger, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.NetworkOperatorHotspotAuthenticationTrigger".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress):
        NetworkOperatorHotspotAuthenticationTrigger {
      val address = segment.toRawLongValue()
      return NetworkOperatorHotspotAuthenticationTrigger(Pointer(address))
    }

    public override fun toNative(obj: NetworkOperatorHotspotAuthenticationTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
