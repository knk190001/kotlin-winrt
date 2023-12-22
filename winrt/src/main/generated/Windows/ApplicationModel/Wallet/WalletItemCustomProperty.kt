package Windows.ApplicationModel.Wallet

import Windows.ApplicationModel.Wallet.IWalletItemCustomPropertyFactory.ABI.IID
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

@ABIMarker(WalletItemCustomProperty.ABI::class)
@Signature("rc(Windows.ApplicationModel.Wallet.WalletItemCustomProperty;{b94b40f3-fa00-40fd-98dc-9de46697f1e7})")
@WinRTByReference(brClass = WalletItemCustomProperty.ByReference::class)
public class WalletItemCustomProperty(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWalletItemCustomProperty.WithDefault, IWinRTObject {
  private val __1660750920_Interface: IWalletItemCustomProperty.WithDefault by lazy {
    as_1660750920()
  }


  public override val __1660750920_Ptr: JNAPointer? by lazy {
    __1660750920_Interface.__1660750920_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1660750920_Interface)

  public constructor(name: String, value: String) : this(ABI.activate(name, value))

  private fun as_1660750920(): IWalletItemCustomProperty.WithDefault {
    if(pointer == NULL) {
      return(IWalletItemCustomProperty.ABI.makeIWalletItemCustomProperty(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWalletItemCustomProperty>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWalletItemCustomProperty.ABI.makeIWalletItemCustomProperty(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WalletItemCustomProperty> {
    public override fun getValue() = WalletItemCustomProperty(pointer.getPointer(0))

    public fun setValue(value: WalletItemCustomProperty): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WalletItemCustomProperty, MemoryAddress> {
    public val IWalletItemCustomPropertyFactory_Instance: IWalletItemCustomPropertyFactory by lazy {
      createIWalletItemCustomPropertyFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWalletItemCustomPropertyFactory(): IWalletItemCustomPropertyFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Wallet.WalletItemCustomProperty".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWalletItemCustomPropertyFactory.ABI.makeIWalletItemCustomPropertyFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String, value: String): JNAPointer? =
        IWalletItemCustomPropertyFactory_Instance.CreateWalletItemCustomProperty(name,
        value)?.pointer

    public override fun fromNative(segment: MemoryAddress): WalletItemCustomProperty {
      val address = segment.toRawLongValue()
      return WalletItemCustomProperty(Pointer(address))
    }

    public override fun toNative(obj: WalletItemCustomProperty): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
