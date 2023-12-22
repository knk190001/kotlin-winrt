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

@ABIMarker(MapTileUriRequestDeferral.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapTileUriRequestDeferral;{c117ade0-bf3e-4c51-8faa-4b593cf68eb2})")
@WinRTByReference(brClass = MapTileUriRequestDeferral.ByReference::class)
public class MapTileUriRequestDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapTileUriRequestDeferral.WithDefault, IWinRTObject {
  private val __1428648025_Interface: IMapTileUriRequestDeferral.WithDefault by lazy {
    as_1428648025()
  }


  public override val __1428648025_Ptr: JNAPointer? by lazy {
    __1428648025_Interface.__1428648025_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1428648025_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1428648025(): IMapTileUriRequestDeferral.WithDefault {
    if(pointer == NULL) {
      return(IMapTileUriRequestDeferral.ABI.makeIMapTileUriRequestDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapTileUriRequestDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapTileUriRequestDeferral.ABI.makeIMapTileUriRequestDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapTileUriRequestDeferral> {
    public override fun getValue() = MapTileUriRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: MapTileUriRequestDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapTileUriRequestDeferral, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapTileUriRequestDeferral".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MapTileUriRequestDeferral {
      val address = segment.toRawLongValue()
      return MapTileUriRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: MapTileUriRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
