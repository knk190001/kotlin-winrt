package Windows.ApplicationModel

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LimitedAccessFeatures.ABI::class)
@WinRTByReference(brClass = LimitedAccessFeatures.ByReference::class)
public class LimitedAccessFeatures(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LimitedAccessFeatures> {
    public override fun getValue() = LimitedAccessFeatures(pointer.getPointer(0))

    public fun setValue(value: LimitedAccessFeatures): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LimitedAccessFeatures, MemoryAddress> {
    public val ILimitedAccessFeaturesStatics_Instance: ILimitedAccessFeaturesStatics by lazy {
      createILimitedAccessFeaturesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILimitedAccessFeaturesStatics(): ILimitedAccessFeaturesStatics {
      val refiid = Guid.REFIID(ILimitedAccessFeaturesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.LimitedAccessFeatures".toHandle(),refiid,interfacePtr)
      val result =
          ILimitedAccessFeaturesStatics.ABI.makeILimitedAccessFeaturesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LimitedAccessFeatures {
      val address = segment.toRawLongValue()
      return LimitedAccessFeatures(Pointer(address))
    }

    public override fun toNative(obj: LimitedAccessFeatures): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryUnlockFeature(
      featureId: String,
      token: String,
      attestation: String
    ) = ABI.ILimitedAccessFeaturesStatics_Instance.TryUnlockFeature(featureId, token, attestation)
  }
}
