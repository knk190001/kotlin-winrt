package Windows.ApplicationModel.Wallet.System

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(WalletManagerSystem.ABI::class)
@WinRTByReference(brClass = WalletManagerSystem.ByReference::class)
public class WalletManagerSystem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WalletManagerSystem> {
    public override fun getValue() = WalletManagerSystem(pointer.getPointer(0))

    public fun setValue(value: WalletManagerSystem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WalletManagerSystem, MemoryAddress> {
    public val IWalletManagerSystemStatics_Instance: IWalletManagerSystemStatics by lazy {
      createIWalletManagerSystemStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWalletManagerSystemStatics(): IWalletManagerSystemStatics {
      val refiid = Guid.REFIID(IWalletManagerSystemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Wallet.System.WalletManagerSystem".toHandle(),refiid,interfacePtr)
      val result =
          IWalletManagerSystemStatics.ABI.makeIWalletManagerSystemStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WalletManagerSystem {
      val address = segment.toRawLongValue()
      return WalletManagerSystem(Pointer(address))
    }

    public override fun toNative(obj: WalletManagerSystem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestStoreAsync() = ABI.IWalletManagerSystemStatics_Instance.RequestStoreAsync()
  }
}
