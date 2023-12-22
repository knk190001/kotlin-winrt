package Windows.UI.Xaml.Documents

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ContentLink.ABI::class)
@Signature("rc(Windows.UI.Xaml.Documents.ContentLink;{6c60c3e1-528c-42f8-92be-34b8c68be304})")
@WinRTByReference(brClass = ContentLink.ByReference::class)
public class ContentLink(
  ptr: JNAPointer? = NULL
) : Inline(ptr), IContentLink.WithDefault, IWinRTObject {
  private val __337794283_Interface: IContentLink.WithDefault by lazy {
    as_337794283()
  }


  public override val __337794283_Ptr: JNAPointer? by lazy {
    __337794283_Interface.__337794283_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__337794283_Interface)

  public constructor() : this(ABI.activate())

  private fun as_337794283(): IContentLink.WithDefault {
    if(pointer == NULL) {
      return(IContentLink.ABI.makeIContentLink(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentLink>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentLink.ABI.makeIContentLink(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContentLink> {
    public override fun getValue() = ContentLink(pointer.getPointer(0))

    public fun setValue(value: ContentLink): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentLink, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IContentLinkStatics_Instance: IContentLinkStatics by lazy {
      createIContentLinkStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.ContentLink".toHandle(),
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

    public fun createIContentLinkStatics(): IContentLinkStatics {
      val refiid = Guid.REFIID(IContentLinkStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.ContentLink".toHandle(),refiid,interfacePtr)
      val result = IContentLinkStatics.ABI.makeIContentLinkStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContentLink {
      val address = segment.toRawLongValue()
      return ContentLink(Pointer(address))
    }

    public override fun toNative(obj: ContentLink): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_BackgroundProperty() = ABI.IContentLinkStatics_Instance.get_BackgroundProperty()

    public fun get_CursorProperty() = ABI.IContentLinkStatics_Instance.get_CursorProperty()

    public fun get_XYFocusLeftProperty() =
        ABI.IContentLinkStatics_Instance.get_XYFocusLeftProperty()

    public fun get_XYFocusRightProperty() =
        ABI.IContentLinkStatics_Instance.get_XYFocusRightProperty()

    public fun get_XYFocusUpProperty() = ABI.IContentLinkStatics_Instance.get_XYFocusUpProperty()

    public fun get_XYFocusDownProperty() =
        ABI.IContentLinkStatics_Instance.get_XYFocusDownProperty()

    public fun get_ElementSoundModeProperty() =
        ABI.IContentLinkStatics_Instance.get_ElementSoundModeProperty()

    public fun get_FocusStateProperty() = ABI.IContentLinkStatics_Instance.get_FocusStateProperty()

    public fun get_XYFocusUpNavigationStrategyProperty() =
        ABI.IContentLinkStatics_Instance.get_XYFocusUpNavigationStrategyProperty()

    public fun get_XYFocusDownNavigationStrategyProperty() =
        ABI.IContentLinkStatics_Instance.get_XYFocusDownNavigationStrategyProperty()

    public fun get_XYFocusLeftNavigationStrategyProperty() =
        ABI.IContentLinkStatics_Instance.get_XYFocusLeftNavigationStrategyProperty()

    public fun get_XYFocusRightNavigationStrategyProperty() =
        ABI.IContentLinkStatics_Instance.get_XYFocusRightNavigationStrategyProperty()

    public fun get_IsTabStopProperty() = ABI.IContentLinkStatics_Instance.get_IsTabStopProperty()

    public fun get_TabIndexProperty() = ABI.IContentLinkStatics_Instance.get_TabIndexProperty()
  }
}
