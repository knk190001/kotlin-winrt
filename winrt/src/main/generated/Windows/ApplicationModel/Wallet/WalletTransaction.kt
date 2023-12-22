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

@ABIMarker(WalletTransaction.ABI::class)
@Signature("rc(Windows.ApplicationModel.Wallet.WalletTransaction;{40e1e940-2606-4519-81cb-bff1c60d1f79})")
@WinRTByReference(brClass = WalletTransaction.ByReference::class)
public class WalletTransaction(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWalletTransaction.WithDefault, IWinRTObject {
  private val __312520097_Interface: IWalletTransaction.WithDefault by lazy {
    as_312520097()
  }


  public override val __312520097_Ptr: JNAPointer? by lazy {
    __312520097_Interface.__312520097_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__312520097_Interface)

  public constructor() : this(ABI.activate())

  private fun as_312520097(): IWalletTransaction.WithDefault {
    if(pointer == NULL) {
      return(IWalletTransaction.ABI.makeIWalletTransaction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWalletTransaction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWalletTransaction.ABI.makeIWalletTransaction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WalletTransaction> {
    public override fun getValue() = WalletTransaction(pointer.getPointer(0))

    public fun setValue(value: WalletTransaction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WalletTransaction, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Wallet.WalletTransaction".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): WalletTransaction {
      val address = segment.toRawLongValue()
      return WalletTransaction(Pointer(address))
    }

    public override fun toNative(obj: WalletTransaction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
