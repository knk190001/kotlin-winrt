package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IRatingItemFontInfoFactory.ABI.IID
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

@ABIMarker(RatingItemFontInfo.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.RatingItemFontInfo;{995a16dc-3a0f-5727-9f38-52cfc8143654})")
@WinRTByReference(brClass = RatingItemFontInfo.ByReference::class)
public open class RatingItemFontInfo(
  ptr: JNAPointer? = NULL
) : RatingItemInfo(ptr), IRatingItemFontInfo.WithDefault, IWinRTObject {
  private val __917917204_Interface: IRatingItemFontInfo.WithDefault by lazy {
    as_917917204()
  }


  public override val __917917204_Ptr: JNAPointer? by lazy {
    __917917204_Interface.__917917204_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__917917204_Interface)

  public constructor() : this(ABI.activate())

  private fun as_917917204(): IRatingItemFontInfo.WithDefault {
    if(pointer == NULL) {
      return(IRatingItemFontInfo.ABI.makeIRatingItemFontInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRatingItemFontInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRatingItemFontInfo.ABI.makeIRatingItemFontInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RatingItemFontInfo> {
    public override fun getValue() = RatingItemFontInfo(pointer.getPointer(0))

    public fun setValue(value: RatingItemFontInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RatingItemFontInfo, MemoryAddress> {
    public val IRatingItemFontInfoStatics_Instance: IRatingItemFontInfoStatics by lazy {
      createIRatingItemFontInfoStatics()
    }


    public val IRatingItemFontInfoFactory_Instance: IRatingItemFontInfoFactory by lazy {
      createIRatingItemFontInfoFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRatingItemFontInfoStatics(): IRatingItemFontInfoStatics {
      val refiid = Guid.REFIID(IRatingItemFontInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RatingItemFontInfo".toHandle(),refiid,interfacePtr)
      val result = IRatingItemFontInfoStatics.ABI.makeIRatingItemFontInfoStatics(interfacePtr.value)
      return result
    }

    public fun createIRatingItemFontInfoFactory(): IRatingItemFontInfoFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RatingItemFontInfo".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRatingItemFontInfoFactory.ABI.makeIRatingItemFontInfoFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRatingItemFontInfoFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RatingItemFontInfo {
      val address = segment.toRawLongValue()
      return RatingItemFontInfo(Pointer(address))
    }

    public override fun toNative(obj: RatingItemFontInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DisabledGlyphProperty() =
        ABI.IRatingItemFontInfoStatics_Instance.get_DisabledGlyphProperty()

    public fun get_GlyphProperty() = ABI.IRatingItemFontInfoStatics_Instance.get_GlyphProperty()

    public fun get_PlaceholderGlyphProperty() =
        ABI.IRatingItemFontInfoStatics_Instance.get_PlaceholderGlyphProperty()

    public fun get_PointerOverGlyphProperty() =
        ABI.IRatingItemFontInfoStatics_Instance.get_PointerOverGlyphProperty()

    public fun get_PointerOverPlaceholderGlyphProperty() =
        ABI.IRatingItemFontInfoStatics_Instance.get_PointerOverPlaceholderGlyphProperty()

    public fun get_UnsetGlyphProperty() =
        ABI.IRatingItemFontInfoStatics_Instance.get_UnsetGlyphProperty()
  }
}
