package Windows.UI.Text.Core

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

@ABIMarker(CoreTextServicesConstants.ABI::class)
@WinRTByReference(brClass = CoreTextServicesConstants.ByReference::class)
public class CoreTextServicesConstants(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextServicesConstants> {
    public override fun getValue() = CoreTextServicesConstants(pointer.getPointer(0))

    public fun setValue(value: CoreTextServicesConstants): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextServicesConstants, MemoryAddress> {
    public val ICoreTextServicesStatics_Instance: ICoreTextServicesStatics by lazy {
      createICoreTextServicesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreTextServicesStatics(): ICoreTextServicesStatics {
      val refiid = Guid.REFIID(ICoreTextServicesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Text.Core.CoreTextServicesConstants".toHandle(),refiid,interfacePtr)
      val result = ICoreTextServicesStatics.ABI.makeICoreTextServicesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreTextServicesConstants {
      val address = segment.toRawLongValue()
      return CoreTextServicesConstants(Pointer(address))
    }

    public override fun toNative(obj: CoreTextServicesConstants): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HiddenCharacter() = ABI.ICoreTextServicesStatics_Instance.get_HiddenCharacter()
  }
}
