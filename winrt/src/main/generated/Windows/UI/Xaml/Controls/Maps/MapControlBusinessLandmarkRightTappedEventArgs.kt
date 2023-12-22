package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(MapControlBusinessLandmarkRightTappedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapControlBusinessLandmarkRightTappedEventArgs;{59ab8ae7-f184-4ab1-b0b0-35c8bf0654b2})")
@WinRTByReference(brClass = MapControlBusinessLandmarkRightTappedEventArgs.ByReference::class)
public class MapControlBusinessLandmarkRightTappedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapControlBusinessLandmarkRightTappedEventArgs.WithDefault, IWinRTObject {
  private val __944686713_Interface: IMapControlBusinessLandmarkRightTappedEventArgs.WithDefault by
      lazy {
    as_944686713()
  }


  public override val __944686713_Ptr: JNAPointer? by lazy {
    __944686713_Interface.__944686713_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__944686713_Interface)

  public constructor() : this(ABI.activate())

  private fun as_944686713(): IMapControlBusinessLandmarkRightTappedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMapControlBusinessLandmarkRightTappedEventArgs.ABI.makeIMapControlBusinessLandmarkRightTappedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControlBusinessLandmarkRightTappedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControlBusinessLandmarkRightTappedEventArgs.ABI.makeIMapControlBusinessLandmarkRightTappedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapControlBusinessLandmarkRightTappedEventArgs> {
    public override fun getValue() =
        MapControlBusinessLandmarkRightTappedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MapControlBusinessLandmarkRightTappedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapControlBusinessLandmarkRightTappedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapControlBusinessLandmarkRightTappedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress):
        MapControlBusinessLandmarkRightTappedEventArgs {
      val address = segment.toRawLongValue()
      return MapControlBusinessLandmarkRightTappedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MapControlBusinessLandmarkRightTappedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
