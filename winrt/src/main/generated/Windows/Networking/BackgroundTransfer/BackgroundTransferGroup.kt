package Windows.Networking.BackgroundTransfer

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

@ABIMarker(BackgroundTransferGroup.ABI::class)
@Signature("rc(Windows.Networking.BackgroundTransfer.BackgroundTransferGroup;{d8c3e3e4-6459-4540-85eb-aaa1c8903677})")
@WinRTByReference(brClass = BackgroundTransferGroup.ByReference::class)
public class BackgroundTransferGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundTransferGroup.WithDefault, IWinRTObject {
  private val __834917787_Interface: IBackgroundTransferGroup.WithDefault by lazy {
    as_834917787()
  }


  public override val __834917787_Ptr: JNAPointer? by lazy {
    __834917787_Interface.__834917787_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__834917787_Interface)

  private fun as_834917787(): IBackgroundTransferGroup.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTransferGroup.ABI.makeIBackgroundTransferGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTransferGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTransferGroup.ABI.makeIBackgroundTransferGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundTransferGroup> {
    public override fun getValue() = BackgroundTransferGroup(pointer.getPointer(0))

    public fun setValue(value: BackgroundTransferGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundTransferGroup, MemoryAddress> {
    public val IBackgroundTransferGroupStatics_Instance: IBackgroundTransferGroupStatics by lazy {
      createIBackgroundTransferGroupStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBackgroundTransferGroupStatics(): IBackgroundTransferGroupStatics {
      val refiid = Guid.REFIID(IBackgroundTransferGroupStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.BackgroundTransfer.BackgroundTransferGroup".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundTransferGroupStatics.ABI.makeIBackgroundTransferGroupStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BackgroundTransferGroup {
      val address = segment.toRawLongValue()
      return BackgroundTransferGroup(Pointer(address))
    }

    public override fun toNative(obj: BackgroundTransferGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateGroup(name: String) =
        ABI.IBackgroundTransferGroupStatics_Instance.CreateGroup(name)
  }
}
