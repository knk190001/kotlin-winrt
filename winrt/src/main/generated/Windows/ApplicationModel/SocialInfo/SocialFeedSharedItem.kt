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

@ABIMarker(SocialFeedSharedItem.ABI::class)
@Signature("rc(Windows.ApplicationModel.SocialInfo.SocialFeedSharedItem;{7bfb9e40-a6aa-45a7-9ff6-54c42105dd1f})")
@WinRTByReference(brClass = SocialFeedSharedItem.ByReference::class)
public class SocialFeedSharedItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISocialFeedSharedItem.WithDefault, IWinRTObject {
  private val __1775884505_Interface: ISocialFeedSharedItem.WithDefault by lazy {
    as_1775884505()
  }


  public override val __1775884505_Ptr: JNAPointer? by lazy {
    __1775884505_Interface.__1775884505_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1775884505_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1775884505(): ISocialFeedSharedItem.WithDefault {
    if(pointer == NULL) {
      return(ISocialFeedSharedItem.ABI.makeISocialFeedSharedItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISocialFeedSharedItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISocialFeedSharedItem.ABI.makeISocialFeedSharedItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SocialFeedSharedItem> {
    public override fun getValue() = SocialFeedSharedItem(pointer.getPointer(0))

    public fun setValue(value: SocialFeedSharedItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SocialFeedSharedItem, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.SocialInfo.SocialFeedSharedItem".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SocialFeedSharedItem {
      val address = segment.toRawLongValue()
      return SocialFeedSharedItem(Pointer(address))
    }

    public override fun toNative(obj: SocialFeedSharedItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
