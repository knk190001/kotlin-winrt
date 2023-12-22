package Windows.Services.TargetedContent

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

@ABIMarker(TargetedContentSubscription.ABI::class)
@Signature("rc(Windows.Services.TargetedContent.TargetedContentSubscription;{882c2c49-c652-4c7a-acad-1f7fa2986c73})")
@WinRTByReference(brClass = TargetedContentSubscription.ByReference::class)
public class TargetedContentSubscription(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITargetedContentSubscription.WithDefault, IWinRTObject {
  private val __644807713_Interface: ITargetedContentSubscription.WithDefault by lazy {
    as_644807713()
  }


  public override val __644807713_Ptr: JNAPointer? by lazy {
    __644807713_Interface.__644807713_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__644807713_Interface)

  private fun as_644807713(): ITargetedContentSubscription.WithDefault {
    if(pointer == NULL) {
      return(ITargetedContentSubscription.ABI.makeITargetedContentSubscription(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITargetedContentSubscription>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITargetedContentSubscription.ABI.makeITargetedContentSubscription(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TargetedContentSubscription> {
    public override fun getValue() = TargetedContentSubscription(pointer.getPointer(0))

    public fun setValue(value: TargetedContentSubscription): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TargetedContentSubscription, MemoryAddress> {
    public val ITargetedContentSubscriptionStatics_Instance: ITargetedContentSubscriptionStatics by
        lazy {
      createITargetedContentSubscriptionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITargetedContentSubscriptionStatics(): ITargetedContentSubscriptionStatics {
      val refiid = Guid.REFIID(ITargetedContentSubscriptionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.TargetedContent.TargetedContentSubscription".toHandle(),refiid,interfacePtr)
      val result =
          ITargetedContentSubscriptionStatics.ABI.makeITargetedContentSubscriptionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TargetedContentSubscription {
      val address = segment.toRawLongValue()
      return TargetedContentSubscription(Pointer(address))
    }

    public override fun toNative(obj: TargetedContentSubscription): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetAsync(subscriptionId: String) =
        ABI.ITargetedContentSubscriptionStatics_Instance.GetAsync(subscriptionId)

    public fun GetOptions(subscriptionId: String) =
        ABI.ITargetedContentSubscriptionStatics_Instance.GetOptions(subscriptionId)
  }
}
