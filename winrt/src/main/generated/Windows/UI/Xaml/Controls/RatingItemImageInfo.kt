package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IRatingItemImageInfoFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RatingItemImageInfo.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.RatingItemImageInfo;{25240e8c-e0d2-490e-b8f8-96c8ee0512b9})")
@WinRTByReference(brClass = RatingItemImageInfo.ByReference::class)
public open class RatingItemImageInfo(
  ptr: JNAPointer? = NULL
) : RatingItemInfo(ptr), IRatingItemImageInfo.WithDefault, IWinRTObject {
  private val __342303389_Interface: IRatingItemImageInfo.WithDefault by lazy {
    as_342303389()
  }


  public override val __342303389_Ptr: JNAPointer? by lazy {
    __342303389_Interface.__342303389_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__342303389_Interface)

  public constructor() : this(ABI.activate())

  private fun as_342303389(): IRatingItemImageInfo.WithDefault {
    if(pointer == NULL) {
      return(IRatingItemImageInfo.ABI.makeIRatingItemImageInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRatingItemImageInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRatingItemImageInfo.ABI.makeIRatingItemImageInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RatingItemImageInfo> {
    public override fun getValue() = RatingItemImageInfo(pointer.getPointer(0))

    public fun setValue(value: RatingItemImageInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RatingItemImageInfo, MemoryAddress> {
    public val IRatingItemImageInfoStatics_Instance: IRatingItemImageInfoStatics by lazy {
      createIRatingItemImageInfoStatics()
    }


    public val IRatingItemImageInfoFactory_Instance: IRatingItemImageInfoFactory by lazy {
      createIRatingItemImageInfoFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRatingItemImageInfoStatics(): IRatingItemImageInfoStatics {
      val refiid = Guid.REFIID(IRatingItemImageInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RatingItemImageInfo".toHandle(),refiid,interfacePtr)
      val result =
          IRatingItemImageInfoStatics.ABI.makeIRatingItemImageInfoStatics(interfacePtr.value)
      return result
    }

    public fun createIRatingItemImageInfoFactory(): IRatingItemImageInfoFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RatingItemImageInfo".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRatingItemImageInfoFactory.ABI.makeIRatingItemImageInfoFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRatingItemImageInfoFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RatingItemImageInfo {
      val address = segment.toRawLongValue()
      return RatingItemImageInfo(Pointer(address))
    }

    public override fun toNative(obj: RatingItemImageInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DisabledImageProperty() =
        ABI.IRatingItemImageInfoStatics_Instance.get_DisabledImageProperty()

    public fun get_ImageProperty() = ABI.IRatingItemImageInfoStatics_Instance.get_ImageProperty()

    public fun get_PlaceholderImageProperty() =
        ABI.IRatingItemImageInfoStatics_Instance.get_PlaceholderImageProperty()

    public fun get_PointerOverImageProperty() =
        ABI.IRatingItemImageInfoStatics_Instance.get_PointerOverImageProperty()

    public fun get_PointerOverPlaceholderImageProperty() =
        ABI.IRatingItemImageInfoStatics_Instance.get_PointerOverPlaceholderImageProperty()

    public fun get_UnsetImageProperty() =
        ABI.IRatingItemImageInfoStatics_Instance.get_UnsetImageProperty()
  }
}
