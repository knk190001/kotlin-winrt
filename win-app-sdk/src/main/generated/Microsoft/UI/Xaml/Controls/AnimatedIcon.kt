package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IAnimatedIconFactory.ABI.IID
import Microsoft.UI.Xaml.DependencyObject
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AnimatedIcon.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.AnimatedIcon;{f705dfda-8196-56d0-8dcf-2b66c2aed791})")
@WinRTByReference(brClass = AnimatedIcon.ByReference::class)
public open class AnimatedIcon(
  ptr: JNAPointer? = NULL
) : IconElement(ptr), IAnimatedIcon.WithDefault, IWinRTObject {
  private val __145773565_Interface: IAnimatedIcon.WithDefault by lazy {
    as_145773565()
  }


  public override val __145773565_Ptr: JNAPointer? by lazy {
    __145773565_Interface.__145773565_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__145773565_Interface)

  public constructor() : this(ABI.activate())

  private fun as_145773565(): IAnimatedIcon.WithDefault {
    if(pointer == NULL) {
      return(IAnimatedIcon.ABI.makeIAnimatedIcon(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimatedIcon>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimatedIcon.ABI.makeIAnimatedIcon(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AnimatedIcon> {
    public override fun getValue() = AnimatedIcon(pointer.getPointer(0))

    public fun setValue(value: AnimatedIcon): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnimatedIcon, MemoryAddress> {
    public val IAnimatedIconStatics_Instance: IAnimatedIconStatics by lazy {
      createIAnimatedIconStatics()
    }


    public val IAnimatedIconFactory_Instance: IAnimatedIconFactory by lazy {
      createIAnimatedIconFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAnimatedIconStatics(): IAnimatedIconStatics {
      val refiid = Guid.REFIID(IAnimatedIconStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AnimatedIcon".toHandle(),refiid,interfacePtr)
      val result = IAnimatedIconStatics.ABI.makeIAnimatedIconStatics(interfacePtr.value)
      return result
    }

    public fun createIAnimatedIconFactory(): IAnimatedIconFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AnimatedIcon".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAnimatedIconFactory.ABI.makeIAnimatedIconFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IAnimatedIconFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AnimatedIcon {
      val address = segment.toRawLongValue()
      return AnimatedIcon(Pointer(address))
    }

    public override fun toNative(obj: AnimatedIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_StateProperty() = ABI.IAnimatedIconStatics_Instance.get_StateProperty()

    public fun SetState(`object`: DependencyObject, value: String) =
        ABI.IAnimatedIconStatics_Instance.SetState(`object`, value)

    public fun GetState(`object`: DependencyObject) =
        ABI.IAnimatedIconStatics_Instance.GetState(`object`)

    public fun get_SourceProperty() = ABI.IAnimatedIconStatics_Instance.get_SourceProperty()

    public fun get_FallbackIconSourceProperty() =
        ABI.IAnimatedIconStatics_Instance.get_FallbackIconSourceProperty()

    public fun get_MirroredWhenRightToLeftProperty() =
        ABI.IAnimatedIconStatics_Instance.get_MirroredWhenRightToLeftProperty()
  }
}
