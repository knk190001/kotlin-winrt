package Microsoft.UI.Xaml.Media

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

@ABIMarker(GradientStop.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.GradientStop;{48bcb039-e8e1-5743-94c3-f766011d3b5d})")
@WinRTByReference(brClass = GradientStop.ByReference::class)
public class GradientStop(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IGradientStop.WithDefault, IWinRTObject {
  private val __907186691_Interface: IGradientStop.WithDefault by lazy {
    as_907186691()
  }


  public override val __907186691_Ptr: JNAPointer? by lazy {
    __907186691_Interface.__907186691_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__907186691_Interface)

  public constructor() : this(ABI.activate())

  private fun as_907186691(): IGradientStop.WithDefault {
    if(pointer == NULL) {
      return(IGradientStop.ABI.makeIGradientStop(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGradientStop>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGradientStop.ABI.makeIGradientStop(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GradientStop> {
    public override fun getValue() = GradientStop(pointer.getPointer(0))

    public fun setValue(value: GradientStop): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GradientStop, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IGradientStopStatics_Instance: IGradientStopStatics by lazy {
      createIGradientStopStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.GradientStop".toHandle(),
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

    public fun createIGradientStopStatics(): IGradientStopStatics {
      val refiid = Guid.REFIID(IGradientStopStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.GradientStop".toHandle(),refiid,interfacePtr)
      val result = IGradientStopStatics.ABI.makeIGradientStopStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GradientStop {
      val address = segment.toRawLongValue()
      return GradientStop(Pointer(address))
    }

    public override fun toNative(obj: GradientStop): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ColorProperty() = ABI.IGradientStopStatics_Instance.get_ColorProperty()

    public fun get_OffsetProperty() = ABI.IGradientStopStatics_Instance.get_OffsetProperty()
  }
}
