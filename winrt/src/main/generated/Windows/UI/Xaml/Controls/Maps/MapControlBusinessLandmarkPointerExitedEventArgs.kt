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

@ABIMarker(MapControlBusinessLandmarkPointerExitedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapControlBusinessLandmarkPointerExitedEventArgs;{2bb52caf-f24a-46d0-b463-65f719731057})")
@WinRTByReference(brClass = MapControlBusinessLandmarkPointerExitedEventArgs.ByReference::class)
public class MapControlBusinessLandmarkPointerExitedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapControlBusinessLandmarkPointerExitedEventArgs.WithDefault, IWinRTObject {
  private val __452207911_Interface: IMapControlBusinessLandmarkPointerExitedEventArgs.WithDefault
      by lazy {
    as_452207911()
  }


  public override val __452207911_Ptr: JNAPointer? by lazy {
    __452207911_Interface.__452207911_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__452207911_Interface)

  public constructor() : this(ABI.activate())

  private fun as_452207911(): IMapControlBusinessLandmarkPointerExitedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMapControlBusinessLandmarkPointerExitedEventArgs.ABI.makeIMapControlBusinessLandmarkPointerExitedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControlBusinessLandmarkPointerExitedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControlBusinessLandmarkPointerExitedEventArgs.ABI.makeIMapControlBusinessLandmarkPointerExitedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapControlBusinessLandmarkPointerExitedEventArgs> {
    public override fun getValue() =
        MapControlBusinessLandmarkPointerExitedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MapControlBusinessLandmarkPointerExitedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapControlBusinessLandmarkPointerExitedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapControlBusinessLandmarkPointerExitedEventArgs".toHandle(),
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
        MapControlBusinessLandmarkPointerExitedEventArgs {
      val address = segment.toRawLongValue()
      return MapControlBusinessLandmarkPointerExitedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MapControlBusinessLandmarkPointerExitedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
