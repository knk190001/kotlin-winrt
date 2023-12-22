package Windows.Services.Store

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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(StoreRequestHelper.ABI::class)
@WinRTByReference(brClass = StoreRequestHelper.ByReference::class)
public class StoreRequestHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreRequestHelper> {
    public override fun getValue() = StoreRequestHelper(pointer.getPointer(0))

    public fun setValue(value: StoreRequestHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreRequestHelper, MemoryAddress> {
    public val IStoreRequestHelperStatics_Instance: IStoreRequestHelperStatics by lazy {
      createIStoreRequestHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStoreRequestHelperStatics(): IStoreRequestHelperStatics {
      val refiid = Guid.REFIID(IStoreRequestHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Store.StoreRequestHelper".toHandle(),refiid,interfacePtr)
      val result = IStoreRequestHelperStatics.ABI.makeIStoreRequestHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StoreRequestHelper {
      val address = segment.toRawLongValue()
      return StoreRequestHelper(Pointer(address))
    }

    public override fun toNative(obj: StoreRequestHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun SendRequestAsync(
      context: StoreContext,
      requestKind: WinDef.UINT,
      parametersAsJson: String
    ) = ABI.IStoreRequestHelperStatics_Instance.SendRequestAsync(context, requestKind,
        parametersAsJson)
  }
}
