package Windows.Services.Cortana

import Windows.System.User
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CortanaActionableInsights.ABI::class)
@Signature("rc(Windows.Services.Cortana.CortanaActionableInsights;{951ec6b1-fc83-586d-8b84-2452c8981625})")
@WinRTByReference(brClass = CortanaActionableInsights.ByReference::class)
public class CortanaActionableInsights(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICortanaActionableInsights.WithDefault, IWinRTObject {
  private val __560740087_Interface: ICortanaActionableInsights.WithDefault by lazy {
    as_560740087()
  }


  public override val __560740087_Ptr: JNAPointer? by lazy {
    __560740087_Interface.__560740087_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__560740087_Interface)

  private fun as_560740087(): ICortanaActionableInsights.WithDefault {
    if(pointer == NULL) {
      return(ICortanaActionableInsights.ABI.makeICortanaActionableInsights(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICortanaActionableInsights>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICortanaActionableInsights.ABI.makeICortanaActionableInsights(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CortanaActionableInsights> {
    public override fun getValue() = CortanaActionableInsights(pointer.getPointer(0))

    public fun setValue(value: CortanaActionableInsights): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CortanaActionableInsights, MemoryAddress> {
    public val ICortanaActionableInsightsStatics_Instance: ICortanaActionableInsightsStatics by
        lazy {
      createICortanaActionableInsightsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICortanaActionableInsightsStatics(): ICortanaActionableInsightsStatics {
      val refiid = Guid.REFIID(ICortanaActionableInsightsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Cortana.CortanaActionableInsights".toHandle(),refiid,interfacePtr)
      val result =
          ICortanaActionableInsightsStatics.ABI.makeICortanaActionableInsightsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CortanaActionableInsights {
      val address = segment.toRawLongValue()
      return CortanaActionableInsights(Pointer(address))
    }

    public override fun toNative(obj: CortanaActionableInsights): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.ICortanaActionableInsightsStatics_Instance.GetDefault()

    public fun GetForUser(user: User) =
        ABI.ICortanaActionableInsightsStatics_Instance.GetForUser(user)
  }
}
