package Windows.ApplicationModel.Wallet

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

@ABIMarker(WalletRelevantLocation.ABI::class)
@Signature("rc(Windows.ApplicationModel.Wallet.WalletRelevantLocation;{9fd8782a-e3f9-4de1-bab3-bb192e46b3f3})")
@WinRTByReference(brClass = WalletRelevantLocation.ByReference::class)
public class WalletRelevantLocation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWalletRelevantLocation.WithDefault, IWinRTObject {
  private val __391691631_Interface: IWalletRelevantLocation.WithDefault by lazy {
    as_391691631()
  }


  public override val __391691631_Ptr: JNAPointer? by lazy {
    __391691631_Interface.__391691631_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__391691631_Interface)

  public constructor() : this(ABI.activate())

  private fun as_391691631(): IWalletRelevantLocation.WithDefault {
    if(pointer == NULL) {
      return(IWalletRelevantLocation.ABI.makeIWalletRelevantLocation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWalletRelevantLocation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWalletRelevantLocation.ABI.makeIWalletRelevantLocation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WalletRelevantLocation> {
    public override fun getValue() = WalletRelevantLocation(pointer.getPointer(0))

    public fun setValue(value: WalletRelevantLocation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WalletRelevantLocation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Wallet.WalletRelevantLocation".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): WalletRelevantLocation {
      val address = segment.toRawLongValue()
      return WalletRelevantLocation(Pointer(address))
    }

    public override fun toNative(obj: WalletRelevantLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
