package Windows.ApplicationModel.SocialInfo

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(SocialFeedChildItem.ABI::class)
@Signature("rc(Windows.ApplicationModel.SocialInfo.SocialFeedChildItem;{0b6a985a-d59d-40be-980c-488a2ab30a83})")
@WinRTByReference(brClass = SocialFeedChildItem.ByReference::class)
public class SocialFeedChildItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISocialFeedChildItem.WithDefault, IWinRTObject {
  private val __233754016_Interface: ISocialFeedChildItem.WithDefault by lazy {
    as_233754016()
  }


  public override val __233754016_Ptr: JNAPointer? by lazy {
    __233754016_Interface.__233754016_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__233754016_Interface)

  public constructor() : this(ABI.activate())

  private fun as_233754016(): ISocialFeedChildItem.WithDefault {
    if(pointer == NULL) {
      return(ISocialFeedChildItem.ABI.makeISocialFeedChildItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISocialFeedChildItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISocialFeedChildItem.ABI.makeISocialFeedChildItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SocialFeedChildItem> {
    public override fun getValue() = SocialFeedChildItem(pointer.getPointer(0))

    public fun setValue(value: SocialFeedChildItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SocialFeedChildItem, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.SocialInfo.SocialFeedChildItem".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): SocialFeedChildItem {
      val address = segment.toRawLongValue()
      return SocialFeedChildItem(Pointer(address))
    }

    public override fun toNative(obj: SocialFeedChildItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
