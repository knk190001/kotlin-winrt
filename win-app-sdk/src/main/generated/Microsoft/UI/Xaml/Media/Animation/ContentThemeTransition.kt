package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(ContentThemeTransition.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.ContentThemeTransition;{dff47071-cc51-556c-a3fe-8bbb4cba6195})")
@WinRTByReference(brClass = ContentThemeTransition.ByReference::class)
public class ContentThemeTransition(
  ptr: JNAPointer? = NULL
) : Transition(ptr), IContentThemeTransition.WithDefault, IWinRTObject {
  private val __1156540928_Interface: IContentThemeTransition.WithDefault by lazy {
    as_1156540928()
  }


  public override val __1156540928_Ptr: JNAPointer? by lazy {
    __1156540928_Interface.__1156540928_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1156540928_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1156540928(): IContentThemeTransition.WithDefault {
    if(pointer == NULL) {
      return(IContentThemeTransition.ABI.makeIContentThemeTransition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentThemeTransition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentThemeTransition.ABI.makeIContentThemeTransition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentThemeTransition> {
    public override fun getValue() = ContentThemeTransition(pointer.getPointer(0))

    public fun setValue(value: ContentThemeTransition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentThemeTransition, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IContentThemeTransitionStatics_Instance: IContentThemeTransitionStatics by lazy {
      createIContentThemeTransitionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.ContentThemeTransition".toHandle(),
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

    public fun createIContentThemeTransitionStatics(): IContentThemeTransitionStatics {
      val refiid = Guid.REFIID(IContentThemeTransitionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.ContentThemeTransition".toHandle(),refiid,interfacePtr)
      val result =
          IContentThemeTransitionStatics.ABI.makeIContentThemeTransitionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContentThemeTransition {
      val address = segment.toRawLongValue()
      return ContentThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: ContentThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HorizontalOffsetProperty() =
        ABI.IContentThemeTransitionStatics_Instance.get_HorizontalOffsetProperty()

    public fun get_VerticalOffsetProperty() =
        ABI.IContentThemeTransitionStatics_Instance.get_VerticalOffsetProperty()
  }
}
