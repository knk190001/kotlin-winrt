package Windows.Foundation

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

@ABIMarker(GuidHelper.ABI::class)
@WinRTByReference(brClass = GuidHelper.ByReference::class)
public class GuidHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GuidHelper> {
    public override fun getValue() = GuidHelper(pointer.getPointer(0))

    public fun setValue(value: GuidHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GuidHelper, MemoryAddress> {
    public val IGuidHelperStatics_Instance: IGuidHelperStatics by lazy {
      createIGuidHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGuidHelperStatics(): IGuidHelperStatics {
      val refiid = Guid.REFIID(IGuidHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.GuidHelper".toHandle(),refiid,interfacePtr)
      val result = IGuidHelperStatics.ABI.makeIGuidHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GuidHelper {
      val address = segment.toRawLongValue()
      return GuidHelper(Pointer(address))
    }

    public override fun toNative(obj: GuidHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateNewGuid() = ABI.IGuidHelperStatics_Instance.CreateNewGuid()

    public fun get_Empty() = ABI.IGuidHelperStatics_Instance.get_Empty()

    public fun Equals(target: Guid.GUID, value: Guid.GUID) =
        ABI.IGuidHelperStatics_Instance.Equals(target, value)
  }
}
