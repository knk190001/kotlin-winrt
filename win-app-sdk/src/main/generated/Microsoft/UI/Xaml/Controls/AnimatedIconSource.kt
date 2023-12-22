package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IAnimatedIconSourceFactory.ABI.IID
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

@ABIMarker(AnimatedIconSource.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.AnimatedIconSource;{2846a198-731b-5379-85ac-8f28027f7183})")
@WinRTByReference(brClass = AnimatedIconSource.ByReference::class)
public open class AnimatedIconSource(
  ptr: JNAPointer? = NULL
) : IconSource(ptr), IAnimatedIconSource.WithDefault, IWinRTObject {
  private val __494489090_Interface: IAnimatedIconSource.WithDefault by lazy {
    as_494489090()
  }


  public override val __494489090_Ptr: JNAPointer? by lazy {
    __494489090_Interface.__494489090_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__494489090_Interface)

  public constructor() : this(ABI.activate())

  private fun as_494489090(): IAnimatedIconSource.WithDefault {
    if(pointer == NULL) {
      return(IAnimatedIconSource.ABI.makeIAnimatedIconSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimatedIconSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimatedIconSource.ABI.makeIAnimatedIconSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AnimatedIconSource> {
    public override fun getValue() = AnimatedIconSource(pointer.getPointer(0))

    public fun setValue(value: AnimatedIconSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnimatedIconSource, MemoryAddress> {
    public val IAnimatedIconSourceStatics_Instance: IAnimatedIconSourceStatics by lazy {
      createIAnimatedIconSourceStatics()
    }


    public val IAnimatedIconSourceFactory_Instance: IAnimatedIconSourceFactory by lazy {
      createIAnimatedIconSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAnimatedIconSourceStatics(): IAnimatedIconSourceStatics {
      val refiid = Guid.REFIID(IAnimatedIconSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AnimatedIconSource".toHandle(),refiid,interfacePtr)
      val result = IAnimatedIconSourceStatics.ABI.makeIAnimatedIconSourceStatics(interfacePtr.value)
      return result
    }

    public fun createIAnimatedIconSourceFactory(): IAnimatedIconSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AnimatedIconSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAnimatedIconSourceFactory.ABI.makeIAnimatedIconSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IAnimatedIconSourceFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AnimatedIconSource {
      val address = segment.toRawLongValue()
      return AnimatedIconSource(Pointer(address))
    }

    public override fun toNative(obj: AnimatedIconSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SourceProperty() = ABI.IAnimatedIconSourceStatics_Instance.get_SourceProperty()

    public fun get_FallbackIconSourceProperty() =
        ABI.IAnimatedIconSourceStatics_Instance.get_FallbackIconSourceProperty()

    public fun get_MirroredWhenRightToLeftProperty() =
        ABI.IAnimatedIconSourceStatics_Instance.get_MirroredWhenRightToLeftProperty()
  }
}
