package Windows.ApplicationModel.Wallet

import Windows.ApplicationModel.Wallet.IWalletVerbFactory.ABI.IID
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

@ABIMarker(WalletVerb.ABI::class)
@Signature("rc(Windows.ApplicationModel.Wallet.WalletVerb;{17b826d6-e3c1-4c74-8a94-217aadbc4884})")
@WinRTByReference(brClass = WalletVerb.ByReference::class)
public class WalletVerb(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWalletVerb.WithDefault, IWinRTObject {
  private val __800500926_Interface: IWalletVerb.WithDefault by lazy {
    as_800500926()
  }


  public override val __800500926_Ptr: JNAPointer? by lazy {
    __800500926_Interface.__800500926_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__800500926_Interface)

  public constructor(name: String) : this(ABI.activate(name))

  private fun as_800500926(): IWalletVerb.WithDefault {
    if(pointer == NULL) {
      return(IWalletVerb.ABI.makeIWalletVerb(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWalletVerb>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWalletVerb.ABI.makeIWalletVerb(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WalletVerb> {
    public override fun getValue() = WalletVerb(pointer.getPointer(0))

    public fun setValue(value: WalletVerb): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WalletVerb, MemoryAddress> {
    public val IWalletVerbFactory_Instance: IWalletVerbFactory by lazy {
      createIWalletVerbFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWalletVerbFactory(): IWalletVerbFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Wallet.WalletVerb".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWalletVerbFactory.ABI.makeIWalletVerbFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        IWalletVerbFactory_Instance.CreateWalletVerb(name)?.pointer

    public override fun fromNative(segment: MemoryAddress): WalletVerb {
      val address = segment.toRawLongValue()
      return WalletVerb(Pointer(address))
    }

    public override fun toNative(obj: WalletVerb): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
