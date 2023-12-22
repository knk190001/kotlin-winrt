package Microsoft.Windows.ApplicationModel.Resources

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

@ABIMarker(KnownResourceQualifierName.ABI::class)
@WinRTByReference(brClass = KnownResourceQualifierName.ByReference::class)
public class KnownResourceQualifierName(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownResourceQualifierName> {
    public override fun getValue() = KnownResourceQualifierName(pointer.getPointer(0))

    public fun setValue(value: KnownResourceQualifierName): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownResourceQualifierName, MemoryAddress> {
    public val IKnownResourceQualifierNameStatics_Instance: IKnownResourceQualifierNameStatics by
        lazy {
      createIKnownResourceQualifierNameStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownResourceQualifierNameStatics(): IKnownResourceQualifierNameStatics {
      val refiid = Guid.REFIID(IKnownResourceQualifierNameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.ApplicationModel.Resources.KnownResourceQualifierName".toHandle(),refiid,interfacePtr)
      val result =
          IKnownResourceQualifierNameStatics.ABI.makeIKnownResourceQualifierNameStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownResourceQualifierName {
      val address = segment.toRawLongValue()
      return KnownResourceQualifierName(Pointer(address))
    }

    public override fun toNative(obj: KnownResourceQualifierName): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Contrast() = ABI.IKnownResourceQualifierNameStatics_Instance.get_Contrast()

    public fun get_Custom() = ABI.IKnownResourceQualifierNameStatics_Instance.get_Custom()

    public fun get_DeviceFamily() =
        ABI.IKnownResourceQualifierNameStatics_Instance.get_DeviceFamily()

    public fun get_HomeRegion() = ABI.IKnownResourceQualifierNameStatics_Instance.get_HomeRegion()

    public fun get_Language() = ABI.IKnownResourceQualifierNameStatics_Instance.get_Language()

    public fun get_LayoutDirection() =
        ABI.IKnownResourceQualifierNameStatics_Instance.get_LayoutDirection()

    public fun get_Scale() = ABI.IKnownResourceQualifierNameStatics_Instance.get_Scale()

    public fun get_TargetSize() = ABI.IKnownResourceQualifierNameStatics_Instance.get_TargetSize()

    public fun get_Theme() = ABI.IKnownResourceQualifierNameStatics_Instance.get_Theme()
  }
}
