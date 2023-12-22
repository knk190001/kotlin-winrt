package Windows.ApplicationModel.Wallet

import Windows.ApplicationModel.Wallet.IWalletItemFactory.ABI.IID
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

@ABIMarker(WalletItem.ABI::class)
@Signature("rc(Windows.ApplicationModel.Wallet.WalletItem;{20b54be8-118d-4ec4-996c-b963e7bd3e74})")
@WinRTByReference(brClass = WalletItem.ByReference::class)
public class WalletItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWalletItem.WithDefault, IWinRTObject {
  private val __800127666_Interface: IWalletItem.WithDefault by lazy {
    as_800127666()
  }


  public override val __800127666_Ptr: JNAPointer? by lazy {
    __800127666_Interface.__800127666_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__800127666_Interface)

  public constructor(kind: WalletItemKind, displayName: String) : this(ABI.activate(kind,
      displayName))

  private fun as_800127666(): IWalletItem.WithDefault {
    if(pointer == NULL) {
      return(IWalletItem.ABI.makeIWalletItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWalletItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWalletItem.ABI.makeIWalletItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WalletItem> {
    public override fun getValue() = WalletItem(pointer.getPointer(0))

    public fun setValue(value: WalletItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WalletItem, MemoryAddress> {
    public val IWalletItemFactory_Instance: IWalletItemFactory by lazy {
      createIWalletItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWalletItemFactory(): IWalletItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Wallet.WalletItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWalletItemFactory.ABI.makeIWalletItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(kind: WalletItemKind, displayName: String): JNAPointer? =
        IWalletItemFactory_Instance.CreateWalletItem(kind, displayName)?.pointer

    public override fun fromNative(segment: MemoryAddress): WalletItem {
      val address = segment.toRawLongValue()
      return WalletItem(Pointer(address))
    }

    public override fun toNative(obj: WalletItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
