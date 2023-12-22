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

@ABIMarker(MapControlBusinessLandmarkClickEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapControlBusinessLandmarkClickEventArgs;{5e464922-4a1a-4797-beb7-5cf7754cb867})")
@WinRTByReference(brClass = MapControlBusinessLandmarkClickEventArgs.ByReference::class)
public class MapControlBusinessLandmarkClickEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapControlBusinessLandmarkClickEventArgs.WithDefault, IWinRTObject {
  private val __1729473593_Interface: IMapControlBusinessLandmarkClickEventArgs.WithDefault by
      lazy {
    as_1729473593()
  }


  public override val __1729473593_Ptr: JNAPointer? by lazy {
    __1729473593_Interface.__1729473593_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1729473593_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1729473593(): IMapControlBusinessLandmarkClickEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMapControlBusinessLandmarkClickEventArgs.ABI.makeIMapControlBusinessLandmarkClickEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControlBusinessLandmarkClickEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControlBusinessLandmarkClickEventArgs.ABI.makeIMapControlBusinessLandmarkClickEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapControlBusinessLandmarkClickEventArgs> {
    public override fun getValue() = MapControlBusinessLandmarkClickEventArgs(pointer.getPointer(0))

    public fun setValue(value: MapControlBusinessLandmarkClickEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapControlBusinessLandmarkClickEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapControlBusinessLandmarkClickEventArgs".toHandle(),
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
        MapControlBusinessLandmarkClickEventArgs {
      val address = segment.toRawLongValue()
      return MapControlBusinessLandmarkClickEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MapControlBusinessLandmarkClickEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
