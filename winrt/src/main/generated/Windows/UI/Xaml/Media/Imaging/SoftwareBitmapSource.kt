package Windows.UI.Xaml.Media.Imaging

import Windows.Foundation.IClosable
import Windows.UI.Xaml.Media.ImageSource
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

@ABIMarker(SoftwareBitmapSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Imaging.SoftwareBitmapSource;{d2dd9ed0-d3c5-4056-91b5-b7c1d1e8130e})")
@WinRTByReference(brClass = SoftwareBitmapSource.ByReference::class)
public class SoftwareBitmapSource(
  ptr: JNAPointer? = NULL
) : ImageSource(ptr), ISoftwareBitmapSource.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __525426333_Interface: ISoftwareBitmapSource.WithDefault by lazy {
    as_525426333()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __525426333_Ptr: JNAPointer? by lazy {
    __525426333_Interface.__525426333_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__525426333_Interface, __1260617006_Interface)

  public constructor() : this(ABI.activate())

  private fun as_525426333(): ISoftwareBitmapSource.WithDefault {
    if(pointer == NULL) {
      return(ISoftwareBitmapSource.ABI.makeISoftwareBitmapSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISoftwareBitmapSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISoftwareBitmapSource.ABI.makeISoftwareBitmapSource(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SoftwareBitmapSource> {
    public override fun getValue() = SoftwareBitmapSource(pointer.getPointer(0))

    public fun setValue(value: SoftwareBitmapSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SoftwareBitmapSource, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Imaging.SoftwareBitmapSource".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SoftwareBitmapSource {
      val address = segment.toRawLongValue()
      return SoftwareBitmapSource(Pointer(address))
    }

    public override fun toNative(obj: SoftwareBitmapSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
