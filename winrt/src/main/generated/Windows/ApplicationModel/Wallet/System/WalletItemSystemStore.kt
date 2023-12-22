package Windows.ApplicationModel.Wallet.System

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WalletItemSystemStore.ABI::class)
@Signature("rc(Windows.ApplicationModel.Wallet.System.WalletItemSystemStore;{522e2bff-96a2-4a17-8d19-fe1d9f837561})")
@WinRTByReference(brClass = WalletItemSystemStore.ByReference::class)
public class WalletItemSystemStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWalletItemSystemStore.WithDefault, IWalletItemSystemStore2.WithDefault,
    IWinRTObject {
  private val __328717641_Interface: IWalletItemSystemStore.WithDefault by lazy {
    as_328717641()
  }


  private val __1600312229_Interface: IWalletItemSystemStore2.WithDefault by lazy {
    as_1600312229()
  }


  public override val __328717641_Ptr: JNAPointer? by lazy {
    __328717641_Interface.__328717641_Ptr
  }


  public override val __1600312229_Ptr: JNAPointer? by lazy {
    __1600312229_Interface.__1600312229_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__328717641_Interface, __1600312229_Interface)

  private fun as_328717641(): IWalletItemSystemStore.WithDefault {
    if(pointer == NULL) {
      return(IWalletItemSystemStore.ABI.makeIWalletItemSystemStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWalletItemSystemStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWalletItemSystemStore.ABI.makeIWalletItemSystemStore(ref.value))
  }

  private fun as_1600312229(): IWalletItemSystemStore2.WithDefault {
    if(pointer == NULL) {
      return(IWalletItemSystemStore2.ABI.makeIWalletItemSystemStore2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWalletItemSystemStore2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWalletItemSystemStore2.ABI.makeIWalletItemSystemStore2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WalletItemSystemStore> {
    public override fun getValue() = WalletItemSystemStore(pointer.getPointer(0))

    public fun setValue(value: WalletItemSystemStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WalletItemSystemStore, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WalletItemSystemStore {
      val address = segment.toRawLongValue()
      return WalletItemSystemStore(Pointer(address))
    }

    public override fun toNative(obj: WalletItemSystemStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
